package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object devicefarmMod {
  type AWSAccountNumber = java.lang.String
  type AccountsCleanup = scala.Boolean
  type AmazonResourceName = java.lang.String
  type AmazonResourceNames = js.Array[typingsSlinky.awsSdk.devicefarmMod.AmazonResourceName]
  type AndroidPaths = js.Array[typingsSlinky.awsSdk.devicefarmMod.String]
  type AppPackagesCleanup = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SCREENSHOT
    - typingsSlinky.awsSdk.awsSdkStrings.FILE
    - typingsSlinky.awsSdk.awsSdkStrings.LOG
    - java.lang.String
  */
  type ArtifactCategory = typingsSlinky.awsSdk.devicefarmMod._ArtifactCategory | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - typingsSlinky.awsSdk.awsSdkStrings.SCREENSHOT
    - typingsSlinky.awsSdk.awsSdkStrings.DEVICE_LOG
    - typingsSlinky.awsSdk.awsSdkStrings.MESSAGE_LOG
    - typingsSlinky.awsSdk.awsSdkStrings.VIDEO_LOG
    - typingsSlinky.awsSdk.awsSdkStrings.RESULT_LOG
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_LOG
    - typingsSlinky.awsSdk.awsSdkStrings.WEBKIT_LOG
    - typingsSlinky.awsSdk.awsSdkStrings.INSTRUMENTATION_OUTPUT
    - typingsSlinky.awsSdk.awsSdkStrings.EXERCISER_MONKEY_OUTPUT
    - typingsSlinky.awsSdk.awsSdkStrings.CALABASH_JSON_OUTPUT
    - typingsSlinky.awsSdk.awsSdkStrings.CALABASH_PRETTY_OUTPUT
    - typingsSlinky.awsSdk.awsSdkStrings.CALABASH_STANDARD_OUTPUT
    - typingsSlinky.awsSdk.awsSdkStrings.CALABASH_JAVA_XML_OUTPUT
    - typingsSlinky.awsSdk.awsSdkStrings.AUTOMATION_OUTPUT
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_SERVER_OUTPUT
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_JAVA_OUTPUT
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_JAVA_XML_OUTPUT
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_PYTHON_OUTPUT
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_PYTHON_XML_OUTPUT
    - typingsSlinky.awsSdk.awsSdkStrings.EXPLORER_EVENT_LOG
    - typingsSlinky.awsSdk.awsSdkStrings.EXPLORER_SUMMARY_LOG
    - typingsSlinky.awsSdk.awsSdkStrings.APPLICATION_CRASH_REPORT
    - typingsSlinky.awsSdk.awsSdkStrings.XCTEST_LOG
    - typingsSlinky.awsSdk.awsSdkStrings.VIDEO
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_ARTIFACT
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_ARTIFACT_LOG
    - typingsSlinky.awsSdk.awsSdkStrings.TESTSPEC_OUTPUT
    - java.lang.String
  */
  type ArtifactType = typingsSlinky.awsSdk.devicefarmMod._ArtifactType | java.lang.String
  type Artifacts = js.Array[typingsSlinky.awsSdk.devicefarmMod.Artifact]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.METERED
    - typingsSlinky.awsSdk.awsSdkStrings.UNMETERED
    - java.lang.String
  */
  type BillingMethod = typingsSlinky.awsSdk.devicefarmMod._BillingMethod | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.devicefarmMod.ClientApiVersions
  type ClientId = java.lang.String
  type ContentType = java.lang.String
  type CurrencyCode = typingsSlinky.awsSdk.awsSdkStrings.USD | java.lang.String
  type DateTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ARN
    - typingsSlinky.awsSdk.awsSdkStrings.PLATFORM
    - typingsSlinky.awsSdk.awsSdkStrings.FORM_FACTOR
    - typingsSlinky.awsSdk.awsSdkStrings.MANUFACTURER
    - typingsSlinky.awsSdk.awsSdkStrings.REMOTE_ACCESS_ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.REMOTE_DEBUG_ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_VERSION
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_ARN
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_LABELS
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.OS_VERSION
    - typingsSlinky.awsSdk.awsSdkStrings.MODEL
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABILITY
    - java.lang.String
  */
  type DeviceAttribute = typingsSlinky.awsSdk.devicefarmMod._DeviceAttribute | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TEMPORARY_NOT_AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.BUSY
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.HIGHLY_AVAILABLE
    - java.lang.String
  */
  type DeviceAvailability = typingsSlinky.awsSdk.devicefarmMod._DeviceAvailability | java.lang.String
  type DeviceFarmArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ARN
    - typingsSlinky.awsSdk.awsSdkStrings.PLATFORM
    - typingsSlinky.awsSdk.awsSdkStrings.OS_VERSION
    - typingsSlinky.awsSdk.awsSdkStrings.MODEL
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABILITY
    - typingsSlinky.awsSdk.awsSdkStrings.FORM_FACTOR
    - typingsSlinky.awsSdk.awsSdkStrings.MANUFACTURER
    - typingsSlinky.awsSdk.awsSdkStrings.REMOTE_ACCESS_ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.REMOTE_DEBUG_ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_ARN
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_LABELS
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_TYPE
    - java.lang.String
  */
  type DeviceFilterAttribute = typingsSlinky.awsSdk.devicefarmMod._DeviceFilterAttribute | java.lang.String
  type DeviceFilterValues = js.Array[typingsSlinky.awsSdk.devicefarmMod.String]
  type DeviceFilters = js.Array[typingsSlinky.awsSdk.devicefarmMod.DeviceFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PHONE
    - typingsSlinky.awsSdk.awsSdkStrings.TABLET
    - java.lang.String
  */
  type DeviceFormFactor = typingsSlinky.awsSdk.devicefarmMod._DeviceFormFactor | java.lang.String
  type DeviceHostPaths = js.Array[typingsSlinky.awsSdk.devicefarmMod.String]
  type DeviceInstances = js.Array[typingsSlinky.awsSdk.devicefarmMod.DeviceInstance]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ANDROID
    - typingsSlinky.awsSdk.awsSdkStrings.IOS
    - java.lang.String
  */
  type DevicePlatform = typingsSlinky.awsSdk.devicefarmMod._DevicePlatform | java.lang.String
  type DevicePoolCompatibilityResults = js.Array[typingsSlinky.awsSdk.devicefarmMod.DevicePoolCompatibilityResult]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CURATED
    - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type DevicePoolType = typingsSlinky.awsSdk.devicefarmMod._DevicePoolType | java.lang.String
  type DevicePools = js.Array[typingsSlinky.awsSdk.devicefarmMod.DevicePool]
  type Devices = js.Array[typingsSlinky.awsSdk.devicefarmMod.Device]
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.PASSED
    - typingsSlinky.awsSdk.awsSdkStrings.WARNED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SKIPPED
    - typingsSlinky.awsSdk.awsSdkStrings.ERRORED
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type ExecutionResult = typingsSlinky.awsSdk.devicefarmMod._ExecutionResult | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PARSING_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.VPC_ENDPOINT_SETUP_FAILED
    - java.lang.String
  */
  type ExecutionResultCode = typingsSlinky.awsSdk.devicefarmMod._ExecutionResultCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_CONCURRENCY
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DEVICE
    - typingsSlinky.awsSdk.awsSdkStrings.PROCESSING
    - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULING
    - typingsSlinky.awsSdk.awsSdkStrings.PREPARING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - java.lang.String
  */
  type ExecutionStatus = typingsSlinky.awsSdk.devicefarmMod._ExecutionStatus | java.lang.String
  type Filter = java.lang.String
  type HostAddress = java.lang.String
  type IncompatibilityMessages = js.Array[typingsSlinky.awsSdk.devicefarmMod.IncompatibilityMessage]
  type InstanceLabels = js.Array[typingsSlinky.awsSdk.devicefarmMod.String]
  type InstanceProfiles = js.Array[typingsSlinky.awsSdk.devicefarmMod.InstanceProfile]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_USE
    - typingsSlinky.awsSdk.awsSdkStrings.PREPARING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_AVAILABLE
    - java.lang.String
  */
  type InstanceStatus = typingsSlinky.awsSdk.devicefarmMod._InstanceStatus | java.lang.String
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INTERACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.NO_VIDEO
    - typingsSlinky.awsSdk.awsSdkStrings.VIDEO_ONLY
    - java.lang.String
  */
  type InteractionMode = typingsSlinky.awsSdk.devicefarmMod._InteractionMode | java.lang.String
  type IosPaths = js.Array[typingsSlinky.awsSdk.devicefarmMod.String]
  type JobTimeoutMinutes = scala.Double
  type Jobs = js.Array[typingsSlinky.awsSdk.devicefarmMod.Job]
  type Long = scala.Double
  type MaxPageSize = scala.Double
  type MaxSlotMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.devicefarmMod.Integer]
  type Message = java.lang.String
  type Metadata = java.lang.String
  type Name = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CURATED
    - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type NetworkProfileType = typingsSlinky.awsSdk.devicefarmMod._NetworkProfileType | java.lang.String
  type NetworkProfiles = js.Array[typingsSlinky.awsSdk.devicefarmMod.NetworkProfile]
  type OfferingIdentifier = java.lang.String
  type OfferingPromotionIdentifier = java.lang.String
  type OfferingPromotions = js.Array[typingsSlinky.awsSdk.devicefarmMod.OfferingPromotion]
  type OfferingStatusMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.devicefarmMod.OfferingStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PURCHASE
    - typingsSlinky.awsSdk.awsSdkStrings.RENEW
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM
    - java.lang.String
  */
  type OfferingTransactionType = typingsSlinky.awsSdk.devicefarmMod._OfferingTransactionType | java.lang.String
  type OfferingTransactions = js.Array[typingsSlinky.awsSdk.devicefarmMod.OfferingTransaction]
  type OfferingType = typingsSlinky.awsSdk.awsSdkStrings.RECURRING | java.lang.String
  type Offerings = js.Array[typingsSlinky.awsSdk.devicefarmMod.Offering]
  type PackageIds = js.Array[typingsSlinky.awsSdk.devicefarmMod.String]
  type PaginationToken = java.lang.String
  type PercentInteger = scala.Double
  type Problems = js.Array[typingsSlinky.awsSdk.devicefarmMod.Problem]
  type Projects = js.Array[typingsSlinky.awsSdk.devicefarmMod.Project]
  type PurchasedDevicesMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.devicefarmMod.Integer]
  type RecurringChargeFrequency = typingsSlinky.awsSdk.awsSdkStrings.MONTHLY | java.lang.String
  type RecurringCharges = js.Array[typingsSlinky.awsSdk.devicefarmMod.RecurringCharge]
  type RemoteAccessSessions = js.Array[typingsSlinky.awsSdk.devicefarmMod.RemoteAccessSession]
  type ResourceDescription = java.lang.String
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQUALS
    - typingsSlinky.awsSdk.awsSdkStrings.LESS_THAN
    - typingsSlinky.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUALS
    - typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN
    - typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUALS
    - typingsSlinky.awsSdk.awsSdkStrings.IN
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_IN
    - typingsSlinky.awsSdk.awsSdkStrings.CONTAINS
    - java.lang.String
  */
  type RuleOperator = typingsSlinky.awsSdk.devicefarmMod._RuleOperator | java.lang.String
  type Rules = js.Array[typingsSlinky.awsSdk.devicefarmMod.Rule]
  type Runs = js.Array[typingsSlinky.awsSdk.devicefarmMod.Run]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CPU
    - typingsSlinky.awsSdk.awsSdkStrings.MEMORY
    - typingsSlinky.awsSdk.awsSdkStrings.THREADS
    - typingsSlinky.awsSdk.awsSdkStrings.RX_RATE
    - typingsSlinky.awsSdk.awsSdkStrings.TX_RATE
    - typingsSlinky.awsSdk.awsSdkStrings.RX
    - typingsSlinky.awsSdk.awsSdkStrings.TX
    - typingsSlinky.awsSdk.awsSdkStrings.NATIVE_FRAMES
    - typingsSlinky.awsSdk.awsSdkStrings.NATIVE_FPS
    - typingsSlinky.awsSdk.awsSdkStrings.NATIVE_MIN_DRAWTIME
    - typingsSlinky.awsSdk.awsSdkStrings.NATIVE_AVG_DRAWTIME
    - typingsSlinky.awsSdk.awsSdkStrings.NATIVE_MAX_DRAWTIME
    - typingsSlinky.awsSdk.awsSdkStrings.OPENGL_FRAMES
    - typingsSlinky.awsSdk.awsSdkStrings.OPENGL_FPS
    - typingsSlinky.awsSdk.awsSdkStrings.OPENGL_MIN_DRAWTIME
    - typingsSlinky.awsSdk.awsSdkStrings.OPENGL_AVG_DRAWTIME
    - typingsSlinky.awsSdk.awsSdkStrings.OPENGL_MAX_DRAWTIME
    - java.lang.String
  */
  type SampleType = typingsSlinky.awsSdk.devicefarmMod._SampleType | java.lang.String
  type Samples = js.Array[typingsSlinky.awsSdk.devicefarmMod.Sample]
  type ServiceDnsName = java.lang.String
  type SkipAppResign = scala.Boolean
  type SshPublicKey = java.lang.String
  type String = java.lang.String
  type Suites = js.Array[typingsSlinky.awsSdk.devicefarmMod.Suite]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.devicefarmMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.devicefarmMod.Tag]
  type TagValue = java.lang.String
  type TestGridProjects = js.Array[typingsSlinky.awsSdk.devicefarmMod.TestGridProject]
  type TestGridSessionActions = js.Array[typingsSlinky.awsSdk.devicefarmMod.TestGridSessionAction]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VIDEO
    - typingsSlinky.awsSdk.awsSdkStrings.LOG
    - java.lang.String
  */
  type TestGridSessionArtifactCategory = typingsSlinky.awsSdk.devicefarmMod._TestGridSessionArtifactCategory | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - typingsSlinky.awsSdk.awsSdkStrings.VIDEO
    - typingsSlinky.awsSdk.awsSdkStrings.SELENIUM_LOG
    - java.lang.String
  */
  type TestGridSessionArtifactType = typingsSlinky.awsSdk.devicefarmMod._TestGridSessionArtifactType | java.lang.String
  type TestGridSessionArtifacts = js.Array[typingsSlinky.awsSdk.devicefarmMod.TestGridSessionArtifact]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.CLOSED
    - typingsSlinky.awsSdk.awsSdkStrings.ERRORED
    - java.lang.String
  */
  type TestGridSessionStatus = typingsSlinky.awsSdk.devicefarmMod._TestGridSessionStatus | java.lang.String
  type TestGridSessions = js.Array[typingsSlinky.awsSdk.devicefarmMod.TestGridSession]
  type TestGridUrlExpiresInSecondsInput = scala.Double
  type TestParameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.devicefarmMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BUILTIN_FUZZ
    - typingsSlinky.awsSdk.awsSdkStrings.BUILTIN_EXPLORER
    - typingsSlinky.awsSdk.awsSdkStrings.WEB_PERFORMANCE_PROFILE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_JAVA_JUNIT
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_JAVA_TESTNG
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_PYTHON
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_NODE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_RUBY
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_JUNIT
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_TESTNG
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_PYTHON
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_NODE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_RUBY
    - typingsSlinky.awsSdk.awsSdkStrings.CALABASH
    - typingsSlinky.awsSdk.awsSdkStrings.INSTRUMENTATION
    - typingsSlinky.awsSdk.awsSdkStrings.UIAUTOMATION
    - typingsSlinky.awsSdk.awsSdkStrings.UIAUTOMATOR
    - typingsSlinky.awsSdk.awsSdkStrings.XCTEST
    - typingsSlinky.awsSdk.awsSdkStrings.XCTEST_UI
    - typingsSlinky.awsSdk.awsSdkStrings.REMOTE_ACCESS_RECORD
    - typingsSlinky.awsSdk.awsSdkStrings.REMOTE_ACCESS_REPLAY
    - java.lang.String
  */
  type TestType = typingsSlinky.awsSdk.devicefarmMod._TestType | java.lang.String
  type Tests = js.Array[typingsSlinky.awsSdk.devicefarmMod.Test]
  type TransactionIdentifier = java.lang.String
  type URL = java.lang.String
  type UniqueProblems = js.Array[typingsSlinky.awsSdk.devicefarmMod.UniqueProblem]
  type UniqueProblemsByExecutionResultMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.devicefarmMod.UniqueProblems]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CURATED
    - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type UploadCategory = typingsSlinky.awsSdk.devicefarmMod._UploadCategory | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED
    - typingsSlinky.awsSdk.awsSdkStrings.PROCESSING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type UploadStatus = typingsSlinky.awsSdk.devicefarmMod._UploadStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ANDROID_APP
    - typingsSlinky.awsSdk.awsSdkStrings.IOS_APP
    - typingsSlinky.awsSdk.awsSdkStrings.WEB_APP
    - typingsSlinky.awsSdk.awsSdkStrings.EXTERNAL_DATA
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_JAVA_JUNIT_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_JAVA_TESTNG_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_PYTHON_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_NODE_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_RUBY_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_PYTHON_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_NODE_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_RUBY_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.CALABASH_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.INSTRUMENTATION_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.UIAUTOMATION_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.UIAUTOMATOR_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.XCTEST_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.XCTEST_UI_TEST_PACKAGE
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_JAVA_JUNIT_TEST_SPEC
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_JAVA_TESTNG_TEST_SPEC
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_PYTHON_TEST_SPEC
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_NODE_TEST_SPEC
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_RUBY_TEST_SPEC
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_PYTHON_TEST_SPEC
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_NODE_TEST_SPEC
    - typingsSlinky.awsSdk.awsSdkStrings.APPIUM_WEB_RUBY_TEST_SPEC
    - typingsSlinky.awsSdk.awsSdkStrings.INSTRUMENTATION_TEST_SPEC
    - typingsSlinky.awsSdk.awsSdkStrings.XCTEST_UI_TEST_SPEC
    - java.lang.String
  */
  type UploadType = typingsSlinky.awsSdk.devicefarmMod._UploadType | java.lang.String
  type Uploads = js.Array[typingsSlinky.awsSdk.devicefarmMod.Upload]
  type VPCEConfigurationDescription = java.lang.String
  type VPCEConfigurationName = java.lang.String
  type VPCEConfigurations = js.Array[typingsSlinky.awsSdk.devicefarmMod.VPCEConfiguration]
  type VPCEServiceName = java.lang.String
  type VideoCapture = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-06-23`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.devicefarmMod._apiVersion | java.lang.String
}
