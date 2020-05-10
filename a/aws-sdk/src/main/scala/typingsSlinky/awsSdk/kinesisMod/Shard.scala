package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shard extends js.Object {
  /**
    * The shard ID of the shard adjacent to the shard's parent.
    */
  var AdjacentParentShardId: js.UndefOr[ShardId] = js.native
  /**
    * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
    */
  var HashKeyRange: typingsSlinky.awsSdk.kinesisMod.HashKeyRange = js.native
  /**
    * The shard ID of the shard's parent.
    */
  var ParentShardId: js.UndefOr[ShardId] = js.native
  /**
    * The range of possible sequence numbers for the shard.
    */
  var SequenceNumberRange: typingsSlinky.awsSdk.kinesisMod.SequenceNumberRange = js.native
  /**
    * The unique identifier of the shard within the stream.
    */
  var ShardId: typingsSlinky.awsSdk.kinesisMod.ShardId = js.native
}

object Shard {
  @scala.inline
  def apply(HashKeyRange: HashKeyRange, SequenceNumberRange: SequenceNumberRange, ShardId: ShardId): Shard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], SequenceNumberRange = SequenceNumberRange.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
  @scala.inline
  implicit class ShardOps[Self <: Shard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashKeyRange(value: HashKeyRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HashKeyRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumberRange(value: SequenceNumberRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumberRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShardId(value: ShardId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdjacentParentShardId(value: ShardId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdjacentParentShardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjacentParentShardId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdjacentParentShardId")(js.undefined)
        ret
    }
    @scala.inline
    def withParentShardId(value: ShardId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentShardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentShardId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentShardId")(js.undefined)
        ret
    }
  }
  
}

