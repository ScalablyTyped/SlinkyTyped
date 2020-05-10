package typingsSlinky.reactStripeElements.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.stripeV3.stripe.elements.ElementsCreateOptions
import typingsSlinky.stripeV3.stripe.elements.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Elements {
  @JSImport("react-stripe-elements", "Elements")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactStripeElements.mod.Elements] {
    @scala.inline
    def fonts(value: js.Array[Font]): this.type = set("fonts", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ElementsCreateOptions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Elements.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

