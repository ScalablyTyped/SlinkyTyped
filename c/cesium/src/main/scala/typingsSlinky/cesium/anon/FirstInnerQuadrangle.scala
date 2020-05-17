package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Quaternion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstInnerQuadrangle extends js.Object {
  var firstInnerQuadrangle: js.UndefOr[Quaternion] = js.native
  var lastInnerQuadrangle: js.UndefOr[Quaternion] = js.native
  var points: js.Array[Quaternion] = js.native
  var times: js.Array[Double] = js.native
}

object FirstInnerQuadrangle {
  @scala.inline
  def apply(points: js.Array[Quaternion], times: js.Array[Double]): FirstInnerQuadrangle = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstInnerQuadrangle]
  }
  @scala.inline
  implicit class FirstInnerQuadrangleOps[Self <: FirstInnerQuadrangle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoints(value: js.Array[Quaternion]): Self = {
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
    def withFirstInnerQuadrangle(value: Quaternion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstInnerQuadrangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstInnerQuadrangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstInnerQuadrangle")(js.undefined)
        ret
    }
    @scala.inline
    def withLastInnerQuadrangle(value: Quaternion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastInnerQuadrangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastInnerQuadrangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastInnerQuadrangle")(js.undefined)
        ret
    }
  }
  
}

