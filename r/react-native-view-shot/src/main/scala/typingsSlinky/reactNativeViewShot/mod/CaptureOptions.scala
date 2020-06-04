package typingsSlinky.reactNativeViewShot.mod

import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.`data-uri`
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.`zip-base64`
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.base64
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.jpg
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.png
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.raw
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.tmpfile
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.webm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureOptions extends js.Object {
  /**
    * either png or jpg or webm (Android). Defaults to png. raw is a ARGB array of image pixels.
    */
  var format: js.UndefOr[jpg | png | webm | raw] = js.undefined
  /**
    * @see {CaptureOptions#width}
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * the quality. 0.0 - 1.0 (default). (only available on lossy formats like jpg)
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * the method you want to use to save the snapshot, one of:
    " - tmpfile" (default): save to a temporary file (that will only exist for as long as the app is running).
    " - base64": encode as base64 and returns the raw string. Use only with small images as this may result of
    *   lags (the string is sent over the bridge). N.B. This is not a data uri, use data-uri instead.
    " - data-uri": same as base64 but also includes the Data URI scheme header.
    " - zip-base64: compress data with zip deflate algorithm and than convert to base64 and return as a raw string."
    */
  var result: js.UndefOr[tmpfile | base64 | `data-uri` | `zip-base64`] = js.undefined
  /**
    * if true and when view is a ScrollView, the "content container" height will be evaluated instead of the
    * container height.
    */
  var snapshotContentContainer: js.UndefOr[Boolean] = js.undefined
  /**
    * (number): the width and height of the final image (resized from the View bound. don't provide it if you want
    * the original pixel size).
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CaptureOptions {
  @scala.inline
  def apply(): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureOptions]
  }
  @scala.inline
  implicit class CaptureOptionsOps[Self <: CaptureOptions] (val x: Self) extends AnyVal {
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
    def setFormat(value: jpg | png | webm | raw): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setResult(value: tmpfile | base64 | `data-uri` | `zip-base64`): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setSnapshotContentContainer(value: Boolean): Self = this.set("snapshotContentContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotContentContainer: Self = this.set("snapshotContentContainer", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

