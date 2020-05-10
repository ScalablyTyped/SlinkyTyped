package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleImageOptions extends js.Object {
  /**
    * Ignored if the current browser does not support image previews.
    *
    * If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a `Promise`.
    *
    * Once the resize is complete, your promise must be fulfilled.
    * You may, of course, reject your returned `Promise` is the resize fails in some way.
    */
  var customResizer: js.UndefOr[CustomResizerCallBack] = js.native
  /**
    * @default `false`
    */
  var includeExif: js.UndefOr[Boolean] = js.native
  /**
    * required
    */
  var maxSize: Double = js.native
  /**
    * @default `true`
    */
  var orient: js.UndefOr[Boolean] = js.native
  /**
    * number between `0` and `100`
    *
    * @default `80`
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * defaults to the type of the reference image
    */
  var `type`: js.UndefOr[String] = js.native
}

object ScaleImageOptions {
  @scala.inline
  def apply(maxSize: Double): ScaleImageOptions = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleImageOptions]
  }
  @scala.inline
  implicit class ScaleImageOptionsOps[Self <: ScaleImageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

