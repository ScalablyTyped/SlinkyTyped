package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndnoteOptions extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Location: WdEndnoteLocation = js.native
  var NumberStyle: WdNoteNumberStyle = js.native
  var NumberingRule: WdNumberingRule = js.native
  val Parent: js.Any = js.native
  var StartingNumber: Double = js.native
  @JSName("Word.EndnoteOptions_typekey")
  var WordDotEndnoteOptions_typekey: EndnoteOptions = js.native
}

object EndnoteOptions {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Location: WdEndnoteLocation,
    NumberStyle: WdNoteNumberStyle,
    NumberingRule: WdNumberingRule,
    Parent: js.Any,
    StartingNumber: Double,
    WordDotEndnoteOptions_typekey: EndnoteOptions
  ): EndnoteOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], NumberingRule = NumberingRule.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StartingNumber = StartingNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EndnoteOptions_typekey")(WordDotEndnoteOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndnoteOptions]
  }
  @scala.inline
  implicit class EndnoteOptionsOps[Self <: EndnoteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: WdEndnoteLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberStyle(value: WdNoteNumberStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberingRule(value: WdNumberingRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberingRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartingNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotEndnoteOptions_typekey(value: EndnoteOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.EndnoteOptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

