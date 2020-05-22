package typingsSlinky.reactNativeMaterialUi.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avatar extends js.Object {
  var avatar: js.UndefOr[ReactElement] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Avatar {
  @scala.inline
  def apply(avatar: ReactElement = null, onPress: () => Unit = null): Avatar = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[Avatar]
  }
}

