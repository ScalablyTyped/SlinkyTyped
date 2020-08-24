package typingsSlinky.ionicAngular

import typingsSlinky.ionicAngular.overlayMod.OverlayBaseController
import typingsSlinky.ionicCore.alertInterfaceMod.AlertOptions
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonAlertElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/providers/alert-controller", JSImport.Namespace)
@js.native
object alertControllerMod extends js.Object {
  @js.native
  class AlertController () extends OverlayBaseController[AlertOptions, HTMLIonAlertElement]
  
}

