package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSimulationApplicationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the updated simulation application.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation application was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The name of the simulation application.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.native
  /**
    * The revision id of the simulation application.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
  /**
    * Information about the robot software suite (ROS distribution).
    */
  var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.native
  /**
    * The simulation software suite used by the simulation application.
    */
  var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.native
  /**
    * The sources of the simulation application.
    */
  var sources: js.UndefOr[Sources] = js.native
  /**
    * The version of the robot application.
    */
  var version: js.UndefOr[Version] = js.native
}

object UpdateSimulationApplicationResponse {
  @scala.inline
  def apply(): UpdateSimulationApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSimulationApplicationResponse]
  }
  @scala.inline
  implicit class UpdateSimulationApplicationResponseOps[Self <: UpdateSimulationApplicationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
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
    @scala.inline
    def withRevisionId(value: RevisionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withRobotSoftwareSuite(value: RobotSoftwareSuite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotSoftwareSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRobotSoftwareSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotSoftwareSuite")(js.undefined)
        ret
    }
    @scala.inline
    def withSimulationSoftwareSuite(value: SimulationSoftwareSuite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulationSoftwareSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimulationSoftwareSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulationSoftwareSuite")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: Sources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

