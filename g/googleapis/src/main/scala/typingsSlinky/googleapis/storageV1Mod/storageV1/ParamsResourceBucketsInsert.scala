package typingsSlinky.googleapis.storageV1Mod.storageV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceBucketsInsert extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Apply a predefined set of access controls to this bucket.
    */
  var predefinedAcl: js.UndefOr[String] = js.native
  
  /**
    * Apply a predefined set of default object access controls to this bucket.
    */
  var predefinedDefaultObjectAcl: js.UndefOr[String] = js.native
  
  /**
    * A valid API project identifier.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * Set of properties to return. Defaults to noAcl, unless the bucket
    * resource specifies acl or defaultObjectAcl properties, when it defaults
    * to full.
    */
  var projection: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBucket] = js.native
  
  /**
    * The project to be billed for this request.
    */
  var userProject: js.UndefOr[String] = js.native
}
object ParamsResourceBucketsInsert {
  
  @scala.inline
  def apply(): ParamsResourceBucketsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBucketsInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceBucketsInsertMutableBuilder[Self <: ParamsResourceBucketsInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPredefinedAcl(value: String): Self = StObject.set(x, "predefinedAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedAclUndefined: Self = StObject.set(x, "predefinedAcl", js.undefined)
    
    @scala.inline
    def setPredefinedDefaultObjectAcl(value: String): Self = StObject.set(x, "predefinedDefaultObjectAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedDefaultObjectAclUndefined: Self = StObject.set(x, "predefinedDefaultObjectAcl", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaBucket): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
