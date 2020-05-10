package typingsSlinky.reactNativeViewShot.mod

import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.continuous
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.mount
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewShotProperties extends js.Object {
  /**
    * - if not defined (default). the capture is not automatic and you need to use the ref and call capture()
    *   yourself.
    * - "mount". Capture the view once at mount. (It is important to understand image loading won't be waited, in
    *   such case you want to use "none" with viewShotRef.capture() after Image#onLoad.)
    * - "continuous" EXPERIMENTAL, this will capture A LOT of images continuously. For very specific use-cases.
    * - "update" EXPERIMENTAL, this will capture images each time React redraw (on did update). For very specific
    *   use-cases.
    */
  var captureMode: js.UndefOr[mount | continuous | update] = js.native
  /**
    * when a captureMode is defined, this callback will be called with the capture result.
    * @param {string} uri
    */
  var onCapture: js.UndefOr[js.Function1[/* uri */ String, Unit]] = js.native
  /**
    * when a captureMode is defined, this callback will be called when a capture fails.
    * @param {Error} error
    */
  var onCaptureFailure: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  var options: js.UndefOr[CaptureOptions] = js.native
  /**
    * style prop as ViewStyle
    */
  var style: js.UndefOr[ViewStyle] = js.native
}

object ViewShotProperties {
  @scala.inline
  def apply(): ViewShotProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewShotProperties]
  }
  @scala.inline
  implicit class ViewShotPropertiesOps[Self <: ViewShotProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureMode(value: mount | continuous | update): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCapture(value: /* uri */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCaptureFailure(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCaptureFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCaptureFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCaptureFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: CaptureOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

