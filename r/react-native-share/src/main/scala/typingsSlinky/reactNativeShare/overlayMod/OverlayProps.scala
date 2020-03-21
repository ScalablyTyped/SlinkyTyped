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
  def apply(children: TagMod[Any], onCancel: () => Unit, visible: Boolean): OverlayProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OverlayProps]
  }
}

