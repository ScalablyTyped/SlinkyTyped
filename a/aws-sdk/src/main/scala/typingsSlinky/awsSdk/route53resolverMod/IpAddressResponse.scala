package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpAddressResponse extends js.Object {
  /**
    * The date and time that the IP address was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.native
  /**
    * One IP address that the resolver endpoint uses for DNS queries.
    */
  var Ip: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Ip] = js.native
  /**
    * The ID of one IP address.
    */
  var IpId: js.UndefOr[ResourceId] = js.native
  /**
    * The date and time that the IP address was last modified, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.native
  /**
    * A status code that gives the current status of the request.
    */
  var Status: js.UndefOr[IpAddressStatus] = js.native
  /**
    * A message that provides additional information about the status of the request.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.StatusMessage] = js.native
  /**
    * The ID of one subnet.
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.SubnetId] = js.native
}

object IpAddressResponse {
  @scala.inline
  def apply(): IpAddressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpAddressResponse]
  }
  @scala.inline
  implicit class IpAddressResponseOps[Self <: IpAddressResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: Rfc3339TimeString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: Ip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ip")(js.undefined)
        ret
    }
    @scala.inline
    def withIpId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpId")(js.undefined)
        ret
    }
    @scala.inline
    def withModificationTime(value: Rfc3339TimeString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModificationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModificationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModificationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: IpAddressStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: StatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
  }
  
}

