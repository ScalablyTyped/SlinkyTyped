package typingsSlinky.reactMediumImageZoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageZoomProps extends js.Object {
  var defaultStyles: js.UndefOr[ImageZoomDefaultStyles] = js.native
  var image: ImageZoomImage = js.native
  var isZoomed: js.UndefOr[Boolean] = js.native
  var onUnzoom: js.UndefOr[js.Function0[js.Object]] = js.native
  var onZoom: js.UndefOr[js.Function0[js.Object]] = js.native
  var shouldHandleZoom: js.UndefOr[js.Function0[Boolean]] = js.native
  var shouldReplaceImage: js.UndefOr[Boolean] = js.native
  var shouldRespectMaxDimension: js.UndefOr[Boolean] = js.native
  var zoomImage: js.UndefOr[ImageZoomZoomImage] = js.native
  var zoomMargin: js.UndefOr[Double] = js.native
}

object ImageZoomProps {
  @scala.inline
  def apply(image: ImageZoomImage): ImageZoomProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageZoomProps]
  }
  @scala.inline
  implicit class ImageZoomPropsOps[Self <: ImageZoomProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: ImageZoomImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultStyles(value: ImageZoomDefaultStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withIsZoomed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isZoomed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsZoomed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isZoomed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnzoom(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnzoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUnzoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnzoom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoom(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldHandleZoom(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHandleZoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShouldHandleZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHandleZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldReplaceImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldReplaceImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldReplaceImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldReplaceImage")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldRespectMaxDimension(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRespectMaxDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldRespectMaxDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRespectMaxDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomImage(value: ImageZoomZoomImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomImage")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMargin")(js.undefined)
        ret
    }
  }
  
}

