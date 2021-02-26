package typingsSlinky.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDigestRequest extends StObject {
  
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
}
object GetDigestRequest {
  
  @scala.inline
  def apply(Name: LedgerName): GetDigestRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDigestRequest]
  }
  
  @scala.inline
  implicit class GetDigestRequestMutableBuilder[Self <: GetDigestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
