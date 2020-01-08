package typingsSlinky.reactDashNativeDashIndicators.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashIndicators.reactDashNativeDashIndicatorsMod.MaterialIndicatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MaterialIndicator
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashIndicators.reactDashNativeDashIndicatorsMod.MaterialIndicator
    ] {
  @JSImport("react-native-indicators", "MaterialIndicator")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: size */
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: /* value */ Double => Double = null,
    color: String = null,
    interaction: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashIndicators.reactDashNativeDashIndicatorsMod.MaterialIndicator
  ] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(js.Any.fromFunction1(animationEasing))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashIndicators.reactDashNativeDashIndicatorsMod.MaterialIndicator
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashIndicators.reactDashNativeDashIndicatorsMod.MaterialIndicator](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MaterialIndicatorProps
}

