package typingsSlinky.cypress.cypressMod

import typingsSlinky.cypress.AnonAbsolute
import typingsSlinky.cypress.AnonFailures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cypress test run result for a single spec.
  */
@js.native
trait RunResult extends js.Object {
  var error: String | Null = js.native
  var hooks: js.Array[HookInformation] = js.native
  /**
    * Reporter name like "spec"
    */
  var reporter: String = js.native
  /**
    * This is controlled by the reporter, and Cypress cannot guarantee
    * the properties. Usually this object has suites, tests, passes, etc
    */
  var reporterStats: js.Object = js.native
  var screenshots: js.Array[ScreenshotInformation] = js.native
  var shouldUploadVideo: Boolean = js.native
  /**
    * information about the spec test file.
    */
  var spec: AnonAbsolute = js.native
  /**
    * Accurate test results collected by Cypress.
    */
  var stats: AnonFailures = js.native
  var tests: js.Array[TestResult] = js.native
  var video: String | Null = js.native
}

object RunResult {
  @scala.inline
  def apply(
    hooks: js.Array[HookInformation],
    reporter: String,
    reporterStats: js.Object,
    screenshots: js.Array[ScreenshotInformation],
    shouldUploadVideo: Boolean,
    spec: AnonAbsolute,
    stats: AnonFailures,
    tests: js.Array[TestResult]
  ): RunResult = {
    val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], reporterStats = reporterStats.asInstanceOf[js.Any], screenshots = screenshots.asInstanceOf[js.Any], shouldUploadVideo = shouldUploadVideo.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult]
  }
  @scala.inline
  implicit class RunResultOps[Self <: RunResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHooks(value: js.Array[HookInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReporter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReporterStats(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporterStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenshots(value: js.Array[ScreenshotInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldUploadVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUploadVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpec(value: AnonAbsolute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: AnonFailures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTests(value: js.Array[TestResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(null)
        ret
    }
    @scala.inline
    def withVideo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(null)
        ret
    }
  }
  
}

