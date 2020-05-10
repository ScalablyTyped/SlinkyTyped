package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateShardCountInput extends js.Object {
  /**
    * The scaling type. Uniform scaling creates shards of equal size.
    */
  var ScalingType: typingsSlinky.awsSdk.kinesisMod.ScalingType = js.native
  /**
    * The name of the stream.
    */
  var StreamName: typingsSlinky.awsSdk.kinesisMod.StreamName = js.native
  /**
    * The new number of shards.
    */
  var TargetShardCount: PositiveIntegerObject = js.native
}

object UpdateShardCountInput {
  @scala.inline
  def apply(ScalingType: ScalingType, StreamName: StreamName, TargetShardCount: PositiveIntegerObject): UpdateShardCountInput = {
    val __obj = js.Dynamic.literal(ScalingType = ScalingType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], TargetShardCount = TargetShardCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShardCountInput]
  }
  @scala.inline
  implicit class UpdateShardCountInputOps[Self <: UpdateShardCountInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScalingType(value: ScalingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamName(value: StreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetShardCount(value: PositiveIntegerObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetShardCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

