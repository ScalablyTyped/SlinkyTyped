package typingsSlinky.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateShardCountOutput extends StObject {
  
  /**
    * The current number of shards.
    */
  var CurrentShardCount: js.UndefOr[PositiveIntegerObject] = js.native
  
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.StreamName] = js.native
  
  /**
    * The updated number of shards.
    */
  var TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.native
}
object UpdateShardCountOutput {
  
  @scala.inline
  def apply(): UpdateShardCountOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShardCountOutput]
  }
  
  @scala.inline
  implicit class UpdateShardCountOutputMutableBuilder[Self <: UpdateShardCountOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentShardCount(value: PositiveIntegerObject): Self = StObject.set(x, "CurrentShardCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentShardCountUndefined: Self = StObject.set(x, "CurrentShardCount", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    
    @scala.inline
    def setTargetShardCount(value: PositiveIntegerObject): Self = StObject.set(x, "TargetShardCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetShardCountUndefined: Self = StObject.set(x, "TargetShardCount", js.undefined)
  }
}
