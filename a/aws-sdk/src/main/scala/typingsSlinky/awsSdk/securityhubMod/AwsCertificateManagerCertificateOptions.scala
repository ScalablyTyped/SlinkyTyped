package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCertificateManagerCertificateOptions extends StObject {
  
  /**
    * Whether to add the certificate to a transparency log. Valid values: DISABLED | ENABLED 
    */
  var CertificateTransparencyLoggingPreference: js.UndefOr[NonEmptyString] = js.native
}
object AwsCertificateManagerCertificateOptions {
  
  @scala.inline
  def apply(): AwsCertificateManagerCertificateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateOptions]
  }
  
  @scala.inline
  implicit class AwsCertificateManagerCertificateOptionsMutableBuilder[Self <: AwsCertificateManagerCertificateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateTransparencyLoggingPreference(value: NonEmptyString): Self = StObject.set(x, "CertificateTransparencyLoggingPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateTransparencyLoggingPreferenceUndefined: Self = StObject.set(x, "CertificateTransparencyLoggingPreference", js.undefined)
  }
}
