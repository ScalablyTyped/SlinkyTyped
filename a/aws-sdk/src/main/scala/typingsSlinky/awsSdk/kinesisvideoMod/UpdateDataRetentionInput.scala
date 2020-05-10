package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataRetentionInput extends js.Object {
  /**
    * The version of the stream whose retention period you want to change. To get the version, call either the DescribeStream or the ListStreams API.
    */
  var CurrentVersion: Version = js.native
  /**
    * The retention period, in hours. The value you specify replaces the current value. The maximum value for this parameter is 87600 (ten years).
    */
  var DataRetentionChangeInHours: typingsSlinky.awsSdk.kinesisvideoMod.DataRetentionChangeInHours = js.native
  /**
    * Indicates whether you want to increase or decrease the retention period.
    */
  var Operation: UpdateDataRetentionOperation = js.native
  /**
    * The Amazon Resource Name (ARN) of the stream whose retention period you want to change.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the stream whose retention period you want to change.
    */
  var StreamName: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.StreamName] = js.native
}

object UpdateDataRetentionInput {
  @scala.inline
  def apply(
    CurrentVersion: Version,
    DataRetentionChangeInHours: DataRetentionChangeInHours,
    Operation: UpdateDataRetentionOperation
  ): UpdateDataRetentionInput = {
    val __obj = js.Dynamic.literal(CurrentVersion = CurrentVersion.asInstanceOf[js.Any], DataRetentionChangeInHours = DataRetentionChangeInHours.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataRetentionInput]
  }
  @scala.inline
  implicit class UpdateDataRetentionInputOps[Self <: UpdateDataRetentionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataRetentionChangeInHours(value: DataRetentionChangeInHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRetentionChangeInHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: UpdateDataRetentionOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamARN")(js.undefined)
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
  }
  
}

