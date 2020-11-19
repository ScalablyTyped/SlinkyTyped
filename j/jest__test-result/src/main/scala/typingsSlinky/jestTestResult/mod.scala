package typingsSlinky.jestTestResult

import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.CodeCoverageFormatter
import typingsSlinky.jestTestResult.typesMod.CodeCoverageReporter
import typingsSlinky.jestTestResult.typesMod.FormattedTestResults
import typingsSlinky.jestTestResult.typesMod.SerializableError
import typingsSlinky.jestTestResult.typesMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/test-result", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addResult(aggregatedResults: AggregatedResult, testResult: TestResult): Unit = js.native
  
  def buildFailureTestResult(testPath: String, err: SerializableError): TestResult = js.native
  
  def formatTestResults(results: AggregatedResult): FormattedTestResults = js.native
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: js.UndefOr[scala.Nothing],
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  def formatTestResults(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  
  def makeEmptyAggregatedTestResult(): AggregatedResult = js.native
}
