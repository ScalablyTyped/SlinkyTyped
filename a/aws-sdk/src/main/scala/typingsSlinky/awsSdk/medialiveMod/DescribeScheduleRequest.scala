package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScheduleRequest extends StObject {
  
  /**
    * Id of the channel whose schedule is being updated.
    */
  var ChannelId: string = js.native
  
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MaxResults] = js.native
  
  var NextToken: js.UndefOr[string] = js.native
}
object DescribeScheduleRequest {
  
  @scala.inline
  def apply(ChannelId: string): DescribeScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduleRequest]
  }
  
  @scala.inline
  implicit class DescribeScheduleRequestMutableBuilder[Self <: DescribeScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
