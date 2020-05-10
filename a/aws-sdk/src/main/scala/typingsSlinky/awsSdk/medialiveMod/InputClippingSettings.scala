package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputClippingSettings extends js.Object {
  /**
    * The source of the timecodes in the source being clipped.
    */
  var InputTimecodeSource: typingsSlinky.awsSdk.medialiveMod.InputTimecodeSource = js.native
  /**
    * Settings to identify the start of the clip.
    */
  var StartTimecode: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.StartTimecode] = js.native
  /**
    * Settings to identify the end of the clip.
    */
  var StopTimecode: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.StopTimecode] = js.native
}

object InputClippingSettings {
  @scala.inline
  def apply(InputTimecodeSource: InputTimecodeSource): InputClippingSettings = {
    val __obj = js.Dynamic.literal(InputTimecodeSource = InputTimecodeSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputClippingSettings]
  }
  @scala.inline
  implicit class InputClippingSettingsOps[Self <: InputClippingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputTimecodeSource(value: InputTimecodeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputTimecodeSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTimecode(value: StartTimecode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTimecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTimecode")(js.undefined)
        ret
    }
    @scala.inline
    def withStopTimecode(value: StopTimecode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopTimecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopTimecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopTimecode")(js.undefined)
        ret
    }
  }
  
}

