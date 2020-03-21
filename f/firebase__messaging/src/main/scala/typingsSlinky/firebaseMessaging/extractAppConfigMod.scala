package typingsSlinky.firebaseMessaging

import typingsSlinky.firebaseMessaging.appConfigMod.AppConfig
import typingsSlinky.firebaseMessaging.mod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/helpers/extract-app-config", JSImport.Namespace)
@js.native
object extractAppConfigMod extends js.Object {
  def extractAppConfig(app: FirebaseApp): AppConfig = js.native
}

