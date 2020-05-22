package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.array
import typingsSlinky.devextreme.devextremeStrings.local
import typingsSlinky.devextreme.devextremeStrings.odata
import typingsSlinky.devextreme.devextremeStrings.xmla
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: js.UndefOr[array | local | odata | xmla] = js.undefined
}

object Type {
  @scala.inline
  def apply(`type`: array | local | odata | xmla = null): Type = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

