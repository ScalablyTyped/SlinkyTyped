package typingsSlinky.giphyApi.mod

import typingsSlinky.giphyApi.AnonHeight
import typingsSlinky.giphyApi.AnonMp4
import typingsSlinky.giphyApi.BaseImagesizestring
import typingsSlinky.giphyApi.BaseImagesizestringframes
import typingsSlinky.giphyApi.BaseImagesizestringmp4str
import typingsSlinky.giphyApi.BaseImagesizestringwebpst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Images extends js.Object {
  var downsized: BaseImagesizestring = js.native
  var downsized_large: BaseImagesizestring = js.native
  var downsized_medium: BaseImagesizestring = js.native
  var downsized_small: BaseImagesizestring = js.native
  var downsized_still: BaseImage = js.native
  var fixed_height: BaseImagesizestringmp4str = js.native
  var fixed_height_downsampled: BaseImagesizestringwebpst = js.native
  var fixed_height_small: BaseImagesizestringmp4str = js.native
  var fixed_height_small_still: BaseImage = js.native
  var fixed_height_still: BaseImage = js.native
  var fixed_width: BaseImagesizestringmp4str = js.native
  var fixed_width_downsampled: BaseImagesizestringwebpst = js.native
  var fixed_width_small: BaseImagesizestringmp4str = js.native
  var fixed_width_small_still: BaseImage = js.native
  var fixed_width_still: BaseImage = js.native
  var looping: AnonMp4 = js.native
  var original: BaseImagesizestringframes = js.native
  var original_still: BaseImage = js.native
  var preview: AnonHeight = js.native
  var preview_gif: BaseImagesizestring = js.native
}

object Images {
  @scala.inline
  def apply(
    downsized: BaseImagesizestring,
    downsized_large: BaseImagesizestring,
    downsized_medium: BaseImagesizestring,
    downsized_small: BaseImagesizestring,
    downsized_still: BaseImage,
    fixed_height: BaseImagesizestringmp4str,
    fixed_height_downsampled: BaseImagesizestringwebpst,
    fixed_height_small: BaseImagesizestringmp4str,
    fixed_height_small_still: BaseImage,
    fixed_height_still: BaseImage,
    fixed_width: BaseImagesizestringmp4str,
    fixed_width_downsampled: BaseImagesizestringwebpst,
    fixed_width_small: BaseImagesizestringmp4str,
    fixed_width_small_still: BaseImage,
    fixed_width_still: BaseImage,
    looping: AnonMp4,
    original: BaseImagesizestringframes,
    original_still: BaseImage,
    preview: AnonHeight,
    preview_gif: BaseImagesizestring
  ): Images = {
    val __obj = js.Dynamic.literal(downsized = downsized.asInstanceOf[js.Any], downsized_large = downsized_large.asInstanceOf[js.Any], downsized_medium = downsized_medium.asInstanceOf[js.Any], downsized_small = downsized_small.asInstanceOf[js.Any], downsized_still = downsized_still.asInstanceOf[js.Any], fixed_height = fixed_height.asInstanceOf[js.Any], fixed_height_downsampled = fixed_height_downsampled.asInstanceOf[js.Any], fixed_height_small = fixed_height_small.asInstanceOf[js.Any], fixed_height_small_still = fixed_height_small_still.asInstanceOf[js.Any], fixed_height_still = fixed_height_still.asInstanceOf[js.Any], fixed_width = fixed_width.asInstanceOf[js.Any], fixed_width_downsampled = fixed_width_downsampled.asInstanceOf[js.Any], fixed_width_small = fixed_width_small.asInstanceOf[js.Any], fixed_width_small_still = fixed_width_small_still.asInstanceOf[js.Any], fixed_width_still = fixed_width_still.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], original_still = original_still.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], preview_gif = preview_gif.asInstanceOf[js.Any])
    __obj.asInstanceOf[Images]
  }
  @scala.inline
  implicit class ImagesOps[Self <: Images] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownsized(value: BaseImagesizestring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downsized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownsized_large(value: BaseImagesizestring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downsized_large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownsized_medium(value: BaseImagesizestring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downsized_medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownsized_small(value: BaseImagesizestring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downsized_small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownsized_still(value: BaseImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downsized_still")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixed_height(value: BaseImagesizestringmp4str): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixed_height_downsampled(value: BaseImagesizestringwebpst): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_height_downsampled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixed_height_small(value: BaseImagesizestringmp4str): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_height_small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixed_height_small_still(value: BaseImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_height_small_still")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixed_height_still(value: BaseImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_height_still")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixed_width(value: BaseImagesizestringmp4str): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixed_width_downsampled(value: BaseImagesizestringwebpst): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_width_downsampled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixed_width_small(value: BaseImagesizestringmp4str): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_width_small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixed_width_small_still(value: BaseImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_width_small_still")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixed_width_still(value: BaseImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_width_still")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLooping(value: AnonMp4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("looping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal(value: BaseImagesizestringframes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_still(value: BaseImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_still")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview_gif(value: BaseImagesizestring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview_gif")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

