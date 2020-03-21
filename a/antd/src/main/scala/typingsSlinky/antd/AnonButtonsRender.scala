package typingsSlinky.antd

import slinky.core.TagMod
import typingsSlinky.antd.antdStrings.bottomCenter
import typingsSlinky.antd.antdStrings.bottomLeft
import typingsSlinky.antd.antdStrings.bottomRight
import typingsSlinky.antd.antdStrings.topCenter
import typingsSlinky.antd.antdStrings.topLeft
import typingsSlinky.antd.antdStrings.topRight
import typingsSlinky.antd.dropdownButtonMod.DropdownButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonsRender extends js.Object {
  var placement: js.UndefOr[bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter] = js.undefined
  var `type`: DropdownButtonType
  def buttonsRender(buttons: js.Array[TagMod[Any]]): js.Array[TagMod[Any]]
}

object AnonButtonsRender {
  @scala.inline
  def apply(
    buttonsRender: js.Array[TagMod[Any]] => js.Array[TagMod[Any]],
    `type`: DropdownButtonType,
    placement: bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter = null
  ): AnonButtonsRender = {
    val __obj = js.Dynamic.literal(buttonsRender = js.Any.fromFunction1(buttonsRender))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonsRender]
  }
}

