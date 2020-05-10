package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RobotSoftwareSuite extends js.Object {
  /**
    * The name of the robot software suite (ROS distribution).
    */
  var name: js.UndefOr[RobotSoftwareSuiteType] = js.native
  /**
    * The version of the robot software suite (ROS distribution).
    */
  var version: js.UndefOr[RobotSoftwareSuiteVersionType] = js.native
}

object RobotSoftwareSuite {
  @scala.inline
  def apply(): RobotSoftwareSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RobotSoftwareSuite]
  }
  @scala.inline
  implicit class RobotSoftwareSuiteOps[Self <: RobotSoftwareSuite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: RobotSoftwareSuiteType): Self = {
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
    def withVersion(value: RobotSoftwareSuiteVersionType): Self = {
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

