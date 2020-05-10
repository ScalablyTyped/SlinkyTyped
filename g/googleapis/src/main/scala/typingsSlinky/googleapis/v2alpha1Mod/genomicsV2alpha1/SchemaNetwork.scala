package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VM networking options.
  */
@js.native
trait SchemaNetwork extends js.Object {
  /**
    * The network name to attach the VM&#39;s network interface to. The value
    * will be prefixed with `global/networks/` unless it contains a `/`, in
    * which case it is assumed to be a fully specified network resource URL. If
    * unspecified, the global default network is used.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If the specified network is configured for custom subnet creation, the
    * name of the subnetwork to attach the instance to must be specified here.
    * The value is prefixed with `regions/x/subnetworks/` unless it contains a
    * `/`, in which case it is assumed to be a fully specified subnetwork
    * resource URL.  If the `*` character appears in the value, it is replaced
    * with the region that the virtual machine has been allocated in.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * If set to true, do not attach a public IP address to the VM. Note that
    * without a public IP address, additional configuration is required to
    * allow the VM to access Google services.  See
    * https://cloud.google.com/vpc/docs/configure-private-google-access for
    * more information.
    */
  var usePrivateAddress: js.UndefOr[Boolean] = js.native
}

object SchemaNetwork {
  @scala.inline
  def apply(): SchemaNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetwork]
  }
  @scala.inline
  implicit class SchemaNetworkOps[Self <: SchemaNetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePrivateAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePrivateAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePrivateAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePrivateAddress")(js.undefined)
        ret
    }
  }
  
}

