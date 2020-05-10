package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingOptions extends js.Object {
  /**
    * Ignored if the current browser does not support image previews.
    *
    * If you want to use an alternate scaling library, you must contribute a function for this option that returns a Promise.
    * Once the resize is complete, your promise must be fulfilled. You may, of course, reject your returned Promise is the resize fails in some way
    *
    * @default `undefined`
    */
  var customResizer: js.UndefOr[CustomResizerCallBack] = js.native
  /**
    * A value between `1` and `100` that describes the requested quality of scaled images.
    *
    * Ignored unless the scaled image type target is `image/jpeg`
    *
    * @default `80`
    */
  var defaultQuality: js.UndefOr[Double] = js.native
  /**
    * Scaled images will assume this image type if you don't specify a specific type in your size object, or if the type specified in the size object is not valid.
    *
    * You generally should not use any value other than `image/jpeg` or `image/png` here.
    *
    * The default value of null will ensure the scaled image type is `PNG`, unless the original file is a `JPEG`, in which case the scaled file will also be a `JPEG`.
    * The default is probably the safest option.
    *
    * @default `null`
    */
  var defaultType: js.UndefOr[String] = js.native
  /**
    * Text sent to your `complete` event handler as an `error` property of the `response` param if a scaled image could not be generated
    *
    * @default `'failed to scale'`
    */
  var failureText: js.UndefOr[String] = js.native
  /**
    * Ensure the `EXIF` data from the reference image is inserted into the scaled image. Only applicable when both the reference and the target are type `image/jpeg`
    *
    * @default `false`
    */
  var includeExif: js.UndefOr[Boolean] = js.native
  /**
    * Set this to `false` if you do not want scaled images to be re-oriented based on parsed `EXIF` data before they are uploaded
    *
    * @default `true`
    */
  var orient: js.UndefOr[Boolean] = js.native
  /**
    * Set this to `false` if you don't want to original file to be uploaded as well
    *
    * @default `true`
    */
  var sendOriginal: js.UndefOr[Boolean] = js.native
  /**
    * An array containing size objects that describe scaled versions of each submitted image that should be generated and uploaded
    *
    * @default `[]`
    */
  var sizes: js.UndefOr[SizeOptions] = js.native
}

object ScalingOptions {
  @scala.inline
  def apply(): ScalingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingOptions]
  }
  @scala.inline
  implicit class ScalingOptionsOps[Self <: ScalingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomResizer(value: /* resizeInfo */ ResizeInfo => PromiseOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customResizer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomResizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customResizer")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureText")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeExif(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeExif: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExif")(js.undefined)
        ret
    }
    @scala.inline
    def withOrient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(js.undefined)
        ret
    }
    @scala.inline
    def withSendOriginal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendOriginal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendOriginal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendOriginal")(js.undefined)
        ret
    }
    @scala.inline
    def withSizes(value: SizeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(js.undefined)
        ret
    }
  }
  
}

