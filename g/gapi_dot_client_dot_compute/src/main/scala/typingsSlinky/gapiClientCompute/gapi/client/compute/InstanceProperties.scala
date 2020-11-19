package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceProperties extends js.Object {
  
  /**
    * Enables instances created based on this template to send packets with source IP addresses other than their own and receive packets with destination IP
    * addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true.
    * If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
    */
  var canIpForward: js.UndefOr[Boolean] = js.native
  
  /** An optional text description for the instances that are created from this instance template. */
  var description: js.UndefOr[String] = js.native
  
  /** An array of disks that are associated with the instances that are created from this template. */
  var disks: js.UndefOr[js.Array[AttachedDisk]] = js.native
  
  /** A list of guest accelerator cards' type and count to use for instances created from the instance template. */
  var guestAccelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.native
  
  /** Labels to apply to instances that are created from this template. */
  var labels: js.UndefOr[Record[String, String]] = js.native
  
  /** The machine type to use for instances that are created from this template. */
  var machineType: js.UndefOr[String] = js.native
  
  /**
    * The metadata key/value pairs to assign to instances that are created from this template. These pairs can consist of custom metadata or predefined keys.
    * See Project and instance metadata for more information.
    */
  var metadata: js.UndefOr[Metadata] = js.native
  
  /**
    * Minimum cpu/platform to be used by this instance. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the
    * friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying
    * a Minimum CPU Platform.
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
  
  /** An array of network access configurations for this interface. */
  var networkInterfaces: js.UndefOr[js.Array[NetworkInterface]] = js.native
  
  /** Specifies the scheduling options for the instances that are created from this template. */
  var scheduling: js.UndefOr[Scheduling] = js.native
  
  /**
    * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from this
    * template. Use metadata queries to obtain the access tokens for these instances.
    */
  var serviceAccounts: js.UndefOr[js.Array[ServiceAccount]] = js.native
  
  /**
    * A list of tags to apply to the instances that are created from this template. The tags identify valid sources or targets for network firewalls. The
    * setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object InstanceProperties {
  
  @scala.inline
  def apply(): InstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceProperties]
  }
  
  @scala.inline
  implicit class InstancePropertiesOps[Self <: InstanceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanIpForward(value: Boolean): Self = this.set("canIpForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanIpForward: Self = this.set("canIpForward", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: AttachedDisk*): Self = this.set("disks", js.Array(value :_*))
    
    @scala.inline
    def setDisks(value: js.Array[AttachedDisk]): Self = this.set("disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisks: Self = this.set("disks", js.undefined)
    
    @scala.inline
    def setGuestAcceleratorsVarargs(value: AcceleratorConfig*): Self = this.set("guestAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setGuestAccelerators(value: js.Array[AcceleratorConfig]): Self = this.set("guestAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestAccelerators: Self = this.set("guestAccelerators", js.undefined)
    
    @scala.inline
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = this.set("minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCpuPlatform: Self = this.set("minCpuPlatform", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = this.set("networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: js.Array[NetworkInterface]): Self = this.set("networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("networkInterfaces", js.undefined)
    
    @scala.inline
    def setScheduling(value: Scheduling): Self = this.set("scheduling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduling: Self = this.set("scheduling", js.undefined)
    
    @scala.inline
    def setServiceAccountsVarargs(value: ServiceAccount*): Self = this.set("serviceAccounts", js.Array(value :_*))
    
    @scala.inline
    def setServiceAccounts(value: js.Array[ServiceAccount]): Self = this.set("serviceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccounts: Self = this.set("serviceAccounts", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
