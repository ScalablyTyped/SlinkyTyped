package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInputDeviceTransfersRequest extends StObject {
  
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MaxResults] = js.native
  
  var NextToken: js.UndefOr[string] = js.native
  
  var TransferType: string = js.native
}
object ListInputDeviceTransfersRequest {
  
  @scala.inline
  def apply(TransferType: string): ListInputDeviceTransfersRequest = {
    val __obj = js.Dynamic.literal(TransferType = TransferType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInputDeviceTransfersRequest]
  }
  
  @scala.inline
  implicit class ListInputDeviceTransfersRequestMutableBuilder[Self <: ListInputDeviceTransfersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransferType(value: string): Self = StObject.set(x, "TransferType", value.asInstanceOf[js.Any])
  }
}
