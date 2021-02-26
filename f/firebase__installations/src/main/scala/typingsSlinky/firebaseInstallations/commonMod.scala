package typingsSlinky.firebaseInstallations

import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.Response
import typingsSlinky.firebaseInstallations.anon.Code
import typingsSlinky.firebaseInstallations.apiResponseMod.GenerateAuthTokenResponse
import typingsSlinky.firebaseInstallations.appConfigMod.AppConfig
import typingsSlinky.firebaseInstallations.installationEntryMod.CompletedAuthToken
import typingsSlinky.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import typingsSlinky.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@firebase/installations/dist/src/api/common", "extractAuthTokenInfoFromResponse")
  @js.native
  def extractAuthTokenInfoFromResponse(response: GenerateAuthTokenResponse): CompletedAuthToken = js.native
  
  @JSImport("@firebase/installations/dist/src/api/common", "getErrorFromResponse")
  @js.native
  def getErrorFromResponse(requestName: String, response: Response): js.Promise[FirebaseError] = js.native
  
  @JSImport("@firebase/installations/dist/src/api/common", "getHeaders")
  @js.native
  def getHeaders(hasApiKey: AppConfig): Headers = js.native
  
  @JSImport("@firebase/installations/dist/src/api/common", "getHeadersWithAuth")
  @js.native
  def getHeadersWithAuth(appConfig: AppConfig, hasRefreshToken: RegisteredInstallationEntry): Headers = js.native
  
  @JSImport("@firebase/installations/dist/src/api/common", "getInstallationsEndpoint")
  @js.native
  def getInstallationsEndpoint(hasProjectId: AppConfig): String = js.native
  
  @JSImport("@firebase/installations/dist/src/api/common", "retryIfServerError")
  @js.native
  def retryIfServerError(fn: js.Function0[js.Promise[Response]]): js.Promise[Response] = js.native
  
  @js.native
  trait ErrorResponse extends StObject {
    
    var error: Code = js.native
  }
  object ErrorResponse {
    
    @scala.inline
    def apply(error: Code): ErrorResponse = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResponse]
    }
    
    @scala.inline
    implicit class ErrorResponseMutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
