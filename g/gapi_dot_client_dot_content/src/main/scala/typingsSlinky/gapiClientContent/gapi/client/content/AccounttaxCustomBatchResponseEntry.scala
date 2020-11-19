package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccounttaxCustomBatchResponseEntry extends js.Object {
  
  /** The retrieved or updated account tax settings. */
  var accountTax: js.UndefOr[AccountTax] = js.native
  
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#accounttaxCustomBatchResponseEntry". */
  var kind: js.UndefOr[String] = js.native
}
object AccounttaxCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): AccounttaxCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccounttaxCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class AccounttaxCustomBatchResponseEntryOps[Self <: AccounttaxCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
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
    def setAccountTax(value: AccountTax): Self = this.set("accountTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountTax: Self = this.set("accountTax", js.undefined)
    
    @scala.inline
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: Errors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
