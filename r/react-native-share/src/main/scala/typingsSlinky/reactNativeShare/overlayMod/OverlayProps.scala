package typingsSlinky.reactNativeShare.overlayMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps extends js.Object {
  var children: TagMod[Any]
  var visible: Boolean
  def onCancel(): Unit
}

object OverlayProps {
  @scala.inline
  def apply(onCancel: () => Unit, visible: Boolean, children: TagMod[Any] = null): OverlayProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}

