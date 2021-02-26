package typingsSlinky.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningPlatformOverrides extends StObject {
  
  /**
    * A signing configuration that overrides the default encryption or hash algorithm of a signing job.
    */
  var signingConfiguration: js.UndefOr[SigningConfigurationOverrides] = js.native
  
  /**
    * A signed image is a JSON object. When overriding the default signing platform configuration, a customer can select either of two signing formats, JSONEmbedded or JSONDetached. (A third format value, JSON, is reserved for future use.) With JSONEmbedded, the signing image has the payload embedded in it. With JSONDetached, the payload is not be embedded in the signing image.
    */
  var signingImageFormat: js.UndefOr[ImageFormat] = js.native
}
object SigningPlatformOverrides {
  
  @scala.inline
  def apply(): SigningPlatformOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningPlatformOverrides]
  }
  
  @scala.inline
  implicit class SigningPlatformOverridesMutableBuilder[Self <: SigningPlatformOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSigningConfiguration(value: SigningConfigurationOverrides): Self = StObject.set(x, "signingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningConfigurationUndefined: Self = StObject.set(x, "signingConfiguration", js.undefined)
    
    @scala.inline
    def setSigningImageFormat(value: ImageFormat): Self = StObject.set(x, "signingImageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningImageFormatUndefined: Self = StObject.set(x, "signingImageFormat", js.undefined)
  }
}
