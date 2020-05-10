package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTimecode extends js.Object {
  /**
    * If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to exclude (the default) or include the frame specified by the timecode.
    */
  var LastFrameClippingBehavior: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.LastFrameClippingBehavior] = js.native
  /**
    * The timecode for the frame where you want to stop the clip. Optional; if not specified, the clip continues to the end of the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
    */
  var Timecode: js.UndefOr[string] = js.native
}

object StopTimecode {
  @scala.inline
  def apply(): StopTimecode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTimecode]
  }
  @scala.inline
  implicit class StopTimecodeOps[Self <: StopTimecode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastFrameClippingBehavior(value: LastFrameClippingBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFrameClippingBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastFrameClippingBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFrameClippingBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withTimecode(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timecode")(js.undefined)
        ret
    }
  }
  
}

