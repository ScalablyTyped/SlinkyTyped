package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsCustomBatchResponseEntry extends js.Object {
  
  /** The retrieved, created, or updated account. Not defined if the method was `delete`, `claimwebsite` or `link`. */
  var account: js.UndefOr[Account] = js.native
  
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#accountsCustomBatchResponseEntry`" */
  var kind: js.UndefOr[String] = js.native
}
object AccountsCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): AccountsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class AccountsCustomBatchResponseEntryOps[Self <: AccountsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: Account): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
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
