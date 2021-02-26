package typingsSlinky.coinlist

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coinsJsonMod extends Shortcut {
  
  @JSImport("coinlist/src/coins.json", JSImport.Namespace)
  @js.native
  val ^ : js.Array[Coin] = js.native
  
  @js.native
  trait Coin extends StObject {
    
    var id: String = js.native
    
    var name: String = js.native
    
    var symbol: String = js.native
  }
  object Coin {
    
    @scala.inline
    def apply(id: String, name: String, symbol: String): Coin = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coin]
    }
    
    @scala.inline
    implicit class CoinMutableBuilder[Self <: Coin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Array[Coin]
  
  /* This means you don't have to write `^`, but can instead just say `coinsJsonMod.foo` */
  override def _to: js.Array[Coin] = ^
}
