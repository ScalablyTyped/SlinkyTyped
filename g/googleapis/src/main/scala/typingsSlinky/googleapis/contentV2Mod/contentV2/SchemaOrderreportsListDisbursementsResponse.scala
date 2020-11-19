package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderreportsListDisbursementsResponse extends js.Object {
  
  /**
    * The list of disbursements.
    */
  var disbursements: js.UndefOr[js.Array[SchemaOrderReportDisbursement]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderreportsListDisbursementsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The token for the retrieval of the next page of disbursements.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaOrderreportsListDisbursementsResponse {
  
  @scala.inline
  def apply(): SchemaOrderreportsListDisbursementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreportsListDisbursementsResponse]
  }
  
  @scala.inline
  implicit class SchemaOrderreportsListDisbursementsResponseOps[Self <: SchemaOrderreportsListDisbursementsResponse] (val x: Self) extends AnyVal {
    
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
    def setDisbursementsVarargs(value: SchemaOrderReportDisbursement*): Self = this.set("disbursements", js.Array(value :_*))
    
    @scala.inline
    def setDisbursements(value: js.Array[SchemaOrderReportDisbursement]): Self = this.set("disbursements", value.asInstanceOf[js.Any])
    
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
