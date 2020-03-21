package typingsSlinky.reactStripeElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactStripeElements.mod.ReactStripeElements.ElementChangeResponse
import typingsSlinky.reactStripeElements.mod.ReactStripeElements.ElementProps
import typingsSlinky.reactStripeElements.mod.ReactStripeElements.HTMLStripeElement
import typingsSlinky.stripeV3.AnonBase
import typingsSlinky.stripeV3.AnonComplete
import typingsSlinky.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typingsSlinky.stripeV3.stripeV3Strings.default
import typingsSlinky.stripeV3.stripeV3Strings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ElementProps659214741[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, disabled, id, placeholder */
  def apply(
    classes: AnonBase = null,
    elementRef: /* ref */ js.Any => Unit = null,
    hideIcon: js.UndefOr[Boolean] = js.undefined,
    hidePostalCode: js.UndefOr[Boolean] = js.undefined,
    iconStyle: solid | default = null,
    onBlur: /* event */ ElementChangeResponse => Unit = null,
    onChange: /* event */ ElementChangeResponse => Unit = null,
    onFocus: /* event */ ElementChangeResponse => Unit = null,
    onReady: /* el */ HTMLStripeElement => Unit = null,
    paymentRequest: StripePaymentRequest = null,
    placeholderCountry: String = null,
    style: AnonComplete = null,
    supportedCountries: js.Array[String] = null,
    value: String | StringDictionary[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (elementRef != null) __obj.updateDynamic("elementRef")(js.Any.fromFunction1(elementRef))
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePostalCode)) __obj.updateDynamic("hidePostalCode")(hidePostalCode.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (paymentRequest != null) __obj.updateDynamic("paymentRequest")(paymentRequest.asInstanceOf[js.Any])
    if (placeholderCountry != null) __obj.updateDynamic("placeholderCountry")(placeholderCountry.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedCountries != null) __obj.updateDynamic("supportedCountries")(supportedCountries.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ElementProps
}

