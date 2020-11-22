package typingsSlinky.saucelabs.mod

import typingsSlinky.saucelabs.anon.AppId
import typingsSlinky.saucelabs.anon.Assets
import typingsSlinky.saucelabs.anon.AutoOnly
import typingsSlinky.saucelabs.anon.Full
import typingsSlinky.saucelabs.anon.IncludeBaseline
import typingsSlinky.saucelabs.anon.LastDays
import typingsSlinky.saucelabs.anon.Limit
import typingsSlinky.saucelabs.anon.MetricNames
import typingsSlinky.saucelabs.anon.OrderIndex
import typingsSlinky.saucelabs.anon.OrderIndexNumber
import typingsSlinky.saucelabs.anon.PageUrl
import typingsSlinky.saucelabs.anon.Subaccounts
import typingsSlinky.saucelabs.saucelabsStrings.all
import typingsSlinky.saucelabs.saucelabsStrings.appium_
import typingsSlinky.saucelabs.saucelabsStrings.webdriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SauceLabs extends js.Object {
  
  /**
    * Sets a reset point market at job_id, previous jobs will not be taken into account in calculating baseline
    * @method
    * @name SauceLabs#acknowledgeBaseline
    * @param {string} jobId - Performance API provides essential information about performance of tested web application.
    */
  def acknowledgeBaseline(jobId: String): js.Promise[Unit] = js.native
  
  /**
    * Acknowledge regime. Confirm values in new regime are acceptable.
    * @method
    * @name SauceLabs#acknowledgeRegime
    * @param {string} jobId - Performance API provides essential information about performance of tested web application.
    * @param {integer} orderIndex - Performance API provides essential information about performance of tested web application.Option
    */
  def acknowledgeRegime(jobId: String): js.Promise[Unit] = js.native
  def acknowledgeRegime(jobId: String, options: OrderIndexNumber): js.Promise[Unit] = js.native
  
  /**
    * Provides information if there is an outlier for the given job_id and metric
    * @method
    * @name SauceLabs#assertPerformance
    * @param {string} jobId - Performance API provides essential information about performance of tested web application.
    * @param {array} metricNames - Performance API provides essential information about performance of tested web application.Option
    * @param {integer} orderIndex - Performance API provides essential information about performance of tested web application.Option
    */
  def assertPerformance(jobId: String): js.Promise[AssertView] = js.native
  def assertPerformance(jobId: String, options: MetricNames): js.Promise[AssertView] = js.native
  
  /**
    * Creates a manual job
    * @method
    * @name SauceLabs#createManualJob
    * @param {} capabilities - desired capabilities to start the session
    */
  def createManualJob(capabilities: Assets): js.Promise[ResponseCreateManualJob200] = js.native
  
  /**
    * Creates a manual job
    * @method
    * @name SauceLabs#createManualJobLegacy
    * @param {} capabilities - desired capabilities to start the session
    */
  def createManualJobLegacy(capabilities: Assets): js.Promise[ResponseCreateManualJobLegacy200] = js.native
  
  /**
    * Take screenshot in manual session
    * @method
    * @name SauceLabs#createManualJobScreenshot
    * @param {string} taskId - task id of manual task
    */
  def createManualJobScreenshot(taskId: String): js.Promise[ResponseCreateManualJobScreenshot201] = js.native
  
  /**
    * complete manual task
    * @method
    * @name SauceLabs#deleteManualJob
    * @param {} ids - list of task ids that to complete
    */
  def deleteManualJob(ids: js.Array[String]): js.Promise[ResponseDeleteManualJob200] = js.native
  
  /**
    * complete manual task
    * @method
    * @name SauceLabs#deleteManualJobLegacy
    * @param {} ids - list of task ids that to complete
    */
  def deleteManualJobLegacy(ids: js.Array[String]): js.Promise[ResponseDeleteManualJobLegacy200] = js.native
  
  /**
    * Delete a Tunnel
    * @method
    * @name SauceLabs#deleteTunnel
    * @param {string} username - username
    * @param {string} id - job id
    */
  def deleteTunnel(username: String, id: String): js.Promise[Unit] = js.native
  
  /**
    * Marks outlier for a given {job_id} as not relevant/flaky
    * @method
    * @name SauceLabs#discardOutliers
    * @param {string} jobId - Performance API provides essential information about performance of tested web application.
    * @param {integer} orderIndex - Performance API provides essential information about performance of tested web application.Option
    */
  def discardOutliers(jobId: String): js.Promise[Unit] = js.native
  def discardOutliers(jobId: String, options: OrderIndexNumber): js.Promise[Unit] = js.native
  
  /**
    * Get job asset
    * @method
    * @name SauceLabs#downloadJobAsset
    * @param {string} id - job id
    * @param {string} filename - filename
    * @param {string} filepath - file path to store the asset at
    */
  def downloadJobAsset(id: String, filename: String): js.Promise[File] = js.native
  def downloadJobAsset(id: String, filename: String, filepath: String): js.Promise[File] = js.native
  
  /**
    * Marks all test executions contained in the specified suite execution as finished.
    * @method
    * @name SauceLabs#finishSuite
    * @param {integer} suiteId - The ID of the suite
    * @param {integer} batchReportId - The ID of this suite execution
    */
  def finishSuite(suiteId: Double, batchReportId: Double): js.Promise[ApiSuiteReport] = js.native
  
  /**
    * Sets the status of the specific test execution and marks it as finished.
    * @method
    * @name SauceLabs#finishTestReport
    * @param {integer} suiteId - The ID of the suite
    * @param {integer} suiteReportId - The ID of this suite execution
    * @param {integer} testReportId - The ID of this test execution
    * @param {} body - TestObject provides access to devices, Appium, storage and your session history via REST API.</br></br>API endpoints requiring authentication use basic authentication. For endpoints requiring "API Key" authentication, the basic authentication should contain your username and have your project's API key as the password. For endpoints requiring "Password" authentication, the basic authentication should contain your username and password. All endpoints in Appium Suites API require basic authentication with the API Key as the username and the password left blank. Please note that the Appium Watcher API does not require basic authentication.</br></br>The base URL for the API is https://app.testobject.com/api/rest/
    */
  def finishTestReport(suiteId: Double, suiteReportId: Double, testReportId: Double): js.Promise[ApiTestReport] = js.native
  def finishTestReport(suiteId: Double, suiteReportId: Double, testReportId: Double, body: ApiTestStatus): js.Promise[ApiTestReport] = js.native
  
  /**
    * Provides json documentation for the performance API
    * @method
    * @name SauceLabs#getApiDefinition
    */
  def getApiDefinition(): js.Promise[Unit] = js.native
  
  /**
    * Returns a list per data center containing the IDs of all devices currently available for testing, including private devices. This endpoint requires API Key authentication.
    * @method
    * @name SauceLabs#getAvailableDescriptorIds
    */
  def getAvailableDescriptorIds(): js.Promise[ResponseGetAvailableDescriptorIds200] = js.native
  
  /**
    * Provides baseline based on metrics history, where the reference point is a given job_id
    * @method
    * @name SauceLabs#getBaseline
    * @param {string} jobId - Performance API provides essential information about performance of tested web application.
    * @param {array} metricNames - Performance API provides essential information about performance of tested web application.Option
    * @param {integer} orderIndex - Performance API provides essential information about performance of tested web application.Option
    * @param {integer} regimeStart - Performance API provides essential information about performance of tested web application.Option
    * @param {integer} regimeEnd - Performance API provides essential information about performance of tested web application.Option
    */
  def getBaseline(jobId: String): js.Promise[BaselineView] = js.native
  def getBaseline(jobId: String, options: OrderIndex): js.Promise[BaselineView] = js.native
  
  /**
    * Provides a list of raw performance metrics up to point where the reference is a given job_id and order_index
    * @method
    * @name SauceLabs#getBaselineHistory
    * @param {string} jobId - Performance API provides essential information about performance of tested web application.
    * @param {integer} orderIndex - Performance API provides essential information about performance of tested web application.Option
    * @param {integer} limit - Performance API provides essential information about performance of tested web application.Option
    */
  def getBaselineHistory(jobId: String): js.Promise[PerformanceMetricsHistoryView] = js.native
  def getBaselineHistory(jobId: String, options: Limit): js.Promise[PerformanceMetricsHistoryView] = js.native
  
  /**
    * Authenticated user cookie information
    * @method
    * @name SauceLabs#getCurrentUser
    */
  def getCurrentUser(): js.Promise[ResponseGetCurrentUser200] = js.native
  
  /**
    * Authenticated user information
    * @method
    * @name SauceLabs#getCurrentUserFull
    */
  def getCurrentUserFull(): js.Promise[WhoamiUser] = js.native
  
  /**
    * Dashboard messages from Django
    * @method
    * @name SauceLabs#getDashboardMessageForUser
    * @param {string} username - username
    */
  def getDashboardMessageForUser(username: String): js.Promise[ResponseGetDashboardMessageForUser200] = js.native
  
  /**
    * Returns information for a particular device per data center. This endpoint requires API Key authentication.
    * @method
    * @name SauceLabs#getDescriptor
    * @param {string} deviceId - The ID of the device
    */
  def getDescriptor(deviceId: String): js.Promise[ResponseGetDescriptor200] = js.native
  
  /**
    * Returns a list per data center containing all devices, including private devices and those not currently available for testing. This endpoint requires API Key authentication.
    * @method
    * @name SauceLabs#getDescriptors
    */
  def getDescriptors(): js.Promise[ResponseGetDescriptors200] = js.native
  
  /**
    * Provides lists outliers marked as discarded
    * @method
    * @name SauceLabs#getDiscardedOutliers
    * @param {string} jobId - Performance API provides essential information about performance of tested web application.
    * @param {integer} orderIndex - Performance API provides essential information about performance of tested web application.Option
    */
  def getDiscardedOutliers(jobId: String): js.Promise[DiscardedView] = js.native
  def getDiscardedOutliers(jobId: String, options: OrderIndexNumber): js.Promise[DiscardedView] = js.native
  
  /**
    * Get Job Information
    * @method
    * @name SauceLabs#getJob
    * @param {string} username - username
    * @param {string} id - job id
    */
  def getJob(username: String, id: String): js.Promise[Job] = js.native
  
  /**
    * Get Job Information
    * @method
    * @name SauceLabs#getJobV1_1
    * @param {string} id - job id
    */
  def getJobV1_1(id: String): js.Promise[Job] = js.native
  
  /**
    * get manual task
    * @method
    * @name SauceLabs#getManualJob
    * @param {string} taskId - task id of manual task
    */
  def getManualJob(taskId: String): js.Promise[ResponseGetManualJob200] = js.native
  
  /**
    * Provides a list of paginated raw performance metrics for the logged user
    * @method
    * @name SauceLabs#getPerformanceMetrics
    * @param {string} pageUrl - Performance API provides essential information about performance of tested web application.Option
    */
  def getPerformanceMetrics(): js.Promise[PerformanceUserMetricsView] = js.native
  def getPerformanceMetrics(options: PageUrl): js.Promise[PerformanceUserMetricsView] = js.native
  
  /**
    * Provides performance metrics and job basic data for a given job_id
    * @method
    * @name SauceLabs#getPerformanceMetricsByJobId
    * @param {string} jobId - Performance API provides essential information about performance of tested web application.
    * @param {boolean} full - When set to false, basic job data will be returned, excluding performance metricsOption
    */
  def getPerformanceMetricsByJobId(jobId: String): js.Promise[PerformanceMetricsListView] = js.native
  def getPerformanceMetricsByJobId(jobId: String, options: Full): js.Promise[PerformanceMetricsListView] = js.native
  
  /**
    * Provides regimes per metric calculated for a set of jobs, where the reference point is a given job_id
    * @method
    * @name SauceLabs#getRegimes
    * @param {string} jobId - Performance API provides essential information about performance of tested web application.
    * @param {array} metricNames - Performance API provides essential information about performance of tested web application.Option
    * @param {integer} orderIndex - Performance API provides essential information about performance of tested web application.Option
    * @param {boolean} includeBaseline - Performance API provides essential information about performance of tested web application.Option
    */
  def getRegimes(jobId: String): js.Promise[RegimesView] = js.native
  def getRegimes(jobId: String, options: IncludeBaseline): js.Promise[RegimesView] = js.native
  
  /**
    * Returns screen recording of a test session after completion
    * @method
    * @name SauceLabs#getScreenRecording
    * @param {string} videoId - The video ID of the recording from the test report
    * @param {string} range - TestObject provides access to devices, Appium, storage and your session history via REST API.</br></br>API endpoints requiring authentication use basic authentication. For endpoints requiring "API Key" authentication, the basic authentication should contain your username and have your project's API key as the password. For endpoints requiring "Password" authentication, the basic authentication should contain your username and password. All endpoints in Appium Suites API require basic authentication with the API Key as the username and the password left blank. Please note that the Appium Watcher API does not require basic authentication.</br></br>The base URL for the API is https://app.testobject.com/api/rest/
    */
  def getScreenRecording(videoId: String): js.Promise[Unit] = js.native
  def getScreenRecording(videoId: String, range: String): js.Promise[Unit] = js.native
  
  /**
    * Returns a PNG screenshot from a test
    * @method
    * @name SauceLabs#getScreenshot
    * @param {integer} testReportId - TestObject provides access to devices, Appium, storage and your session history via REST API.</br></br>API endpoints requiring authentication use basic authentication. For endpoints requiring "API Key" authentication, the basic authentication should contain your username and have your project's API key as the password. For endpoints requiring "Password" authentication, the basic authentication should contain your username and password. All endpoints in Appium Suites API require basic authentication with the API Key as the username and the password left blank. Please note that the Appium Watcher API does not require basic authentication.</br></br>The base URL for the API is https://app.testobject.com/api/rest/
    * @param {integer} screenshotId - TestObject provides access to devices, Appium, storage and your session history via REST API.</br></br>API endpoints requiring authentication use basic authentication. For endpoints requiring "API Key" authentication, the basic authentication should contain your username and have your project's API key as the password. For endpoints requiring "Password" authentication, the basic authentication should contain your username and password. All endpoints in Appium Suites API require basic authentication with the API Key as the username and the password left blank. Please note that the Appium Watcher API does not require basic authentication.</br></br>The base URL for the API is https://app.testobject.com/api/rest/
    */
  def getScreenshot(testReportId: Double, screenshotId: Double): js.Promise[Unit] = js.native
  
  /**
    * The session history reports provide information about user sessions. This includes device usage and test reports. By default reports of the last 30 days will be retrieved - limited to a maximum of 50 reports.
    If the authenticated user is the owner of the account, session reports of the entire team will be retrieved. Team members can only retrieve their own session history. This endpoint requires Password authentication.
    * @method
    * @name SauceLabs#getSessionReports
    * @param {string} userId - Your username.Option
    * @param {integer} lastDays - Number of days to reportOption
    * @param {integer} offset - Offset for paginationOption
    * @param {integer} limit - Max number of results per pageOption
    */
  def getSessionReports(): js.Promise[PaginationResultSessionReport] = js.native
  def getSessionReports(options: LastDays): js.Promise[PaginationResultSessionReport] = js.native
  
  /**
    * Sauce Labs Status
    * @method
    * @name SauceLabs#getStatus
    */
  def getStatus(): js.Promise[SauceStatus] = js.native
  
  /**
    * User information
    * @method
    * @name SauceLabs#getSubaccounts
    * @param {string} username - username
    */
  def getSubaccounts(username: String): js.Promise[User] = js.native
  
  /**
    * Get Tunnels
    * @method
    * @name SauceLabs#getTunnel
    * @param {string} username - username
    * @param {string} id - job id
    */
  def getTunnel(username: String, id: String): js.Promise[Tunnel] = js.native
  
  /**
    * User information
    * @method
    * @name SauceLabs#getUser
    * @param {string} username - username
    */
  def getUser(username: String): js.Promise[User] = js.native
  
  /**
    * Get currently running job counts broken down by account and job status
    * @method
    * @name SauceLabs#getUserActivity
    * @param {string} username - username
    */
  def getUserActivity(username: String): js.Promise[Activity] = js.native
  
  /**
    * User concurrency
    * @method
    * @name SauceLabs#getUserConcurrency
    * @param {string} username - username
    */
  def getUserConcurrency(username: String): js.Promise[Concurrency] = js.native
  
  /**
    * User's monthly-minutes
    * @method
    * @name SauceLabs#getUserMinutes
    * @param {string} username - username
    */
  def getUserMinutes(username: String): js.Promise[ResponseGetUserMinutes200] = js.native
  
  /**
    * Get job statistics for usernames
    * @method
    * @name SauceLabs#getUsersActivity
    */
  def getUsersActivity(): js.Promise[ResponseGetUsersActivity200] = js.native
  
  /**
    * Returns true if a baseline was resetted for a give job_id
    * @method
    * @name SauceLabs#hasBaselineReset
    * @param {string} jobId - Performance API provides essential information about performance of tested web application.
    */
  def hasBaselineReset(jobId: String): js.Promise[ErrorResponse] = js.native
  
  var headless: Boolean = js.native
  
  /**
    * Returns the test report of a suite as XML
    * @method
    * @name SauceLabs#junitStyleXmlReport
    * @param {} body - TestObject provides access to devices, Appium, storage and your session history via REST API.</br></br>API endpoints requiring authentication use basic authentication. For endpoints requiring "API Key" authentication, the basic authentication should contain your username and have your project's API key as the password. For endpoints requiring "Password" authentication, the basic authentication should contain your username and password. All endpoints in Appium Suites API require basic authentication with the API Key as the username and the password left blank. Please note that the Appium Watcher API does not require basic authentication.</br></br>The base URL for the API is https://app.testobject.com/api/rest/
    * @param {} body - TestObject provides access to devices, Appium, storage and your session history via REST API.</br></br>API endpoints requiring authentication use basic authentication. For endpoints requiring "API Key" authentication, the basic authentication should contain your username and have your project's API key as the password. For endpoints requiring "Password" authentication, the basic authentication should contain your username and password. All endpoints in Appium Suites API require basic authentication with the API Key as the username and the password left blank. Please note that the Appium Watcher API does not require basic authentication.</br></br>The base URL for the API is https://app.testobject.com/api/rest/
    */
  def junitStyleXmlReport(): js.Promise[JunitXMLReport] = js.native
  def junitStyleXmlReport(body: String): js.Promise[JunitXMLReport] = js.native
  def junitStyleXmlReport(body: Double): js.Promise[JunitXMLReport] = js.native
  
  /**
    * Get all Tunnels
    * @method
    * @name SauceLabs#listAllTunnels
    * @param {string} username - username
    */
  def listAllTunnels(username: String): js.Promise[ResponseListAllTunnels200] = js.native
  
  /**
    * Get Tunnels
    * @method
    * @name SauceLabs#listAvailableTunnels
    * @param {string} username - username
    */
  def listAvailableTunnels(username: String): js.Promise[ResponseListAvailableTunnels200] = js.native
  
  /**
    * Get all of the jobs associated with a build that have failed
    * @method
    * @name SauceLabs#listBuildFailedJobs
    * @param {string} username - username
    * @param {string} id - job id
    */
  def listBuildFailedJobs(username: String, id: String): js.Promise[ResponseListBuildFailedJobs200] = js.native
  
  /**
    * Get all of the jobs associated with a build
    * @method
    * @name SauceLabs#listBuildJobs
    * @param {string} id - job id
    * @param {boolean} full - Should the return result contain everything or just the basicsOption
    */
  def listBuildJobs(id: String): js.Promise[ResponseListBuildJobs200] = js.native
  def listBuildJobs(id: String, options: Full): js.Promise[ResponseListBuildJobs200] = js.native
  
  /**
    * Get all of a users builds
    * @method
    * @name SauceLabs#listBuilds
    * @param {string} username - username
    * @param {number} limit - Number of results to returnOption
    * @param {boolean} subaccounts - Include subaccounts in list of jobsOption
    */
  def listBuilds(username: String): js.Promise[ResponseListBuilds200] = js.native
  def listBuilds(username: String, options: Subaccounts): js.Promise[ResponseListBuilds200] = js.native
  
  /**
    * Get all of a users jobs
    * @method
    * @name SauceLabs#listJobs
    * @param {string} username - username
    * @param {number} limit - Number of results to returnOption
    * @param {boolean} subaccounts - Include subaccounts in list of jobsOption
    * @param {boolean} full - Should the return result contain everything or just the basicsOption
    * @param {boolean} manualOnly - Only return manual jobsOption
    * @param {boolean} autoOnly - This is a REST API documentation provided by Sauce LabsOption
    * @param {string} name - name of the jobOption
    * @param {string} ownerType - owner type for jobsOption
    * @param {string} owner - username of owner of the jobsOption
    * @param {number} from - receive jobs beginning of a specific timestampOption
    * @param {number} to - receive jobs until specific timestampOption
    */
  def listJobs(username: String): js.Promise[ResponseListJobs200] = js.native
  def listJobs(username: String, options: AutoOnly): js.Promise[ResponseListJobs200] = js.native
  
  /**
    * returns a list of supported platforms in the Sauce cloud
    * @method
    * @name SauceLabs#listManualPlatforms
    */
  def listManualPlatforms(): js.Promise[ResponseListManualPlatforms200] = js.native
  
  @JSName("listPlatforms")
  def listPlatforms_all(platform: all): js.Promise[ResponseListPlatforms200] = js.native
  /**
    * returns a list of supported platforms in the Sauce cloud
    * @method
    * @name SauceLabs#listPlatforms
    * @param {string} platform - username
    */
  @JSName("listPlatforms")
  def listPlatforms_appium(platform: appium_): js.Promise[ResponseListPlatforms200] = js.native
  @JSName("listPlatforms")
  def listPlatforms_webdriver(platform: webdriver): js.Promise[ResponseListPlatforms200] = js.native
  
  /**
    * Get Tunnels
    * @method
    * @name SauceLabs#listTunnels
    * @param {string} username - username
    * @param {boolean} full - Should the return result contain everything or just the basicsOption
    */
  def listTunnels(username: String): js.Promise[ResponseListTunnels200] = js.native
  def listTunnels(username: String, options: Full): js.Promise[ResponseListTunnels200] = js.native
  
  /**
    * Org information
    * @method
    * @name SauceLabs#listUserOrganization
    * @param {string} username - username
    */
  def listUserOrganization(username: String): js.Promise[ResponseListUserOrganization200] = js.native
  
  /**
    * Report the result of a test as skipped.
    * @method
    * @name SauceLabs#markTestAsSkipped
    * @param {string} sessionId - The Appium session ID of your test
    */
  def markTestAsSkipped(sessionId: String): js.Promise[Unit] = js.native
  
  /**
    * Returns Appium log for the specified test report
    * @method
    * @name SauceLabs#readAppiumLog
    * @param {integer} testReportId - The ID of the test report
    */
  def readAppiumLog(testReportId: Double): js.Promise[StreamingOutput] = js.native
  
  /**
    * Returns the test report of a suite
    * @method
    * @name SauceLabs#readBatchReport
    * @param {} body - TestObject provides access to devices, Appium, storage and your session history via REST API.</br></br>API endpoints requiring authentication use basic authentication. For endpoints requiring "API Key" authentication, the basic authentication should contain your username and have your project's API key as the password. For endpoints requiring "Password" authentication, the basic authentication should contain your username and password. All endpoints in Appium Suites API require basic authentication with the API Key as the username and the password left blank. Please note that the Appium Watcher API does not require basic authentication.</br></br>The base URL for the API is https://app.testobject.com/api/rest/
    * @param {} body - TestObject provides access to devices, Appium, storage and your session history via REST API.</br></br>API endpoints requiring authentication use basic authentication. For endpoints requiring "API Key" authentication, the basic authentication should contain your username and have your project's API key as the password. For endpoints requiring "Password" authentication, the basic authentication should contain your username and password. All endpoints in Appium Suites API require basic authentication with the API Key as the username and the password left blank. Please note that the Appium Watcher API does not require basic authentication.</br></br>The base URL for the API is https://app.testobject.com/api/rest/
    */
  def readBatchReport(): js.Promise[BatchReport] = js.native
  def readBatchReport(body: String): js.Promise[BatchReport] = js.native
  def readBatchReport(body: Double): js.Promise[BatchReport] = js.native
  
  /**
    * Returns the IDs of the devices which you had selected for the specified suite.
    * @method
    * @name SauceLabs#readDeviceIds
    * @param {integer} suiteId - The ID of the suite
    */
  def readDeviceIds(suiteId: Double): js.Promise[ResponseReadDeviceIds200] = js.native
  
  /**
    * Returns device log for the specified test report
    * @method
    * @name SauceLabs#readDeviceLog
    * @param {integer} testReportId - The ID of the test report
    */
  def readDeviceLog(testReportId: Double): js.Promise[StreamingOutput] = js.native
  
  /**
    * Returns test report and artifacts for a test session after completion
    * @method
    * @name SauceLabs#readReport
    * @param {integer} testReportId - The test report ID from the test session
    */
  def readReport(testReportId: Double): js.Promise[TestReportWithArtifacts] = js.native
  
  /**
    * Returns device vitals of a test session after completion
    * @method
    * @name SauceLabs#readVitalsLog
    * @param {integer} testReportId - The ID of the test report
    */
  def readVitalsLog(testReportId: Double): js.Promise[StreamingOutput] = js.native
  
  /**
    * Returns XCUITest log for the specified test report
    * @method
    * @name SauceLabs#readXcuiTestLog
    * @param {integer} testReportId - The ID of the test report
    */
  def readXcuiTestLog(testReportId: Double): js.Promise[StreamingOutput] = js.native
  
  var region: String = js.native
  
  /**
    * Mark test execution as skipped
    * @method
    * @name SauceLabs#skipTestReport
    * @param {integer} suiteId - The ID of the suite
    * @param {integer} suiteReportId - The ID of this suite execution
    * @param {integer} testReportId - The ID of this test execution
    */
  def skipTestReport(suiteId: Double, suiteReportId: Double, testReportId: Double): js.Promise[ApiTestReport] = js.native
  
  /**
    * Start Sauce Connect
    * @method
    * @name SauceLabs#startSauceConnect
    * @param {string} id - job id
    */
  def startSauceConnect(params: SauceConnectOptions): js.Promise[SauceConnectInstance] = js.native
  
  /**
    * Start a new suite execution including its test executions.
    * @method
    * @name SauceLabs#startSuite
    * @param {integer} suiteId - The ID of the suite
    * @param {integer} appId - The ID of the app version you wish to testOption
    * @param {} body - TestObject provides access to devices, Appium, storage and your session history via REST API.</br></br>API endpoints requiring authentication use basic authentication. For endpoints requiring "API Key" authentication, the basic authentication should contain your username and have your project's API key as the password. For endpoints requiring "Password" authentication, the basic authentication should contain your username and password. All endpoints in Appium Suites API require basic authentication with the API Key as the username and the password left blank. Please note that the Appium Watcher API does not require basic authentication.</br></br>The base URL for the API is https://app.testobject.com/api/rest/
    */
  def startSuite(suiteId: Double): js.Promise[ApiSuiteReport] = js.native
  def startSuite(suiteId: Double, options: js.UndefOr[scala.Nothing], body: js.Array[ApiTestV2]): js.Promise[ApiSuiteReport] = js.native
  def startSuite(suiteId: Double, options: AppId): js.Promise[ApiSuiteReport] = js.native
  def startSuite(suiteId: Double, options: AppId, body: js.Array[ApiTestV2]): js.Promise[ApiSuiteReport] = js.native
  
  /**
    * Stop Job Information
    * @method
    * @name SauceLabs#stopJob
    * @param {string} username - username
    * @param {string} id - job id
    */
  def stopJob(username: String, id: String): js.Promise[Unit] = js.native
  
  var tld: String = js.native
  
  /**
    * Update Job Information
    * @method
    * @name SauceLabs#updateJob
    * @param {string} username - username
    * @param {string} id - job id
    * @param {} body - This is a REST API documentation provided by Sauce Labs
    */
  def updateJob(username: String, id: String, body: Job): js.Promise[Job] = js.native
  
  /**
    * Updates the properties of a suite.
    * @method
    * @name SauceLabs#updateSuite
    * @param {integer} suiteId - The ID of the suite
    * @param {} body - TestObject provides access to devices, Appium, storage and your session history via REST API.</br></br>API endpoints requiring authentication use basic authentication. For endpoints requiring "API Key" authentication, the basic authentication should contain your username and have your project's API key as the password. For endpoints requiring "Password" authentication, the basic authentication should contain your username and password. All endpoints in Appium Suites API require basic authentication with the API Key as the username and the password left blank. Please note that the Appium Watcher API does not require basic authentication.</br></br>The base URL for the API is https://app.testobject.com/api/rest/
    */
  def updateSuite(suiteId: Double): js.Promise[ApiSuite] = js.native
  def updateSuite(suiteId: Double, body: ApiSuiteV2): js.Promise[ApiSuite] = js.native
  
  /**
    * Report the result of a test.
    * @method
    * @name SauceLabs#updateTest
    * @param {string} sessionId - The Appium session ID of your test
    * @param {} body - TestObject provides access to devices, Appium, storage and your session history via REST API.</br></br>API endpoints requiring authentication use basic authentication. For endpoints requiring "API Key" authentication, the basic authentication should contain your username and have your project's API key as the password. For endpoints requiring "Password" authentication, the basic authentication should contain your username and password. All endpoints in Appium Suites API require basic authentication with the API Key as the username and the password left blank. Please note that the Appium Watcher API does not require basic authentication.</br></br>The base URL for the API is https://app.testobject.com/api/rest/
    */
  def updateTest(sessionId: String): js.Promise[Unit] = js.native
  def updateTest(sessionId: String, body: ApiTestStatus): js.Promise[Unit] = js.native
  
  /**
    * Returns new application id after the upload.
    * @method
    * @name SauceLabs#uploadApp
    * @param {string} appType - Application type
    * @param {string} appIdentifier - Your custom unique identifier for your app
    * @param {string} appDisplayName - Your custom display name
    * @param {boolean} appActive - If true makes uploaded application active one
    * @param {} body - TestObject provides access to devices, Appium, storage and your session history via REST API.</br></br>API endpoints requiring authentication use basic authentication. For endpoints requiring "API Key" authentication, the basic authentication should contain your username and have your project's API key as the password. For endpoints requiring "Password" authentication, the basic authentication should contain your username and password. All endpoints in Appium Suites API require basic authentication with the API Key as the username and the password left blank. Please note that the Appium Watcher API does not require basic authentication.</br></br>The base URL for the API is https://app.testobject.com/api/rest/
    */
  def uploadApp(): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: js.UndefOr[scala.Nothing],
    appActive: js.UndefOr[scala.Nothing],
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: js.UndefOr[scala.Nothing],
    appActive: Boolean
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: js.UndefOr[scala.Nothing],
    appActive: Boolean,
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: String
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: String,
    appActive: js.UndefOr[scala.Nothing],
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: String,
    appActive: Boolean
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: String,
    appActive: Boolean,
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(appType: js.UndefOr[scala.Nothing], appIdentifier: String): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: String,
    appDisplayName: js.UndefOr[scala.Nothing],
    appActive: js.UndefOr[scala.Nothing],
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: String,
    appDisplayName: js.UndefOr[scala.Nothing],
    appActive: Boolean
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: String,
    appDisplayName: js.UndefOr[scala.Nothing],
    appActive: Boolean,
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(appType: js.UndefOr[scala.Nothing], appIdentifier: String, appDisplayName: String): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: String,
    appDisplayName: String,
    appActive: js.UndefOr[scala.Nothing],
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: String,
    appDisplayName: String,
    appActive: Boolean
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: js.UndefOr[scala.Nothing],
    appIdentifier: String,
    appDisplayName: String,
    appActive: Boolean,
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(appType: String): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: String,
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: js.UndefOr[scala.Nothing],
    appActive: js.UndefOr[scala.Nothing],
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: String,
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: js.UndefOr[scala.Nothing],
    appActive: Boolean
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: String,
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: js.UndefOr[scala.Nothing],
    appActive: Boolean,
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(appType: String, appIdentifier: js.UndefOr[scala.Nothing], appDisplayName: String): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: String,
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: String,
    appActive: js.UndefOr[scala.Nothing],
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: String,
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: String,
    appActive: Boolean
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: String,
    appIdentifier: js.UndefOr[scala.Nothing],
    appDisplayName: String,
    appActive: Boolean,
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(appType: String, appIdentifier: String): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: String,
    appIdentifier: String,
    appDisplayName: js.UndefOr[scala.Nothing],
    appActive: js.UndefOr[scala.Nothing],
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: String,
    appIdentifier: String,
    appDisplayName: js.UndefOr[scala.Nothing],
    appActive: Boolean
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: String,
    appIdentifier: String,
    appDisplayName: js.UndefOr[scala.Nothing],
    appActive: Boolean,
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(appType: String, appIdentifier: String, appDisplayName: String): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: String,
    appIdentifier: String,
    appDisplayName: String,
    appActive: js.UndefOr[scala.Nothing],
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(appType: String, appIdentifier: String, appDisplayName: String, appActive: Boolean): js.Promise[ResponseUploadApp200] = js.native
  def uploadApp(
    appType: String,
    appIdentifier: String,
    appDisplayName: String,
    appActive: Boolean,
    body: InputStream
  ): js.Promise[ResponseUploadApp200] = js.native
  
  var username: String = js.native
  
  /**
    * The result returns dict of usersnames and time when they started last job.
    * @method
    * @name SauceLabs#usersLastJob
    */
  def usersLastJob(): js.Promise[ResponseUsersLastJob200] = js.native
  
  var webdriverEndpoint: String = js.native
}
