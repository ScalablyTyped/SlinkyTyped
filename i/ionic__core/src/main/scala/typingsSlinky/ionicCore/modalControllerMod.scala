package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.componentsMod.global.HTMLIonModalElement
import typingsSlinky.ionicCore.mod.ComponentRef
import typingsSlinky.ionicCore.modalInterfaceMod.ModalOptions
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayController
import typingsSlinky.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/modal-controller/modal-controller", JSImport.Namespace)
@js.native
object modalControllerMod extends js.Object {
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

