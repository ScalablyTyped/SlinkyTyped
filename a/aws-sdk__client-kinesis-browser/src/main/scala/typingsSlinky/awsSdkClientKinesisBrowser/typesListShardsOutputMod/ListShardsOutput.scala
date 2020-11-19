package typingsSlinky.awsSdkClientKinesisBrowser.typesListShardsOutputMod

import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesShardMod.UnmarshalledShard
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListShardsOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>When the number of shards in the data stream is greater than the default value for the <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of shards in the data stream, the response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to <code>ListShards</code> to list the next set of shards. For more information about the use of this pagination token when calling the <code>ListShards</code> operation, see <a>ListShardsInput$NextToken</a>.</p> <important> <p>Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to <code>ListShards</code>, you have 300 seconds to use that value. If you specify an expired token in a call to <code>ListShards</code>, you get <code>ExpiredNextTokenException</code>.</p> </important>
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * <p>An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and ending hash keys and the starting and ending sequence numbers for the shard.</p>
    */
  var Shards: js.UndefOr[js.Array[UnmarshalledShard]] = js.native
}
object ListShardsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListShardsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListShardsOutput]
  }
  
  @scala.inline
  implicit class ListShardsOutputOps[Self <: ListShardsOutput] (val x: Self) extends AnyVal {
    
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setShardsVarargs(value: UnmarshalledShard*): Self = this.set("Shards", js.Array(value :_*))
    
    @scala.inline
    def setShards(value: js.Array[UnmarshalledShard]): Self = this.set("Shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShards: Self = this.set("Shards", js.undefined)
  }
}
