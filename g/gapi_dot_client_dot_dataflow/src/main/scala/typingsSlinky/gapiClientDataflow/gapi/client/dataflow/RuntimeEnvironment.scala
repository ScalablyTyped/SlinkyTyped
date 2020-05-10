package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeEnvironment extends js.Object {
  /**
    * Whether to bypass the safety checks for the job's temporary directory.
    * Use with caution.
    */
  var bypassTempDirValidation: js.UndefOr[Boolean] = js.native
  /**
    * The machine type to use for the job. Defaults to the value from the
    * template if not specified.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The maximum number of Google Compute Engine instances to be made
    * available to your pipeline during execution, from 1 to 1000.
    */
  var maxWorkers: js.UndefOr[Double] = js.native
  /** The email address of the service account to run the job as. */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  /**
    * The Cloud Storage path to use for temporary files.
    * Must be a valid Cloud Storage URL, beginning with `gs://`.
    */
  var tempLocation: js.UndefOr[String] = js.native
  /**
    * The Compute Engine [availability
    * zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones)
    * for launching worker instances to run your pipeline.
    */
  var zone: js.UndefOr[String] = js.native
}

object RuntimeEnvironment {
  @scala.inline
  def apply(): RuntimeEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeEnvironment]
  }
  @scala.inline
  implicit class RuntimeEnvironmentOps[Self <: RuntimeEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBypassTempDirValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassTempDirValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypassTempDirValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassTempDirValidation")(js.undefined)
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
    def withMaxWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withTempLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempLocation")(js.undefined)
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

