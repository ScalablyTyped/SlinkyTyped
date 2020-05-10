package typingsSlinky.cypress.cypressMod

import typingsSlinky.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cypress configuration object.
  * @see https://on.cypress.io/configuration
  */
@js.native
trait CypressConfiguration extends js.Object {
  //
  // animations
  //
  /**
    * The distance in pixels an element must exceed over
    * time to be considered animating.
    */
  var animationDistanceThreshold: Double = js.native
  //
  // global options
  //
  /**
    * Url used as prefix for `cy.visit()` or `cy.request()` command’s url
    */
  var baseUrl: String = js.native
  /**
    * A String or Array of hosts that you wish to block traffic for.
    */
  var blacklistHosts: String | js.Array[String] = js.native
  //
  // browser
  //
  /**
    * Whether Chrome Web Security for `same-origin` policy and
    * `insecure mixed content` is enabled.
    */
  var chromeWebSecurity: Boolean = js.native
  //
  // timeouts
  //
  /**
    * Time, in milliseconds, to wait until most DOM based commands
    * are considered timed out.
    */
  var defaultCommandTimeout: Double = js.native
  /**
    * Any values to be set as environment variables
    */
  var env: js.Object = js.native
  /**
    * Time, in milliseconds, to wait for a system command to
    * finish executing during a `cy.exec()` command.
    */
  var execTimeout: Double = js.native
  //
  // folders and files
  //
  /**
    * Path to folder where application files will attempt to be served from.
    */
  var fileServerFolder: String = js.native
  /**
    * Path to folder containing fixture files (Pass `false` to disable).
    */
  var fixturesFolder: String | `false` = js.native
  /**
    * A String or Array of glob patterns used to ignore test files
    * that would otherwise be shown in your list of tests.
    */
  var ignoreTestFiles: String | js.Array[String] = js.native
  /**
    * Path to folder containing integration test files.
    */
  var integrationFolder: String = js.native
  /**
    * Whether Cypress will search for and replace obstructive JS code
    * in `.js` or `.html` files.
    */
  var modifyObstructiveCode: Boolean = js.native
  /**
    * The number of tests for which snapshots and command data are kept in memory.
    * Reduce this number if you are experiencing high memory consumption in your browser during a test run.
    */
  var numTestsKeptInMemory: Double = js.native
  /**
    * Time, in milliseconds, to wait for page transition events or
    * `cy.visit()`, `cy.go()`, `cy.reload()` commands to fire
    * their page load events.
    */
  var pageLoadTimeout: Double = js.native
  /**
    * Path to plugins file. (Pass `false` to disable)
    */
  var pluginsFile: String | `false` = js.native
  /**
    * Port used to host Cypress. Normally this is a randomly generated port
    */
  var port: Double = js.native
  /**
    * The reporter used during the `cypress run`. Default is "spec"
    */
  var reporter: String = js.native
  /**
    * Time, in milliseconds, to wait for an XHR request to go out
    * in a `cy.wait()` command.
    */
  var requestTimeout: Double = js.native
  /**
    * Time, in milliseconds, to wait until a response in a
    * `cy.request()`, `cy.wait()`, `cy.fixture()`, `cy.getCookie()`,
    * `cy.getCookies()`, `cy.setCookie()`, `cy.clearCookie()`,
    * `cy.clearCookies()`, and `cy.screenshot()` commands.
    */
  var responseTimeout: Double = js.native
  /**
    * Path to folder where screenshots will be saved from `cy.screenshot()`
    * command or after a test fails during cypress run.
    */
  var screenshotsFolder: String = js.native
  /**
    * Path to file to load before test files load.
    * This file is compiled and bundled. (Pass `false` to disable).
    */
  var supportFile: String | `false` = js.native
  /**
    * Time, in milliseconds, to wait for a task to finish executing
    * during a `cy.task()` command.
    */
  var taskTimeout: Double = js.native
  /**
    * A String or Array of string glob pattern of the test files to load.
    */
  var testFiles: String | js.Array[String] = js.native
  //
  // screenshots
  //
  /**
    * Whether Cypress will trash assets within the `screenshotsFolder` and
    * `videosFolder` before tests run with cypress run. Default is `true`.
    */
  var trashAssetsBeforeRuns: Boolean = js.native
  /**
    * Enables you to override the default user agent the
    * browser sends in all request headers.
    */
  var userAgent: String = js.native
  /**
    * Whether Cypress will capture a video of the tests run with `cypress run`.
    */
  var video: Boolean = js.native
  //
  // videos
  //
  /**
    * The quality setting for the video compression, in Constant Rate Factor (CRF).
    * The value can be false to disable compression or a value between 0 and 51,
    * where a lower value results in better quality
    * (at the expense of a higher file size).
    */
  var videoCompression: Double | `false` = js.native
  /**
    * Whether Cypress will upload the video to the Dashboard even if
    * all tests are passing. This applies only when recording your runs
    * to the Dashboard. Turn this off if you’d like the video uploaded
    * only when there are failing tests.
    */
  var videoUploadOnPasses: Boolean = js.native
  /**
    * Path to folder where videos will be saved during `cypress run`
    */
  var videosFolder: String = js.native
  //
  // viewport
  //
  /**
    * Default height in pixels for the application under tests’ viewport
    * (Override with `cy.viewport()` command)
    */
  var viewportHeight: Double = js.native
  /**
    * Default width in pixels for the application under tests’ viewport.
    * (Override with `cy.viewport()` command)
    */
  var viewportWidth: Double = js.native
  /**
    * Whether to wait for elements to finish animating before executing commands.
    */
  var waitForAnimations: Boolean = js.native
}

