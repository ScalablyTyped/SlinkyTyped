package typingsSlinky.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGmbAccountsGmbAccount extends StObject {
  
  /**
    * The email which identifies the GMB account.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Number of listings under this account.
    */
  var listingCount: js.UndefOr[String] = js.native
  
  /**
    * The name of the GMB account.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of the GMB account (User or Business).
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaGmbAccountsGmbAccount {
  
  @scala.inline
  def apply(): SchemaGmbAccountsGmbAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmbAccountsGmbAccount]
  }
  
  @scala.inline
  implicit class SchemaGmbAccountsGmbAccountMutableBuilder[Self <: SchemaGmbAccountsGmbAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setListingCount(value: String): Self = StObject.set(x, "listingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListingCountUndefined: Self = StObject.set(x, "listingCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
