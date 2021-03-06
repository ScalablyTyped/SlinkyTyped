package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
  */
@js.native
trait ServiceAccountTokenProjection extends StObject {
  
  /**
    * Audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
    */
  var audience: js.UndefOr[Input[String]] = js.native
  
  /**
    * ExpirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
    */
  var expirationSeconds: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Path is the path relative to the mount point of the file to project the token into.
    */
  var path: Input[String] = js.native
}
object ServiceAccountTokenProjection {
  
  @scala.inline
  def apply(path: Input[String]): ServiceAccountTokenProjection = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountTokenProjection]
  }
  
  @scala.inline
  implicit class ServiceAccountTokenProjectionMutableBuilder[Self <: ServiceAccountTokenProjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: Input[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setExpirationSeconds(value: Input[Double]): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationSecondsUndefined: Self = StObject.set(x, "expirationSeconds", js.undefined)
    
    @scala.inline
    def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
