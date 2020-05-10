package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInstanceRequest extends js.Object {
  /**
    * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
    */
  var forceDeleteAddOns: js.UndefOr[Boolean] = js.native
  /**
    * The name of the instance to delete.
    */
  var instanceName: ResourceName = js.native
}

object DeleteInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName): DeleteInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceRequest]
  }
  @scala.inline
  implicit class DeleteInstanceRequestOps[Self <: DeleteInstanceRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withForceDeleteAddOns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDeleteAddOns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDeleteAddOns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDeleteAddOns")(js.undefined)
        ret
    }
  }
  
}

