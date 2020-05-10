package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The system resources for the pipeline run.
  */
@js.native
trait SchemaPipelineResources extends js.Object {
  /**
    * Optional. The number of accelerators of the specified type to attach. By
    * specifying this parameter, you will download and install the following
    * third-party software onto your managed Compute Engine instances: NVIDIA®
    * Tesla® drivers and NVIDIA® CUDA toolkit.
    */
  var acceleratorCount: js.UndefOr[String] = js.native
  /**
    * Optional. The Compute Engine defined accelerator type. By specifying this
    * parameter, you will download and install the following third-party
    * software onto your managed Compute Engine instances: NVIDIA® Tesla®
    * drivers and NVIDIA® CUDA toolkit. Please see
    * https://cloud.google.com/compute/docs/gpus/ for a list of available
    * accelerator types.
    */
  var acceleratorType: js.UndefOr[String] = js.native
  /**
    * The size of the boot disk. Defaults to 10 (GB).
    */
  var bootDiskSizeGb: js.UndefOr[Double] = js.native
  /**
    * Disks to attach.
    */
  var disks: js.UndefOr[js.Array[SchemaDisk]] = js.native
  /**
    * The minimum number of cores to use. Defaults to 1.
    */
  var minimumCpuCores: js.UndefOr[Double] = js.native
  /**
    * The minimum amount of RAM to use. Defaults to 3.75 (GB)
    */
  var minimumRamGb: js.UndefOr[Double] = js.native
  /**
    * Whether to assign an external IP to the instance. This is an experimental
    * feature that may go away. Defaults to false. Corresponds to
    * `--no_address` flag for [gcloud compute instances create]
    * (https://cloud.google.com/sdk/gcloud/reference/compute/instances/create).
    * In order to use this, must be true for both create time and run time.
    * Cannot be true at run time if false at create time. If you need to ssh
    * into a private IP VM for debugging, you can ssh to a public VM and then
    * ssh into the private VM&#39;s Internal IP.  If noAddress is set, this
    * pipeline run may only load docker images from Google Container Registry
    * and not Docker Hub. Before using this, you must [configure access to
    * Google services from internal
    * IPs](https://cloud.google.com/compute/docs/configure-private-google-access#configuring_access_to_google_services_from_internal_ips).
    */
  var noAddress: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use preemptible VMs. Defaults to `false`. In order to use
    * this, must be true for both create time and run time. Cannot be true at
    * run time if false at create time.
    */
  var preemptible: js.UndefOr[Boolean] = js.native
  /**
    * List of Google Compute Engine availability zones to which resource
    * creation will restricted. If empty, any zone may be chosen.
    */
  var zones: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPipelineResources {
  @scala.inline
  def apply(): SchemaPipelineResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipelineResources]
  }
  @scala.inline
  implicit class SchemaPipelineResourcesOps[Self <: SchemaPipelineResources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleratorCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleratorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceleratorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleratorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorType")(js.undefined)
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
    def withMinimumCpuCores(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumCpuCores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumCpuCores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumCpuCores")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumRamGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRamGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumRamGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRamGb")(js.undefined)
        ret
    }
    @scala.inline
    def withNoAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAddress")(js.undefined)
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
    def withZones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zones")(js.undefined)
        ret
    }
  }
  
}

