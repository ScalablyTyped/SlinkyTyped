package typingsSlinky.cesium

import typingsSlinky.cesium.mod.InterpolationAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInterpolationAlgorithm extends js.Object {
  var interpolationAlgorithm: js.UndefOr[InterpolationAlgorithm] = js.native
  var interpolationDegree: js.UndefOr[Double] = js.native
}

object AnonInterpolationAlgorithm {
  @scala.inline
  def apply(): AnonInterpolationAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInterpolationAlgorithm]
  }
  @scala.inline
  implicit class AnonInterpolationAlgorithmOps[Self <: AnonInterpolationAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterpolationAlgorithm(value: InterpolationAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolationAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolationAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolationAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolationDegree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolationDegree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolationDegree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolationDegree")(js.undefined)
        ret
    }
  }
  
}

