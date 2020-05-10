package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageResizeModeStatic extends js.Object {
  /**
    * center - The image will be scaled down such that it is completely visible,
    * if bigger than the area of the view.
    * The image will not be scaled up.
    */
  var center: ImageResizeMode = js.native
  /**
    * contain - The image will be resized such that it will be completely
    * visible, contained within the frame of the View.
    */
  var contain: ImageResizeMode = js.native
  /**
    * cover - The image will be resized such that the entire area of the view
    * is covered by the image, potentially clipping parts of the image.
    */
  var cover: ImageResizeMode = js.native
  /**
    * repeat - The image will be repeated to cover the frame of the View. The
    * image will keep it's size and aspect ratio.
    */
  var repeat: ImageResizeMode = js.native
  /**
    * stretch - The image will be stretched to fill the entire frame of the
    * view without clipping.  This may change the aspect ratio of the image,
    * distoring it.  Only supported on iOS.
    */
  var stretch: ImageResizeMode = js.native
}

object ImageResizeModeStatic {
  @scala.inline
  def apply(
    center: ImageResizeMode,
    contain: ImageResizeMode,
    cover: ImageResizeMode,
    repeat: ImageResizeMode,
    stretch: ImageResizeMode
  ): ImageResizeModeStatic = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], contain = contain.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResizeModeStatic]
  }
  @scala.inline
  implicit class ImageResizeModeStaticOps[Self <: ImageResizeModeStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: ImageResizeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContain(value: ImageResizeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCover(value: ImageResizeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeat(value: ImageResizeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStretch(value: ImageResizeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

