package typingsSlinky.paypalRestSdk.mod.payment

import typingsSlinky.paypalRestSdk.mod.Amount
import typingsSlinky.paypalRestSdk.mod.Response
import typingsSlinky.paypalRestSdk.mod.SaleResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaleResponse
  extends SaleResource
     with Response {
  
  /* InferMemberOverrides */
  override val create_time: js.UndefOr[String] = js.native
}
object SaleResponse {
  
  @scala.inline
  def apply(amount: Amount, httpStatusCode: Double, id: String): SaleResponse = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaleResponse]
  }
  
  @scala.inline
  implicit class SaleResponseOps[Self <: SaleResponse] (val x: Self) extends AnyVal {
    
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
    def setCreate_time(value: String): Self = this.set("create_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate_time: Self = this.set("create_time", js.undefined)
  }
}
