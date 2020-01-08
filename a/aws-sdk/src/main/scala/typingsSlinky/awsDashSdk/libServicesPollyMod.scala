package typingsSlinky.awsDashSdk

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.awsDashSdk.libPollyPresignerMod.Presigner.PresignerOptions
import typingsSlinky.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/polly", JSImport.Namespace)
@js.native
object libServicesPollyMod extends js.Object {
  @js.native
  class PollyCustomizations () extends Service
  
  /* static members */
  @js.native
  object PollyCustomizations extends js.Object {
    var Presigner: Instantiable1[
        js.UndefOr[/* options */ PresignerOptions], 
        typingsSlinky.awsDashSdk.libPollyPresignerMod.Presigner
      ] = js.native
  }
  
}

