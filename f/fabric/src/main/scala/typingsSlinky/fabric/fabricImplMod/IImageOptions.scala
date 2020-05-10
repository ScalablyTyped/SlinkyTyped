package typingsSlinky.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImageOptions extends IObjectOptions {
  /**
  	 * key used to retrieve the texture representing this image
  	 * @since 2.0.0
  	 * @type String
  	 */
  var cacheKey: js.UndefOr[String] = js.native
  /**
  	 * Image crop in pixels from original image size.
  	 * @since 2.0.0
  	 * @type Number
  	 */
  var cropX: js.UndefOr[Double] = js.native
  /**
  	 * Image crop in pixels from original image size.
  	 * @since 2.0.0
  	 * @type Number
  	 */
  var cropY: js.UndefOr[Double] = js.native
  /**
  	 * crossOrigin value (one of "", "anonymous", "allow-credentials")
  	 */
  var crossOrigin: js.UndefOr[String] = js.native
  /**
  	 * Image filter array
  	 */
  var filters: js.UndefOr[js.Array[IBaseFilter]] = js.native
  /**
  	 * minimum scale factor under which any resizeFilter is triggered to resize the image
  	 * 0 will disable the automatic resize. 1 will trigger automatically always.
  	 * number bigger than 1 are not implemented yet.
  	 * @type Number
  	 */
  var minimumScaleTrigger: js.UndefOr[Double] = js.native
  /**
  	 * When calling {@link fabric.Image.getSrc}, return value from element src with `element.getAttribute('src')`.
  	 * This allows for relative urls as image src.
  	 * @since 2.7.0
  	 * @type Boolean
  	 */
  var srcFromAttribute: js.UndefOr[Boolean] = js.native
}

object IImageOptions {
  @scala.inline
  def apply(): IImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImageOptions]
  }
  @scala.inline
  implicit class IImageOptionsOps[Self <: IImageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCropX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropX")(js.undefined)
        ret
    }
    @scala.inline
    def withCropY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropY")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[IBaseFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumScaleTrigger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumScaleTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumScaleTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumScaleTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcFromAttribute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcFromAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcFromAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcFromAttribute")(js.undefined)
        ret
    }
  }
  
}

