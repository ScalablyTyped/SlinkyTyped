package typingsSlinky.reactStripeElements.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.stripeV3.stripe.elements.ElementsCreateOptions
import typingsSlinky.stripeV3.stripe.elements.Font
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Elements {
  
  @JSImport("react-stripe-elements", "Elements")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactStripeElements.mod.Elements] {
    
    @scala.inline
    def fonts(value: js.Array[Font]): this.type = set("fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontsVarargs(value: Font*): this.type = set("fonts", js.Array(value :_*))
    
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Elements.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ElementsCreateOptions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
