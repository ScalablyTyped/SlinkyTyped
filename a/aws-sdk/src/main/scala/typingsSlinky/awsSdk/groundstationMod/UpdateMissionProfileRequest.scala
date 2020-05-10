package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMissionProfileRequest extends js.Object {
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  /**
    * A list of lists of ARNs. Each list of ARNs is an edge, with a from Config and a to Config.
    */
  var dataflowEdges: js.UndefOr[DataflowEdgeList] = js.native
  /**
    * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not present you with contacts shorter than this duration.
    */
  var minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: String = js.native
  /**
    * Name of a mission profile.
    */
  var name: js.UndefOr[SafeName] = js.native
  /**
    * ARN of a tracking Config.
    */
  var trackingConfigArn: js.UndefOr[ConfigArn] = js.native
}

object UpdateMissionProfileRequest {
  @scala.inline
  def apply(missionProfileId: String): UpdateMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMissionProfileRequest]
  }
  @scala.inline
  implicit class UpdateMissionProfileRequestOps[Self <: UpdateMissionProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissionProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missionProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContactPostPassDurationSeconds(value: DurationInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPostPassDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactPostPassDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPostPassDurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withContactPrePassDurationSeconds(value: DurationInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPrePassDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactPrePassDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPrePassDurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withDataflowEdges(value: DataflowEdgeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataflowEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumViableContactDurationSeconds(value: DurationInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumViableContactDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumViableContactDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumViableContactDurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: SafeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingConfigArn(value: ConfigArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingConfigArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingConfigArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingConfigArn")(js.undefined)
        ret
    }
  }
  
}

