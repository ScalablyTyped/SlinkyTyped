package typingsSlinky.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateFilterData extends FilterValue {
  
  var `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.DateFilter = js.native
  
  var value: DateFilterValue = js.native
}
object DateFilterData {
  
  @scala.inline
  def apply(
    `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.DateFilter,
    value: DateFilterValue
  ): DateFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilterData]
  }
  
  @scala.inline
  implicit class DateFilterDataOps[Self <: DateFilterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.DateFilter): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: DateFilterValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
