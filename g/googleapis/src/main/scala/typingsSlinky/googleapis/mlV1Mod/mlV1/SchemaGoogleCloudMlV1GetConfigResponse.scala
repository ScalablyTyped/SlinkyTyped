package typingsSlinky.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns service account information associated with a project.
  */
@js.native
trait SchemaGoogleCloudMlV1GetConfigResponse extends StObject {
  
  var config: js.UndefOr[SchemaGoogleCloudMlV1Config] = js.native
  
  /**
    * The service account Cloud ML uses to access resources in the project.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  
  /**
    * The project number for `service_account`.
    */
  var serviceAccountProject: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1GetConfigResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1GetConfigResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1GetConfigResponseMutableBuilder[Self <: SchemaGoogleCloudMlV1GetConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: SchemaGoogleCloudMlV1Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountProject(value: String): Self = StObject.set(x, "serviceAccountProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountProjectUndefined: Self = StObject.set(x, "serviceAccountProject", js.undefined)
    
    @scala.inline
    def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
