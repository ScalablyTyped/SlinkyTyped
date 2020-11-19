package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountsAuthInfoResponse extends js.Object {
  
  /**
    * The account identifiers corresponding to the authenticated user. - For an
    * individual account: only the merchant ID is defined - For an aggregator:
    * only the aggregator ID is defined - For a subaccount of an MCA: both the
    * merchant ID and the aggregator ID are defined.
    */
  var accountIdentifiers: js.UndefOr[js.Array[SchemaAccountIdentifier]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountsAuthInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAccountsAuthInfoResponse {
  
  @scala.inline
  def apply(): SchemaAccountsAuthInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsAuthInfoResponse]
  }
  
  @scala.inline
  implicit class SchemaAccountsAuthInfoResponseOps[Self <: SchemaAccountsAuthInfoResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountIdentifiersVarargs(value: SchemaAccountIdentifier*): Self = this.set("accountIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setAccountIdentifiers(value: js.Array[SchemaAccountIdentifier]): Self = this.set("accountIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountIdentifiers: Self = this.set("accountIdentifiers", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
