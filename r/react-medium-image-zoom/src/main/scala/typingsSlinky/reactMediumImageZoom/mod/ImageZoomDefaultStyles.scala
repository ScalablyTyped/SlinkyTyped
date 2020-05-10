package typingsSlinky.reactMediumImageZoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageZoomDefaultStyles extends js.Object {
  var image: js.UndefOr[js.Object] = js.native
  var overlay: js.UndefOr[js.Object] = js.native
  var zoomContainer: js.UndefOr[js.Object] = js.native
  var zoomImage: js.UndefOr[js.Object] = js.native
}

object ImageZoomDefaultStyles {
  @scala.inline
  def apply(): ImageZoomDefaultStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageZoomDefaultStyles]
  }
  @scala.inline
  implicit class ImageZoomDefaultStylesOps[Self <: ImageZoomDefaultStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomContainer(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomImage(value: js.Object): Self = {
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
  }
  
}

