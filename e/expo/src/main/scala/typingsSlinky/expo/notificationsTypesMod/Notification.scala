package typingsSlinky.expo.notificationsTypesMod

import typingsSlinky.expo.expoStrings.received
import typingsSlinky.expo.expoStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var data: js.Any
  var isMultiple: Boolean
  var origin: selected | received
  var remote: Boolean
}

object Notification {
  @scala.inline
  def apply(data: js.Any, isMultiple: Boolean, origin: selected | received, remote: Boolean): Notification = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isMultiple = isMultiple.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Notification]
  }
}

