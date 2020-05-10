package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHsmRequest extends js.Object {
  /**
    * The identifier (ID) of the cluster that contains the HSM that you are deleting.
    */
  var ClusterId: typingsSlinky.awsSdk.cloudhsmv2Mod.ClusterId = js.native
  /**
    * The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
    */
  var EniId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.EniId] = js.native
  /**
    * The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  /**
    * The identifier (ID) of the HSM that you are deleting.
    */
  var HsmId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.HsmId] = js.native
}

object DeleteHsmRequest {
  @scala.inline
  def apply(ClusterId: ClusterId): DeleteHsmRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmRequest]
  }
  @scala.inline
  implicit class DeleteHsmRequestOps[Self <: DeleteHsmRequest] (val x: Self) extends AnyVal {
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
    def withEniId(value: EniId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEniId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniId")(js.undefined)
        ret
    }
    @scala.inline
    def withEniIp(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEniIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniIp")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmId(value: HsmId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmId")(js.undefined)
        ret
    }
  }
  
}

