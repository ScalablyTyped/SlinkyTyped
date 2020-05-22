package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.onClick
import typingsSlinky.devextreme.devextremeStrings.onHover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelayName extends js.Object {
  var delay: js.UndefOr[Show | Double] = js.undefined
  var name: js.UndefOr[onClick | onHover] = js.undefined
}

object DelayName {
  @scala.inline
  def apply(delay: Show | Double = null, name: onClick | onHover = null): DelayName = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayName]
  }
}

