package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.componentsMod.global.HTMLIonLoadingElement
import typingsSlinky.ionicCore.loadingInterfaceMod.LoadingOptions
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayController
import typingsSlinky.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/loading-controller/loading-controller", JSImport.Namespace)
@js.native
object loadingControllerMod extends js.Object {
  @js.native
  class LoadingController ()
    extends ComponentInterface
       with OverlayController {
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
  }
  
}

