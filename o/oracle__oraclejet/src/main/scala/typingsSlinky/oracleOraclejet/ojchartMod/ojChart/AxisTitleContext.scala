package typingsSlinky.oracleOraclejet.ojchartMod.ojChart

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.xAxis
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.y2Axis
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.yAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait AxisTitleContext extends js.Object {
  var axis: xAxis | yAxis | y2Axis
  var subId: String
}

object AxisTitleContext {
  @scala.inline
  def apply(axis: xAxis | yAxis | y2Axis, subId: String): AxisTitleContext = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisTitleContext]
  }
}

