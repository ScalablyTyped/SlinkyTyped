package typingsSlinky.atAntDashDesignReactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.large
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.small
import typingsSlinky.atAntDashDesignReactDashNative.libActivityDashIndicatorMod.ActivityIndicatorNativeProps
import typingsSlinky.atAntDashDesignReactDashNative.libActivityDashIndicatorStyleMod.ActivityIndicatorStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ActivityIndicatorNativeProps_1480779262[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    size: large | small = null,
    styles: ActivityIndicatorStyle = null,
    text: String = null,
    toast: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(toast)) __obj.updateDynamic("toast")(toast.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ActivityIndicatorNativeProps
}

