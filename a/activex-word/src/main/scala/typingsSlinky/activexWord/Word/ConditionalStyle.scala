package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalStyle extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Borders: typingsSlinky.activexWord.Word.Borders = js.native
  var BottomPadding: Double = js.native
  val Creator: Double = js.native
  var Font: typingsSlinky.activexWord.Word.Font = js.native
  var LeftPadding: Double = js.native
  var ParagraphFormat: typingsSlinky.activexWord.Word.ParagraphFormat = js.native
  val Parent: js.Any = js.native
  var RightPadding: Double = js.native
  val Shading: typingsSlinky.activexWord.Word.Shading = js.native
  var TopPadding: Double = js.native
  @JSName("Word.ConditionalStyle_typekey")
  var WordDotConditionalStyle_typekey: ConditionalStyle = js.native
}

object ConditionalStyle {
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    BottomPadding: Double,
    Creator: Double,
    Font: Font,
    LeftPadding: Double,
    ParagraphFormat: ParagraphFormat,
    Parent: js.Any,
    RightPadding: Double,
    Shading: Shading,
    TopPadding: Double,
    WordDotConditionalStyle_typekey: ConditionalStyle
  ): ConditionalStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], BottomPadding = BottomPadding.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], LeftPadding = LeftPadding.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RightPadding = RightPadding.asInstanceOf[js.Any], Shading = Shading.asInstanceOf[js.Any], TopPadding = TopPadding.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ConditionalStyle_typekey")(WordDotConditionalStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalStyle]
  }
  @scala.inline
  implicit class ConditionalStyleOps[Self <: ConditionalStyle] (val x: Self) extends AnyVal {
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
    def withBorders(value: Borders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParagraphFormat(value: ParagraphFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParagraphFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShading(value: Shading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotConditionalStyle_typekey(value: ConditionalStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.ConditionalStyle_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

