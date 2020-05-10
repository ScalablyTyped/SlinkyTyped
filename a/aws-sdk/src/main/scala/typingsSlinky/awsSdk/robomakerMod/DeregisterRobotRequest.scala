package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterRobotRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: Arn = js.native
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: Arn = js.native
}

object DeregisterRobotRequest {
  @scala.inline
  def apply(fleet: Arn, robot: Arn): DeregisterRobotRequest = {
    val __obj = js.Dynamic.literal(fleet = fleet.asInstanceOf[js.Any], robot = robot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterRobotRequest]
  }
  @scala.inline
  implicit class DeregisterRobotRequestOps[Self <: DeregisterRobotRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleet(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRobot(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

