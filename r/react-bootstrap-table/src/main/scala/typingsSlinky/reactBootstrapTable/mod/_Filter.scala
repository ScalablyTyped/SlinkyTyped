package typingsSlinky.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Filter extends js.Object
object _Filter {
  
  @scala.inline
  def TextFilter(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.TextFilter): _Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
  
  @scala.inline
  def RegexFilter(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter): _Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
  
  @scala.inline
  def NumberFilter(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter): _Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
  
  @scala.inline
  def SelectFilter(
    options: SelectFilterOptionsType,
    `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter
  ): _Filter = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
  
  @scala.inline
  def DateFilter(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.DateFilter): _Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
}
