package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var DisplayPasteOptions: MsoTriState = js.native
  var DoNotPromptForConvert: MsoTriState = js.native
  @JSName("PowerPoint.Options_typekey")
  var PowerPointDotOptions_typekey: Options = js.native
  var ShowCoauthoringMergeChanges: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(
    DisplayPasteOptions: MsoTriState,
    DoNotPromptForConvert: MsoTriState,
    PowerPointDotOptions_typekey: Options,
    ShowCoauthoringMergeChanges: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(DisplayPasteOptions = DisplayPasteOptions.asInstanceOf[js.Any], DoNotPromptForConvert = DoNotPromptForConvert.asInstanceOf[js.Any], ShowCoauthoringMergeChanges = ShowCoauthoringMergeChanges.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Options_typekey")(PowerPointDotOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayPasteOptions(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayPasteOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoNotPromptForConvert(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoNotPromptForConvert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotOptions_typekey(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Options_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCoauthoringMergeChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowCoauthoringMergeChanges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

