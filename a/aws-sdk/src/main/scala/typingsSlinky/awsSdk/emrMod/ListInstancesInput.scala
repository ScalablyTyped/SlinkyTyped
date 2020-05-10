package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstancesInput extends js.Object {
  /**
    * The identifier of the cluster for which to list the instances.
    */
  var ClusterId: typingsSlinky.awsSdk.emrMod.ClusterId = js.native
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleetId: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceFleetId] = js.native
  /**
    * The node type of the instance fleet. For example MASTER, CORE, or TASK.
    */
  var InstanceFleetType: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceFleetType] = js.native
  /**
    * The identifier of the instance group for which to list the instances.
    */
  var InstanceGroupId: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceGroupId] = js.native
  /**
    * The type of instance group for which to list the instances.
    */
  var InstanceGroupTypes: js.UndefOr[InstanceGroupTypeList] = js.native
  /**
    * A list of instance states that will filter the instances returned with this request.
    */
  var InstanceStates: js.UndefOr[InstanceStateList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.emrMod.Marker] = js.native
}

object ListInstancesInput {
  @scala.inline
  def apply(ClusterId: ClusterId): ListInstancesInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstancesInput]
  }
  @scala.inline
  implicit class ListInstancesInputOps[Self <: ListInstancesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceFleetId(value: InstanceFleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceFleetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleetId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceFleetType(value: InstanceFleetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceFleetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleetType")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceGroupId(value: InstanceGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceGroupTypes(value: InstanceGroupTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroupTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroupTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroupTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceStates(value: InstanceStateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceStates")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
  }
  
}

