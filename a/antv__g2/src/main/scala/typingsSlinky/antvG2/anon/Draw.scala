package typingsSlinky.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draw extends js.Object {
  var draw: js.Any = js.native
  var getMarkerCfg: js.UndefOr[js.Any] = js.native
  var getPoints: js.UndefOr[js.Any] = js.native
}

object Draw {
  @scala.inline
  def apply(draw: js.Any): Draw = {
    val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draw]
  }
  @scala.inline
  implicit class DrawOps[Self <: Draw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraw(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMarkerCfg(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkerCfg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetMarkerCfg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkerCfg")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPoints(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPoints")(js.undefined)
        ret
    }
  }
  
}

