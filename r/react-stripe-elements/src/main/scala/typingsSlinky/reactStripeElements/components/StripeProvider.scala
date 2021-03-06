package typingsSlinky.reactStripeElements.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.stripeV3.stripe.Stripe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StripeProvider {
  
  object apiKeyneverundefinedstrip {
    
    @JSImport("react-stripe-elements", "StripeProvider")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactStripeElements.mod.StripeProvider] {
      
      @scala.inline
      def stripe(value: Stripe): this.type = set("stripe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def stripeAccount(value: String): this.type = set("stripeAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def stripeNull: this.type = set("stripe", null)
    }
    
    implicit def make(companion: apiKeyneverundefinedstrip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: typingsSlinky.reactStripeElements.anon.apiKeyneverundefinedstrip): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object apiKeystringstripeneverun {
    
    @scala.inline
    def apply(apiKey: String): Builder = {
      val __props = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactStripeElements.anon.apiKeystringstripeneverun]))
    }
    
    @JSImport("react-stripe-elements", "StripeProvider")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactStripeElements.mod.StripeProvider] {
      
      @scala.inline
      def stripeAccount(value: String): this.type = set("stripeAccount", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.reactStripeElements.anon.apiKeystringstripeneverun): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
