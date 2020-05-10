package typingsSlinky.cypress.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results returned by the test run.
  * @see https://on.cypress.io/module-api
  */
@js.native
trait CypressRunResult extends js.Object {
  var browserName: String = js.native
  var browserPath: String = js.native
  var browserVersion: String = js.native
  // TODO add resolved object to the configuration
  var config: CypressConfiguration = js.native
  var cypressVersion: String = js.native
  var endedTestsAt: dateTimeISO = js.native
  /**
    * If Cypress fails to run at all (for example, if there are no spec files to run),
    * then it will set failures to 1 and will have actual error message in the
    * property "message". Check this property before checking other properties.
    *
    * @type {number}
    * @example
    ```
    const result = await cypress.run()
    if (result.failures) {
    console.error(result.message)
    process.exit(result.failures)
    }
    ```
    */
  var failures: js.UndefOr[Double] = js.native
  /**
    * If returned result has "failures" set, then this property gives
    * the error message.
    *
    * @type {string}
    */
  var message: js.UndefOr[String] = js.native
  var osName: String = js.native
  var osVersion: String = js.native
  /**
    * If Cypress test run is being recorded, full url will be provided.
    * @see https://on.cypress.io/dashboard-introduction
    */
  var runUrl: js.UndefOr[String] = js.native
  var runs: js.Array[RunResult] = js.native
  var startedTestsAt: dateTimeISO = js.native
  var totalDuration: ms = js.native
  var totalFailed: Double = js.native
  var totalPassed: Double = js.native
  var totalPending: Double = js.native
  var totalSkipped: Double = js.native
  var totalSuites: Double = js.native
  var totalTests: Double = js.native
}

object CypressRunResult {
  @scala.inline
  def apply(
    browserName: String,
    browserPath: String,
    browserVersion: String,
    config: CypressConfiguration,
    cypressVersion: String,
    endedTestsAt: dateTimeISO,
    osName: String,
    osVersion: String,
    runs: js.Array[RunResult],
    startedTestsAt: dateTimeISO,
    totalDuration: ms,
    totalFailed: Double,
    totalPassed: Double,
    totalPending: Double,
    totalSkipped: Double,
    totalSuites: Double,
    totalTests: Double
  ): CypressRunResult = {
    val __obj = js.Dynamic.literal(browserName = browserName.asInstanceOf[js.Any], browserPath = browserPath.asInstanceOf[js.Any], browserVersion = browserVersion.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], cypressVersion = cypressVersion.asInstanceOf[js.Any], endedTestsAt = endedTestsAt.asInstanceOf[js.Any], osName = osName.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], startedTestsAt = startedTestsAt.asInstanceOf[js.Any], totalDuration = totalDuration.asInstanceOf[js.Any], totalFailed = totalFailed.asInstanceOf[js.Any], totalPassed = totalPassed.asInstanceOf[js.Any], totalPending = totalPending.asInstanceOf[js.Any], totalSkipped = totalSkipped.asInstanceOf[js.Any], totalSuites = totalSuites.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressRunResult]
  }
  @scala.inline
  implicit class CypressRunResultOps[Self <: CypressRunResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowserPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowserVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: CypressConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCypressVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cypressVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndedTestsAt(value: dateTimeISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endedTestsAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuns(value: js.Array[RunResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedTestsAt(value: dateTimeISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedTestsAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalDuration(value: ms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalFailed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalPassed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPassed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalSkipped(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSkipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalSuites(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSuites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
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
    def withRunUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runUrl")(js.undefined)
        ret
    }
  }
  
}

