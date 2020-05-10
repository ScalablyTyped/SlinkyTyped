package typingsSlinky.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional arguments to enable specific features of builds.
  */
@js.native
trait SchemaBuildOptions extends js.Object {
  /**
    * Requested disk size for the VM that runs the build. Note that this is
    * *NOT* &quot;disk free&quot;; some of the space will be used by the
    * operating system and build utilities. Also note that this is the minimum
    * disk size that will be allocated for the build -- the build may run with
    * a larger disk than requested. At present, the maximum disk size is
    * 1000GB; builds that request more than the maximum are rejected with an
    * error.
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  /**
    * A list of global environment variable definitions that will exist for all
    * build steps in this build. If a variable is defined in both globally and
    * in a build step, the variable will use the build step value.  The
    * elements are of the form &quot;KEY=VALUE&quot; for the environment
    * variable &quot;KEY&quot; being given the value &quot;VALUE&quot;.
    */
  var env: js.UndefOr[js.Array[String]] = js.native
  /**
    * Option to define build log streaming behavior to Google Cloud Storage.
    */
  var logStreamingOption: js.UndefOr[String] = js.native
  /**
    * Option to specify the logging mode, which determines where the logs are
    * stored.
    */
  var logging: js.UndefOr[String] = js.native
  /**
    * Compute Engine machine type on which to run the build.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * Requested verifiability options.
    */
  var requestedVerifyOption: js.UndefOr[String] = js.native
  /**
    * A list of global environment variables, which are encrypted using a Cloud
    * Key Management Service crypto key. These values must be specified in the
    * build&#39;s `Secret`. These variables will be available to all build
    * steps in this build.
    */
  var secretEnv: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requested hash for SourceProvenance.
    */
  var sourceProvenanceHash: js.UndefOr[js.Array[String]] = js.native
  /**
    * Option to specify behavior when there is an error in the substitution
    * checks.
    */
  var substitutionOption: js.UndefOr[String] = js.native
  /**
    * Global list of volumes to mount for ALL build steps  Each volume is
    * created as an empty volume prior to starting the build process. Upon
    * completion of the build, volumes and their contents are discarded. Global
    * volume names and paths cannot conflict with the volumes defined a build
    * step.  Using a global volume in a build with only one step is not valid
    * as it is indicative of a build request with an incorrect configuration.
    */
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.native
  /**
    * Option to specify a `WorkerPool` for the build. User specifies the pool
    * with the format &quot;[WORKERPOOL_PROJECT_ID]/[WORKERPOOL_NAME]&quot;.
    * This is an experimental field.
    */
  var workerPool: js.UndefOr[String] = js.native
}

object SchemaBuildOptions {
  @scala.inline
  def apply(): SchemaBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildOptions]
  }
  @scala.inline
  implicit class SchemaBuildOptionsOps[Self <: SchemaBuildOptions] (val x: Self) extends AnyVal {
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
    def withEnv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withLogStreamingOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamingOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreamingOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamingOption")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
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
    def withRequestedVerifyOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedVerifyOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedVerifyOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedVerifyOption")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretEnv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretEnv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretEnv")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceProvenanceHash(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceProvenanceHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceProvenanceHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceProvenanceHash")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitutionOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitutionOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutionOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitutionOption")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumes(value: js.Array[SchemaVolume]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerPool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerPool")(js.undefined)
        ret
    }
  }
  
}

