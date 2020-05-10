package typingsSlinky.heremaps.H.map.Icon

import typingsSlinky.heremaps.H.map.HitArea
import typingsSlinky.heremaps.H.math.IPoint
import typingsSlinky.heremaps.H.math.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used to initialize a Icon
  * @property size {H.math.ISize=} - The icon's size in pixel, default is the bitmap's natural size
  * @property anchor {H.math.IPoint=} - The anchorage point in pixel, default is bottom-center
  * @property hitArea {H.map.HitArea=} - The area to use for hit detection, default is the whole rectangular area
  * @property asCanvas {H.map.HitArea=} - Indicates whether a non canvas bitmap is converted into a canvas, default is true. The conversion improves the rendering performance but it could
  * also cause a higher memory consumption.
  * @property crossOrigin {boolean} - Specifies whether to use anonynous Cross-Origin Resource Sharing (CORS) when fetching an image to prevent resulting canvas from tainting, default is
  * false. The option is ignored by IE9-10.
  */
@js.native
trait Options extends js.Object {
  var anchor: js.UndefOr[IPoint] = js.native
  var asCanvas: js.UndefOr[HitArea] = js.native
  var crossOrigin: Boolean = js.native
  var hitArea: js.UndefOr[HitArea] = js.native
  var size: js.UndefOr[ISize | Double] = js.native
}

object Options {
  @scala.inline
  def apply(crossOrigin: Boolean): Options = {
    val __obj = js.Dynamic.literal(crossOrigin = crossOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossOrigin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchor(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAsCanvas(value: HitArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asCanvas")(js.undefined)
        ret
    }
    @scala.inline
    def withHitArea(value: HitArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitArea")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: ISize | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

