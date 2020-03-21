package typingsSlinky.ionicAngular.distMod

import typingsSlinky.angularCommon.mod.Location
import typingsSlinky.angularRouter.mod.Router
import typingsSlinky.angularRouter.mod.UrlSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist", "NavController")
@js.native
class NavController protected ()
  extends typingsSlinky.ionicAngular.navControllerMod.NavController {
  def this(
    platform: typingsSlinky.ionicAngular.platformMod.Platform,
    location: Location,
    serializer: UrlSerializer
  ) = this()
  def this(
    platform: typingsSlinky.ionicAngular.platformMod.Platform,
    location: Location,
    serializer: UrlSerializer,
    router: Router
  ) = this()
}

