package typingsSlinky.atFirebaseMessaging.atFirebaseMessagingMod.atFirebaseAppDashTypesMod

import typingsSlinky.atFirebaseMessaging.Anon_App
import typingsSlinky.atFirebaseMessagingDashTypes.atFirebaseMessagingDashTypesMod.FirebaseMessaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseNamespace extends js.Object {
  @JSName("messaging")
  var messaging_Original: Anon_App = js.native
  def messaging(): FirebaseMessaging = js.native
  def messaging(app: FirebaseApp): FirebaseMessaging = js.native
}

