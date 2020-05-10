package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkGroupInput extends js.Object {
  /**
    * The workgroup configuration that will be updated for the given workgroup.
    */
  var ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates] = js.native
  /**
    * The workgroup description.
    */
  var Description: js.UndefOr[WorkGroupDescriptionString] = js.native
  /**
    * The workgroup state that will be updated for the given workgroup.
    */
  var State: js.UndefOr[WorkGroupState] = js.native
  /**
    * The specified workgroup that will be updated.
    */
  var WorkGroup: WorkGroupName = js.native
}

object UpdateWorkGroupInput {
  @scala.inline
  def apply(WorkGroup: WorkGroupName): UpdateWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkGroupInput]
  }
  @scala.inline
  implicit class UpdateWorkGroupInputOps[Self <: UpdateWorkGroupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkGroup(value: WorkGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationUpdates(value: WorkGroupConfigurationUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: WorkGroupDescriptionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: WorkGroupState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

