package typingsSlinky.reactDashNativeDashMaterialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.RippleFeedbackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RippleFeedback
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.RippleFeedback
    ] {
  @JSImport("react-native-material-ui", "RippleFeedback")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    borderless: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.RippleFeedback
  ] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.RippleFeedback
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.RippleFeedback](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RippleFeedbackProps
}

