package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionInstanceGroupsListInstancesRequest extends js.Object {
  /** Instances in which state should be returned. Valid options are: 'ALL', 'RUNNING'. By default, it lists all instances. */
  var instanceState: js.UndefOr[String] = js.native
  /**
    * Name of port user is interested in. It is optional. If it is set, only information about this ports will be returned. If it is not set, all the named
    * ports will be returned. Always lists all instances.
    */
  var portName: js.UndefOr[String] = js.native
}

object RegionInstanceGroupsListInstancesRequest {
  @scala.inline
  def apply(): RegionInstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupsListInstancesRequest]
  }
  @scala.inline
  implicit class RegionInstanceGroupsListInstancesRequestOps[Self <: RegionInstanceGroupsListInstancesRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portName")(js.undefined)
        ret
    }
  }
  
}

