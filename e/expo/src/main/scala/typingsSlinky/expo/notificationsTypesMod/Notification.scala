package typingsSlinky.expo.notificationsTypesMod

import typingsSlinky.expo.expoStrings.received
import typingsSlinky.expo.expoStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  var data: js.Any = js.native
  var isMultiple: Boolean = js.native
  var origin: selected | received = js.native
  var remote: Boolean = js.native
}

object Notification {
  @scala.inline
  def apply(data: js.Any, isMultiple: Boolean, origin: selected | received, remote: Boolean): Notification = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isMultiple = isMultiple.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: selected | received): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

