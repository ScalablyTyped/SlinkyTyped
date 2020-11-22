package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreturnsCreateOrderReturnResponse extends js.Object {
  
  /** The status of the execution. Acceptable values are: - "`duplicate`" - "`executed`" */
  var executionStatus: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#orderreturnsCreateOrderReturnResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Created order return. */
  var orderReturn: js.UndefOr[MerchantOrderReturn] = js.native
}
object OrderreturnsCreateOrderReturnResponse {
  
  @scala.inline
  def apply(): OrderreturnsCreateOrderReturnResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsCreateOrderReturnResponse]
  }
  
  @scala.inline
  implicit class OrderreturnsCreateOrderReturnResponseOps[Self <: OrderreturnsCreateOrderReturnResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setOrderReturn(value: MerchantOrderReturn): Self = this.set("orderReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderReturn: Self = this.set("orderReturn", js.undefined)
  }
}
