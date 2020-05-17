package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstTangent extends js.Object {
  var firstTangent: js.UndefOr[Cartesian3] = js.native
  var lastTangent: js.UndefOr[Cartesian3] = js.native
  var points: js.Array[Cartesian3] = js.native
  var times: js.Array[Double] = js.native
}

object FirstTangent {
  @scala.inline
  def apply(points: js.Array[Cartesian3], times: js.Array[Double]): FirstTangent = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstTangent]
  }
  @scala.inline
  implicit class FirstTangentOps[Self <: FirstTangent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoints(value: js.Array[Cartesian3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstTangent(value: Cartesian3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstTangent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstTangent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstTangent")(js.undefined)
        ret
    }
    @scala.inline
    def withLastTangent(value: Cartesian3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTangent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastTangent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTangent")(js.undefined)
        ret
    }
  }
  
}

