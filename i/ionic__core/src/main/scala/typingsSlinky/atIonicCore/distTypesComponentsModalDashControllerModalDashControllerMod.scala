package typingsSlinky.atIonicCore

import typingsSlinky.atIonicCore.atIonicCoreMod.ComponentRef
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonModalElement
import typingsSlinky.atIonicCore.distTypesComponentsModalModalDashInterfaceMod.ModalOptions
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typingsSlinky.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/modal-controller/modal-controller", JSImport.Namespace)
@js.native
object distTypesComponentsModalDashControllerModalDashControllerMod extends js.Object {
  @js.native
  class ModalController ()
    extends ComponentInterface
       with OverlayController {
    /**
      * Create a modal overlay with modal options.
      *
      * @param options The options to use to create the modal.
      */
    def create[T /* <: ComponentRef */](options: ModalOptions[T]): js.Promise[HTMLIonModalElement] = js.native
  }
  
}

