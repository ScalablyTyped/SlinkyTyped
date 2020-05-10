package typingsSlinky.jestTestResult.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.istanbulLibCoverage.mod.CoverageMapData
import typingsSlinky.jestConsole.typesMod.ConsoleBuffer
import typingsSlinky.jestTestResult.AnonAdded
import typingsSlinky.jestTestResult.AnonEnd
import typingsSlinky.jestTypes.configMod.DisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResult extends js.Object {
  var console: js.UndefOr[ConsoleBuffer] = js.native
  var coverage: js.UndefOr[CoverageMapData] = js.native
  var displayName: js.UndefOr[DisplayName] = js.native
  var failureMessage: js.UndefOr[String | Null] = js.native
  var leaks: Boolean = js.native
  var memoryUsage: js.UndefOr[Bytes] = js.native
  var numFailingTests: Double = js.native
  var numPassingTests: Double = js.native
  var numPendingTests: Double = js.native
  var numTodoTests: Double = js.native
  var openHandles: js.Array[js.Error] = js.native
  var perfStats: AnonEnd = js.native
  var skipped: Boolean = js.native
  var snapshot: AnonAdded = js.native
  var sourceMaps: js.UndefOr[StringDictionary[String]] = js.native
  var testExecError: js.UndefOr[SerializableError] = js.native
  var testFilePath: String = js.native
  var testResults: js.Array[AssertionResult] = js.native
}

object TestResult {
  @scala.inline
  def apply(
    leaks: Boolean,
    numFailingTests: Double,
    numPassingTests: Double,
    numPendingTests: Double,
    numTodoTests: Double,
    openHandles: js.Array[js.Error],
    perfStats: AnonEnd,
    skipped: Boolean,
    snapshot: AnonAdded,
    testFilePath: String,
    testResults: js.Array[AssertionResult]
  ): TestResult = {
    val __obj = js.Dynamic.literal(leaks = leaks.asInstanceOf[js.Any], numFailingTests = numFailingTests.asInstanceOf[js.Any], numPassingTests = numPassingTests.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], numTodoTests = numTodoTests.asInstanceOf[js.Any], openHandles = openHandles.asInstanceOf[js.Any], perfStats = perfStats.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], testFilePath = testFilePath.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  @scala.inline
  implicit class TestResultOps[Self <: TestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumFailingTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFailingTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumPassingTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPassingTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumPendingTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPendingTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumTodoTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTodoTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenHandles(value: js.Array[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openHandles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerfStats(value: AnonEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshot(value: AnonAdded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestResults(value: js.Array[AssertionResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsole(value: ConsoleBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverage(value: CoverageMapData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureMessage")(null)
        ret
    }
    @scala.inline
    def withMemoryUsage(value: Bytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMaps(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withTestExecError(value: SerializableError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testExecError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestExecError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testExecError")(js.undefined)
        ret
    }
  }
  
}

