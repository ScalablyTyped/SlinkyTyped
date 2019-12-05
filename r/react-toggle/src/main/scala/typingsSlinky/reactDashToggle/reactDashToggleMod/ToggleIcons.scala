package typingsSlinky.reactDashToggle.reactDashToggleMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleIcons extends js.Object {
  var checked: js.UndefOr[TagMod[Any]] = js.undefined
  var unchecked: js.UndefOr[TagMod[Any]] = js.undefined
}

object ToggleIcons {
  @scala.inline
  def apply(checked: TagMod[Any] = null, unchecked: TagMod[Any] = null): ToggleIcons = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (unchecked != null) __obj.updateDynamic("unchecked")(unchecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleIcons]
  }
}

