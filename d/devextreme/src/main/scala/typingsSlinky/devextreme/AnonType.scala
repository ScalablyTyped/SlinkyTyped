package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.array
import typingsSlinky.devextreme.devextremeStrings.local
import typingsSlinky.devextreme.devextremeStrings.odata
import typingsSlinky.devextreme.devextremeStrings.xmla
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: js.UndefOr[array | local | odata | xmla] = js.undefined
}

object AnonType {
  @scala.inline
  def apply(`type`: array | local | odata | xmla = null): AnonType = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

