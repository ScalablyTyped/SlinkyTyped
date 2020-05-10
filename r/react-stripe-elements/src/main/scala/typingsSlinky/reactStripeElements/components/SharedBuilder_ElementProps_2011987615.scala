package typingsSlinky.reactStripeElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactStripeElements.mod.ReactStripeElements.ElementChangeResponse
import typingsSlinky.reactStripeElements.mod.ReactStripeElements.HTMLStripeElement
import typingsSlinky.stripeV3.AnonBase
import typingsSlinky.stripeV3.AnonComplete
import typingsSlinky.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typingsSlinky.stripeV3.stripeV3Strings.default
import typingsSlinky.stripeV3.stripeV3Strings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ElementProps_2011987615[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def classes(value: AnonBase): this.type = set("classes", value.asInstanceOf[js.Any])
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def elementRef(value: /* ref */ js.Any => Unit): this.type = set("elementRef", js.Any.fromFunction1(value))
  @scala.inline
  def hideIcon(value: Boolean): this.type = set("hideIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def hidePostalCode(value: Boolean): this.type = set("hidePostalCode", value.asInstanceOf[js.Any])
  @scala.inline
  def iconStyle(value: solid | default): this.type = set("iconStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  @scala.inline
  def onBlur(value: /* event */ ElementChangeResponse => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  @scala.inline
  def onChange(value: /* event */ ElementChangeResponse => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onFocus(value: /* event */ ElementChangeResponse => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  @scala.inline
  def onReady(value: /* el */ HTMLStripeElement => Unit): this.type = set("onReady", js.Any.fromFunction1(value))
  @scala.inline
  def paymentRequest(value: StripePaymentRequest): this.type = set("paymentRequest", value.asInstanceOf[js.Any])
  @scala.inline
  def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  @scala.inline
  def placeholderCountry(value: String): this.type = set("placeholderCountry", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: AnonComplete): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def supportedCountries(value: js.Array[String]): this.type = set("supportedCountries", value.asInstanceOf[js.Any])
  @scala.inline
  def value(value: String | StringDictionary[String]): this.type = set("value", value.asInstanceOf[js.Any])
}

