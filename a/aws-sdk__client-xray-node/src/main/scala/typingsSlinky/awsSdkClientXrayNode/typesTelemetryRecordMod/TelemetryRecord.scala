package typingsSlinky.awsSdkClientXrayNode.typesTelemetryRecordMod

import typingsSlinky.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelemetryRecord extends js.Object {
  /**
    * <p/>
    */
  var BackendConnectionErrors: js.UndefOr[
    typingsSlinky.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
  ] = js.native
  /**
    * <p/>
    */
  var SegmentsReceivedCount: js.UndefOr[Double] = js.native
  /**
    * <p/>
    */
  var SegmentsRejectedCount: js.UndefOr[Double] = js.native
  /**
    * <p/>
    */
  var SegmentsSentCount: js.UndefOr[Double] = js.native
  /**
    * <p/>
    */
  var SegmentsSpilloverCount: js.UndefOr[Double] = js.native
  /**
    * <p/>
    */
  var Timestamp: js.Date | String | Double = js.native
}

object TelemetryRecord {
  @scala.inline
  def apply(Timestamp: js.Date | String | Double): TelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryRecord]
  }
  @scala.inline
  implicit class TelemetryRecordOps[Self <: TelemetryRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimestampDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackendConnectionErrors(value: BackendConnectionErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackendConnectionErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackendConnectionErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackendConnectionErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentsReceivedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsReceivedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentsReceivedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsReceivedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentsRejectedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsRejectedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentsRejectedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsRejectedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentsSentCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsSentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentsSentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsSentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentsSpilloverCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsSpilloverCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentsSpilloverCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsSpilloverCount")(js.undefined)
        ret
    }
  }
  
}

