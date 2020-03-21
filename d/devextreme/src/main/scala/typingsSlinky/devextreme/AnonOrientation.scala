package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.horizontal
import typingsSlinky.devextreme.devextremeStrings.layered
import typingsSlinky.devextreme.devextremeStrings.off
import typingsSlinky.devextreme.devextremeStrings.tree
import typingsSlinky.devextreme.devextremeStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrientation extends js.Object {
  var orientation: js.UndefOr[auto | vertical | horizontal] = js.undefined
  var `type`: js.UndefOr[off | tree | layered] = js.undefined
}

object AnonOrientation {
  @scala.inline
  def apply(orientation: auto | vertical | horizontal = null, `type`: off | tree | layered = null): AnonOrientation = {
    val __obj = js.Dynamic.literal()
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrientation]
  }
}

