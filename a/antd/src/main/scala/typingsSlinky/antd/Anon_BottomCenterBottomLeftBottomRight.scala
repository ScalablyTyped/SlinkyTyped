package typingsSlinky.antd

import typingsSlinky.antd.antdStrings.bottomCenter
import typingsSlinky.antd.antdStrings.bottomLeft
import typingsSlinky.antd.antdStrings.bottomRight
import typingsSlinky.antd.antdStrings.topCenter
import typingsSlinky.antd.antdStrings.topLeft
import typingsSlinky.antd.antdStrings.topRight
import typingsSlinky.antd.libDropdownDropdownDashButtonMod.DropdownButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomCenterBottomLeftBottomRight extends js.Object {
  var placement: js.UndefOr[bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter] = js.undefined
  var `type`: DropdownButtonType
}

object Anon_BottomCenterBottomLeftBottomRight {
  @scala.inline
  def apply(
    `type`: DropdownButtonType,
    placement: bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter = null
  ): Anon_BottomCenterBottomLeftBottomRight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomCenterBottomLeftBottomRight]
  }
}

