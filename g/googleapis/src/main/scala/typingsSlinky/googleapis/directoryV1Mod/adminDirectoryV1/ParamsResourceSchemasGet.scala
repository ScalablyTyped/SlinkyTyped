package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceSchemasGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Immutable ID of the G Suite account
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * Name or immutable ID of the schema
    */
  var schemaKey: js.UndefOr[String] = js.native
}
object ParamsResourceSchemasGet {
  
  @scala.inline
  def apply(): ParamsResourceSchemasGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSchemasGet]
  }
  
  @scala.inline
  implicit class ParamsResourceSchemasGetMutableBuilder[Self <: ParamsResourceSchemasGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setSchemaKey(value: String): Self = StObject.set(x, "schemaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaKeyUndefined: Self = StObject.set(x, "schemaKey", js.undefined)
  }
}
