package typingsSlinky.phonegapPluginBarcodescanner.phonegapBarcode

import typingsSlinky.phonegapPluginBarcodescanner.phonegapPluginBarcodescannerStrings.landscape
import typingsSlinky.phonegapPluginBarcodescanner.phonegapPluginBarcodescannerStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarcodeScanOptions extends js.Object {
  var disableAnimations: Boolean = js.native
  var disableSuccessBeep: js.UndefOr[Boolean] = js.native
  var formats: js.UndefOr[String] = js.native
  var orientation: js.UndefOr[landscape | portrait] = js.native
  var preferFrontCamera: js.UndefOr[Boolean] = js.native
  var prompt: js.UndefOr[String] = js.native
  var resultDisplayDuration: js.UndefOr[Double] = js.native
  var saveHistory: js.UndefOr[Boolean] = js.native
  var showFlipCameraButton: js.UndefOr[Boolean] = js.native
  var showTorchButton: js.UndefOr[Boolean] = js.native
  var torchOn: js.UndefOr[Boolean] = js.native
}

object BarcodeScanOptions {
  @scala.inline
  def apply(disableAnimations: Boolean): BarcodeScanOptions = {
    val __obj = js.Dynamic.literal(disableAnimations = disableAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScanOptions]
  }
  @scala.inline
  implicit class BarcodeScanOptionsOps[Self <: BarcodeScanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableSuccessBeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSuccessBeep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSuccessBeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSuccessBeep")(js.undefined)
        ret
    }
    @scala.inline
    def withFormats(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: landscape | portrait): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferFrontCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferFrontCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferFrontCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferFrontCamera")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withResultDisplayDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultDisplayDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultDisplayDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultDisplayDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFlipCameraButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFlipCameraButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFlipCameraButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFlipCameraButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTorchButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTorchButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTorchButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTorchButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTorchOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torchOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTorchOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torchOn")(js.undefined)
        ret
    }
  }
  
}

