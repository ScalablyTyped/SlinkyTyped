package typingsSlinky.reactCreditCards.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCreditCards.AnonName
import typingsSlinky.reactCreditCards.AnonValid
import typingsSlinky.reactCreditCards.mod.CallbackArgument
import typingsSlinky.reactCreditCards.mod.Focused
import typingsSlinky.reactCreditCards.mod.ReactCreditCardProps
import typingsSlinky.reactCreditCards.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCreditCards {
  @JSImport("react-credit-cards", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def acceptedCards(value: js.Array[String]): this.type = set("acceptedCards", value.asInstanceOf[js.Any])
    @scala.inline
    def callback(value: (/* type */ CallbackArgument, /* isValid */ Boolean) => Unit): this.type = set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def focused(value: Focused): this.type = set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def issuer(value: String): this.type = set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: AnonValid): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholders(value: AnonName): this.type = set("placeholders", value.asInstanceOf[js.Any])
    @scala.inline
    def preview(value: Boolean): this.type = set("preview", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactCreditCardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(cvc: String | Double, expiry: String | Double, name: String, number: String | Double): Builder = {
    val __props = js.Dynamic.literal(cvc = cvc.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactCreditCardProps]))
  }
}

