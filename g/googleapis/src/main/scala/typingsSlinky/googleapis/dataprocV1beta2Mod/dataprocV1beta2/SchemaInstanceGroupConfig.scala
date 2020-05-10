package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional. The config settings for Compute Engine resources in an instance
  * group, such as a master or worker group.
  */
@js.native
trait SchemaInstanceGroupConfig extends js.Object {
  /**
    * Optional. The Compute Engine accelerator configuration for these
    * instances.Beta Feature: This feature is still under development. It may
    * be changed before final release.
    */
  var accelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.native
  /**
    * Optional. Disk option config settings.
    */
  var diskConfig: js.UndefOr[SchemaDiskConfig] = js.native
  /**
    * Optional. The Compute Engine image resource used for cluster instances.
    * It can be specified or may be inferred from SoftwareConfig.image_version.
    */
  var imageUri: js.UndefOr[String] = js.native
  /**
    * Output only. The list of instance names. Cloud Dataproc derives the names
    * from cluster_name, num_instances, and the instance group.
    */
  var instanceNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. Specifies that this instance group contains preemptible
    * instances.
    */
  var isPreemptible: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The Compute Engine machine type used for cluster instances.A
    * full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * n1-standard-2Auto Zone Exception: If you are using the Cloud Dataproc
    * Auto Zone Placement feature, you must use the short name of the machine
    * type resource, for example, n1-standard-2.
    */
  var machineTypeUri: js.UndefOr[String] = js.native
  /**
    * Output only. The config for Compute Engine Instance Group Manager that
    * manages this group. This is only used for preemptible instance groups.
    */
  var managedGroupConfig: js.UndefOr[SchemaManagedGroupConfig] = js.native
  /**
    * Optional. Specifies the minimum cpu platform for the Instance Group. See
    * Cloud Dataproc&amp;rarr;Minimum CPU Platform.
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
  /**
    * Optional. The number of VM instances in the instance group. For master
    * instance groups, must be set to 1.
    */
  var numInstances: js.UndefOr[Double] = js.native
}

object SchemaInstanceGroupConfig {
  @scala.inline
  def apply(): SchemaInstanceGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupConfig]
  }
  @scala.inline
  implicit class SchemaInstanceGroupConfigOps[Self <: SchemaInstanceGroupConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = {
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
    def withDiskConfig(value: SchemaDiskConfig): Self = {
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
    def withManagedGroupConfig(value: SchemaManagedGroupConfig): Self = {
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

