package typingsSlinky.azdata.mod

import typingsSlinky.azdata.azdataStrings.bold
import typingsSlinky.azdata.azdataStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardDescriptionItem extends js.Object {
  var fontWeight: js.UndefOr[normal | bold] = js.undefined
  var label: String
  var tooltip: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CardDescriptionItem {
  @scala.inline
  def apply(label: String, fontWeight: normal | bold = null, tooltip: String = null, value: String = null): CardDescriptionItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardDescriptionItem]
  }
}

