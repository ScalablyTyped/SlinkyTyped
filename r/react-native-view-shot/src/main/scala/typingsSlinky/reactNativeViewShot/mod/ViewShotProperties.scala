package typingsSlinky.reactNativeViewShot.mod

import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.continuous
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.mount
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var captureMode: js.UndefOr[mount | continuous | update] = js.undefined
  /**
    * when a captureMode is defined, this callback will be called with the capture result.
    * @param {string} uri
    */
  var onCapture: js.UndefOr[js.Function1[/* uri */ String, Unit]] = js.undefined
  /**
    * when a captureMode is defined, this callback will be called when a capture fails.
    * @param {Error} error
    */
  var onCaptureFailure: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var options: js.UndefOr[CaptureOptions] = js.undefined
  /**
    * style prop as ViewStyle
    */
  var style: js.UndefOr[ViewStyle] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaptureMode(value: mount | continuous | update): Self = this.set("captureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureMode: Self = this.set("captureMode", js.undefined)
    @scala.inline
    def setOnCapture(value: /* uri */ String => Unit): Self = this.set("onCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCapture: Self = this.set("onCapture", js.undefined)
    @scala.inline
    def setOnCaptureFailure(value: /* error */ js.Error => Unit): Self = this.set("onCaptureFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCaptureFailure: Self = this.set("onCaptureFailure", js.undefined)
    @scala.inline
    def setOptions(value: CaptureOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

