package typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.ArrayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.TextFilterData
  - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.SelectFilterData
  - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.RegexFilterData
  - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.NumberFilterData
  - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.DateFilterData
  - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.ArrayFilterData
*/
trait FilterValue extends js.Object

object FilterValue {
  @scala.inline
  def NumberFilterData(
    `type`: typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.NumberFilter,
    value: NumberFilterValue
  ): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def RegexFilterData(
    `type`: typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.RegexFilter,
    value: String
  ): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def ArrayFilterData(`type`: ArrayFilter, value: js.Array[Double | String]): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def TextFilterData(
    `type`: typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.TextFilter,
    value: String
  ): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def SelectFilterData(
    `type`: typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.SelectFilter,
    value: String
  ): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def DateFilterData(
    `type`: typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.DateFilter,
    value: DateFilterValue
  ): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
}

