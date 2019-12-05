package typingsSlinky.atIonicCore

import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonToastElement
import typingsSlinky.atIonicCore.distTypesComponentsToastToastDashInterfaceMod.ToastOptions
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typingsSlinky.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/toast-controller/toast-controller", JSImport.Namespace)
@js.native
object distTypesComponentsToastDashControllerToastDashControllerMod extends js.Object {
  @js.native
  class ToastController ()
    extends ComponentInterface
       with OverlayController {
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
  }
  
}

