package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Replacement extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Font: typingsSlinky.activexWord.Word.Font = js.native
  val Frame: typingsSlinky.activexWord.Word.Frame = js.native
  var Highlight: Double = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  var NoProofing: Double = js.native
  var ParagraphFormat: typingsSlinky.activexWord.Word.ParagraphFormat = js.native
  val Parent: js.Any = js.native
  var Style: js.Any = js.native
  var Text: String = js.native
  @JSName("Word.Replacement_typekey")
  var WordDotReplacement_typekey: Replacement = js.native
  def ClearFormatting(): Unit = js.native
}

object Replacement {
  @scala.inline
  def apply(
    Application: Application,
    ClearFormatting: () => Unit,
    Creator: Double,
    Font: Font,
    Frame: Frame,
    Highlight: Double,
    LanguageID: WdLanguageID,
    LanguageIDFarEast: WdLanguageID,
    NoProofing: Double,
    ParagraphFormat: ParagraphFormat,
    Parent: js.Any,
    Style: js.Any,
    Text: String,
    WordDotReplacement_typekey: Replacement
  ): Replacement = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearFormatting = js.Any.fromFunction0(ClearFormatting), Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Highlight = Highlight.asInstanceOf[js.Any], LanguageID = LanguageID.asInstanceOf[js.Any], LanguageIDFarEast = LanguageIDFarEast.asInstanceOf[js.Any], NoProofing = NoProofing.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Replacement_typekey")(WordDotReplacement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacement]
  }
  @scala.inline
  implicit class ReplacementOps[Self <: Replacement] (val x: Self) extends AnyVal {
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
    def withClearFormatting(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearFormatting")(js.Any.fromFunction0(value))
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
    def withFrame(value: Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageID(value: WdLanguageID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageIDFarEast(value: WdLanguageID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageIDFarEast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoProofing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoProofing")(value.asInstanceOf[js.Any])
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
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotReplacement_typekey(value: Replacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Replacement_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

