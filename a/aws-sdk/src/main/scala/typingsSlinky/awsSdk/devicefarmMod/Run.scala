package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Run extends js.Object {
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
  implicit class RunOps[Self <: Run] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppUpload(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingMethod(value: BillingMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletedJobs(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedJobs")(js.undefined)
        ret
    }
    @scala.inline
    def withCounters(value: Counters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerArtifactPaths(value: CustomerArtifactPaths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerArtifactPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerArtifactPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerArtifactPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceMinutes(value: DeviceMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withDevicePoolArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePoolArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicePoolArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePoolArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceSelectionResult(value: DeviceSelectionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSelectionResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceSelectionResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSelectionResult")(js.undefined)
        ret
    }
    @scala.inline
    def withEventCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCount")(js.undefined)
        ret
    }
    @scala.inline
    def withJobTimeoutMinutes(value: JobTimeoutMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTimeoutMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTimeoutMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTimeoutMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkProfile(value: NetworkProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withParsingResultUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsingResultUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsingResultUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsingResultUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: DevicePlatform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withRadios(value: Radios): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadios: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radios")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: ExecutionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withResultCode(value: ExecutionResultCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipAppResign(value: SkipAppResign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAppResign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipAppResign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAppResign")(js.undefined)
        ret
    }
    @scala.inline
    def withStarted(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStopped(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(js.undefined)
        ret
    }
    @scala.inline
    def withTestSpecArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSpecArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestSpecArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSpecArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalJobs(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalJobs")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TestType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWebUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(js.undefined)
        ret
    }
  }
  
}

