package typingsSlinky.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for StartEnvironment.
  */
@js.native
trait SchemaStartEnvironmentRequest extends StObject {
  
  /**
    * The initial access token passed to the environment. If this is present
    * and valid, the environment will be pre-authenticated with gcloud so that
    * the user can run gcloud commands in Cloud Shell without having to log in.
    * This code can be updated later by calling AuthorizeEnvironment.
    */
  var accessToken: js.UndefOr[String] = js.native
}
object SchemaStartEnvironmentRequest {
  
  @scala.inline
  def apply(): SchemaStartEnvironmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartEnvironmentRequest]
  }
  
  @scala.inline
  implicit class SchemaStartEnvironmentRequestMutableBuilder[Self <: SchemaStartEnvironmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
  }
}
