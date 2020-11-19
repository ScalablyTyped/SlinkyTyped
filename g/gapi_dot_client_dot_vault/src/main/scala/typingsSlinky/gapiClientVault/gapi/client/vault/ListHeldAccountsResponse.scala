package typingsSlinky.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHeldAccountsResponse extends js.Object {
  
  /** The held accounts on a hold. */
  var accounts: js.UndefOr[js.Array[HeldAccount]] = js.native
}
object ListHeldAccountsResponse {
  
  @scala.inline
  def apply(): ListHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHeldAccountsResponse]
  }
  
  @scala.inline
  implicit class ListHeldAccountsResponseOps[Self <: ListHeldAccountsResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountsVarargs(value: HeldAccount*): Self = this.set("accounts", js.Array(value :_*))
    
    @scala.inline
    def setAccounts(value: js.Array[HeldAccount]): Self = this.set("accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccounts: Self = this.set("accounts", js.undefined)
  }
}
