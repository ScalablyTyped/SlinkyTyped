package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersReturnLineItemResponse extends js.Object {
  
  /** The status of the execution. */
  var executionStatus: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersReturnLineItemResponse". */
  var kind: js.UndefOr[String] = js.native
}
object OrdersReturnLineItemResponse {
  
  @scala.inline
  def apply(): OrdersReturnLineItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersReturnLineItemResponse]
  }
  
  @scala.inline
  implicit class OrdersReturnLineItemResponseOps[Self <: OrdersReturnLineItemResponse] (val x: Self) extends AnyVal {
    
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
    def setExecutionStatus(value: String): Self = this.set("executionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionStatus: Self = this.set("executionStatus", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
