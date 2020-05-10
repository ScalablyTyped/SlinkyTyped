package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subnet extends js.Object {
  var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.native
  /**
    * Specifies the identifier of the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the status of the subnet.
    */
  var SubnetStatus: js.UndefOr[String] = js.native
}

object Subnet {
  @scala.inline
  def apply(): Subnet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subnet]
  }
  @scala.inline
  implicit class SubnetOps[Self <: Subnet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnetAvailabilityZone(value: AvailabilityZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetAvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetAvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetStatus")(js.undefined)
        ret
    }
  }
  
}

