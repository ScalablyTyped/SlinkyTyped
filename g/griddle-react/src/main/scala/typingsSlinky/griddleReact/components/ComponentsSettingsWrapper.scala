package typingsSlinky.griddleReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.griddleReact.mod.GriddleComponent
import typingsSlinky.griddleReact.mod.components.SettingsProps
import typingsSlinky.griddleReact.mod.components.SettingsToggleProps
import typingsSlinky.griddleReact.mod.components.SettingsWrapper
import typingsSlinky.griddleReact.mod.components.SettingsWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsSettingsWrapper
  extends ExternalComponentWithAttributesWithRefType[tag.type, SettingsWrapper] {
  @JSImport("griddle-react", "components.SettingsWrapper")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    Settings: GriddleComponent[SettingsProps] = null,
    SettingsToggle: GriddleComponent[SettingsToggleProps] = null,
    isEnabled: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, SettingsWrapper] = {
    val __obj = js.Dynamic.literal()
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    if (SettingsToggle != null) __obj.updateDynamic("SettingsToggle")(SettingsToggle.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, SettingsWrapper] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.griddleReact.mod.components.SettingsWrapper](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SettingsWrapperProps
}

