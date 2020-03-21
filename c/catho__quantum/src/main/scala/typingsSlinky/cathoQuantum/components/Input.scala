package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.input.tag
import typingsSlinky.cathoQuantum.AnonBaseFontSizeColors
import typingsSlinky.cathoQuantum.cathoQuantumStrings.email
import typingsSlinky.cathoQuantum.cathoQuantumStrings.number
import typingsSlinky.cathoQuantum.cathoQuantumStrings.password
import typingsSlinky.cathoQuantum.cathoQuantumStrings.search
import typingsSlinky.cathoQuantum.cathoQuantumStrings.tel
import typingsSlinky.cathoQuantum.cathoQuantumStrings.text
import typingsSlinky.cathoQuantum.inputMod.CustomValidate
import typingsSlinky.cathoQuantum.inputMod.InputProps
import typingsSlinky.cathoQuantum.inputMod.Mask
import typingsSlinky.cathoQuantum.inputMod.Validate
import typingsSlinky.cathoQuantum.inputMod.default
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Input
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@catho/quantum/Input", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id, name, placeholder, required */
  def apply(
    descriptionLabel: String = null,
    error: String = null,
    helperText: String = null,
    label: String = null,
    mask: Mask | js.Array[Mask] = null,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    onClean: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    theme: AnonBaseFontSizeColors = null,
    `type`: email | text | tel | number | password | search = null,
    validate: Validate | CustomValidate | (js.Array[Validate | CustomValidate]) = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (descriptionLabel != null) __obj.updateDynamic("descriptionLabel")(descriptionLabel.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClean != null) __obj.updateDynamic("onClean")(js.Any.fromFunction1(onClean))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.input.tag.type, typingsSlinky.cathoQuantum.inputMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InputProps
}

