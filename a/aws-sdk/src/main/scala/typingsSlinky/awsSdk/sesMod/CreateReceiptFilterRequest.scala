package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReceiptFilterRequest extends StObject {
  
  /**
    * A data structure that describes the IP address filter to create, which consists of a name, an IP address range, and whether to allow or block mail from it.
    */
  var Filter: ReceiptFilter = js.native
}
object CreateReceiptFilterRequest {
  
  @scala.inline
  def apply(Filter: ReceiptFilter): CreateReceiptFilterRequest = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReceiptFilterRequest]
  }
  
  @scala.inline
  implicit class CreateReceiptFilterRequestMutableBuilder[Self <: CreateReceiptFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: ReceiptFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
  }
}
