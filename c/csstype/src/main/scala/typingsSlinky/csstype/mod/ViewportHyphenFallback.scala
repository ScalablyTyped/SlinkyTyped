package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportHyphenFallback[TLength] extends js.Object {
  var `-ms-height`: js.UndefOr[ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]] = js.native
  var `-ms-max-height`: js.UndefOr[
    ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]
  ] = js.native
  var `-ms-max-width`: js.UndefOr[ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]] = js.native
  var `-ms-max-zoom`: js.UndefOr[ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]] = js.native
  var `-ms-min-height`: js.UndefOr[
    ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]
  ] = js.native
  var `-ms-min-width`: js.UndefOr[ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]] = js.native
  var `-ms-min-zoom`: js.UndefOr[ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]] = js.native
  var `-ms-orientation`: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.native
  var `-ms-user-zoom`: js.UndefOr[ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]] = js.native
  var `-ms-width`: js.UndefOr[ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]] = js.native
  var `-ms-zoom`: js.UndefOr[ViewportZoomProperty | js.Array[ViewportZoomProperty]] = js.native
  var `-o-orientation`: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.native
  var height: js.UndefOr[ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]] = js.native
  var `max-height`: js.UndefOr[
    ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]
  ] = js.native
  var `max-width`: js.UndefOr[ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]] = js.native
  var `max-zoom`: js.UndefOr[ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]] = js.native
  var `min-height`: js.UndefOr[
    ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]
  ] = js.native
  var `min-width`: js.UndefOr[ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]] = js.native
  var `min-zoom`: js.UndefOr[ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]] = js.native
  var orientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.native
  var `user-zoom`: js.UndefOr[ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]] = js.native
  var width: js.UndefOr[ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]] = js.native
  var zoom: js.UndefOr[ViewportZoomProperty | js.Array[ViewportZoomProperty]] = js.native
}

object ViewportHyphenFallback {
  @scala.inline
  def apply[TLength](): ViewportHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportHyphenFallback[TLength]]
  }
  @scala.inline
  implicit class ViewportHyphenFallbackOps[Self[tlength] <: ViewportHyphenFallback[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def `with-ms-height`(value: ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-ms-height`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-height")(js.undefined)
        ret
    }
    @scala.inline
    def `with-ms-max-height`(value: ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-max-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-ms-max-height`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-max-height")(js.undefined)
        ret
    }
    @scala.inline
    def `with-ms-max-width`(value: ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-max-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-ms-max-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-max-width")(js.undefined)
        ret
    }
    @scala.inline
    def `with-ms-max-zoom`(value: ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-max-zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-ms-max-zoom`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-max-zoom")(js.undefined)
        ret
    }
    @scala.inline
    def `with-ms-min-height`(value: ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-min-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-ms-min-height`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-min-height")(js.undefined)
        ret
    }
    @scala.inline
    def `with-ms-min-width`(value: ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-min-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-ms-min-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-min-width")(js.undefined)
        ret
    }
    @scala.inline
    def `with-ms-min-zoom`(value: ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-min-zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-ms-min-zoom`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-min-zoom")(js.undefined)
        ret
    }
    @scala.inline
    def `with-ms-orientation`(value: ViewportOrientationProperty | js.Array[ViewportOrientationProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-ms-orientation`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-orientation")(js.undefined)
        ret
    }
    @scala.inline
    def `with-ms-user-zoom`(value: ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-user-zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-ms-user-zoom`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-user-zoom")(js.undefined)
        ret
    }
    @scala.inline
    def `with-ms-width`(value: ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-ms-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-width")(js.undefined)
        ret
    }
    @scala.inline
    def `with-ms-zoom`(value: ViewportZoomProperty | js.Array[ViewportZoomProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-ms-zoom`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-ms-zoom")(js.undefined)
        ret
    }
    @scala.inline
    def `with-o-orientation`(value: ViewportOrientationProperty | js.Array[ViewportOrientationProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-o-orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-o-orientation`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-o-orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]): Self[TLength] = {
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
    def `withMax-height`(value: ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-height`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-width`(value: ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-zoom`(value: ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-zoom`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-zoom")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-height`(value: ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-height`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-width`(value: ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-zoom`(value: ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-zoom`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: ViewportOrientationProperty | js.Array[ViewportOrientationProperty]): Self[TLength] = {
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
    def `withUser-zoom`(value: ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUser-zoom`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]): Self[TLength] = {
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
    def withZoom(value: ViewportZoomProperty | js.Array[ViewportZoomProperty]): Self[TLength] = {
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

