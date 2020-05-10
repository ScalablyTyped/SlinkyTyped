package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeShardsInput extends js.Object {
  /**
    * The shard ID of the adjacent shard for the merge.
    */
  var AdjacentShardToMerge: ShardId = js.native
  /**
    * The shard ID of the shard to combine with the adjacent shard for the merge.
    */
  var ShardToMerge: ShardId = js.native
  /**
    * The name of the stream for the merge.
    */
  var StreamName: typingsSlinky.awsSdk.kinesisMod.StreamName = js.native
}

object MergeShardsInput {
  @scala.inline
  def apply(AdjacentShardToMerge: ShardId, ShardToMerge: ShardId, StreamName: StreamName): MergeShardsInput = {
    val __obj = js.Dynamic.literal(AdjacentShardToMerge = AdjacentShardToMerge.asInstanceOf[js.Any], ShardToMerge = ShardToMerge.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeShardsInput]
  }
  @scala.inline
  implicit class MergeShardsInputOps[Self <: MergeShardsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjacentShardToMerge(value: ShardId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdjacentShardToMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShardToMerge(value: ShardId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardToMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamName(value: StreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

