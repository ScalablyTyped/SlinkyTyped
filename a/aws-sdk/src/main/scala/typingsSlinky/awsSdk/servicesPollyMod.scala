package typingsSlinky.awsSdk

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.awsSdk.presignerMod.Presigner.PresignerOptions
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/services/polly", JSImport.Namespace)
@js.native
object servicesPollyMod extends js.Object {
  
  @js.native
  class PollyCustomizations () extends Service
  /* static members */
  @js.native
  object PollyCustomizations extends js.Object {
    
    var Presigner: Instantiable1[
        /* options */ js.UndefOr[PresignerOptions], 
        typingsSlinky.awsSdk.presignerMod.Presigner
      ] = js.native
  }
}
