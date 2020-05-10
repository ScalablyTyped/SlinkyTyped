package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateShardCountOutput extends js.Object {
  /**
    * The current number of shards.
    */
  var CurrentShardCount: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.StreamName] = js.native
  /**
    * The updated number of shards.
    */
  var TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.native
}

object UpdateShardCountOutput {
  @scala.inline
  def apply(): UpdateShardCountOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShardCountOutput]
  }
  @scala.inline
  implicit class UpdateShardCountOutputOps[Self <: UpdateShardCountOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentShardCount(value: PositiveIntegerObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentShardCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentShardCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentShardCount")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamName(value: StreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetShardCount(value: PositiveIntegerObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetShardCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetShardCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetShardCount")(js.undefined)
        ret
    }
  }
  
}

