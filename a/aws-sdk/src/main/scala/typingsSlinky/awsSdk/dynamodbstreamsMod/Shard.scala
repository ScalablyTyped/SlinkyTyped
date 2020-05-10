package typingsSlinky.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shard extends js.Object {
  /**
    * The shard ID of the current shard's parent.
    */
  var ParentShardId: js.UndefOr[ShardId] = js.native
  /**
    * The range of possible sequence numbers for the shard.
    */
  var SequenceNumberRange: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.SequenceNumberRange] = js.native
  /**
    * The system-generated identifier for this shard.
    */
  var ShardId: js.UndefOr[typingsSlinky.awsSdk.dynamodbstreamsMod.ShardId] = js.native
}

object Shard {
  @scala.inline
  def apply(): Shard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shard]
  }
  @scala.inline
  implicit class ShardOps[Self <: Shard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSequenceNumberRange(value: SequenceNumberRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumberRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceNumberRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumberRange")(js.undefined)
        ret
    }
    @scala.inline
    def withShardId(value: ShardId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShardId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardId")(js.undefined)
        ret
    }
  }
  
}

