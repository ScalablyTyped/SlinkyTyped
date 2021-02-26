package typingsSlinky.coinbaseCommerceNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Price object.
  */
@js.native
trait Price[Currency] extends StObject {
  
  var amount: String = js.native
  
  var currency: Currency = js.native
}
object Price {
  
  @scala.inline
  def apply[Currency](amount: String, currency: Currency): Price[Currency] = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price[Currency]]
  }
  
  @scala.inline
  implicit class PriceMutableBuilder[Self <: Price[_], Currency] (val x: Self with Price[Currency]) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
  }
}
