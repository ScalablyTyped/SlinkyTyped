package typingsSlinky.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBatchPayoutResponse extends StObject {
  
  var batch_header: js.UndefOr[PayoutHeader] = js.native
  
  var links: js.UndefOr[js.Array[LinkDescription]] = js.native
}
object CreateBatchPayoutResponse {
  
  @scala.inline
  def apply(): CreateBatchPayoutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBatchPayoutResponse]
  }
  
  @scala.inline
  implicit class CreateBatchPayoutResponseMutableBuilder[Self <: CreateBatchPayoutResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch_header(value: PayoutHeader): Self = StObject.set(x, "batch_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatch_headerUndefined: Self = StObject.set(x, "batch_header", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[LinkDescription]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: LinkDescription*): Self = StObject.set(x, "links", js.Array(value :_*))
  }
}
