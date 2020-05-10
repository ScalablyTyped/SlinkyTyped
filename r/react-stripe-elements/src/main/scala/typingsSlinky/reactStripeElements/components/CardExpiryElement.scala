package typingsSlinky.reactStripeElements.components

import typingsSlinky.reactStripeElements.mod.ReactStripeElements.ElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardExpiryElement {
  @JSImport("react-stripe-elements", "CardExpiryElement")
  @js.native
  object component extends js.Object
  
  def withProps(p: ElementProps): SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.CardExpiryElement] = new SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.CardExpiryElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardExpiryElement.type): SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.CardExpiryElement] = new SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.CardExpiryElement](js.Array(this.component, js.Dictionary.empty))()
}

