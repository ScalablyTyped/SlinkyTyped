package typingsSlinky.reactSvgPanZoom.anon

import typingsSlinky.reactSvgPanZoom.mod.ToolbarPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  var SVGAlignX: js.UndefOr[/* "center" */ String] = js.native
  var SVGAlignY: js.UndefOr[/* "center" */ String] = js.native
  var position: js.UndefOr[ToolbarPosition] = js.native
}

object Position {
  @scala.inline
  def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSVGAlignX(value: /* "center" */ String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVGAlignX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSVGAlignX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVGAlignX")(js.undefined)
        ret
    }
    @scala.inline
    def withSVGAlignY(value: /* "center" */ String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVGAlignY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSVGAlignY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVGAlignY")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ToolbarPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

