package typingsSlinky.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListListenersRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator for which you want to list listener objects.
    */
  var AcceleratorArn: GenericString = js.native
  
  /**
    * The number of listener objects that you want to return with this call. The default value is 10.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.MaxResults] = js.native
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object ListListenersRequest {
  
  @scala.inline
  def apply(AcceleratorArn: GenericString): ListListenersRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListListenersRequest]
  }
  
  @scala.inline
  implicit class ListListenersRequestMutableBuilder[Self <: ListListenersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
