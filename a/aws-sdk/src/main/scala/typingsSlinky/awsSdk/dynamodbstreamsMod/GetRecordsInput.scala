package typingsSlinky.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecordsInput extends StObject {
  
  /**
    * The maximum number of records to return from the shard. The upper limit is 1000.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  
  /**
    * A shard iterator that was retrieved from a previous GetShardIterator operation. This iterator can be used to access the stream records in this shard.
    */
  var ShardIterator: typingsSlinky.awsSdk.dynamodbstreamsMod.ShardIterator = js.native
}
object GetRecordsInput {
  
  @scala.inline
  def apply(ShardIterator: ShardIterator): GetRecordsInput = {
    val __obj = js.Dynamic.literal(ShardIterator = ShardIterator.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordsInput]
  }
  
  @scala.inline
  implicit class GetRecordsInputMutableBuilder[Self <: GetRecordsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setShardIterator(value: ShardIterator): Self = StObject.set(x, "ShardIterator", value.asInstanceOf[js.Any])
  }
}
