package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListShardsInput extends js.Object {
  
  /**
    * Specify this parameter to indicate that you want to list the shards starting with the shard whose ID immediately follows ExclusiveStartShardId. If you don't specify this parameter, the default behavior is for ListShards to list the shards starting with the first one in the stream. You cannot specify this parameter if you specify NextToken.
    */
  var ExclusiveStartShardId: js.UndefOr[ShardId] = js.native
  
  /**
    * The maximum number of shards to return in a single call to ListShards. The minimum value you can specify for this parameter is 1, and the maximum is 1,000, which is also the default. When the number of shards to be listed is greater than the value of MaxResults, the response contains a NextToken value that you can use in a subsequent call to ListShards to list the next set of shards.
    */
  var MaxResults: js.UndefOr[ListShardsInputLimit] = js.native
  
  /**
    * When the number of shards in the data stream is greater than the default value for the MaxResults parameter, or if you explicitly specify a value for MaxResults that is less than the number of shards in the data stream, the response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to ListShards to list the next set of shards. Don't specify StreamName or StreamCreationTimestamp if you specify NextToken because the latter unambiguously identifies the stream. You can optionally specify a value for the MaxResults parameter when you specify NextToken. If you specify a MaxResults value that is less than the number of shards that the operation returns if you don't specify MaxResults, the response will contain a new NextToken value. You can use the new NextToken value in a subsequent call to the ListShards operation.  Tokens expire after 300 seconds. When you obtain a value for NextToken in the response to a call to ListShards, you have 300 seconds to use that value. If you specify an expired token in a call to ListShards, you get ExpiredNextTokenException. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.NextToken] = js.native
  
  /**
    * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a data stream and then delete it, and you later create another data stream with the same name, you can use this input parameter to specify which of the two streams you want to list the shards for. You cannot specify this parameter if you specify the NextToken parameter.
    */
  var StreamCreationTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the data stream whose shards you want to list.  You cannot specify this parameter if you specify the NextToken parameter.
    */
  var StreamName: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.StreamName] = js.native
}
object ListShardsInput {
  
  @scala.inline
  def apply(): ListShardsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListShardsInput]
  }
  
  @scala.inline
  implicit class ListShardsInputOps[Self <: ListShardsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExclusiveStartShardId(value: ShardId): Self = this.set("ExclusiveStartShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveStartShardId: Self = this.set("ExclusiveStartShardId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ListShardsInputLimit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStreamCreationTimestamp(value: js.Date): Self = this.set("StreamCreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamCreationTimestamp: Self = this.set("StreamCreationTimestamp", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
  }
}
