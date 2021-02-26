package typingsSlinky.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends StObject {
  
  var client: typingsSlinky.braintreeWeb.clientMod.Client = js.native
}
object Client {
  
  @scala.inline
  def apply(client: typingsSlinky.braintreeWeb.clientMod.Client): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: typingsSlinky.braintreeWeb.clientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
  }
}
