package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.input.tag
import typingsSlinky.cathoQuantum.AnonColorsSpacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.checkbox
import typingsSlinky.cathoQuantum.checkboxMod.CheckboxGroupProps
import typingsSlinky.cathoQuantum.checkboxMod.Options
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CheckboxGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.cathoQuantum.checkboxMod.CheckboxGroup] {
  @JSImport("@catho/quantum/Checkbox", "CheckboxGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    `type`: checkbox | button,
    error: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* items */ js.UndefOr[Options], /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit = null,
    options: Options = null,
    theme: AnonColorsSpacing = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.cathoQuantum.checkboxMod.CheckboxGroup] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.cathoQuantum.checkboxMod.CheckboxGroup] = new slinky.core.BuildingComponent[
  slinky.web.html.input.tag.type, 
  typingsSlinky.cathoQuantum.checkboxMod.CheckboxGroup](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CheckboxGroupProps
}

