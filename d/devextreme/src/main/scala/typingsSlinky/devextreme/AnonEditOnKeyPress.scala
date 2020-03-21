package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.column
import typingsSlinky.devextreme.devextremeStrings.moveFocus
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.row
import typingsSlinky.devextreme.devextremeStrings.startEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEditOnKeyPress extends js.Object {
  var editOnKeyPress: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var enterKeyAction: js.UndefOr[startEdit | moveFocus] = js.undefined
  var enterKeyDirection: js.UndefOr[none | column | row] = js.undefined
}

object AnonEditOnKeyPress {
  @scala.inline
  def apply(
    editOnKeyPress: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    enterKeyAction: startEdit | moveFocus = null,
    enterKeyDirection: none | column | row = null
  ): AnonEditOnKeyPress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(editOnKeyPress)) __obj.updateDynamic("editOnKeyPress")(editOnKeyPress.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (enterKeyAction != null) __obj.updateDynamic("enterKeyAction")(enterKeyAction.asInstanceOf[js.Any])
    if (enterKeyDirection != null) __obj.updateDynamic("enterKeyDirection")(enterKeyDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEditOnKeyPress]
  }
}

