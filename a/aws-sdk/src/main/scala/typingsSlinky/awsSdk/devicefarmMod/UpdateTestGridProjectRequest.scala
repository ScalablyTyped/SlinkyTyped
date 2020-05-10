package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTestGridProjectRequest extends js.Object {
  /**
    * Human-readable description for the project.
    */
  var description: js.UndefOr[ResourceDescription] = js.native
  /**
    * Human-readable name for the project.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * ARN of the project to update.
    */
  var projectArn: DeviceFarmArn = js.native
}

object UpdateTestGridProjectRequest {
  @scala.inline
  def apply(projectArn: DeviceFarmArn): UpdateTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTestGridProjectRequest]
  }
  @scala.inline
  implicit class UpdateTestGridProjectRequestOps[Self <: UpdateTestGridProjectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectArn(value: DeviceFarmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: ResourceDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
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
  }
  
}

