package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotSchedulesOutputMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the marker parameter and retrying the command. If the marker field is empty, all response records have been retrieved for the request.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of SnapshotSchedules.
    */
  var SnapshotSchedules: js.UndefOr[SnapshotScheduleList] = js.native
}

object DescribeSnapshotSchedulesOutputMessage {
  @scala.inline
  def apply(): DescribeSnapshotSchedulesOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotSchedulesOutputMessage]
  }
  @scala.inline
  implicit class DescribeSnapshotSchedulesOutputMessageOps[Self <: DescribeSnapshotSchedulesOutputMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotSchedules(value: SnapshotScheduleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotSchedules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotSchedules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotSchedules")(js.undefined)
        ret
    }
  }
  
}

