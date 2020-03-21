package typingsSlinky.griddleReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.griddleReact.mod.GriddleComponent
import typingsSlinky.griddleReact.mod.components.Settings
import typingsSlinky.griddleReact.mod.components.SettingsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsSettings
  extends ExternalComponentWithAttributesWithRefType[tag.type, Settings] {
  @JSImport("griddle-react", "components.Settings")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    settingsComponents: js.Array[GriddleComponent[_]] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Settings] = {
    val __obj = js.Dynamic.literal()
    if (settingsComponents != null) __obj.updateDynamic("settingsComponents")(settingsComponents.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, Settings] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.griddleReact.mod.components.Settings](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SettingsProps
}

