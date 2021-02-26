package typingsSlinky.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitShardInput extends StObject {
  
  /**
    * A hash key value for the starting hash key of one of the child shards created by the split. The hash key range for a given shard constitutes a set of ordered contiguous positive integers. The value for NewStartingHashKey must be in the range of hash keys being mapped into the shard. The NewStartingHashKey hash key value and all higher hash key values in hash key range are distributed to one of the child shards. All the lower hash key values in the range are distributed to the other child shard.
    */
  var NewStartingHashKey: HashKey = js.native
  
  /**
    * The shard ID of the shard to split.
    */
  var ShardToSplit: ShardId = js.native
  
  /**
    * The name of the stream for the shard split.
    */
  var StreamName: typingsSlinky.awsSdk.kinesisMod.StreamName = js.native
}
object SplitShardInput {
  
  @scala.inline
  def apply(NewStartingHashKey: HashKey, ShardToSplit: ShardId, StreamName: StreamName): SplitShardInput = {
    val __obj = js.Dynamic.literal(NewStartingHashKey = NewStartingHashKey.asInstanceOf[js.Any], ShardToSplit = ShardToSplit.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitShardInput]
  }
  
  @scala.inline
  implicit class SplitShardInputMutableBuilder[Self <: SplitShardInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewStartingHashKey(value: HashKey): Self = StObject.set(x, "NewStartingHashKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardToSplit(value: ShardId): Self = StObject.set(x, "ShardToSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
