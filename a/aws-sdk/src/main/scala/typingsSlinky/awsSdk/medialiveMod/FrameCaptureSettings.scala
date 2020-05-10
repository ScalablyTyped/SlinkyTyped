package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameCaptureSettings extends js.Object {
  /**
    * The frequency at which to capture frames for inclusion in the output. May be specified in either seconds or milliseconds, as specified by captureIntervalUnits.
    */
  var CaptureInterval: integerMin1Max3600000 = js.native
  /**
    * Unit for the frame capture interval.
    */
  var CaptureIntervalUnits: js.UndefOr[FrameCaptureIntervalUnit] = js.native
}

object FrameCaptureSettings {
  @scala.inline
  def apply(CaptureInterval: integerMin1Max3600000): FrameCaptureSettings = {
    val __obj = js.Dynamic.literal(CaptureInterval = CaptureInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameCaptureSettings]
  }
  @scala.inline
  implicit class FrameCaptureSettingsOps[Self <: FrameCaptureSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureInterval(value: integerMin1Max3600000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptureIntervalUnits(value: FrameCaptureIntervalUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureIntervalUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureIntervalUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureIntervalUnits")(js.undefined)
        ret
    }
  }
  
}

