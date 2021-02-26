package typingsSlinky.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStreamsOutput extends StObject {
  
  /**
    * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use this token in your next request. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.NextToken] = js.native
  
  /**
    * An array of StreamInfo objects.
    */
  var StreamInfoList: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.StreamInfoList] = js.native
}
object ListStreamsOutput {
  
  @scala.inline
  def apply(): ListStreamsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsOutput]
  }
  
  @scala.inline
  implicit class ListStreamsOutputMutableBuilder[Self <: ListStreamsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStreamInfoList(value: StreamInfoList): Self = StObject.set(x, "StreamInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamInfoListUndefined: Self = StObject.set(x, "StreamInfoList", js.undefined)
    
    @scala.inline
    def setStreamInfoListVarargs(value: StreamInfo*): Self = StObject.set(x, "StreamInfoList", js.Array(value :_*))
  }
}
