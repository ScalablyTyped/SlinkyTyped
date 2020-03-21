package typingsSlinky.reactNativeShare.mod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareSheetProps extends js.Object {
  var children: TagMod[Any]
  var overlayStyle: js.UndefOr[StyleProp[ViewProps]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewProps]] = js.undefined
  var visible: Boolean
  def onCancel(): Unit
}

object ShareSheetProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    onCancel: () => Unit,
    visible: Boolean,
    overlayStyle: StyleProp[ViewProps] = null,
    style: StyleProp[ViewProps] = null
  ): ShareSheetProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareSheetProps]
  }
}

