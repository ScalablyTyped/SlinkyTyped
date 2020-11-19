package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.ArrayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBootstrapTable.mod.TextFilterData
  - typingsSlinky.reactBootstrapTable.mod.SelectFilterData
  - typingsSlinky.reactBootstrapTable.mod.RegexFilterData
  - typingsSlinky.reactBootstrapTable.mod.NumberFilterData
  - typingsSlinky.reactBootstrapTable.mod.DateFilterData
  - typingsSlinky.reactBootstrapTable.mod.ArrayFilterData
*/
trait FilterValue extends js.Object
object FilterValue {
  
  @scala.inline
  def RegexFilterData(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter, value: String): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  
  @scala.inline
  def NumberFilterData(
    `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter,
    value: NumberFilterValue
  ): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  
  @scala.inline
  def TextFilterData(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.TextFilter, value: String): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  
  @scala.inline
  def SelectFilterData(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter, value: String): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  
  @scala.inline
  def DateFilterData(
    `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.DateFilter,
    value: DateFilterValue
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
}
