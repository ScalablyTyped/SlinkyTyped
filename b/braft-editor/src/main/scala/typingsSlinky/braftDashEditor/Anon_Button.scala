package typingsSlinky.braftDashEditor

import slinky.core.TagMod
import typingsSlinky.braftDashEditor.braftDashEditorMod.ExtendControlType
import typingsSlinky.braftDashEditor.braftDashEditorStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends ExtendControlType {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[String | Null] = js.undefined
  var key: String
  var onClick: js.UndefOr[js.Function] = js.undefined
  var text: js.UndefOr[String | TagMod[Any]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: button
}

object Anon_Button {
  @scala.inline
  def apply(
    key: String,
    `type`: button,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    onClick: js.Function = null,
    text: String | TagMod[Any] = null,
    title: String = null
  ): Anon_Button = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Button]
  }
}

