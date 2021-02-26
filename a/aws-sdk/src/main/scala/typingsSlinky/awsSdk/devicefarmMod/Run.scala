package typingsSlinky.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Run extends StObject {
  
  /**
    * An app to upload or that has been uploaded.
    */
  var appUpload: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The run's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * Specifies the billing method for a test run: metered or unmetered. If the parameter is not specified, the default value is metered.  If you have unmetered device slots, you must set this to unmetered to use them. Otherwise, the run is counted toward metered device minutes. 
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.native
  
  /**
    * The total number of completed jobs.
    */
  var completedJobs: js.UndefOr[Integer] = js.native
  
  /**
    * The run's result counters.
    */
  var counters: js.UndefOr[Counters] = js.native
  
  /**
    * When the run was created.
    */
  var created: js.UndefOr[js.Date] = js.native
  
  /**
    * Output CustomerArtifactPaths object for the test run.
    */
  var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.native
  
  /**
    * Represents the total (metered or unmetered) minutes used by the test run.
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.native
  
  /**
    * The ARN of the device pool for the run.
    */
  var devicePoolArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The results of a device filter used to select the devices for a test run.
    */
  var deviceSelectionResult: js.UndefOr[DeviceSelectionResult] = js.native
  
  /**
    * For fuzz tests, this is the number of events, between 1 and 10000, that the UI fuzz test should perform.
    */
  var eventCount: js.UndefOr[Integer] = js.native
  
  /**
    * The number of minutes the job executes before it times out.
    */
  var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  
  /**
    * Information about the locale that is used for the run.
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * Information about the location that is used for the run.
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * A message about the run's result.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * The run's name.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The network profile being used for a test run.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.native
  
  /**
    * Read-only URL for an object in an S3 bucket where you can get the parsing results of the test package. If the test package doesn't parse, the reason why it doesn't parse appears in the file that this URL points to.
    */
  var parsingResultUrl: js.UndefOr[String] = js.native
  
  /**
    * The run's platform. Allowed values include:   ANDROID   IOS  
    */
  var platform: js.UndefOr[DevicePlatform] = js.native
  
  /**
    * Information about the radio states for the run.
    */
  var radios: js.UndefOr[Radios] = js.native
  
  /**
    * The run's result. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var result: js.UndefOr[ExecutionResult] = js.native
  
  /**
    * Supporting field for the result field. Set only if result is SKIPPED. PARSING_FAILED if the result is skipped because of test package parsing failure.
    */
  var resultCode: js.UndefOr[ExecutionResultCode] = js.native
  
  /**
    * For fuzz tests, this is a seed to use for randomizing the UI fuzz test. Using the same seed value between tests ensures identical event sequences.
    */
  var seed: js.UndefOr[Integer] = js.native
  
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.native
  
  /**
    * The run's start time.
    */
  var started: js.UndefOr[js.Date] = js.native
  
  /**
    * The run's status. Allowed values include:   PENDING   PENDING_CONCURRENCY   PENDING_DEVICE   PROCESSING   SCHEDULING   PREPARING   RUNNING   COMPLETED   STOPPING  
    */
  var status: js.UndefOr[ExecutionStatus] = js.native
  
  /**
    * The run's stop time.
    */
  var stopped: js.UndefOr[js.Date] = js.native
  
  /**
    * The ARN of the YAML-formatted test specification for the run.
    */
  var testSpecArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The total number of jobs for the run.
    */
  var totalJobs: js.UndefOr[Integer] = js.native
  
  /**
    * The run's type. Must be one of the following values:   BUILTIN_FUZZ   BUILTIN_EXPLORER  For Android, an app explorer that traverses an Android app, interacting with it and capturing screenshots at the same time.    APPIUM_JAVA_JUNIT   APPIUM_JAVA_TESTNG   APPIUM_PYTHON   APPIUM_NODE   APPIUM_RUBY   APPIUM_WEB_JAVA_JUNIT   APPIUM_WEB_JAVA_TESTNG   APPIUM_WEB_PYTHON   APPIUM_WEB_NODE   APPIUM_WEB_RUBY   CALABASH   INSTRUMENTATION   UIAUTOMATION   UIAUTOMATOR   XCTEST   XCTEST_UI  
    */
  var `type`: js.UndefOr[TestType] = js.native
  
  /**
    * The Device Farm console URL for the recording of the run.
    */
  var webUrl: js.UndefOr[String] = js.native
}
object Run {
  
