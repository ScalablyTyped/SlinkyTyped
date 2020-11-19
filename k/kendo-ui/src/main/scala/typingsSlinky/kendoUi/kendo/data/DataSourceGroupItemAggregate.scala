package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceGroupItemAggregate extends js.Object {
  
  var aggregate: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[String] = js.native
}
object DataSourceGroupItemAggregate {
  
  @scala.inline
  def apply(): DataSourceGroupItemAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceGroupItemAggregate]
  }
  
  @scala.inline
  implicit class DataSourceGroupItemAggregateOps[Self <: DataSourceGroupItemAggregate] (val x: Self) extends AnyVal {
    
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
    def setAggregate(value: String): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregate: Self = this.set("aggregate", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
}
