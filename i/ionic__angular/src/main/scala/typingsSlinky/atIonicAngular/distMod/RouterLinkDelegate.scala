package typingsSlinky.atIonicAngular.distMod

import typingsSlinky.atAngularCommon.atAngularCommonMod.LocationStrategy
import typingsSlinky.atAngularCore.atAngularCoreMod.ElementRef
import typingsSlinky.atAngularRouter.atAngularRouterMod.Router
import typingsSlinky.atAngularRouter.atAngularRouterMod.RouterLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist", "RouterLinkDelegate")
@js.native
class RouterLinkDelegate protected ()
  extends typingsSlinky.atIonicAngular.distDirectivesNavigationRouterDashLinkDashDelegateMod.RouterLinkDelegate {
  def this(
    locationStrategy: LocationStrategy,
    navCtrl: typingsSlinky.atIonicAngular.distProvidersNavDashControllerMod.NavController,
    elementRef: ElementRef[_],
    router: Router
  ) = this()
  def this(
    locationStrategy: LocationStrategy,
    navCtrl: typingsSlinky.atIonicAngular.distProvidersNavDashControllerMod.NavController,
    elementRef: ElementRef[_],
    router: Router,
    routerLink: RouterLink
  ) = this()
}

