package typingsSlinky.firebaseMessaging.anon

import typingsSlinky.firebaseMessaging.mod.FirebaseApp
import typingsSlinky.firebaseMessagingTypes.mod.FirebaseMessaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Call extends js.Object {
  def apply(): FirebaseMessaging = js.native
  def apply(app: FirebaseApp): FirebaseMessaging = js.native
  def isSupported(): Boolean = js.native
}

