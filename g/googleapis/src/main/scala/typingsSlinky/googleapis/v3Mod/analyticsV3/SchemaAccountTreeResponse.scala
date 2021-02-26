package typingsSlinky.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics account tree response. The account tree
  * response is used in the provisioning api to return the result of creating
  * an account, property, and view (profile).
  */
@js.native
trait SchemaAccountTreeResponse extends StObject {
  
  /**
    * The account created.
    */
  var account: js.UndefOr[SchemaAccount] = js.native
  
  /**
    * Resource type for account ticket.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * View (Profile) for the account.
    */
  var profile: js.UndefOr[SchemaProfile] = js.native
  
  /**
    * Web property for the account.
    */
  var webproperty: js.UndefOr[SchemaWebproperty] = js.native
}
object SchemaAccountTreeResponse {
  
  @scala.inline
  def apply(): SchemaAccountTreeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTreeResponse]
  }
  
  @scala.inline
  implicit class SchemaAccountTreeResponseMutableBuilder[Self <: SchemaAccountTreeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: SchemaAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProfile(value: SchemaProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setWebproperty(value: SchemaWebproperty): Self = StObject.set(x, "webproperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebpropertyUndefined: Self = StObject.set(x, "webproperty", js.undefined)
  }
}
