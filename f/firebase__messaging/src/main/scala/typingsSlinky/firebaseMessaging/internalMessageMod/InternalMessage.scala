package typingsSlinky.firebaseMessaging.internalMessageMod

import typingsSlinky.firebaseMessaging.AnonPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalMessage extends js.Object {
  var firebaseMessaging: AnonPayload = js.native
}

object InternalMessage {
  @scala.inline
  def apply(firebaseMessaging: AnonPayload): InternalMessage = {
    val __obj = js.Dynamic.literal(firebaseMessaging = firebaseMessaging.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalMessage]
  }
  @scala.inline
  implicit class InternalMessageOps[Self <: InternalMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirebaseMessaging(value: AnonPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firebaseMessaging")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

