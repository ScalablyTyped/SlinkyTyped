package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.onHover
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShowMode extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.undefined
  var position: js.UndefOr[bottom | top] = js.undefined
  var showMode: js.UndefOr[always | onHover] = js.undefined
}

object AnonShowMode {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    format: format = null,
    position: bottom | top = null,
    showMode: always | onHover = null
  ): AnonShowMode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showMode != null) __obj.updateDynamic("showMode")(showMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShowMode]
  }
}

