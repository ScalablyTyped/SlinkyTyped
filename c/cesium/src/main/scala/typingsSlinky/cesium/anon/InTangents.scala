package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InTangents extends js.Object {
  var inTangents: js.Array[Cartesian3] = js.native
  var outTangents: js.Array[Cartesian3] = js.native
  var points: js.Array[Cartesian3] = js.native
  var times: js.Array[Double] = js.native
}

object InTangents {
  @scala.inline
  def apply(
    inTangents: js.Array[Cartesian3],
    outTangents: js.Array[Cartesian3],
    points: js.Array[Cartesian3],
    times: js.Array[Double]
  ): InTangents = {
    val __obj = js.Dynamic.literal(inTangents = inTangents.asInstanceOf[js.Any], outTangents = outTangents.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[InTangents]
  }
  @scala.inline
  implicit class InTangentsOps[Self <: InTangents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInTangents(value: js.Array[Cartesian3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inTangents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutTangents(value: js.Array[Cartesian3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outTangents")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

