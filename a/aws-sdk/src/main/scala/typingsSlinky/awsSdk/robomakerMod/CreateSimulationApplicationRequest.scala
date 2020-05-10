package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSimulationApplicationRequest extends js.Object {
  /**
    * The name of the simulation application.
    */
  var name: Name = js.native
  /**
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.native
  /**
    * The robot software suite (ROS distribution) used by the simulation application.
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
  /**
    * A map that contains tag keys and tag values that are attached to the simulation application.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateSimulationApplicationRequest {
  @scala.inline
  def apply(
    name: Name,
    robotSoftwareSuite: RobotSoftwareSuite,
    simulationSoftwareSuite: SimulationSoftwareSuite,
    sources: SourceConfigs
  ): CreateSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], simulationSoftwareSuite = simulationSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSimulationApplicationRequest]
  }
  @scala.inline
  implicit class CreateSimulationApplicationRequestOps[Self <: CreateSimulationApplicationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    def withTags(value: TagMap): Self = {
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
  }
  
}

