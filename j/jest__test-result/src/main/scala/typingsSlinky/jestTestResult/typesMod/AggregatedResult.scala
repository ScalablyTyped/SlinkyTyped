package typingsSlinky.jestTestResult.typesMod

import typingsSlinky.istanbulLibCoverage.mod.CoverageMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @jest/test-result.@jest/test-result/build/types.AggregatedResultWithoutCoverage & {  coverageMap ? :istanbul-lib-coverage.istanbul-lib-coverage.CoverageMap | null} */
@js.native
trait AggregatedResult extends js.Object {
  var coverageMap: js.UndefOr[CoverageMap | Null] = js.native
  var numFailedTestSuites: Double = js.native
  var numFailedTests: Double = js.native
  var numPassedTestSuites: Double = js.native
  var numPassedTests: Double = js.native
  var numPendingTestSuites: Double = js.native
  var numPendingTests: Double = js.native
  var numRuntimeErrorTestSuites: Double = js.native
  var numTodoTests: Double = js.native
  var numTotalTestSuites: Double = js.native
  var numTotalTests: Double = js.native
  var openHandles: js.Array[js.Error] = js.native
  var snapshot: SnapshotSummary = js.native
  var startTime: Double = js.native
  var success: Boolean = js.native
  var testResults: js.Array[TestResult] = js.native
  var wasInterrupted: Boolean = js.native
}

object AggregatedResult {
  @scala.inline
  def apply(
    numFailedTestSuites: Double,
    numFailedTests: Double,
    numPassedTestSuites: Double,
    numPassedTests: Double,
    numPendingTestSuites: Double,
    numPendingTests: Double,
    numRuntimeErrorTestSuites: Double,
    numTodoTests: Double,
    numTotalTestSuites: Double,
    numTotalTests: Double,
    openHandles: js.Array[js.Error],
    snapshot: SnapshotSummary,
    startTime: Double,
    success: Boolean,
    testResults: js.Array[TestResult],
    wasInterrupted: Boolean
  ): AggregatedResult = {
    val __obj = js.Dynamic.literal(numFailedTestSuites = numFailedTestSuites.asInstanceOf[js.Any], numFailedTests = numFailedTests.asInstanceOf[js.Any], numPassedTestSuites = numPassedTestSuites.asInstanceOf[js.Any], numPassedTests = numPassedTests.asInstanceOf[js.Any], numPendingTestSuites = numPendingTestSuites.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], numRuntimeErrorTestSuites = numRuntimeErrorTestSuites.asInstanceOf[js.Any], numTodoTests = numTodoTests.asInstanceOf[js.Any], numTotalTestSuites = numTotalTestSuites.asInstanceOf[js.Any], numTotalTests = numTotalTests.asInstanceOf[js.Any], openHandles = openHandles.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any], wasInterrupted = wasInterrupted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResult]
  }
  @scala.inline
  implicit class AggregatedResultOps[Self <: AggregatedResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumFailedTestSuites(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFailedTestSuites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumFailedTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFailedTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumPassedTestSuites(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPassedTestSuites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumPassedTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPassedTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumPendingTestSuites(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPendingTestSuites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumPendingTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPendingTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumRuntimeErrorTestSuites(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRuntimeErrorTestSuites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumTodoTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTodoTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumTotalTestSuites(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTotalTestSuites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumTotalTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTotalTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenHandles(value: js.Array[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openHandles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshot(value: SnapshotSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestResults(value: js.Array[TestResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWasInterrupted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasInterrupted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverageMap(value: CoverageMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageMap")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverageMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageMap")(null)
        ret
    }
  }
  
}

