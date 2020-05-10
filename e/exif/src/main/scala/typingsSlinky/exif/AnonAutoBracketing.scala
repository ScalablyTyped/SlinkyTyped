package typingsSlinky.exif

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoBracketing extends js.Object {
  var AutoBracketing: js.UndefOr[Double] = js.native
  var BlurWarning: js.UndefOr[Double] = js.native
  var ExposureWarning: js.UndefOr[Double] = js.native
  var FlashExposureComp: js.UndefOr[Double] = js.native
  var FocusMode: js.UndefOr[Double] = js.native
  var FocusWarning: js.UndefOr[Double] = js.native
  var FujiFlashMode: js.UndefOr[Double] = js.native
  var Macro: js.UndefOr[Double] = js.native
  var Quality: js.UndefOr[String] = js.native
  var Sharpness: js.UndefOr[Double] = js.native
  var SlowSync: js.UndefOr[Double] = js.native
  var Version: js.UndefOr[Buffer] = js.native
  var WhiteBalance: js.UndefOr[Double] = js.native
  var error: js.UndefOr[String] = js.native
}

object AnonAutoBracketing {
  @scala.inline
  def apply(): AnonAutoBracketing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAutoBracketing]
  }
  @scala.inline
  implicit class AnonAutoBracketingOps[Self <: AnonAutoBracketing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoBracketing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoBracketing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBracketing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoBracketing")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurWarning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlurWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlurWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withExposureWarning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposureWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposureWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashExposureComp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlashExposureComp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashExposureComp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlashExposureComp")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocusMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocusMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusWarning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocusWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocusWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withFujiFlashMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FujiFlashMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFujiFlashMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FujiFlashMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMacro(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Macro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacro: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Macro")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quality")(js.undefined)
        ret
    }
    @scala.inline
    def withSharpness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sharpness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharpness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sharpness")(js.undefined)
        ret
    }
    @scala.inline
    def withSlowSync(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlowSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlowSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlowSync")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
    @scala.inline
    def withWhiteBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhiteBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhiteBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhiteBalance")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
  }
  
}

