package typingsSlinky.cathoQuantum.checkboxMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.cathoQuantum.AnonColorsSpacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.checkbox
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxGroupProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* items */ js.UndefOr[Options], 
      /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], 
      Unit
    ]
  ] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var theme: js.UndefOr[AnonColorsSpacing] = js.undefined
  var `type`: checkbox | button
}

object CheckboxGroupProps {
  @scala.inline
  def apply(
    `type`: checkbox | button,
    children: js.Array[ReactElement] | ReactElement = null,
    error: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* items */ js.UndefOr[Options], /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit = null,
    options: Options = null,
    theme: AnonColorsSpacing = null
  ): CheckboxGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxGroupProps]
  }
}

