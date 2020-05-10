package typingsSlinky.cypress

import typingsSlinky.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.CypressConfiguration> */
@js.native
trait PartialCypressConfigurati extends js.Object {
  var animationDistanceThreshold: js.UndefOr[Double] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var blacklistHosts: js.UndefOr[String | js.Array[String]] = js.native
  var chromeWebSecurity: js.UndefOr[Boolean] = js.native
  var defaultCommandTimeout: js.UndefOr[Double] = js.native
  var env: js.UndefOr[js.Object] = js.native
  var execTimeout: js.UndefOr[Double] = js.native
  var fileServerFolder: js.UndefOr[String] = js.native
  var fixturesFolder: js.UndefOr[String | `false`] = js.native
  var ignoreTestFiles: js.UndefOr[String | js.Array[String]] = js.native
  var integrationFolder: js.UndefOr[String] = js.native
  var modifyObstructiveCode: js.UndefOr[Boolean] = js.native
  var numTestsKeptInMemory: js.UndefOr[Double] = js.native
  var pageLoadTimeout: js.UndefOr[Double] = js.native
  var pluginsFile: js.UndefOr[String | `false`] = js.native
  var port: js.UndefOr[Double] = js.native
  var reporter: js.UndefOr[String] = js.native
  var requestTimeout: js.UndefOr[Double] = js.native
  var responseTimeout: js.UndefOr[Double] = js.native
  var screenshotsFolder: js.UndefOr[String] = js.native
  var supportFile: js.UndefOr[String | `false`] = js.native
  var taskTimeout: js.UndefOr[Double] = js.native
  var testFiles: js.UndefOr[String | js.Array[String]] = js.native
  var trashAssetsBeforeRuns: js.UndefOr[Boolean] = js.native
  var userAgent: js.UndefOr[String] = js.native
  var video: js.UndefOr[Boolean] = js.native
  var videoCompression: js.UndefOr[Double | `false`] = js.native
  var videoUploadOnPasses: js.UndefOr[Boolean] = js.native
  var videosFolder: js.UndefOr[String] = js.native
  var viewportHeight: js.UndefOr[Double] = js.native
  var viewportWidth: js.UndefOr[Double] = js.native
  var waitForAnimations: js.UndefOr[Boolean] = js.native
}

object PartialCypressConfigurati {
  @scala.inline
  def apply(): PartialCypressConfigurati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCypressConfigurati]
  }
  @scala.inline
  implicit class PartialCypressConfiguratiOps[Self <: PartialCypressConfigurati] (val x: Self) extends AnyVal {
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
    def withoutAnimationDistanceThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDistanceThreshold")(js.undefined)
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
    def withBlacklistHosts(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklistHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklistHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklistHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withChromeWebSecurity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeWebSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromeWebSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeWebSecurity")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCommandTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCommandTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCommandTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCommandTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: js.Object): Self = {
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
    def withExecTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withFileServerFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileServerFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileServerFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileServerFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withFixturesFolder(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixturesFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixturesFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixturesFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTestFiles(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTestFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTestFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTestFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrationFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrationFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrationFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrationFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyObstructiveCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyObstructiveCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyObstructiveCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyObstructiveCode")(js.undefined)
        ret
    }
    @scala.inline
    def withNumTestsKeptInMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTestsKeptInMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumTestsKeptInMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTestsKeptInMemory")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLoadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLoadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginsFile(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginsFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginsFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginsFile")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withReporter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenshotsFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotsFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenshotsFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotsFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportFile(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportFile")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTestFiles(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withTrashAssetsBeforeRuns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashAssetsBeforeRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrashAssetsBeforeRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashAssetsBeforeRuns")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoCompression(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCompression")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoUploadOnPasses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoUploadOnPasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoUploadOnPasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoUploadOnPasses")(js.undefined)
        ret
    }
    @scala.inline
    def withVideosFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videosFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideosFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videosFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForAnimations")(js.undefined)
        ret
    }
  }
  
}

