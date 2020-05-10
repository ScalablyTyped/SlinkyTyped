package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSimulationApplicationRequest extends js.Object {
  /**
    * The application information for the simulation application.
    */
  var application: Arn = js.native
  /**
    * The revision id for the robot application.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.native
  /**
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.native
  /**
    * Information about the robot software suite (ROS distribution).
    */
  var robotSoftwareSuite: RobotSoftwareSuite = js.native
  /**
    * The simulation software suite used by the simulation application.
    */
  var simulationSoftwareSuite: SimulationSoftwareSuite = js.native
  /**
    * The sources of the simulation application.
    */
  var sources: SourceConfigs = js.native
}

object UpdateSimulationApplicationRequest {
  @scala.inline
  def apply(
    application: Arn,
    robotSoftwareSuite: RobotSoftwareSuite,
    simulationSoftwareSuite: SimulationSoftwareSuite,
    sources: SourceConfigs
  ): UpdateSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], simulationSoftwareSuite = simulationSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSimulationApplicationRequest]
  }
  @scala.inline
  implicit class UpdateSimulationApplicationRequestOps[Self <: UpdateSimulationApplicationRequest] (val x: Self) extends AnyVal {
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
    def withSimulationSoftwareSuite(value: SimulationSoftwareSuite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulationSoftwareSuite")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withRenderingEngine(value: RenderingEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderingEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingEngine")(js.undefined)
        ret
    }
  }
  
}

