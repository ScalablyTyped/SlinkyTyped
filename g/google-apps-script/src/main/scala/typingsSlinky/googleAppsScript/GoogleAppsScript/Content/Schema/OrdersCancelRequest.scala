package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersCancelRequest extends js.Object {
  
  var operationId: js.UndefOr[String] = js.native
  
  var reason: js.UndefOr[String] = js.native
  
  var reasonText: js.UndefOr[String] = js.native
}
object OrdersCancelRequest {
  
  @scala.inline
  def apply(): OrdersCancelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCancelRequest]
  }
  
  @scala.inline
  implicit class OrdersCancelRequestOps[Self <: OrdersCancelRequest] (val x: Self) extends AnyVal {
    
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
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setReasonText(value: String): Self = this.set("reasonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonText: Self = this.set("reasonText", js.undefined)
  }
}
