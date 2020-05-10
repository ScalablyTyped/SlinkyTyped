package typingsSlinky.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupConfig extends js.Object {
  /**
    * Optional. The Google Compute Engine accelerator configuration for these instances.Beta Feature: This feature is still under development. It may be
    * changed before final release.
    */
  var accelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.native
  /** Optional. Disk option config settings. */
  var diskConfig: js.UndefOr[DiskConfig] = js.native
  /** Output-only. The Google Compute Engine image resource used for cluster instances. Inferred from SoftwareConfig.image_version. */
  var imageUri: js.UndefOr[String] = js.native
  /**
    * Optional. The list of instance names. Cloud Dataproc derives the names from cluster_name, num_instances, and the instance group if not set by user
    * (recommended practice is to let Cloud Dataproc derive the name).
    */
  var instanceNames: js.UndefOr[js.Array[String]] = js.native
  /** Optional. Specifies that this instance group contains preemptible instances. */
  var isPreemptible: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The Google Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * n1-standard-2
    */
  var machineTypeUri: js.UndefOr[String] = js.native
  /** Output-only. The config for Google Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups. */
  var managedGroupConfig: js.UndefOr[ManagedGroupConfig] = js.native
  /** Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1. */
  var numInstances: js.UndefOr[Double] = js.native
}

object InstanceGroupConfig {
  @scala.inline
  def apply(): InstanceGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupConfig]
  }
  @scala.inline
  implicit class InstanceGroupConfigOps[Self <: InstanceGroupConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerators(value: js.Array[AcceleratorConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerators")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskConfig(value: DiskConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUri")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceNames")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPreemptible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPreemptible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPreemptible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPreemptible")(js.undefined)
        ret
    }
    @scala.inline
    def withMachineTypeUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineTypeUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMachineTypeUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineTypeUri")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedGroupConfig(value: ManagedGroupConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedGroupConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedGroupConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedGroupConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNumInstances(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numInstances")(js.undefined)
        ret
    }
  }
  
}

