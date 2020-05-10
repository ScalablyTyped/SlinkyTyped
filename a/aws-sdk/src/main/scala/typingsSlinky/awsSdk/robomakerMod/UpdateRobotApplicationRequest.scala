package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRobotApplicationRequest extends js.Object {
  /**
    * The application information for the robot application.
    */
  var application: Arn = js.native
  /**
    * The revision id for the robot application.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.native
  /**
    * The robot software suite (ROS distribution) used by the robot application.
    */
  var robotSoftwareSuite: RobotSoftwareSuite = js.native
  /**
    * The sources of the robot application.
    */
  var sources: SourceConfigs = js.native
}

object UpdateRobotApplicationRequest {
  @scala.inline
  def apply(application: Arn, robotSoftwareSuite: RobotSoftwareSuite, sources: SourceConfigs): UpdateRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRobotApplicationRequest]
  }
  @scala.inline
  implicit class UpdateRobotApplicationRequestOps[Self <: UpdateRobotApplicationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRobotSoftwareSuite(value: RobotSoftwareSuite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotSoftwareSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSources(value: SourceConfigs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentRevisionId(value: RevisionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRevisionId")(js.undefined)
        ret
    }
  }
  
}

