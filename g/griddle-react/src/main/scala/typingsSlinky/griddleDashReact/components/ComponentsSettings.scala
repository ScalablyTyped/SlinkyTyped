package typingsSlinky.griddleDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.griddleDashReact.griddleDashReactMod.GriddleComponent
import typingsSlinky.griddleDashReact.griddleDashReactMod.components.Settings
import typingsSlinky.griddleDashReact.griddleDashReactMod.components.SettingsProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsSettings
  extends ExternalComponentWithAttributesWithRefType[tag.type, Settings] {
  @JSImport("griddle-react", "components.Settings")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    settingsComponents: js.Array[GriddleComponent[_]] = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Settings] = {
    val __obj = js.Dynamic.literal()
    if (settingsComponents != null) __obj.updateDynamic("settingsComponents")(settingsComponents.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, Settings] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.griddleDashReact.griddleDashReactMod.components.Settings](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SettingsProps
}

