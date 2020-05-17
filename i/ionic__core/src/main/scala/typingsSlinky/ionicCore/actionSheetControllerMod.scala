package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.actionSheetInterfaceMod.ActionSheetOptions
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonActionSheetElement
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayController
import typingsSlinky.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/action-sheet-controller/action-sheet-controller", JSImport.Namespace)
@js.native
object actionSheetControllerMod extends js.Object {
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

