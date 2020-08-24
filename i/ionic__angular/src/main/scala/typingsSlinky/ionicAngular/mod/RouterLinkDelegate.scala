package typingsSlinky.ionicAngular.mod

import typingsSlinky.angularCommon.mod.LocationStrategy
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularRouter.mod.Router
import typingsSlinky.angularRouter.mod.RouterLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular", "RouterLinkDelegate")
@js.native
class RouterLinkDelegate protected ()
  extends typingsSlinky.ionicAngular.routerLinkDelegateMod.RouterLinkDelegate {
  def this(
    locationStrategy: LocationStrategy,
    navCtrl: typingsSlinky.ionicAngular.navControllerMod.NavController,
    elementRef: ElementRef[_],
    router: Router
  ) = this()
  def this(
    locationStrategy: LocationStrategy,
    navCtrl: typingsSlinky.ionicAngular.navControllerMod.NavController,
    elementRef: ElementRef[_],
    router: Router,
    routerLink: RouterLink
  ) = this()
}

