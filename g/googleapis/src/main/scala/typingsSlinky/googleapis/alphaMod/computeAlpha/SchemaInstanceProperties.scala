package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceProperties extends js.Object {
  /**
    * Enables instances created based on this template to send packets with
    * source IP addresses other than their own and receive packets with
    * destination IP addresses other than their own. If these instances will be
    * used as an IP gateway or it will be set as the next-hop in a Route
    * resource, specify true. If unsure, leave this set to false. See the
    * Enable IP forwarding documentation for more information.
    */
  var canIpForward: js.UndefOr[Boolean] = js.native
  /**
    * An optional text description for the instances that are created from this
    * instance template.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * An array of disks that are associated with the instances that are created
    * from this template.
    */
  var disks: js.UndefOr[js.Array[SchemaAttachedDisk]] = js.native
  /**
    * Display Device properties to enable support for remote display products
    * like: Teradici, VNC and TeamViewer
    */
  var displayDevice: js.UndefOr[SchemaDisplayDevice] = js.native
  /**
    * A list of guest accelerator cards&#39; type and count to use for
    * instances created from the instance template.
    */
  var guestAccelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.native
  /**
    * Labels to apply to instances that are created from this template.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The machine type to use for instances that are created from this
    * template.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The metadata key/value pairs to assign to instances that are created from
    * this template. These pairs can consist of custom metadata or predefined
    * keys. See Project and instance metadata for more information.
    */
  var metadata: js.UndefOr[SchemaMetadata] = js.native
  /**
    * Minimum cpu/platform to be used by this instance. The instance may be
    * scheduled on the specified or newer cpu/platform. Applicable values are
    * the friendly names of CPU platforms, such as minCpuPlatform: &quot;Intel
    * Haswell&quot; or minCpuPlatform: &quot;Intel Sandy Bridge&quot;. For more
    * information, read Specifying a Minimum CPU Platform.
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
  /**
    * An array of network access configurations for this interface.
    */
  var networkInterfaces: js.UndefOr[js.Array[SchemaNetworkInterface]] = js.native
  /**
    * The configuration of desired reservations which this Instance could
    * consume capacity from.
    */
  var reservationAffinity: js.UndefOr[SchemaReservationAffinity] = js.native
  /**
    * Specifies the scheduling options for the instances that are created from
    * this template.
    */
  var scheduling: js.UndefOr[SchemaScheduling] = js.native
  /**
    * A list of service accounts with specified scopes. Access tokens for these
    * service accounts are available to the instances that are created from
    * this template. Use metadata queries to obtain the access tokens for these
    * instances.
    */
  var serviceAccounts: js.UndefOr[js.Array[SchemaServiceAccount]] = js.native
  var shieldedInstanceConfig: js.UndefOr[SchemaShieldedInstanceConfig] = js.native
  /**
    * Specifies the Shielded VM options for the instances that are created from
    * this template.
    */
  var shieldedVmConfig: js.UndefOr[SchemaShieldedVmConfig] = js.native
  /**
    * A list of tags to apply to the instances that are created from this
    * template. The tags identify valid sources or targets for network
    * firewalls. The setTags method can modify this list of tags. Each tag
    * within the list must comply with RFC1035.
    */
  var tags: js.UndefOr[SchemaTags] = js.native
}

object SchemaInstanceProperties {
  @scala.inline
  def apply(): SchemaInstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceProperties]
  }
  @scala.inline
  implicit class SchemaInstancePropertiesOps[Self <: SchemaInstanceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDisks(value: js.Array[SchemaAttachedDisk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disks")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayDevice(value: SchemaDisplayDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withGuestAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestAccelerators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuestAccelerators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestAccelerators")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
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
    def withMinCpuPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCpuPlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCpuPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCpuPlatform")(js.undefined)
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
    def withReservationAffinity(value: SchemaReservationAffinity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservationAffinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservationAffinity")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduling(value: SchemaScheduling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduling")(js.undefined)
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
    def withShieldedInstanceConfig(value: SchemaShieldedInstanceConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shieldedInstanceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShieldedInstanceConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shieldedInstanceConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withShieldedVmConfig(value: SchemaShieldedVmConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shieldedVmConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShieldedVmConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shieldedVmConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: SchemaTags): Self = {
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

