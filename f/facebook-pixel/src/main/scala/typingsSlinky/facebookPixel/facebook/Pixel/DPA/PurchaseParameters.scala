package typingsSlinky.facebookPixel.facebook.Pixel.DPA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseParameters
  extends typingsSlinky.facebookPixel.facebook.Pixel.PurchaseParameters
object PurchaseParameters {
  
  @scala.inline
  def apply(currency: String, value: Double): PurchaseParameters = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseParameters]
  }
}
