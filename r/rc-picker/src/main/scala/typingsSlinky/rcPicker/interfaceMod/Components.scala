package typingsSlinky.rcPicker.interfaceMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Components extends js.Object {
  var button: js.UndefOr[ReactComponentClass[js.Object] | String] = js.undefined
  var rangeItem: js.UndefOr[ReactComponentClass[js.Object] | String] = js.undefined
}

object Components {
  @scala.inline
  def apply(
    button: ReactComponentClass[js.Object] | String = null,
    rangeItem: ReactComponentClass[js.Object] | String = null
  ): Components = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (rangeItem != null) __obj.updateDynamic("rangeItem")(rangeItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
}

