package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMissionProfileResponse extends js.Object {
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
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
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.native
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: js.UndefOr[String] = js.native
  /**
    * Name of a mission profile.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Region of a mission profile.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Tags assigned to a mission profile.
    */
  var tags: js.UndefOr[TagsMap] = js.native
  /**
    * ARN of a tracking Config.
    */
  var trackingConfigArn: js.UndefOr[ConfigArn] = js.native
}

object GetMissionProfileResponse {
  @scala.inline
  def apply(): GetMissionProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMissionProfileResponse]
  }
  @scala.inline
  implicit class GetMissionProfileResponseOps[Self <: GetMissionProfileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMissionProfileArn(value: MissionProfileArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missionProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissionProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missionProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMissionProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missionProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissionProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missionProfileId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
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

