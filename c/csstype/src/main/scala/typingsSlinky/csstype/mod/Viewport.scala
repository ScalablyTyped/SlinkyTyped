package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewport[TLength] extends js.Object {
  var OOrientation: js.UndefOr[ViewportOrientationProperty] = js.native
  var height: js.UndefOr[ViewportHeightProperty[TLength]] = js.native
  var maxHeight: js.UndefOr[ViewportMaxHeightProperty[TLength]] = js.native
  var maxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength]] = js.native
  var maxZoom: js.UndefOr[ViewportMaxZoomProperty] = js.native
  var minHeight: js.UndefOr[ViewportMinHeightProperty[TLength]] = js.native
  var minWidth: js.UndefOr[ViewportMinWidthProperty[TLength]] = js.native
  var minZoom: js.UndefOr[ViewportMinZoomProperty] = js.native
  var msHeight: js.UndefOr[ViewportHeightProperty[TLength]] = js.native
  var msMaxHeight: js.UndefOr[ViewportMaxHeightProperty[TLength]] = js.native
  var msMaxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength]] = js.native
  var msMaxZoom: js.UndefOr[ViewportMaxZoomProperty] = js.native
  var msMinHeight: js.UndefOr[ViewportMinHeightProperty[TLength]] = js.native
  var msMinWidth: js.UndefOr[ViewportMinWidthProperty[TLength]] = js.native
  var msMinZoom: js.UndefOr[ViewportMinZoomProperty] = js.native
  var msOrientation: js.UndefOr[ViewportOrientationProperty] = js.native
  var msUserZoom: js.UndefOr[ViewportUserZoomProperty] = js.native
  var msWidth: js.UndefOr[ViewportWidthProperty[TLength]] = js.native
  var msZoom: js.UndefOr[ViewportZoomProperty] = js.native
  var orientation: js.UndefOr[ViewportOrientationProperty] = js.native
  var userZoom: js.UndefOr[ViewportUserZoomProperty] = js.native
  var width: js.UndefOr[ViewportWidthProperty[TLength]] = js.native
  var zoom: js.UndefOr[ViewportZoomProperty] = js.native
}

object Viewport {
  @scala.inline
  def apply[TLength](): Viewport[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewport[TLength]]
  }
  @scala.inline
  implicit class ViewportOps[Self[tlength] <: Viewport[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withOOrientation(value: ViewportOrientationProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOOrientation: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: ViewportHeightProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: ViewportMaxHeightProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: ViewportMaxWidthProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: ViewportMaxZoomProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: ViewportMinHeightProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: ViewportMinWidthProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: ViewportMinZoomProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMsHeight(value: ViewportHeightProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsHeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMsMaxHeight(value: ViewportMaxHeightProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsMaxHeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMsMaxWidth(value: ViewportMaxWidthProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsMaxWidth: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMsMaxZoom(value: ViewportMaxZoomProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMaxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsMaxZoom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMaxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMsMinHeight(value: ViewportMinHeightProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMinHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsMinHeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMinHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMsMinWidth(value: ViewportMinWidthProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsMinWidth: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMinWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMsMinZoom(value: ViewportMinZoomProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMinZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsMinZoom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMinZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMsOrientation(value: ViewportOrientationProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsOrientation: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withMsUserZoom(value: ViewportUserZoomProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msUserZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsUserZoom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msUserZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMsWidth(value: ViewportWidthProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsWidth: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMsZoom(value: ViewportZoomProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsZoom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: ViewportOrientationProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withUserZoom(value: ViewportUserZoomProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserZoom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: ViewportWidthProperty[TLength]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: ViewportZoomProperty): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

