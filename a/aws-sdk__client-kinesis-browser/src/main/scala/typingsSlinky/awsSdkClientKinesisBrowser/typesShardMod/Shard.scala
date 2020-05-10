package typingsSlinky.awsSdkClientKinesisBrowser.typesShardMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesHashKeyRangeMod.HashKeyRange
import typingsSlinky.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod.SequenceNumberRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shard extends js.Object {
  /**
    * <p>The shard ID of the shard adjacent to the shard's parent.</p>
    */
  var AdjacentParentShardId: js.UndefOr[String] = js.native
  /**
    * <p>The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.</p>
    */
  var HashKeyRange: typingsSlinky.awsSdkClientKinesisBrowser.typesHashKeyRangeMod.HashKeyRange = js.native
  /**
    * <p>The shard ID of the shard's parent.</p>
    */
  var ParentShardId: js.UndefOr[String] = js.native
  /**
    * <p>The range of possible sequence numbers for the shard.</p>
    */
  var SequenceNumberRange: typingsSlinky.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod.SequenceNumberRange = js.native
  /**
    * <p>The unique identifier of the shard within the stream.</p>
    */
  var ShardId: String = js.native
}

object Shard {
  @scala.inline
  def apply(HashKeyRange: HashKeyRange, SequenceNumberRange: SequenceNumberRange, ShardId: String): Shard = {
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
    def withShardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdjacentParentShardId(value: String): Self = {
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
    def withParentShardId(value: String): Self = {
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

