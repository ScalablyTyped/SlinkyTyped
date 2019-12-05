package typingsSlinky.atIonicCore

import typingsSlinky.atIonicCore.distTypesComponentsAlertAlertDashInterfaceMod.AlertOptions
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonAlertElement
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typingsSlinky.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/alert-controller/alert-controller", JSImport.Namespace)
@js.native
object distTypesComponentsAlertDashControllerAlertDashControllerMod extends js.Object {
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

