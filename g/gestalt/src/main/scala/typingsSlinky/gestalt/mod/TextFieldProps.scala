package typingsSlinky.gestalt.mod

import typingsSlinky.gestalt.anon.EventSyntheticEventValueString
import typingsSlinky.gestalt.anon.`1`
import typingsSlinky.gestalt.anon.`2`
import typingsSlinky.gestalt.gestaltStrings.`current-password`
import typingsSlinky.gestalt.gestaltStrings.`new-password`
import typingsSlinky.gestalt.gestaltStrings.date
import typingsSlinky.gestalt.gestaltStrings.email
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.number
import typingsSlinky.gestalt.gestaltStrings.off
import typingsSlinky.gestalt.gestaltStrings.on
import typingsSlinky.gestalt.gestaltStrings.password
import typingsSlinky.gestalt.gestaltStrings.text
import typingsSlinky.gestalt.gestaltStrings.url
import typingsSlinky.gestalt.gestaltStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldProps extends js.Object {
  var autoComplete: js.UndefOr[`current-password` | on | off | username | `new-password`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var helperText: js.UndefOr[String] = js.undefined
  var id: String
  var label: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* args */ `1`, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ `1`, Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* args */ `2`, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[md | lg] = js.undefined
  var `type`: js.UndefOr[date | email | number | password | text | url] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: EventSyntheticEventValueString): Unit
}

object TextFieldProps {
  @scala.inline
  def apply(
    id: String,
    onChange: EventSyntheticEventValueString => Unit,
    autoComplete: `current-password` | on | off | username | `new-password` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    helperText: String = null,
    label: String = null,
    name: String = null,
    onBlur: /* args */ `1` => Unit = null,
    onFocus: /* args */ `1` => Unit = null,
    onKeyDown: /* args */ `2` => Unit = null,
    placeholder: String = null,
    size: md | lg = null,
    `type`: date | email | number | password | text | url = null,
    value: String = null
  ): TextFieldProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
}

