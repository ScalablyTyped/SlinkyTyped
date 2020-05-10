package typingsSlinky.cypress.cypressMod.Cypress

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cypress.cypressStrings.bundled
import typingsSlinky.cypress.cypressStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /**
    * The distance in pixels an element must exceed over time to be considered animating
    * @default 5
    */
  var animationDistanceThreshold: Double = js.native
  /**
    * Url used as prefix for [cy.visit()](https://on.cypress.io/visit) or [cy.request()](https://on.cypress.io/request) command’s url
    * @default null
    */
  var baseUrl: String | Null = js.native
  /**
    * Whether Chrome Web Security for same-origin policy and insecure mixed content is enabled. Read more about this here
    * @default true
    */
  var chromeWebSecurity: Boolean = js.native
  /**
    * Time, in milliseconds, to wait until most DOM based commands are considered timed out
    * @default 4000
    */
  var defaultCommandTimeout: Double = js.native
  /**
    * Any values to be set as [environment variables](https://docs.cypress.io/guides/guides/environment-variables.html)
    * @default {}
    */
  var env: StringDictionary[js.Any] = js.native
  /**
    * Time, in milliseconds, to wait for a system command to finish executing during a [cy.exec()](https://on.cypress.io/exec) command
    * @default 60000
    */
  var execTimeout: Double = js.native
  /**
    * Path to folder where application files will attempt to be served from
    * @default root project folder
    */
  var fileServerFolder: String = js.native
  /**
    * Path to folder containing fixture files (Pass false to disable)
    * @default "cypress/fixtures"
    */
  var fixturesFolder: String = js.native
  /**
    * A String or Array of glob patterns used to ignore test files that would otherwise be shown in your list of tests. Cypress uses minimatch with the options: {dot: true, matchBase: true}. We suggest using http://globtester.com to test what files would match.
    * @default "*.hot-update.js"
    */
  var ignoreTestFiles: String | js.Array[String] = js.native
  /**
    * Path to folder containing integration test files
    * @default "cypress/integration"
    */
  var integrationFolder: String = js.native
  /**
    * If set to `system`, Cypress will try to find a `node` executable on your path to use when executing your plugins. Otherwise, Cypress will use the Node version bundled with Cypress.
    * @default "bundled"
    */
  var nodeVersion: system | bundled = js.native
  /**
    * The number of tests for which snapshots and command data are kept in memory. Reduce this number if you are experiencing high memory consumption in your browser during a test run.
    * @default 50
    */
  var numTestsKeptInMemory: Double = js.native
  /**
    * Time, in milliseconds, to wait for page transition events or [cy.visit()](https://on.cypress.io/visit), [cy.go()](https://on.cypress.io/go), [cy.reload()](https://on.cypress.io/reload) commands to fire their page load events
    * @default 60000
    */
  var pageLoadTimeout: Double = js.native
  /**
    * Path to plugins file. (Pass false to disable)
    * @default "cypress/plugins/index.js"
    */
  var pluginsFile: String = js.native
  /**
    * Port used to host Cypress. Normally this is a randomly generated port
    * @default null
    */
  var port: Double | Null = js.native
  /**
    * The [reporter](https://docs.cypress.io/guides/guides/reporters.html) used when running headlessly or in CI
    * @default "spec"
    */
  var reporter: String = js.native
  /**
    * Time, in milliseconds, to wait for an XHR request to go out in a [cy.wait()](https://on.cypress.io/wait) command
    * @default 5000
    */
  var requestTimeout: Double = js.native
  /**
    * If `nodeVersion === 'system'` and a `node` executable is found, this will be the full filesystem path to that executable.
    * @default null
    */
  var resolvedNodePath: String = js.native
  /**
    * The version of `node` that is being used to execute plugins.
    * @example 1.2.3
    */
  var resolvedNodeVersion: String = js.native
  /**
    * Time, in milliseconds, to wait until a response in a [cy.request()](https://on.cypress.io/request), [cy.wait()](https://on.cypress.io/wait), [cy.fixture()](https://on.cypress.io/fixture), [cy.getCookie()](https://on.cypress.io/getcookie), [cy.getCookies()](https://on.cypress.io/getcookies), [cy.setCookie()](https://on.cypress.io/setcookie), [cy.clearCookie()](https://on.cypress.io/clearcookie), [cy.clearCookies()](https://on.cypress.io/clearcookies), and [cy.screenshot()](https://on.cypress.io/screenshot) commands
    * @default 30000
    */
  var responseTimeout: Double = js.native
  /**
    * Path to folder where screenshots will be saved from [cy.screenshot()](https://on.cypress.io/screenshot) command or after a headless or CI run’s test failure
    * @default "cypress/screenshots"
    */
  var screenshotsFolder: String = js.native
  /**
    * Path to file to load before test files load. This file is compiled and bundled. (Pass false to disable)
    * @default "cypress/support/index.js"
    */
  var supportFile: String = js.native
  /**
    * Whether Cypress will trash assets within the screenshotsFolder and videosFolder before headless test runs.
    * @default true
    */
  var trashAssetsBeforeRuns: Boolean = js.native
  /**
    * Whether Cypress will record a video of the test run when running headlessly.
    * @default true
    */
  var video: Boolean = js.native
  /**
    * The quality setting for the video compression, in Constant Rate Factor (CRF). The value can be false to disable compression or a value between 0 and 51, where a lower value results in better quality (at the expense of a higher file size).
    * @default 32
    */
  var videoCompression: Double = js.native
  /**
    * Whether Cypress will upload the video to the Dashboard even if all tests are passing. This applies only when recording your runs to the Dashboard. Turn this off if you’d like the video uploaded only when there are failing tests.
    * @default true
    */
  var videoUploadOnPasses: Boolean = js.native
  /**
    * Path to folder where videos will be saved after a headless or CI run
    * @default "cypress/videos"
    */
  var videosFolder: String = js.native
  /**
    * Default height in pixels for the application under tests’ viewport (Override with [cy.viewport()](https://on.cypress.io/viewport) command)
    * @default 660
    */
  var viewportHeight: Double = js.native
  /**
    * Default width in pixels for the application under tests’ viewport. (Override with [cy.viewport()](https://on.cypress.io/viewport) command)
    * @default 1000
    */
  var viewportWidth: Double = js.native
  /**
    * Whether to wait for elements to finish animating before executing commands
    * @default true
    */
  var waitForAnimations: Boolean = js.native
  /**
    * Whether to take a screenshot on test failure when running headlessly or in CI
    * @default true
    */
  var watchForFileChanges: Boolean = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(
    animationDistanceThreshold: Double,
    chromeWebSecurity: Boolean,
    defaultCommandTimeout: Double,
    env: StringDictionary[js.Any],
    execTimeout: Double,
    fileServerFolder: String,
    fixturesFolder: String,
    ignoreTestFiles: String | js.Array[String],
    integrationFolder: String,
    nodeVersion: system | bundled,
    numTestsKeptInMemory: Double,
    pageLoadTimeout: Double,
    pluginsFile: String,
    reporter: String,
    requestTimeout: Double,
    resolvedNodePath: String,
    resolvedNodeVersion: String,
    responseTimeout: Double,
    screenshotsFolder: String,
    supportFile: String,
    trashAssetsBeforeRuns: Boolean,
    video: Boolean,
    videoCompression: Double,
    videoUploadOnPasses: Boolean,
    videosFolder: String,
    viewportHeight: Double,
    viewportWidth: Double,
    waitForAnimations: Boolean,
    watchForFileChanges: Boolean
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal(animationDistanceThreshold = animationDistanceThreshold.asInstanceOf[js.Any], chromeWebSecurity = chromeWebSecurity.asInstanceOf[js.Any], defaultCommandTimeout = defaultCommandTimeout.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], execTimeout = execTimeout.asInstanceOf[js.Any], fileServerFolder = fileServerFolder.asInstanceOf[js.Any], fixturesFolder = fixturesFolder.asInstanceOf[js.Any], ignoreTestFiles = ignoreTestFiles.asInstanceOf[js.Any], integrationFolder = integrationFolder.asInstanceOf[js.Any], nodeVersion = nodeVersion.asInstanceOf[js.Any], numTestsKeptInMemory = numTestsKeptInMemory.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], pluginsFile = pluginsFile.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], resolvedNodePath = resolvedNodePath.asInstanceOf[js.Any], resolvedNodeVersion = resolvedNodeVersion.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any], screenshotsFolder = screenshotsFolder.asInstanceOf[js.Any], supportFile = supportFile.asInstanceOf[js.Any], trashAssetsBeforeRuns = trashAssetsBeforeRuns.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], videoCompression = videoCompression.asInstanceOf[js.Any], videoUploadOnPasses = videoUploadOnPasses.asInstanceOf[js.Any], videosFolder = videosFolder.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForAnimations = waitForAnimations.asInstanceOf[js.Any], watchForFileChanges = watchForFileChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
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
    def withEnv(value: StringDictionary[js.Any]): Self = {
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
    def withFixturesFolder(value: String): Self = {
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
    def withNodeVersion(value: system | bundled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeVersion")(value.asInstanceOf[js.Any])
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
    def withPluginsFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginsFile")(value.asInstanceOf[js.Any])
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
    def withResolvedNodePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedNodePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedNodeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedNodeVersion")(value.asInstanceOf[js.Any])
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
    def withSupportFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrashAssetsBeforeRuns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashAssetsBeforeRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoCompression(value: Double): Self = {
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
    @scala.inline
    def withWatchForFileChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchForFileChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(null)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(null)
        ret
    }
  }
  
}

