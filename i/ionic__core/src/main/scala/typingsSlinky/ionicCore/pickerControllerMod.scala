package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.componentsMod._Global_.HTMLIonPickerElement
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayController
import typingsSlinky.ionicCore.pickerInterfaceMod.PickerOptions
import typingsSlinky.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/picker-controller/picker-controller", JSImport.Namespace)
@js.native
object pickerControllerMod extends js.Object {
  @js.native
  class PickerController ()
    extends ComponentInterface
       with OverlayController {
    /**
      * Create a picker overlay with picker options.
      *
      * @param options The options to use to create the picker.
      */
    def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = js.native
  }
  
}

