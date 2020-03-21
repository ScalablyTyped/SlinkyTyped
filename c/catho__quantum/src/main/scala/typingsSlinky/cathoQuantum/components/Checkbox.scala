package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.input.tag
import typingsSlinky.cathoQuantum.AnonBaseFontSize
import typingsSlinky.cathoQuantum.checkboxMod.CheckboxProps
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkbox
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.cathoQuantum.checkboxMod.Checkbox] {
  @JSImport("@catho/quantum/Checkbox", "Checkbox")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: checked, disabled, id */
  def apply(
    name: String,
    error: String = null,
    label: String = null,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    theme: AnonBaseFontSize = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.cathoQuantum.checkboxMod.Checkbox] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CheckboxProps
}

