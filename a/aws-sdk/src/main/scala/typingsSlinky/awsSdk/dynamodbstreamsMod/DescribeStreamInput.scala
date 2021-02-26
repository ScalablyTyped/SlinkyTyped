package typingsSlinky.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStreamInput extends StObject {
  
  /**
    * The shard ID of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedShardId in the previous operation. 
    */
  var ExclusiveStartShardId: js.UndefOr[ShardId] = js.native
  
  /**
    * The maximum number of shard objects to return. The upper limit is 100.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: typingsSlinky.awsSdk.dynamodbstreamsMod.StreamArn = js.native
}
object DescribeStreamInput {
  
  @scala.inline
  def apply(StreamArn: StreamArn): DescribeStreamInput = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamInput]
  }
  
  @scala.inline
  implicit class DescribeStreamInputMutableBuilder[Self <: DescribeStreamInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusiveStartShardId(value: ShardId): Self = StObject.set(x, "ExclusiveStartShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveStartShardIdUndefined: Self = StObject.set(x, "ExclusiveStartShardId", js.undefined)
    
    @scala.inline
    def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setStreamArn(value: StreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
  }
}
