package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncreaseStreamRetentionPeriodInput extends js.Object {
  /**
    * The new retention period of the stream, in hours. Must be more than the current retention period.
    */
  var RetentionPeriodHours: typingsSlinky.awsSdk.kinesisMod.RetentionPeriodHours = js.native
  /**
    * The name of the stream to modify.
    */
  var StreamName: typingsSlinky.awsSdk.kinesisMod.StreamName = js.native
}

object IncreaseStreamRetentionPeriodInput {
  @scala.inline
  def apply(RetentionPeriodHours: RetentionPeriodHours, StreamName: StreamName): IncreaseStreamRetentionPeriodInput = {
    val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseStreamRetentionPeriodInput]
  }
  @scala.inline
  implicit class IncreaseStreamRetentionPeriodInputOps[Self <: IncreaseStreamRetentionPeriodInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetentionPeriodHours(value: RetentionPeriodHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionPeriodHours")(value.asInstanceOf[js.Any])
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

