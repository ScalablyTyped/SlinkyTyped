package typingsSlinky.chance.Chance

import typingsSlinky.chance.chanceStrings.lower
import typingsSlinky.chance.chanceStrings.upper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined chance.Chance.CharacterOptions & {  length :number} */
@js.native
trait StringOptions extends StObject {
  
  var alpha: Boolean = js.native
  
  var casing: upper | lower = js.native
  
  var length: Double = js.native
  
  var numeric: Boolean = js.native
  
  var pool: String = js.native
  
  var symbols: Boolean = js.native
}
object StringOptions {
  
  @scala.inline
  def apply(
    alpha: Boolean,
    casing: upper | lower,
    length: Double,
    numeric: Boolean,
    pool: String,
    symbols: Boolean
  ): StringOptions = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], casing = casing.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringOptions]
  }
  
  @scala.inline
  implicit class StringOptionsMutableBuilder[Self <: StringOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCasing(value: upper | lower): Self = StObject.set(x, "casing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
  }
}
