package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FootnoteOptions extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Location: WdFootnoteLocation = js.native
  var NumberStyle: WdNoteNumberStyle = js.native
  var NumberingRule: WdNumberingRule = js.native
  val Parent: js.Any = js.native
  var StartingNumber: Double = js.native
  @JSName("Word.FootnoteOptions_typekey")
  var WordDotFootnoteOptions_typekey: FootnoteOptions = js.native
}

object FootnoteOptions {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Location: WdFootnoteLocation,
    NumberStyle: WdNoteNumberStyle,
    NumberingRule: WdNumberingRule,
    Parent: js.Any,
    StartingNumber: Double,
    WordDotFootnoteOptions_typekey: FootnoteOptions
  ): FootnoteOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], NumberingRule = NumberingRule.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StartingNumber = StartingNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FootnoteOptions_typekey")(WordDotFootnoteOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteOptions]
  }
  @scala.inline
  implicit class FootnoteOptionsOps[Self <: FootnoteOptions] (val x: Self) extends AnyVal {
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
    def withLocation(value: WdFootnoteLocation): Self = {
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
    def withWordDotFootnoteOptions_typekey(value: FootnoteOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.FootnoteOptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

