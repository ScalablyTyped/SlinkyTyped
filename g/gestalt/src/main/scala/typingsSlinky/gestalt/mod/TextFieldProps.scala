package typingsSlinky.gestalt.mod

import typingsSlinky.gestalt.AnonValue
import typingsSlinky.gestalt.AnonValueString
import typingsSlinky.gestalt.gestaltStrings.`current-password`
import typingsSlinky.gestalt.gestaltStrings.date
import typingsSlinky.gestalt.gestaltStrings.down
import typingsSlinky.gestalt.gestaltStrings.email
import typingsSlinky.gestalt.gestaltStrings.left
import typingsSlinky.gestalt.gestaltStrings.number
import typingsSlinky.gestalt.gestaltStrings.off
import typingsSlinky.gestalt.gestaltStrings.on
import typingsSlinky.gestalt.gestaltStrings.password
import typingsSlinky.gestalt.gestaltStrings.right
import typingsSlinky.gestalt.gestaltStrings.text
import typingsSlinky.gestalt.gestaltStrings.up
import typingsSlinky.gestalt.gestaltStrings.url
import typingsSlinky.gestalt.gestaltStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldProps extends js.Object {
  var autoComplete: js.UndefOr[`current-password` | on | off | username] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var id: String
  var idealErrorDirection: js.UndefOr[up | right | down | left] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* args */ AnonValueString, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ AnonValueString, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[date | email | number | password | text | url] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: AnonValue): Unit
}

object TextFieldProps {
  @scala.inline
  def apply(
    id: String,
    onChange: AnonValue => Unit,
    autoComplete: `current-password` | on | off | username = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    idealErrorDirection: up | right | down | left = null,
    name: String = null,
    onBlur: /* args */ AnonValueString => Unit = null,
    onFocus: /* args */ AnonValueString => Unit = null,
    placeholder: String = null,
    `type`: date | email | number | password | text | url = null,
    value: String = null
  ): TextFieldProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (idealErrorDirection != null) __obj.updateDynamic("idealErrorDirection")(idealErrorDirection.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
}

