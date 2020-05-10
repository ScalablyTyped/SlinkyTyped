package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterRobotResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet that the robot will join.
    */
  var fleet: js.UndefOr[Arn] = js.native
  /**
    * Information about the robot registration.
    */
  var robot: js.UndefOr[Arn] = js.native
}

object RegisterRobotResponse {
  @scala.inline
  def apply(): RegisterRobotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterRobotResponse]
  }
  @scala.inline
  implicit class RegisterRobotResponseOps[Self <: RegisterRobotResponse] (val x: Self) extends AnyVal {
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
    def withoutFleet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleet")(js.undefined)
        ret
    }
    @scala.inline
    def withRobot(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRobot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robot")(js.undefined)
        ret
    }
  }
  
}

