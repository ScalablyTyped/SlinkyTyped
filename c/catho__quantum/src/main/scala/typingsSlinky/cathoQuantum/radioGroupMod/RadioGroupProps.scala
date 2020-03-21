package typingsSlinky.cathoQuantum.radioGroupMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import typingsSlinky.cathoQuantum.AnonColorsSpacing
import typingsSlinky.cathoQuantum.AnonDisabled
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.radio
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.ChangeEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupProps extends js.Object {
  var children: js.UndefOr[js.Array[TagMod[Any]] | TagMod[Any]] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var name: String
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var options: js.UndefOr[js.Array[AnonDisabled]] = js.undefined
  var theme: js.UndefOr[AnonColorsSpacing] = js.undefined
  var `type`: js.UndefOr[radio | button] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object RadioGroupProps {
  @scala.inline
  def apply(
    name: String,
    children: js.Array[TagMod[Any]] | TagMod[Any] = null,
    error: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    options: js.Array[AnonDisabled] = null,
    theme: AnonColorsSpacing = null,
    `type`: radio | button = null,
    value: String = null
  ): RadioGroupProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupProps]
  }
}

