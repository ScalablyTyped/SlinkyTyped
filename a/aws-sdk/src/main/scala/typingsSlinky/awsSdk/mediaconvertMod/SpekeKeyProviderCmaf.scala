package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpekeKeyProviderCmaf extends StObject {
  
  /**
    * If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a certificate with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource Name (ARN) here.
    */
  var CertificateArn: js.UndefOr[stringPatternArnAwsUsGovAcm] = js.native
  
  /**
    * Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part of this CMAF package. The DASH manifest can currently signal up to three system IDs. For more information, see https://dashif.org/identifiers/content_protection/.
    */
  var DashSignaledSystemIds: js.UndefOr[listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.native
  
  /**
    * Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of this CMAF package. The HLS manifest can currently signal only one system ID. For more information, see https://dashif.org/identifiers/content_protection/.
    */
  var HlsSignaledSystemIds: js.UndefOr[listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.native
  
  /**
    * Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
    */
  var ResourceId: js.UndefOr[stringPatternW] = js.native
  
  /**
    * Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for encrypting your content.
    */
  var Url: js.UndefOr[stringPatternHttps] = js.native
}
object SpekeKeyProviderCmaf {
  
  @scala.inline
  def apply(): SpekeKeyProviderCmaf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpekeKeyProviderCmaf]
  }
  
  @scala.inline
  implicit class SpekeKeyProviderCmafMutableBuilder[Self <: SpekeKeyProviderCmaf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: stringPatternArnAwsUsGovAcm): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    @scala.inline
    def setDashSignaledSystemIds(value: listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12): Self = StObject.set(x, "DashSignaledSystemIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashSignaledSystemIdsUndefined: Self = StObject.set(x, "DashSignaledSystemIds", js.undefined)
    
    @scala.inline
    def setDashSignaledSystemIdsVarargs(value: stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12*): Self = StObject.set(x, "DashSignaledSystemIds", js.Array(value :_*))
    
    @scala.inline
    def setHlsSignaledSystemIds(value: listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12): Self = StObject.set(x, "HlsSignaledSystemIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsSignaledSystemIdsUndefined: Self = StObject.set(x, "HlsSignaledSystemIds", js.undefined)
    
    @scala.inline
    def setHlsSignaledSystemIdsVarargs(value: stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12*): Self = StObject.set(x, "HlsSignaledSystemIds", js.Array(value :_*))
    
    @scala.inline
    def setResourceId(value: stringPatternW): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setUrl(value: stringPatternHttps): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
