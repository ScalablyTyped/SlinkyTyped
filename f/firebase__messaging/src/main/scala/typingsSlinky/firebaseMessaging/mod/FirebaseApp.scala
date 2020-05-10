package typingsSlinky.firebaseMessaging.mod

import typingsSlinky.firebaseMessagingTypes.mod.FirebaseMessaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseApp extends js.Object {
  def messaging(): FirebaseMessaging = js.native
}

object FirebaseApp {
  @scala.inline
  def apply(messaging: () => FirebaseMessaging): FirebaseApp = {
    val __obj = js.Dynamic.literal(messaging = js.Any.fromFunction0(messaging))
    __obj.asInstanceOf[FirebaseApp]
  }
  @scala.inline
  implicit class FirebaseAppOps[Self <: FirebaseApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessaging(value: () => FirebaseMessaging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messaging")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

