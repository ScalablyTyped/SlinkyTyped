package typingsSlinky.mirrorx.mod

import slinky.core.TagMod
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var location: js.UndefOr[Location[LocationState]] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(children: TagMod[Any] = null, location: Location[LocationState] = null): SwitchProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchProps]
  }
}

