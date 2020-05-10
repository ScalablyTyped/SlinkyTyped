package typingsSlinky.antvG2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDrawShape extends js.Object {
  var drawShape: js.Any = js.native
  var getMarkerCfg: js.UndefOr[js.Any] = js.native
  var getPoints: js.UndefOr[js.Any] = js.native
}

object AnonDrawShape {
  @scala.inline
  def apply(drawShape: js.Any): AnonDrawShape = {
    val __obj = js.Dynamic.literal(drawShape = drawShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDrawShape]
  }
  @scala.inline
  implicit class AnonDrawShapeOps[Self <: AnonDrawShape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawShape(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawShape")(value.asInstanceOf[js.Any])
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