  @scala.inline
  def apply(): Run = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Run]
  }
  
  @scala.inline
  implicit class RunMutableBuilder[Self <: Run] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppUpload(value: AmazonResourceName): Self = StObject.set(x, "appUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUploadUndefined: Self = StObject.set(x, "appUpload", js.undefined)
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setBillingMethod(value: BillingMethod): Self = StObject.set(x, "billingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingMethodUndefined: Self = StObject.set(x, "billingMethod", js.undefined)
    
    @scala.inline
    def setCompletedJobs(value: Integer): Self = StObject.set(x, "completedJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedJobsUndefined: Self = StObject.set(x, "completedJobs", js.undefined)
    
    @scala.inline
    def setCounters(value: Counters): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountersUndefined: Self = StObject.set(x, "counters", js.undefined)
    
    @scala.inline
    def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setCustomerArtifactPaths(value: CustomerArtifactPaths): Self = StObject.set(x, "customerArtifactPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerArtifactPathsUndefined: Self = StObject.set(x, "customerArtifactPaths", js.undefined)
    
    @scala.inline
    def setDeviceMinutes(value: DeviceMinutes): Self = StObject.set(x, "deviceMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMinutesUndefined: Self = StObject.set(x, "deviceMinutes", js.undefined)
    
    @scala.inline
    def setDevicePoolArn(value: AmazonResourceName): Self = StObject.set(x, "devicePoolArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePoolArnUndefined: Self = StObject.set(x, "devicePoolArn", js.undefined)
    
    @scala.inline
    def setDeviceSelectionResult(value: DeviceSelectionResult): Self = StObject.set(x, "deviceSelectionResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSelectionResultUndefined: Self = StObject.set(x, "deviceSelectionResult", js.undefined)
    
    @scala.inline
    def setEventCount(value: Integer): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCountUndefined: Self = StObject.set(x, "eventCount", js.undefined)
    
    @scala.inline
    def setJobTimeoutMinutes(value: JobTimeoutMinutes): Self = StObject.set(x, "jobTimeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTimeoutMinutesUndefined: Self = StObject.set(x, "jobTimeoutMinutes", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworkProfile(value: NetworkProfile): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
    
    @scala.inline
    def setParsingResultUrl(value: String): Self = StObject.set(x, "parsingResultUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsingResultUrlUndefined: Self = StObject.set(x, "parsingResultUrl", js.undefined)
    
    @scala.inline
    def setPlatform(value: DevicePlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setRadios(value: Radios): Self = StObject.set(x, "radios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiosUndefined: Self = StObject.set(x, "radios", js.undefined)
    
    @scala.inline
    def setResult(value: ExecutionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCode(value: ExecutionResultCode): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCodeUndefined: Self = StObject.set(x, "resultCode", js.undefined)
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setSeed(value: Integer): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    @scala.inline
    def setSkipAppResign(value: SkipAppResign): Self = StObject.set(x, "skipAppResign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipAppResignUndefined: Self = StObject.set(x, "skipAppResign", js.undefined)
    
    @scala.inline
    def setStarted(value: js.Date): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    @scala.inline
    def setStatus(value: ExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStopped(value: js.Date): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppedUndefined: Self = StObject.set(x, "stopped", js.undefined)
    
    @scala.inline
    def setTestSpecArn(value: AmazonResourceName): Self = StObject.set(x, "testSpecArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSpecArnUndefined: Self = StObject.set(x, "testSpecArn", js.undefined)
    
    @scala.inline
    def setTotalJobs(value: Integer): Self = StObject.set(x, "totalJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalJobsUndefined: Self = StObject.set(x, "totalJobs", js.undefined)
    
    @scala.inline
    def setType(value: TestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
