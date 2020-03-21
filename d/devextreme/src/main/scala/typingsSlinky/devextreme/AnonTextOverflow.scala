package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.ellipsis
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTextOverflow extends js.Object {
  var font: js.UndefOr[Font] = js.undefined
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonTextOverflow {
  @scala.inline
  def apply(
    font: Font = null,
    textOverflow: ellipsis | hide | none = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonTextOverflow = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextOverflow]
  }
}

