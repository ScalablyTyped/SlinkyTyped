package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for creating a Compute Engine Instance resource. Most fields are
  * identical to the corresponding Compute Engine resource.
  */
@js.native
trait SchemaVmParams extends js.Object {
  /**
    * Deprecated. Please use baseInstanceName instead.
    */
  var baseInstanceName: js.UndefOr[String] = js.native
  /**
    * Enables IP Forwarding, which allows this instance to receive packets
    * destined for a different IP address, and send packets with a different
    * source IP. See IP Forwarding for more information.
    */
  var canIpForward: js.UndefOr[Boolean] = js.native
  /**
    * An optional textual description of the instance.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A list of existing Persistent Disk resources to attach to each replica in
    * the pool. Each disk will be attached in read-only mode to every replica.
    */
  var disksToAttach: js.UndefOr[js.Array[SchemaExistingDisk]] = js.native
  /**
    * A list of Disk resources to create and attach to each Replica in the
    * Pool. Currently, you can only define one disk and it must be a root
    * persistent disk. Note that Replica Pool will create a root persistent
    * disk for each replica.
    */
  var disksToCreate: js.UndefOr[js.Array[SchemaNewDisk]] = js.native
  /**
    * The machine type for this instance. The resource name (e.g.
    * n1-standard-1).
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The metadata key/value pairs assigned to this instance.
    */
  var metadata: js.UndefOr[SchemaMetadata] = js.native
  /**
    * A list of network interfaces for the instance. Currently only one
    * interface is supported by Google Compute Engine, ONE_TO_ONE_NAT.
    */
  var networkInterfaces: js.UndefOr[js.Array[SchemaNetworkInterface]] = js.native
  var onHostMaintenance: js.UndefOr[String] = js.native
  /**
    * A list of Service Accounts to enable for this instance.
    */
  var serviceAccounts: js.UndefOr[js.Array[SchemaServiceAccount]] = js.native
  /**
    * A list of tags to apply to the Google Compute Engine instance to identify
    * resources.
    */
  var tags: js.UndefOr[SchemaTag] = js.native
}

object SchemaVmParams {
  @scala.inline
  def apply(): SchemaVmParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmParams]
  }
  @scala.inline
  implicit class SchemaVmParamsOps[Self <: SchemaVmParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseInstanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseInstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withCanIpForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canIpForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanIpForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canIpForward")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisksToAttach(value: js.Array[SchemaExistingDisk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disksToAttach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisksToAttach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disksToAttach")(js.undefined)
        ret
    }
    @scala.inline
    def withDisksToCreate(value: js.Array[SchemaNewDisk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disksToCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisksToCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disksToCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withMachineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMachineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineType")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaces(value: js.Array[SchemaNetworkInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHostMaintenance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHostMaintenance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHostMaintenance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHostMaintenance")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccounts(value: js.Array[SchemaServiceAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: SchemaTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

