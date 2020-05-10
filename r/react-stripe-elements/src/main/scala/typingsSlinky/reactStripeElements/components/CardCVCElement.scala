package typingsSlinky.reactStripeElements.components

import typingsSlinky.reactStripeElements.mod.CardCVCElement_
import typingsSlinky.reactStripeElements.mod.ReactStripeElements.ElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardCVCElement {
  @JSImport("react-stripe-elements", "CardCVCElement")
  @js.native
  object component extends js.Object
  
  def withProps(p: ElementProps): SharedBuilder_ElementProps_2011987615[CardCVCElement_] = new SharedBuilder_ElementProps_2011987615[CardCVCElement_](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardCVCElement.type): SharedBuilder_ElementProps_2011987615[CardCVCElement_] = new SharedBuilder_ElementProps_2011987615[CardCVCElement_](js.Array(this.component, js.Dictionary.empty))()
}

object CardCvcElement {
  @JSImport("react-stripe-elements", "CardCvcElement")
  @js.native
  object component extends js.Object
  
  def withProps(p: ElementProps): SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.CardCvcElement] = new SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.CardCvcElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardCvcElement.type): SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.CardCvcElement] = new SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.CardCvcElement](js.Array(this.component, js.Dictionary.empty))()
}