object CypressConfiguration {
  @scala.inline
  def apply(
    animationDistanceThreshold: Double,
    baseUrl: String,
    blacklistHosts: String | js.Array[String],
    chromeWebSecurity: Boolean,
    defaultCommandTimeout: Double,
    env: js.Object,
    execTimeout: Double,
    fileServerFolder: String,
    fixturesFolder: String | `false`,
    ignoreTestFiles: String | js.Array[String],
    integrationFolder: String,
    modifyObstructiveCode: Boolean,
    numTestsKeptInMemory: Double,
    pageLoadTimeout: Double,
    pluginsFile: String | `false`,
    port: Double,
    reporter: String,
    requestTimeout: Double,
    responseTimeout: Double,
    screenshotsFolder: String,
    supportFile: String | `false`,
    taskTimeout: Double,
    testFiles: String | js.Array[String],
    trashAssetsBeforeRuns: Boolean,
    userAgent: String,
    video: Boolean,
    videoCompression: Double | `false`,
    videoUploadOnPasses: Boolean,
    videosFolder: String,
    viewportHeight: Double,
    viewportWidth: Double,
    waitForAnimations: Boolean
  ): CypressConfiguration = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], blacklistHosts = blacklistHosts.asInstanceOf[js.Any], chromeWebSecurity = chromeWebSecurity.asInstanceOf[js.Any], defaultCommandTimeout = defaultCommandTimeout.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], execTimeout = execTimeout.asInstanceOf[js.Any], fileServerFolder = fileServerFolder.asInstanceOf[js.Any], fixturesFolder = fixturesFolder.asInstanceOf[js.Any], ignoreTestFiles = ignoreTestFiles.asInstanceOf[js.Any], integrationFolder = integrationFolder.asInstanceOf[js.Any], modifyObstructiveCode = modifyObstructiveCode.asInstanceOf[js.Any], numTestsKeptInMemory = numTestsKeptInMemory.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], pluginsFile = pluginsFile.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any], screenshotsFolder = screenshotsFolder.asInstanceOf[js.Any], supportFile = supportFile.asInstanceOf[js.Any], taskTimeout = taskTimeout.asInstanceOf[js.Any], testFiles = testFiles.asInstanceOf[js.Any], trashAssetsBeforeRuns = trashAssetsBeforeRuns.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], videoCompression = videoCompression.asInstanceOf[js.Any], videoUploadOnPasses = videoUploadOnPasses.asInstanceOf[js.Any], videosFolder = videosFolder.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressConfiguration]
  }
  @scala.inline
  implicit class CypressConfigurationOps[Self <: CypressConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDistanceThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDistanceThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlacklistHosts(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklistHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChromeWebSecurity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeWebSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCommandTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCommandTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileServerFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileServerFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixturesFolder(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixturesFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreTestFiles(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTestFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegrationFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrationFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyObstructiveCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyObstructiveCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumTestsKeptInMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTestsKeptInMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageLoadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginsFile(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginsFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReporter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenshotsFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotsFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportFile(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestFiles(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrashAssetsBeforeRuns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashAssetsBeforeRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoCompression(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoUploadOnPasses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoUploadOnPasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideosFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videosFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitForAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForAnimations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

