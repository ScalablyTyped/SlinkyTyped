package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.ArrayFilter
import org.scalablytyped.runtime.StObject
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
trait FilterValue extends StObject
object FilterValue {
  
  @scala.inline
  def ArrayFilterData(`type`: ArrayFilter, value: js.Array[Double | String]): typingsSlinky.reactBootstrapTable.mod.ArrayFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactBootstrapTable.mod.ArrayFilterData]
  }
  
  @scala.inline
  def DateFilterData(
    `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.DateFilter,
    value: DateFilterValue
  ): typingsSlinky.reactBootstrapTable.mod.DateFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactBootstrapTable.mod.DateFilterData]
  }
  
  @scala.inline
  def NumberFilterData(
    `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter,
    value: NumberFilterValue
  ): typingsSlinky.reactBootstrapTable.mod.NumberFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactBootstrapTable.mod.NumberFilterData]
  }
  
  @scala.inline
  def RegexFilterData(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter, value: String): typingsSlinky.reactBootstrapTable.mod.RegexFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactBootstrapTable.mod.RegexFilterData]
  }
  
  @scala.inline
  def SelectFilterData(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter, value: String): typingsSlinky.reactBootstrapTable.mod.SelectFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactBootstrapTable.mod.SelectFilterData]
  }
  
  @scala.inline
  def TextFilterData(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.TextFilter, value: String): typingsSlinky.reactBootstrapTable.mod.TextFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactBootstrapTable.mod.TextFilterData]
  }
}
