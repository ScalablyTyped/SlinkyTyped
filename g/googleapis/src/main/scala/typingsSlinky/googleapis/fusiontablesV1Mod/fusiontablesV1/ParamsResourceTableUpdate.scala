package typingsSlinky.googleapis.fusiontablesV1Mod.fusiontablesV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceTableUpdate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Should the view definition also be updated? The specified view definition
    * replaces the existing one. Only a view can be updated with a new
    * definition.
    */
  var replaceViewDefinition: js.UndefOr[Boolean] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTable] = js.native
  
  /**
    * ID of the table that is being updated.
    */
  var tableId: js.UndefOr[String] = js.native
}
object ParamsResourceTableUpdate {
  
  @scala.inline
  def apply(): ParamsResourceTableUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTableUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceTableUpdateMutableBuilder[Self <: ParamsResourceTableUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setReplaceViewDefinition(value: Boolean): Self = StObject.set(x, "replaceViewDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceViewDefinitionUndefined: Self = StObject.set(x, "replaceViewDefinition", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaTable): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
