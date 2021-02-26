package typingsSlinky.polished.anon

import typingsSlinky.polished.polishedStrings.BackslashRightparenthesis
import typingsSlinky.polished.polishedStrings.Rightparenthesis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostfixRegSymbol extends StObject {
  
  var postfix: ArgCountFNotation = js.native
  
  var regSymbol: BackslashRightparenthesis = js.native
  
  var symbol: Rightparenthesis = js.native
}
object PostfixRegSymbol {
  
  @scala.inline
  def apply(postfix: ArgCountFNotation, regSymbol: BackslashRightparenthesis, symbol: Rightparenthesis): PostfixRegSymbol = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostfixRegSymbol]
  }
  
  @scala.inline
  implicit class PostfixRegSymbolMutableBuilder[Self <: PostfixRegSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostfix(value: ArgCountFNotation): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: BackslashRightparenthesis): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Rightparenthesis): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
