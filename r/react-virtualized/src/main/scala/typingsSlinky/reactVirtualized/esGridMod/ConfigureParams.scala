package typingsSlinky.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureParams extends js.Object {
  var cellCount: Double = js.native
  var estimatedCellSize: Double = js.native
}

object ConfigureParams {
  @scala.inline
  def apply(cellCount: Double, estimatedCellSize: Double): ConfigureParams = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], estimatedCellSize = estimatedCellSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureParams]
  }
  @scala.inline
  implicit class ConfigureParamsOps[Self <: ConfigureParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedCellSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedCellSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

