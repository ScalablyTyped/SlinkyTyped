package typingsSlinky.reactStripeElements.components

import typingsSlinky.reactStripeElements.mod.ReactStripeElements.ElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IbanElement {
  @JSImport("react-stripe-elements", "IbanElement")
  @js.native
  object component extends js.Object
  
  def withProps(p: ElementProps): SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.IbanElement] = new SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.IbanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: IbanElement.type): SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.IbanElement] = new SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.IbanElement](js.Array(this.component, js.Dictionary.empty))()
}

