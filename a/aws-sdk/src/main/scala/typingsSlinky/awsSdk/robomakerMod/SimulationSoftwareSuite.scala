package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationSoftwareSuite extends js.Object {
  /**
    * The name of the simulation software suite.
    */
  var name: js.UndefOr[SimulationSoftwareSuiteType] = js.native
  /**
    * The version of the simulation software suite.
    */
  var version: js.UndefOr[SimulationSoftwareSuiteVersionType] = js.native
}

object SimulationSoftwareSuite {
  @scala.inline
  def apply(): SimulationSoftwareSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationSoftwareSuite]
  }
  @scala.inline
  implicit class SimulationSoftwareSuiteOps[Self <: SimulationSoftwareSuite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: SimulationSoftwareSuiteType): Self = {
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
    def withVersion(value: SimulationSoftwareSuiteVersionType): Self = {
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

