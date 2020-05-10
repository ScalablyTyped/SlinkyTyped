package typingsSlinky.fineUploader.mod

import typingsSlinky.fineUploader.coreMod.CustomResizerCallBack
import typingsSlinky.fineUploader.coreMod.PromiseOptions
import typingsSlinky.fineUploader.coreMod.ResizeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIThumbnailsOptions extends js.Object {
  /**
    * Ignored if the current browser does not support image previews.
    *
    * If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a Promise.
    * Once the resize is complete, your promise must be fulfilled.
    *
    * You may, of course, reject your returned Promise is the resize fails in some way
    *
    * @default `undefined`
    */
  var customResizer: js.UndefOr[CustomResizerCallBack] = js.native
  /**
    * Maximum number of previews to render per Fine Uploader instance.
    *
    * A call to the reset method resets this value as well
    *
    * @default `0`
    */
  var maxCount: js.UndefOr[Double] = js.native
  /**
    *
    */
  var placeholders: js.UndefOr[UIThumbnailsPlaceholderOptions] = js.native
  /**
    * The amount of time, in milliseconds, to pause between each preview generation process.
    *
    * This is in place to prevent the UI thread from locking up for a continuously long period of time, as preview generation can be a resource-intensive process
    *
    * @default `750`
    */
  var timeBetweenThumbs: js.UndefOr[Double] = js.native
}

object UIThumbnailsOptions {
  @scala.inline
  def apply(): UIThumbnailsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIThumbnailsOptions]
  }
  @scala.inline
  implicit class UIThumbnailsOptionsOps[Self <: UIThumbnailsOptions] (val x: Self) extends AnyVal {
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
    def withMaxCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholders(value: UIThumbnailsPlaceholderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholders")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeBetweenThumbs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeBetweenThumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeBetweenThumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeBetweenThumbs")(js.undefined)
        ret
    }
  }
  
}

