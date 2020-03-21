package typingsSlinky.reactToastNotifications.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastContainerProps extends js.Object {
  var children: TagMod[Any]
  var hasToasts: Boolean
  var placement: Placement
}

object ToastContainerProps {
  @scala.inline
  def apply(children: TagMod[Any], hasToasts: Boolean, placement: Placement): ToastContainerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hasToasts = hasToasts.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToastContainerProps]
  }
}

