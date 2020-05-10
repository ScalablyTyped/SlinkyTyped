package typingsSlinky.mapsjs

import typingsSlinky.mapsjs.mod.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDistance extends js.Object {
  var distance: Double = js.native
  var pt: point = js.native
  var ptIdx: Double = js.native
  var setIdx: Double = js.native
}

object AnonDistance {
  @scala.inline
  def apply(distance: Double, pt: point, ptIdx: Double, setIdx: Double): AnonDistance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any], ptIdx = ptIdx.asInstanceOf[js.Any], setIdx = setIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDistance]
  }
  @scala.inline
  implicit class AnonDistanceOps[Self <: AnonDistance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPt(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPtIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ptIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIdx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

