package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDashNb extends js.Object {
  var dashNb: js.UndefOr[Double] = js.native
  var dashSize: js.UndefOr[Double] = js.native
  var gapSize: js.UndefOr[Double] = js.native
  var points: js.Array[Vector3] = js.native
}

object AnonDashNb {
  @scala.inline
  def apply(points: js.Array[Vector3]): AnonDashNb = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDashNb]
  }
  @scala.inline
  implicit class AnonDashNbOps[Self <: AnonDashNb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoints(value: js.Array[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashNb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashNb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashNb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashNb")(js.undefined)
        ret
    }
    @scala.inline
    def withDashSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGapSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSize")(js.undefined)
        ret
    }
  }
  
}

