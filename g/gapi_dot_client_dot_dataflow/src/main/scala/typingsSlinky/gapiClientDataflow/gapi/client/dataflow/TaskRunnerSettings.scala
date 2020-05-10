package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRunnerSettings extends js.Object {
  /** Whether to also send taskrunner log info to stderr. */
  var alsologtostderr: js.UndefOr[Boolean] = js.native
  /** The location on the worker for task-specific subdirectories. */
  var baseTaskDir: js.UndefOr[String] = js.native
  /**
    * The base URL for the taskrunner to use when accessing Google Cloud APIs.
    *
    * When workers access Google Cloud APIs, they logically do so via
    * relative URLs.  If this field is specified, it supplies the base
    * URL to use for resolving these relative URLs.  The normative
    * algorithm used is defined by RFC 1808, "Relative Uniform Resource
    * Locators".
    *
    * If not specified, the default value is "http://www.googleapis.com/"
    */
  var baseUrl: js.UndefOr[String] = js.native
  /** The file to store preprocessing commands in. */
  var commandlinesFileName: js.UndefOr[String] = js.native
  /** Whether to continue taskrunner if an exception is hit. */
  var continueOnException: js.UndefOr[Boolean] = js.native
  /** The API version of endpoint, e.g. "v1b3" */
  var dataflowApiVersion: js.UndefOr[String] = js.native
  /** The command to launch the worker harness. */
  var harnessCommand: js.UndefOr[String] = js.native
  /** The suggested backend language. */
  var languageHint: js.UndefOr[String] = js.native
  /** The directory on the VM to store logs. */
  var logDir: js.UndefOr[String] = js.native
  /**
    * Whether to send taskrunner log info to Google Compute Engine VM serial
    * console.
    */
  var logToSerialconsole: js.UndefOr[Boolean] = js.native
  /**
    * Indicates where to put logs.  If this is not specified, the logs
    * will not be uploaded.
    *
    * The supported resource type is:
    *
    * Google Cloud Storage:
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var logUploadLocation: js.UndefOr[String] = js.native
  /**
    * The OAuth2 scopes to be requested by the taskrunner in order to
    * access the Cloud Dataflow API.
    */
  var oauthScopes: js.UndefOr[js.Array[String]] = js.native
  /** The settings to pass to the parallel worker harness. */
  var parallelWorkerSettings: js.UndefOr[WorkerSettings] = js.native
  /** The streaming worker main class name. */
  var streamingWorkerMainClass: js.UndefOr[String] = js.native
  /**
    * The UNIX group ID on the worker VM to use for tasks launched by
    * taskrunner; e.g. "wheel".
    */
  var taskGroup: js.UndefOr[String] = js.native
  /**
    * The UNIX user ID on the worker VM to use for tasks launched by
    * taskrunner; e.g. "root".
    */
  var taskUser: js.UndefOr[String] = js.native
  /**
    * The prefix of the resources the taskrunner should use for
    * temporary storage.
    *
    * The supported resource type is:
    *
    * Google Cloud Storage:
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[String] = js.native
  /** The ID string of the VM. */
  var vmId: js.UndefOr[String] = js.native
  /** The file to store the workflow in. */
  var workflowFileName: js.UndefOr[String] = js.native
}

object TaskRunnerSettings {
  @scala.inline
  def apply(): TaskRunnerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRunnerSettings]
  }
  @scala.inline
  implicit class TaskRunnerSettingsOps[Self <: TaskRunnerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlsologtostderr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alsologtostderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlsologtostderr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alsologtostderr")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseTaskDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTaskDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseTaskDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTaskDir")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCommandlinesFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandlinesFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandlinesFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandlinesFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withContinueOnException(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueOnException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnException")(js.undefined)
        ret
    }
    @scala.inline
    def withDataflowApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowApiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataflowApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataflowApiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withHarnessCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("harnessCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHarnessCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("harnessCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageHint")(js.undefined)
        ret
    }
    @scala.inline
    def withLogDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logDir")(js.undefined)
        ret
    }
    @scala.inline
    def withLogToSerialconsole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logToSerialconsole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogToSerialconsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logToSerialconsole")(js.undefined)
        ret
    }
    @scala.inline
    def withLogUploadLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUploadLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUploadLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUploadLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthScopes")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelWorkerSettings(value: WorkerSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelWorkerSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelWorkerSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelWorkerSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingWorkerMainClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingWorkerMainClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingWorkerMainClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingWorkerMainClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskUser")(js.undefined)
        ret
    }
    @scala.inline
    def withTempStoragePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempStoragePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempStoragePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempStoragePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withVmId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmId")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowFileName")(js.undefined)
        ret
    }
  }
  
}

