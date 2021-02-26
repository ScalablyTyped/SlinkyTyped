package typingsSlinky.pulumiAws.inputMod.opsworks

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationSslConfiguration extends StObject {
  
  /**
    * The contents of the certificate's domain.crt file.
    */
  var certificate: Input[String] = js.native
  
  /**
    * Can be used to specify an intermediate certificate authority key or client authentication.
    */
  var chain: js.UndefOr[Input[String]] = js.native
  
  /**
    * The private key; the contents of the certificate's domain.key file.
    */
  var privateKey: Input[String] = js.native
}
object ApplicationSslConfiguration {
  
  @scala.inline
  def apply(certificate: Input[String], privateKey: Input[String]): ApplicationSslConfiguration = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSslConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationSslConfigurationMutableBuilder[Self <: ApplicationSslConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChain(value: Input[String]): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: Input[String]): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
  }
}
