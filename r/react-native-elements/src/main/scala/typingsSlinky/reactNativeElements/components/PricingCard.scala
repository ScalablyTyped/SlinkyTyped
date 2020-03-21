package typingsSlinky.reactNativeElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.ButtonInformation
import typingsSlinky.reactNativeElements.mod.PricingCardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PricingCard
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeElements.mod.PricingCard] {
  @JSImport("react-native-elements", "PricingCard")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: title */
  def apply(
    button: ButtonInformation,
    price: String,
    color: String = null,
    containerStyle: StyleProp[ViewStyle] = null,
    info: js.Array[String] = null,
    infoStyle: StyleProp[TextStyle] = null,
    onButtonPress: () => Unit = null,
    pricingStyle: StyleProp[TextStyle] = null,
    titleStyle: StyleProp[TextStyle] = null,
    wrapperStyle: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.PricingCard] = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (infoStyle != null) __obj.updateDynamic("infoStyle")(infoStyle.asInstanceOf[js.Any])
    if (onButtonPress != null) __obj.updateDynamic("onButtonPress")(js.Any.fromFunction0(onButtonPress))
    if (pricingStyle != null) __obj.updateDynamic("pricingStyle")(pricingStyle.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PricingCardProps
}

