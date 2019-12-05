package typingsSlinky.atIonicAngular.distMod

import typingsSlinky.atAngularCommon.atAngularCommonMod.Location
import typingsSlinky.atAngularRouter.atAngularRouterMod.Router
import typingsSlinky.atAngularRouter.atAngularRouterMod.UrlSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist", "NavController")
@js.native
class NavController protected ()
  extends typingsSlinky.atIonicAngular.distProvidersNavDashControllerMod.NavController {
  def this(
    platform: typingsSlinky.atIonicAngular.distProvidersPlatformMod.Platform,
    location: Location,
    serializer: UrlSerializer
  ) = this()
  def this(
    platform: typingsSlinky.atIonicAngular.distProvidersPlatformMod.Platform,
    location: Location,
    serializer: UrlSerializer,
    router: Router
  ) = this()
}

