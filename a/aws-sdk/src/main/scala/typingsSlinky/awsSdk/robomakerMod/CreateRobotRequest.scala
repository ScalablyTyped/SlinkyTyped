package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRobotRequest extends js.Object {
  /**
    * The target architecture of the robot.
    */
  var architecture: Architecture = js.native
  /**
    * The Greengrass group id.
    */
  var greengrassGroupId: Id = js.native
  /**
    * The name for the robot.
    */
  var name: Name = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the robot.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateRobotRequest {
  @scala.inline
  def apply(architecture: Architecture, greengrassGroupId: Id, name: Name): CreateRobotRequest = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], greengrassGroupId = greengrassGroupId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotRequest]
  }
  @scala.inline
  implicit class CreateRobotRequestOps[Self <: CreateRobotRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: Architecture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreengrassGroupId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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

