package typingsSlinky.reactDashNativeDashMaterialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashMaterialDashUi.Anon_ContainerViewStyle
import typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.DividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Divider
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Divider
    ] {
  @JSImport("react-native-material-ui", "Divider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    inset: js.UndefOr[Boolean] = js.undefined,
    style: Anon_ContainerViewStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Divider
  ] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Divider
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Divider](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DividerProps
}

