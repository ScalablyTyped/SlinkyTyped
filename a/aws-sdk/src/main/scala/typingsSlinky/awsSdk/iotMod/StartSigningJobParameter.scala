package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSigningJobParameter extends StObject {
  
  /**
    * The location to write the code-signed file.
    */
  var destination: js.UndefOr[Destination] = js.native
  
  /**
    * The code-signing profile name.
    */
  var signingProfileName: js.UndefOr[SigningProfileName] = js.native
  
  /**
    * Describes the code-signing profile.
    */
  var signingProfileParameter: js.UndefOr[SigningProfileParameter] = js.native
}
object StartSigningJobParameter {
  
  @scala.inline
  def apply(): StartSigningJobParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSigningJobParameter]
  }
  
  @scala.inline
  implicit class StartSigningJobParameterMutableBuilder[Self <: StartSigningJobParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setSigningProfileName(value: SigningProfileName): Self = StObject.set(x, "signingProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningProfileNameUndefined: Self = StObject.set(x, "signingProfileName", js.undefined)
    
    @scala.inline
    def setSigningProfileParameter(value: SigningProfileParameter): Self = StObject.set(x, "signingProfileParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningProfileParameterUndefined: Self = StObject.set(x, "signingProfileParameter", js.undefined)
  }
}
