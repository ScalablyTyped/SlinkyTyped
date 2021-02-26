package typingsSlinky.reactCurrencyFormatter

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-currency-formatter", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[CurrencyFormatterProps, js.Object, js.Any] {
    def this(props: CurrencyFormatterProps) = this()
    def this(props: CurrencyFormatterProps, context: js.Any) = this()
  }
  @JSImport("react-currency-formatter", JSImport.Namespace)
  @js.native
  val ^ : ComponentClass[CurrencyFormatterProps, js.Object] = js.native
  
  @js.native
  trait CurrencyFormatterProps extends StObject {
    
    var currency: js.UndefOr[String] = js.native
    
    var decimal: js.UndefOr[String] = js.native
    
    var group: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var quantity: Double = js.native
    
    var symbol: js.UndefOr[String] = js.native
  }
  object CurrencyFormatterProps {
    
    @scala.inline
    def apply(quantity: Double): CurrencyFormatterProps = {
      val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrencyFormatterProps]
    }
    
    @scala.inline
    implicit class CurrencyFormatterPropsMutableBuilder[Self <: CurrencyFormatterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    }
  }
  
  type _To = ComponentClass[CurrencyFormatterProps, js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[CurrencyFormatterProps, js.Object] = ^
}
