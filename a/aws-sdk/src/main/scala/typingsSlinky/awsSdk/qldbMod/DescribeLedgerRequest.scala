package typingsSlinky.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLedgerRequest extends StObject {
  
  /**
    * The name of the ledger that you want to describe.
    */
  var Name: LedgerName = js.native
}
object DescribeLedgerRequest {
  
  @scala.inline
  def apply(Name: LedgerName): DescribeLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLedgerRequest]
  }
  
  @scala.inline
  implicit class DescribeLedgerRequestMutableBuilder[Self <: DescribeLedgerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
