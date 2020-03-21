package typingsSlinky.firebaseAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReason extends js.Object {
  var reason: js.Error
}

object AnonReason {
  @scala.inline
  def apply(reason: js.Error): AnonReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReason]
  }
}

