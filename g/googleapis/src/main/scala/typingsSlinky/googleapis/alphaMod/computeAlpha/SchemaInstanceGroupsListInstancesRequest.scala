package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupsListInstancesRequest extends js.Object {
  /**
    * A filter for the state of the instances in the instance group. Valid
    * options are ALL or RUNNING. If you do not specify this parameter the list
    * includes all instances regardless of their state.
    */
  var instanceState: js.UndefOr[String] = js.native
}

object SchemaInstanceGroupsListInstancesRequest {
  @scala.inline
  def apply(): SchemaInstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupsListInstancesRequest]
  }
  @scala.inline
  implicit class SchemaInstanceGroupsListInstancesRequestOps[Self <: SchemaInstanceGroupsListInstancesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceState")(js.undefined)
        ret
    }
  }
  
}

