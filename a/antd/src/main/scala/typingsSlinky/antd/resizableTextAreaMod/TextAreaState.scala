package typingsSlinky.antd.resizableTextAreaMod

import typingsSlinky.antd.antdNumbers.`0`
import typingsSlinky.antd.antdNumbers.`1`
import typingsSlinky.antd.antdNumbers.`2`
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaState extends js.Object {
  /** We need add process style to disable scroll first and then add back to avoid unexpected scrollbar  */
  var resizeStatus: js.UndefOr[`0` | `1` | `2`] = js.undefined
  var textareaStyles: js.UndefOr[CSSProperties] = js.undefined
}

object TextAreaState {
  @scala.inline
  def apply(resizeStatus: `0` | `1` | `2` = null, textareaStyles: CSSProperties = null): TextAreaState = {
    val __obj = js.Dynamic.literal()
    if (resizeStatus != null) __obj.updateDynamic("resizeStatus")(resizeStatus.asInstanceOf[js.Any])
    if (textareaStyles != null) __obj.updateDynamic("textareaStyles")(textareaStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaState]
  }
}

