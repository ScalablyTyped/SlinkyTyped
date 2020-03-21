package typingsSlinky.jestTestResult

import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.CodeCoverageFormatter
import typingsSlinky.jestTestResult.typesMod.CodeCoverageReporter
import typingsSlinky.jestTestResult.typesMod.FormattedTestResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/test-result/build/formatTestResults", JSImport.Namespace)
@js.native
object formatTestResultsMod extends js.Object {
  def default(results: AggregatedResult): FormattedTestResults = js.native
  def default(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def default(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
}

