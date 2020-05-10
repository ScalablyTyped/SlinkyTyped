package typingsSlinky.awsSdkClientKinesisBrowser.typesShardMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesHashKeyRangeMod.UnmarshalledHashKeyRange
import typingsSlinky.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod.UnmarshalledSequenceNumberRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledShard extends Shard {
  /**
    * <p>The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.</p>
    */
  @JSName("HashKeyRange")
  var HashKeyRange_UnmarshalledShard: UnmarshalledHashKeyRange = js.native
  /**
    * <p>The range of possible sequence numbers for the shard.</p>
    */
  @JSName("SequenceNumberRange")
  var SequenceNumberRange_UnmarshalledShard: UnmarshalledSequenceNumberRange = js.native
}

object UnmarshalledShard {
  @scala.inline
  def apply(
    HashKeyRange: UnmarshalledHashKeyRange,
    SequenceNumberRange: UnmarshalledSequenceNumberRange,
    ShardId: String
  ): UnmarshalledShard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], SequenceNumberRange = SequenceNumberRange.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledShard]
  }
  @scala.inline
  implicit class UnmarshalledShardOps[Self <: UnmarshalledShard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashKeyRange(value: UnmarshalledHashKeyRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HashKeyRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumberRange(value: UnmarshalledSequenceNumberRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumberRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

