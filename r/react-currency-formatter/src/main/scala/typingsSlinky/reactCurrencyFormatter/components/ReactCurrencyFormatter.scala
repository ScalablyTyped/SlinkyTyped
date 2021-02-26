package typingsSlinky.reactCurrencyFormatter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCurrencyFormatter.mod.CurrencyFormatterProps
import typingsSlinky.reactCurrencyFormatter.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCurrencyFormatter {
  
  @scala.inline
  def apply(quantity: Double): Builder = {
    val __props = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CurrencyFormatterProps]))
  }
  
  object ReactCurrencyFormatter {
    
    @scala.inline
    def apply(quantity: Double): typingsSlinky.reactCurrencyFormatter.components.ReactCurrencyFormatter.ReactCurrencyFormatter.Builder = {
      val __props = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
      new typingsSlinky.reactCurrencyFormatter.components.ReactCurrencyFormatter.ReactCurrencyFormatter.Builder(js.Array(this.component, __props.asInstanceOf[CurrencyFormatterProps]))
    }
    
    @JSImport("react-currency-formatter", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, ^] {
      
      @scala.inline
      def currency(value: String): this.type = set("currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def decimal(value: String): this.type = set("decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def symbol(value: String): this.type = set("symbol", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: CurrencyFormatterProps): typingsSlinky.reactCurrencyFormatter.components.ReactCurrencyFormatter.ReactCurrencyFormatter.Builder = new typingsSlinky.reactCurrencyFormatter.components.ReactCurrencyFormatter.ReactCurrencyFormatter.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-currency-formatter", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def currency(value: String): this.type = set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def decimal(value: String): this.type = set("decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def symbol(value: String): this.type = set("symbol", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CurrencyFormatterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
