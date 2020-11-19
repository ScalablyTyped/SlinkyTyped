package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.com_.sun.star.style.HorizontalAlignment
import typingsSlinky.activexLibreoffice.com_.sun.star.style.NumberingAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the rules for chapter numbering in a text document.
  *
  * Some of the properties that are available in the interface are ignored here.
  *
  * The type of numbering can only be: NUM_CHARS_UPPER_LETTER, NUM_CHARS_LOWER_LETTER, NUM_ROMAN_UPPER, NUM_ROMAN_LOWER, NUM_ARABIC, or NUM_NUMBER_NONE
  *
  * In the {@link com.sun.star.style.NumberingAlignment} only the field {@link com.sun.star.style.NumberingAlignment.Alignment} is applied.
  *
  * Depending on the numbering types, the parameters for bullets or bit maps may be ignored. The character style name for the numbering symbol is also
  * ignored.
  */
@js.native
trait ChapterNumberingRule
  extends NumberingAlignment
     with typingsSlinky.activexLibreoffice.com_.sun.star.style.NumberingLevel {
  
  /**
    * contains the name of the paragraph style that marks this heading level.
    *
    * It is necessary that each style name appears only once in the sequence of numbering rules.
    */
  var HeadingStyleName: String = js.native
}
object ChapterNumberingRule {
  
  @scala.inline
  def apply(
    Alignment: HorizontalAlignment,
    BulletFontName: String,
    BulletId: Double,
    CharStyleName: String,
    GraphicURL: String,
    HeadingStyleName: String,
    Insertion: Double,
    NumberingType: Double,
    ParentNumbering: Double,
    Prefix: String,
    StartWith: Double,
    Suffix: String,
    TextMarginDistance: Double,
    TextNumberingDistance: Double
  ): ChapterNumberingRule = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], BulletFontName = BulletFontName.asInstanceOf[js.Any], BulletId = BulletId.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], GraphicURL = GraphicURL.asInstanceOf[js.Any], HeadingStyleName = HeadingStyleName.asInstanceOf[js.Any], Insertion = Insertion.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], ParentNumbering = ParentNumbering.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], StartWith = StartWith.asInstanceOf[js.Any], Suffix = Suffix.asInstanceOf[js.Any], TextMarginDistance = TextMarginDistance.asInstanceOf[js.Any], TextNumberingDistance = TextNumberingDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChapterNumberingRule]
  }
  
  @scala.inline
  implicit class ChapterNumberingRuleOps[Self <: ChapterNumberingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeadingStyleName(value: String): Self = this.set("HeadingStyleName", value.asInstanceOf[js.Any])
  }
}
