package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskRunnerSettings extends StObject {
  
  /** Whether to also send taskrunner log info to stderr. */
  var alsologtostderr: js.UndefOr[Boolean] = js.native
  
  /** The location on the worker for task-specific subdirectories. */
  var baseTaskDir: js.UndefOr[String] = js.native
  
  /**
    * The base URL for the taskrunner to use when accessing Google Cloud APIs. When workers access Google Cloud APIs, they logically do so via relative URLs. If this field is specified,
    * it supplies the base URL to use for resolving these relative URLs. The normative algorithm used is defined by RFC 1808, "Relative Uniform Resource Locators". If not specified, the
    * default value is "http://www.googleapis.com/"
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
  
  /** Whether to send taskrunner log info to Google Compute Engine VM serial console. */
  var logToSerialconsole: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates where to put logs. If this is not specified, the logs will not be uploaded. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var logUploadLocation: js.UndefOr[String] = js.native
  
  /** The OAuth2 scopes to be requested by the taskrunner in order to access the Cloud Dataflow API. */
  var oauthScopes: js.UndefOr[js.Array[String]] = js.native
  
  /** The settings to pass to the parallel worker harness. */
  var parallelWorkerSettings: js.UndefOr[WorkerSettings] = js.native
  
  /** The streaming worker main class name. */
  var streamingWorkerMainClass: js.UndefOr[String] = js.native
  
  /** The UNIX group ID on the worker VM to use for tasks launched by taskrunner; e.g. "wheel". */
  var taskGroup: js.UndefOr[String] = js.native
  
  /** The UNIX user ID on the worker VM to use for tasks launched by taskrunner; e.g. "root". */
  var taskUser: js.UndefOr[String] = js.native
  
  /**
    * The prefix of the resources the taskrunner should use for temporary storage. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object}
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
  implicit class TaskRunnerSettingsMutableBuilder[Self <: TaskRunnerSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlsologtostderr(value: Boolean): Self = StObject.set(x, "alsologtostderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlsologtostderrUndefined: Self = StObject.set(x, "alsologtostderr", js.undefined)
    
    @scala.inline
    def setBaseTaskDir(value: String): Self = StObject.set(x, "baseTaskDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseTaskDirUndefined: Self = StObject.set(x, "baseTaskDir", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setCommandlinesFileName(value: String): Self = StObject.set(x, "commandlinesFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandlinesFileNameUndefined: Self = StObject.set(x, "commandlinesFileName", js.undefined)
    
    @scala.inline
    def setContinueOnException(value: Boolean): Self = StObject.set(x, "continueOnException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueOnExceptionUndefined: Self = StObject.set(x, "continueOnException", js.undefined)
    
    @scala.inline
    def setDataflowApiVersion(value: String): Self = StObject.set(x, "dataflowApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataflowApiVersionUndefined: Self = StObject.set(x, "dataflowApiVersion", js.undefined)
    
    @scala.inline
    def setHarnessCommand(value: String): Self = StObject.set(x, "harnessCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHarnessCommandUndefined: Self = StObject.set(x, "harnessCommand", js.undefined)
    
    @scala.inline
    def setLanguageHint(value: String): Self = StObject.set(x, "languageHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageHintUndefined: Self = StObject.set(x, "languageHint", js.undefined)
    
    @scala.inline
    def setLogDir(value: String): Self = StObject.set(x, "logDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDirUndefined: Self = StObject.set(x, "logDir", js.undefined)
    
    @scala.inline
    def setLogToSerialconsole(value: Boolean): Self = StObject.set(x, "logToSerialconsole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogToSerialconsoleUndefined: Self = StObject.set(x, "logToSerialconsole", js.undefined)
    
    @scala.inline
    def setLogUploadLocation(value: String): Self = StObject.set(x, "logUploadLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUploadLocationUndefined: Self = StObject.set(x, "logUploadLocation", js.undefined)
    
    @scala.inline
    def setOauthScopes(value: js.Array[String]): Self = StObject.set(x, "oauthScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthScopesUndefined: Self = StObject.set(x, "oauthScopes", js.undefined)
    
    @scala.inline
    def setOauthScopesVarargs(value: String*): Self = StObject.set(x, "oauthScopes", js.Array(value :_*))
    
    @scala.inline
    def setParallelWorkerSettings(value: WorkerSettings): Self = StObject.set(x, "parallelWorkerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelWorkerSettingsUndefined: Self = StObject.set(x, "parallelWorkerSettings", js.undefined)
    
    @scala.inline
    def setStreamingWorkerMainClass(value: String): Self = StObject.set(x, "streamingWorkerMainClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingWorkerMainClassUndefined: Self = StObject.set(x, "streamingWorkerMainClass", js.undefined)
    
    @scala.inline
    def setTaskGroup(value: String): Self = StObject.set(x, "taskGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskGroupUndefined: Self = StObject.set(x, "taskGroup", js.undefined)
    
    @scala.inline
    def setTaskUser(value: String): Self = StObject.set(x, "taskUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUserUndefined: Self = StObject.set(x, "taskUser", js.undefined)
    
    @scala.inline
    def setTempStoragePrefix(value: String): Self = StObject.set(x, "tempStoragePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempStoragePrefixUndefined: Self = StObject.set(x, "tempStoragePrefix", js.undefined)
    
    @scala.inline
    def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
    
    @scala.inline
    def setWorkflowFileName(value: String): Self = StObject.set(x, "workflowFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowFileNameUndefined: Self = StObject.set(x, "workflowFileName", js.undefined)
  }
}
