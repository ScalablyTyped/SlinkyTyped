package typingsSlinky.griddleDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.griddleDashReact.griddleDashReactMod.GriddleComponent
import typingsSlinky.griddleDashReact.griddleDashReactMod.components.SettingsProps
import typingsSlinky.griddleDashReact.griddleDashReactMod.components.SettingsToggleProps
import typingsSlinky.griddleDashReact.griddleDashReactMod.components.SettingsWrapper
import typingsSlinky.griddleDashReact.griddleDashReactMod.components.SettingsWrapperProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsSettingsWrapper
  extends ExternalComponentWithAttributesWithRefType[tag.type, SettingsWrapper] {
  @JSImport("griddle-react", "components.SettingsWrapper")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    Settings: GriddleComponent[SettingsProps] = null,
    SettingsToggle: GriddleComponent[SettingsToggleProps] = null,
    isEnabled: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, SettingsWrapper] = {
    val __obj = js.Dynamic.literal()
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    if (SettingsToggle != null) __obj.updateDynamic("SettingsToggle")(SettingsToggle.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SettingsWrapperProps
}

