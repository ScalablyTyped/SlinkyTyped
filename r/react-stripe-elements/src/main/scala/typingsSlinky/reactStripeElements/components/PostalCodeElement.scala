package typingsSlinky.reactStripeElements.components

import typingsSlinky.reactStripeElements.mod.ReactStripeElements.ElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostalCodeElement {
  
  @JSImport("react-stripe-elements", "PostalCodeElement")
  @js.native
  object component extends js.Object
  
  def withProps(p: ElementProps): SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.PostalCodeElement] = new SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.PostalCodeElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PostalCodeElement.type): SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.PostalCodeElement] = new SharedBuilder_ElementProps_2011987615[typingsSlinky.reactStripeElements.mod.PostalCodeElement](js.Array(this.component, js.Dictionary.empty))()
}
