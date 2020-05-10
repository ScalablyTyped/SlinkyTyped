package typingsSlinky.reactSvgPanZoom.mod

import typingsSlinky.reactSvgPanZoom.reactSvgPanZoomNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  var SVGHeight: Double = js.native
  var SVGWidth: Double = js.native
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var endX: js.UndefOr[Double | Null] = js.native
  var endY: js.UndefOr[Double | Null] = js.native
  var f: Double = js.native
  var focus: Boolean = js.native
  var miniatureOpen: Boolean = js.native
  var mode: Mode = js.native
  var startX: js.UndefOr[Double | Null] = js.native
  var startY: js.UndefOr[Double | Null] = js.native
  var version: `2` = js.native
  var viewerHeight: Double = js.native
  var viewerWidth: Double = js.native
}

object Value {
  @scala.inline
  def apply(
    SVGHeight: Double,
    SVGWidth: Double,
    a: Double,
    b: Double,
    c: Double,
    d: Double,
    e: Double,
    f: Double,
    focus: Boolean,
    miniatureOpen: Boolean,
    mode: Mode,
    version: `2`,
    viewerHeight: Double,
    viewerWidth: Double
  ): Value = {
    val __obj = js.Dynamic.literal(SVGHeight = SVGHeight.asInstanceOf[js.Any], SVGWidth = SVGWidth.asInstanceOf[js.Any], a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], miniatureOpen = miniatureOpen.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], viewerHeight = viewerHeight.asInstanceOf[js.Any], viewerWidth = viewerWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSVGHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVGHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVGWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVGWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiniatureOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniatureOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endX")(js.undefined)
        ret
    }
    @scala.inline
    def withEndXNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endX")(null)
        ret
    }
    @scala.inline
    def withEndY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endY")(js.undefined)
        ret
    }
    @scala.inline
    def withEndYNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endY")(null)
        ret
    }
    @scala.inline
    def withStartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(js.undefined)
        ret
    }
    @scala.inline
    def withStartXNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(null)
        ret
    }
    @scala.inline
    def withStartY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(js.undefined)
        ret
    }
    @scala.inline
    def withStartYNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(null)
        ret
    }
  }
  
}

