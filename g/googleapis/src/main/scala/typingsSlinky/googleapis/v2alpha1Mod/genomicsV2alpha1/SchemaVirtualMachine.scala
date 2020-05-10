package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Carries information about a Compute Engine VM resource.
  */
@js.native
trait SchemaVirtualMachine extends js.Object {
  /**
    * The list of accelerators to attach to the VM.
    */
  var accelerators: js.UndefOr[js.Array[SchemaAccelerator]] = js.native
  /**
    * The size of the boot disk, in GB. The boot disk must be large enough to
    * accommodate all of the Docker images from each action in the pipeline at
    * the same time. If not specified, a small but reasonable default value is
    * used.
    */
  var bootDiskSizeGb: js.UndefOr[Double] = js.native
  /**
    * The host operating system image to use.  Currently, only
    * Container-Optimized OS images can be used.  The default value is
    * `projects/cos-cloud/global/images/family/cos-stable`, which selects the
    * latest stable release of Container-Optimized OS.  This option is provided
    * to allow testing against the beta release of the operating system to
    * ensure that the new version does not interact negatively with production
    * pipelines.  To test a pipeline against the beta release of
    * Container-Optimized OS, use the value
    * `projects/cos-cloud/global/images/family/cos-beta`.
    */
  var bootImage: js.UndefOr[String] = js.native
  /**
    * The CPU platform to request. An instance based on a newer platform can be
    * allocated, but never one with fewer capabilities. The value of this
    * parameter must be a valid Compute Engine CPU platform name (such as
    * &quot;Intel Skylake&quot;). This parameter is only useful for carefully
    * optimized work loads where the CPU platform has a significant impact. For
    * more information about the effect of this parameter, see
    * https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform.
    */
  var cpuPlatform: js.UndefOr[String] = js.native
  /**
    * The list of disks to create and attach to the VM.
    */
  var disks: js.UndefOr[js.Array[SchemaDisk]] = js.native
  /**
    * Optional set of labels to apply to the VM and any attached disk
    * resources. These labels must adhere to the name and value restrictions on
    * VM labels imposed by Compute Engine.  Labels applied at creation time to
    * the VM. Applied on a best-effort basis to attached disk resources shortly
    * after VM creation.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The machine type of the virtual machine to create. Must be the short name
    * of a standard machine type (such as &quot;n1-standard-1&quot;) or a
    * custom machine type (such as &quot;custom-1-4096&quot;, where
    * &quot;1&quot; indicates the number of vCPUs and &quot;4096&quot;
    * indicates the memory in MB). See [Creating an instance with a custom
    * machine
    * type](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create)
    * for more specifications on creating a custom machine type.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The VM network configuration.
    */
  var network: js.UndefOr[SchemaNetwork] = js.native
  /**
    * The NVIDIA driver version to use when attaching an NVIDIA GPU
    * accelerator. The version specified here must be compatible with the GPU
    * libraries contained in the container being executed, and must be one of
    * the drivers hosted in the `nvidia-drivers-us-public` bucket on Google
    * Cloud Storage.
    */
  var nvidiaDriverVersion: js.UndefOr[String] = js.native
  /**
    * If true, allocate a preemptible VM.
    */
  var preemptible: js.UndefOr[Boolean] = js.native
  /**
    * The service account to install on the VM. This account does not need any
    * permissions other than those required by the pipeline.
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.native
}

object SchemaVirtualMachine {
  @scala.inline
  def apply(): SchemaVirtualMachine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVirtualMachine]
  }
  @scala.inline
  implicit class SchemaVirtualMachineOps[Self <: SchemaVirtualMachine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerators(value: js.Array[SchemaAccelerator]): Self = {
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
    def withBootDiskSizeGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootDiskSizeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootDiskSizeGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootDiskSizeGb")(js.undefined)
        ret
    }
    @scala.inline
    def withBootImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootImage")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuPlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuPlatform")(js.undefined)
        ret
    }
    @scala.inline
    def withDisks(value: js.Array[SchemaDisk]): Self = {
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
    def withNvidiaDriverVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nvidiaDriverVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNvidiaDriverVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nvidiaDriverVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPreemptible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preemptible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreemptible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preemptible")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccount(value: SchemaServiceAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(js.undefined)
        ret
    }
  }
  
}

