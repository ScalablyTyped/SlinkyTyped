package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.no_price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * No price resource.
  */
@js.native
trait NoPrice extends StObject {
  
  /**
    * Pricing type.
    */
  var pricing_type: no_price = js.native
}
object NoPrice {
  
  @scala.inline
  def apply(pricing_type: no_price): NoPrice = {
    val __obj = js.Dynamic.literal(pricing_type = pricing_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoPrice]
  }
  
  @scala.inline
  implicit class NoPriceMutableBuilder[Self <: NoPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPricing_type(value: no_price): Self = StObject.set(x, "pricing_type", value.asInstanceOf[js.Any])
  }
}
