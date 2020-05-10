package typingsSlinky.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetShardIteratorOutput extends js.Object {
  /**
    * The position in the shard from which to start reading stream records sequentially. A shard iterator specifies this position using the sequence number of a stream record in a shard.
    */
  var ShardIterator: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.ShardIterator] = js.native
}

object GetShardIteratorOutput {
  @scala.inline
  def apply(): GetShardIteratorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetShardIteratorOutput]
  }
  @scala.inline
  implicit class GetShardIteratorOutputOps[Self <: GetShardIteratorOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShardIterator(value: ShardIterator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardIterator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShardIterator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardIterator")(js.undefined)
        ret
    }
  }
  
}

