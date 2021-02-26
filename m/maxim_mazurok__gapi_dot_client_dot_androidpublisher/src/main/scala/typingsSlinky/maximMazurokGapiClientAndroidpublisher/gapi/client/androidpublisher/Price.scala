package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Price extends StObject {
  
  /** 3 letter Currency code, as defined by ISO 4217. See java/com/google/common/money/CurrencyCode.java */
  var currency: js.UndefOr[String] = js.native
  
  /** Price in 1/million of the currency base unit, represented as a string. */
  var priceMicros: js.UndefOr[String] = js.native
}
object Price {
  
  @scala.inline
  def apply(): Price = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Price]
  }
  
  @scala.inline
  implicit class PriceMutableBuilder[Self <: Price] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setPriceMicros(value: String): Self = StObject.set(x, "priceMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceMicrosUndefined: Self = StObject.set(x, "priceMicros", js.undefined)
  }
}
