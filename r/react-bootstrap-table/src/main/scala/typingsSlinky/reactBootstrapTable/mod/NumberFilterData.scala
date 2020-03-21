package typingsSlinky.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFilterData extends FilterValue {
  var `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter
  var value: NumberFilterValue
}

object NumberFilterData {
  @scala.inline
  def apply(
    `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter,
    value: NumberFilterValue
  ): NumberFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFilterData]
  }
}

