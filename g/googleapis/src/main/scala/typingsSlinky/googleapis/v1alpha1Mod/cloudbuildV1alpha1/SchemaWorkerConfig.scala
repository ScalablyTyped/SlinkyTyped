package typingsSlinky.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WorkerConfig defines the configuration to be used for a creating workers in
  * the pool.
  */
@js.native
trait SchemaWorkerConfig extends js.Object {
  /**
    * Size of the disk attached to the worker, in GB. See
    * https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud
    * Build will use a standard disk size. `disk_size` is overridden if you
    * specify a different disk size in `build_options`. In this case, a VM with
    * a disk size specified in the `build_options` will be created on demand at
    * build time. For more information see
    * https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.builds#buildoptions
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  /**
    * Machine Type of the worker, such as n1-standard-1. See
    * https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud
    * Build will use a standard unspecified machine to create the worker pool.
    * `machine_type` is overridden if you specify a different machine type in
    * `build_options`. In this case, the VM specified in the `build_options`
    * will be created on demand at build time. For more information see
    * https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The network definition used to create the worker. If this section is left
    * empty, the workers will be created in WorkerPool.project_id on the
    * default network.
    */
  var network: js.UndefOr[SchemaNetwork] = js.native
  /**
    * The tag applied to the worker, and the same tag used by the firewall
    * rule. It is used to identify the Cloud Build workers among other VMs. The
    * default value for tag is `worker`.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaWorkerConfig {
  @scala.inline
  def apply(): SchemaWorkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerConfig]
  }
  @scala.inline
  implicit class SchemaWorkerConfigOps[Self <: SchemaWorkerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskSizeGb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSizeGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeGb")(js.undefined)
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
    def withNetwork(value: SchemaNetwork): Self = {
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
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

