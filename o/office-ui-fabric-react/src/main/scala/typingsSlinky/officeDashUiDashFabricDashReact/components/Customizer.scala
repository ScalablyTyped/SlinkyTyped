package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricUtilities.ReadonlyICustomizerContext
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.atUifabricUtilities.libCustomizationsCustomizationsMod.ISettings
import typingsSlinky.atUifabricUtilities.libCustomizationsCustomizationsMod.ISettingsFunction
import typingsSlinky.atUifabricUtilities.libCustomizationsCustomizerContextMod.ICustomizerContext
import typingsSlinky.atUifabricUtilities.libCustomizationsCustomizerDotTypesMod.ICustomizerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Customizer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesMod.Customizer] {
  @JSImport("office-ui-fabric-react/lib/Utilities", "Customizer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    componentRef: IRefObject[_] = null,
    contextTransform: /* context */ ReadonlyICustomizerContext => ICustomizerContext = null,
    scopedSettings: ISettings | ISettingsFunction = null,
    settings: ISettings | ISettingsFunction = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesMod.Customizer] = {
    val __obj = js.Dynamic.literal()
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextTransform != null) __obj.updateDynamic("contextTransform")(js.Any.fromFunction1(contextTransform))
    if (scopedSettings != null) __obj.updateDynamic("scopedSettings")(scopedSettings.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesMod.Customizer] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesMod.Customizer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ICustomizerProps
}

