package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes one particular pool of Cloud Dataflow workers to be instantiated
  * by the Cloud Dataflow service in order to perform the computations required
  * by a job.  Note that a workflow job may use multiple pools, in order to
  * match the various computational requirements of the various stages of the
  * job.
  */
@js.native
trait SchemaWorkerPool extends js.Object {
  /**
    * Settings for autoscaling of this WorkerPool.
    */
  var autoscalingSettings: js.UndefOr[SchemaAutoscalingSettings] = js.native
  /**
    * Data disks that are used by a VM in this workflow.
    */
  var dataDisks: js.UndefOr[js.Array[SchemaDisk]] = js.native
  /**
    * The default package set to install.  This allows the service to select a
    * default set of packages which are useful to worker harnesses written in a
    * particular language.
    */
  var defaultPackageSet: js.UndefOr[String] = js.native
  /**
    * Size of root disk for VMs, in GB.  If zero or unspecified, the service
    * will attempt to choose a reasonable default.
    */
  var diskSizeGb: js.UndefOr[Double] = js.native
  /**
    * Fully qualified source image for disks.
    */
  var diskSourceImage: js.UndefOr[String] = js.native
  /**
    * Type of root disk for VMs.  If empty or unspecified, the service will
    * attempt to choose a reasonable default.
    */
  var diskType: js.UndefOr[String] = js.native
  /**
    * Configuration for VM IPs.
    */
  var ipConfiguration: js.UndefOr[String] = js.native
  /**
    * The kind of the worker pool; currently only `harness` and `shuffle` are
    * supported.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Machine type (e.g. &quot;n1-standard-1&quot;).  If empty or unspecified,
    * the service will attempt to choose a reasonable default.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * Metadata to set on the Google Compute Engine VMs.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Network to which VMs will be assigned.  If empty or unspecified, the
    * service will use the network &quot;default&quot;.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * The number of threads per worker harness. If empty or unspecified, the
    * service will choose a number of threads (according to the number of cores
    * on the selected machine type for batch, or 1 by convention for
    * streaming).
    */
  var numThreadsPerWorker: js.UndefOr[Double] = js.native
  /**
    * Number of Google Compute Engine workers in this pool needed to execute
    * the job.  If zero or unspecified, the service will attempt to choose a
    * reasonable default.
    */
  var numWorkers: js.UndefOr[Double] = js.native
  /**
    * The action to take on host maintenance, as defined by the Google Compute
    * Engine API.
    */
  var onHostMaintenance: js.UndefOr[String] = js.native
  /**
    * Packages to be installed on workers.
    */
  var packages: js.UndefOr[js.Array[SchemaPackage]] = js.native
  /**
    * Extra arguments for this worker pool.
    */
  var poolArgs: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Subnetwork to which VMs will be assigned, if desired.  Expected to be of
    * the form &quot;regions/REGION/subnetworks/SUBNETWORK&quot;.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * Settings passed through to Google Compute Engine workers when using the
    * standard Dataflow task runner.  Users should ignore this field.
    */
  var taskrunnerSettings: js.UndefOr[SchemaTaskRunnerSettings] = js.native
  /**
    * Sets the policy for determining when to turndown worker pool. Allowed
    * values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and
    * `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are always torn down
    * regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means
    * workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the
    * workers are never torn down.  If the workers are not torn down by the
    * service, they will continue to run and use Google Compute Engine VM
    * resources in the user&#39;s project until they are explicitly terminated
    * by the user. Because of this, Google recommends using the
    * `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs.
    * If unknown or unspecified, the service will attempt to choose a
    * reasonable default.
    */
  var teardownPolicy: js.UndefOr[String] = js.native
  /**
    * Required. Docker container image that executes the Cloud Dataflow worker
    * harness, residing in Google Container Registry.
    */
  var workerHarnessContainerImage: js.UndefOr[String] = js.native
  /**
    * Zone to run the worker pools in.  If empty or unspecified, the service
    * will attempt to choose a reasonable default.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaWorkerPool {
  @scala.inline
  def apply(): SchemaWorkerPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerPool]
  }
  @scala.inline
  implicit class SchemaWorkerPoolOps[Self <: SchemaWorkerPool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscalingSettings(value: SchemaAutoscalingSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDataDisks(value: js.Array[SchemaDisk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDisks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDisks")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPackageSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPackageSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPackageSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPackageSet")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskSizeGb(value: Double): Self = {
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
    def withDiskSourceImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSourceImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSourceImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSourceImage")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskType")(js.undefined)
        ret
    }
    @scala.inline
    def withIpConfiguration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withMetadata(value: StringDictionary[String]): Self = {
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
    def withNumThreadsPerWorker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numThreadsPerWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumThreadsPerWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numThreadsPerWorker")(js.undefined)
        ret
    }
    @scala.inline
    def withNumWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numWorkers")(js.undefined)
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
    def withPackages(value: js.Array[SchemaPackage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packages")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolArgs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolArgs")(js.undefined)
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
    def withTaskrunnerSettings(value: SchemaTaskRunnerSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskrunnerSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskrunnerSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskrunnerSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTeardownPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardownPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeardownPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardownPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerHarnessContainerImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerHarnessContainerImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerHarnessContainerImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerHarnessContainerImage")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

