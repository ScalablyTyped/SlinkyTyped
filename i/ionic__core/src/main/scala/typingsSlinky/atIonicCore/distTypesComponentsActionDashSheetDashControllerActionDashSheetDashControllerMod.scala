package typingsSlinky.atIonicCore

import typingsSlinky.atIonicCore.distTypesComponentsActionDashSheetActionDashSheetDashInterfaceMod.ActionSheetOptions
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonActionSheetElement
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typingsSlinky.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/action-sheet-controller/action-sheet-controller", JSImport.Namespace)
@js.native
object distTypesComponentsActionDashSheetDashControllerActionDashSheetDashControllerMod extends js.Object {
  @js.native
  class ActionSheetController ()
    extends ComponentInterface
       with OverlayController {
    /**
      * Create an action sheet overlay with action sheet options.
      *
      * @param options The options to use to create the action sheet.
      */
    def create(options: ActionSheetOptions): js.Promise[HTMLIonActionSheetElement] = js.native
  }
  
}

