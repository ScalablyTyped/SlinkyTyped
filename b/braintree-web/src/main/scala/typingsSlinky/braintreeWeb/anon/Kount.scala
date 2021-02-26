package typingsSlinky.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kount extends StObject {
  
  var client: typingsSlinky.braintreeWeb.clientMod.Client = js.native
  
  var kount: js.UndefOr[Boolean] = js.native
  
  var paypal: js.UndefOr[Boolean] = js.native
}
object Kount {
  
  @scala.inline
  def apply(client: typingsSlinky.braintreeWeb.clientMod.Client): Kount = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kount]
  }
  
  @scala.inline
  implicit class KountMutableBuilder[Self <: Kount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: typingsSlinky.braintreeWeb.clientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKount(value: Boolean): Self = StObject.set(x, "kount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKountUndefined: Self = StObject.set(x, "kount", js.undefined)
    
    @scala.inline
    def setPaypal(value: Boolean): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
  }
}
