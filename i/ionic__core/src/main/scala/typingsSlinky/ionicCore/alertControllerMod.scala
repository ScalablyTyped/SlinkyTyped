package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.alertInterfaceMod.AlertOptions
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonAlertElement
import typingsSlinky.ionicCore.overlaysInterfaceMod.OverlayController
import typingsSlinky.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/alert-controller/alert-controller", JSImport.Namespace)
@js.native
object alertControllerMod extends js.Object {
  @js.native
  class AlertController ()
    extends ComponentInterface
       with OverlayController {
    /**
      * Create an alert overlay with alert options.
      *
      * @param options The options to use to create the alert.
      */
    def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = js.native
  }
  
}

