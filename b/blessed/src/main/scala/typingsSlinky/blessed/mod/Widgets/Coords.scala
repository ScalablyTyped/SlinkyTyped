package typingsSlinky.blessed.mod.Widgets

import typingsSlinky.blessed.AnonX
import typingsSlinky.blessed.mod.Widgets.Types.TPosition
import typingsSlinky.blessed.mod.Widgets.Types.TTopLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coords extends js.Object {
  var _contentEnd: AnonX = js.native
  var base: Double = js.native
  var nobot: TPosition = js.native
  var noleft: TTopLeft = js.native
  var noright: TPosition = js.native
  var notop: TTopLeft = js.native
  var xi: Double = js.native
  var xl: Double = js.native
  var yi: Double = js.native
  var yl: Double = js.native
}

object Coords {
  @scala.inline
  def apply(
    _contentEnd: AnonX,
    base: Double,
    nobot: TPosition,
    noleft: TTopLeft,
    noright: TPosition,
    notop: TTopLeft,
    xi: Double,
    xl: Double,
    yi: Double,
    yl: Double
  ): Coords = {
    val __obj = js.Dynamic.literal(_contentEnd = _contentEnd.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], nobot = nobot.asInstanceOf[js.Any], noleft = noleft.asInstanceOf[js.Any], noright = noright.asInstanceOf[js.Any], notop = notop.asInstanceOf[js.Any], xi = xi.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], yi = yi.asInstanceOf[js.Any], yl = yl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coords]
  }
  @scala.inline
  implicit class CoordsOps[Self <: Coords] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_contentEnd(value: AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_contentEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNobot(value: TPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoleft(value: TTopLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noleft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoright(value: TPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotop(value: TTopLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

