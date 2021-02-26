package typingsSlinky.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSigningJobRequest extends StObject {
  
  /**
    * String that identifies the signing request. All calls after the first that use this token return the same response as the first call.
    */
  var clientRequestToken: ClientRequestToken = js.native
  
  /**
    * The S3 bucket in which to save your signed object. The destination contains the name of your bucket and an optional prefix.
    */
  var destination: Destination = js.native
  
  /**
    * The name of the signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.native
  
  /**
    * The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
    */
  var source: Source = js.native
}
object StartSigningJobRequest {
  
  @scala.inline
  def apply(clientRequestToken: ClientRequestToken, destination: Destination, source: Source): StartSigningJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSigningJobRequest]
  }
  
  @scala.inline
  implicit class StartSigningJobRequestMutableBuilder[Self <: StartSigningJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
