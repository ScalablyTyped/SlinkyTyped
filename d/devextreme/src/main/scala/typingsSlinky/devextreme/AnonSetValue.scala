package typingsSlinky.devextreme

import typingsSlinky.devextreme.mod.DevExpress.ui.dxFilterBuilderField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSetValue extends js.Object {
  var field: js.UndefOr[dxFilterBuilderField] = js.undefined
  var setValue: js.UndefOr[js.Function] = js.undefined
  var value: js.UndefOr[String | Double | js.Date] = js.undefined
}

object AnonSetValue {
  @scala.inline
  def apply(
    field: dxFilterBuilderField = null,
    setValue: js.Function = null,
    value: String | Double | js.Date = null
  ): AnonSetValue = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(setValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSetValue]
  }
}

