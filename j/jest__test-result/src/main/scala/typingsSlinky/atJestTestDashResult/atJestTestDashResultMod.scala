package typingsSlinky.atJestTestDashResult

import typingsSlinky.atJestTestDashResult.buildTypesMod.AggregatedResult
import typingsSlinky.atJestTestDashResult.buildTypesMod.CodeCoverageFormatter
import typingsSlinky.atJestTestDashResult.buildTypesMod.CodeCoverageReporter
import typingsSlinky.atJestTestDashResult.buildTypesMod.FormattedTestResults
import typingsSlinky.atJestTestDashResult.buildTypesMod.SerializableError
import typingsSlinky.atJestTestDashResult.buildTypesMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/test-result", JSImport.Namespace)
@js.native
object atJestTestDashResultMod extends js.Object {
  def addResult(aggregatedResults: AggregatedResult, testResult: TestResult): Unit = js.native
  def buildFailureTestResult(testPath: String, err: SerializableError): TestResult = js.native
  def formatTestResults(results: AggregatedResult): FormattedTestResults = js.native
  def formatTestResults(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  def makeEmptyAggregatedTestResult(): AggregatedResult = js.native
}

