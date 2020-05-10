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

@js.native
trait CaptureOptions extends js.Object {
  /**
    * either png or jpg or webm (Android). Defaults to png. raw is a ARGB array of image pixels.
    */
  var format: js.UndefOr[jpg | png | webm | raw] = js.native
  /**
    * @see {CaptureOptions#width}
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * the quality. 0.0 - 1.0 (default). (only available on lossy formats like jpg)
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * the method you want to use to save the snapshot, one of:
    " - tmpfile" (default): save to a temporary file (that will only exist for as long as the app is running).
    " - base64": encode as base64 and returns the raw string. Use only with small images as this may result of
    *   lags (the string is sent over the bridge). N.B. This is not a data uri, use data-uri instead.
    " - data-uri": same as base64 but also includes the Data URI scheme header.
    " - zip-base64: compress data with zip deflate algorithm and than convert to base64 and return as a raw string."
    */
  var result: js.UndefOr[tmpfile | base64 | `data-uri` | `zip-base64`] = js.native
  /**
    * if true and when view is a ScrollView, the "content container" height will be evaluated instead of the
    * container height.
    */
  var snapshotContentContainer: js.UndefOr[Boolean] = js.native
  /**
    * (number): the width and height of the final image (resized from the View bound. don't provide it if you want
    * the original pixel size).
    */
  var width: js.UndefOr[Double] = js.native
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
    def withFormat(value: jpg | png | webm | raw): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: tmpfile | base64 | `data-uri` | `zip-base64`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotContentContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotContentContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotContentContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotContentContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

