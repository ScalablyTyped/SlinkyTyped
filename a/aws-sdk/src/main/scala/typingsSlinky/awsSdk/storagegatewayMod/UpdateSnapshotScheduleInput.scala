package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSnapshotScheduleInput extends js.Object {
  /**
    * Optional description of the snapshot that overwrites the existing description.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Description] = js.native
  /**
    * Frequency of snapshots. Specify the number of hours between snapshots.
    */
  var RecurrenceInHours: typingsSlinky.awsSdk.storagegatewayMod.RecurrenceInHours = js.native
  /**
    * The hour of the day at which the snapshot schedule begins represented as hh, where hh is the hour (0 to 23). The hour of the day is in the time zone of the gateway.
    */
  var StartAt: HourOfDay = js.native
  /**
    * A list of up to 50 tags that can be assigned to a snapshot. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Tags] = js.native
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: typingsSlinky.awsSdk.storagegatewayMod.VolumeARN = js.native
}

object UpdateSnapshotScheduleInput {
  @scala.inline
  def apply(RecurrenceInHours: RecurrenceInHours, StartAt: HourOfDay, VolumeARN: VolumeARN): UpdateSnapshotScheduleInput = {
    val __obj = js.Dynamic.literal(RecurrenceInHours = RecurrenceInHours.asInstanceOf[js.Any], StartAt = StartAt.asInstanceOf[js.Any], VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSnapshotScheduleInput]
  }
  @scala.inline
  implicit class UpdateSnapshotScheduleInputOps[Self <: UpdateSnapshotScheduleInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecurrenceInHours(value: RecurrenceInHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurrenceInHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAt(value: HourOfDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeARN(value: VolumeARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

