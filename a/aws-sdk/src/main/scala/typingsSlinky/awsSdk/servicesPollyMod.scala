package typingsSlinky.awsSdk

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.awsSdk.presignerMod.Presigner
import typingsSlinky.awsSdk.presignerMod.Presigner.PresignerOptions
import typingsSlinky.awsSdk.serviceMod.Service
import typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesPollyMod {
  
  @JSImport("aws-sdk/lib/services/polly", "PollyCustomizations")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  class PollyCustomizations () extends Service {
    def this(config: ServiceConfigurationOptions) = this()
  }
  /* static members */
  object PollyCustomizations {
    
    @JSImport("aws-sdk/lib/services/polly", "PollyCustomizations")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/lib/services/polly", "PollyCustomizations.Presigner")
    @js.native
    def Presigner: Instantiable1[
        /* options */ js.UndefOr[PresignerOptions], 
        typingsSlinky.awsSdk.presignerMod.Presigner
      ] = js.native
    @scala.inline
    def Presigner_=(x: Instantiable1[/* options */ js.UndefOr[PresignerOptions], Presigner]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Presigner")(x.asInstanceOf[js.Any])
  }
}
