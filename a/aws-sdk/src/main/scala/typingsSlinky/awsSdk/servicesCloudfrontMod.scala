package typingsSlinky.awsSdk

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.awsSdk.cloudfrontSignerMod.Signer
import typingsSlinky.awsSdk.serviceMod.Service
import typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesCloudfrontMod {
  
  @JSImport("aws-sdk/lib/services/cloudfront", "CloudFrontCustomizations")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  class CloudFrontCustomizations () extends Service {
    def this(config: ServiceConfigurationOptions) = this()
  }
  /* static members */
  object CloudFrontCustomizations {
    
    @JSImport("aws-sdk/lib/services/cloudfront", "CloudFrontCustomizations")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/lib/services/cloudfront", "CloudFrontCustomizations.Signer")
    @js.native
    def Signer: Instantiable2[
        /* keyPairId */ String, 
        /* privateKey */ String, 
        typingsSlinky.awsSdk.cloudfrontSignerMod.Signer
      ] = js.native
    @scala.inline
    def Signer_=(x: Instantiable2[/* keyPairId */ String, /* privateKey */ String, Signer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Signer")(x.asInstanceOf[js.Any])
  }
}
