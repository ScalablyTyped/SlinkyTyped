package typingsSlinky.oracleOraclejet.ojchartMod.ojChart

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.xAxis
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.y2Axis
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.yAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait AxisTitleContext extends js.Object {
  var axis: xAxis | yAxis | y2Axis = js.native
  var subId: String = js.native
}

object AxisTitleContext {
  @scala.inline
  def apply(axis: xAxis | yAxis | y2Axis, subId: String): AxisTitleContext = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisTitleContext]
  }
  @scala.inline
  implicit class AxisTitleContextOps[Self <: AxisTitleContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: xAxis | yAxis | y2Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

