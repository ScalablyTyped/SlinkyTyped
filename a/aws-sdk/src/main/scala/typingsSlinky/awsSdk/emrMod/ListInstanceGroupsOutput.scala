package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstanceGroupsOutput extends js.Object {
  /**
    * The list of instance groups for the cluster and given filters.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.emrMod.Marker] = js.native
}

object ListInstanceGroupsOutput {
  @scala.inline
  def apply(): ListInstanceGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceGroupsOutput]
  }
  @scala.inline
  implicit class ListInstanceGroupsOutputOps[Self <: ListInstanceGroupsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceGroups(value: InstanceGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroups")(js.undefined)
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

