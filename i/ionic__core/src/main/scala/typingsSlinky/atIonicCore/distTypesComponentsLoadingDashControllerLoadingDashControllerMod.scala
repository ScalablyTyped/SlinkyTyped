package typingsSlinky.atIonicCore

import typingsSlinky.atIonicCore.distTypesComponentsLoadingLoadingDashInterfaceMod.LoadingOptions
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonLoadingElement
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typingsSlinky.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/loading-controller/loading-controller", JSImport.Namespace)
@js.native
object distTypesComponentsLoadingDashControllerLoadingDashControllerMod extends js.Object {
  @js.native
  class LoadingController ()
    extends ComponentInterface
       with OverlayController {
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
  }
  
}

