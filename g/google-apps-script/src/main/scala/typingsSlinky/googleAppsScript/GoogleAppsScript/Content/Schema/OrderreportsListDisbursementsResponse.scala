package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreportsListDisbursementsResponse extends js.Object {
  
  var disbursements: js.UndefOr[js.Array[OrderReportDisbursement]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
}
object OrderreportsListDisbursementsResponse {
  
  @scala.inline
  def apply(): OrderreportsListDisbursementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreportsListDisbursementsResponse]
  }
  
  @scala.inline
  implicit class OrderreportsListDisbursementsResponseOps[Self <: OrderreportsListDisbursementsResponse] (val x: Self) extends AnyVal {
    
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
    def setDisbursementsVarargs(value: OrderReportDisbursement*): Self = this.set("disbursements", js.Array(value :_*))
    
    @scala.inline
    def setDisbursements(value: js.Array[OrderReportDisbursement]): Self = this.set("disbursements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisbursements: Self = this.set("disbursements", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
