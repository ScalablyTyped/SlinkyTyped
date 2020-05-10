package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compute Engine NetworkInterface resource. Identical to the
  * NetworkInterface on the corresponding Compute Engine resource.
  */
@js.native
trait SchemaNetworkInterface extends js.Object {
  /**
    * An array of configurations for this interface. This specifies how this
    * interface is configured to interact with other network services.
    */
  var accessConfigs: js.UndefOr[js.Array[SchemaAccessConfig]] = js.native
  /**
    * Name the Network resource to which this interface applies.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * An optional IPV4 internal network address to assign to the instance for
    * this network interface.
    */
  var networkIp: js.UndefOr[String] = js.native
}

object SchemaNetworkInterface {
  @scala.inline
  def apply(): SchemaNetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkInterface]
  }
  @scala.inline
  implicit class SchemaNetworkInterfaceOps[Self <: SchemaNetworkInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessConfigs(value: js.Array[SchemaAccessConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkIp")(js.undefined)
        ret
    }
  }
  
}

