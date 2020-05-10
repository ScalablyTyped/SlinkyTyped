package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostProperties extends js.Object {
  /**
    * The number of cores on the Dedicated Host.
    */
  var Cores: js.UndefOr[Integer] = js.native
  /**
    * The instance family supported by the Dedicated Host. For example, m5.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  /**
    * The instance type supported by the Dedicated Host. For example, m5.large. If the host supports multiple instance types, no instanceType is returned.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The number of sockets on the Dedicated Host.
    */
  var Sockets: js.UndefOr[Integer] = js.native
  /**
    * The total number of vCPUs on the Dedicated Host.
    */
  var TotalVCpus: js.UndefOr[Integer] = js.native
}

object HostProperties {
  @scala.inline
  def apply(): HostProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostProperties]
  }
  @scala.inline
  implicit class HostPropertiesOps[Self <: HostProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCores(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cores")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSockets(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sockets")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalVCpus(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalVCpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalVCpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalVCpus")(js.undefined)
        ret
    }
  }
  
}

