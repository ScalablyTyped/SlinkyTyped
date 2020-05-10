package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceStateRequest extends js.Object {
  /**
    * The name of the instance to get state information about.
    */
  var instanceName: ResourceName = js.native
}

object GetInstanceStateRequest {
  @scala.inline
  def apply(instanceName: ResourceName): GetInstanceStateRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceStateRequest]
  }
  @scala.inline
  implicit class GetInstanceStateRequestOps[Self <: GetInstanceStateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

