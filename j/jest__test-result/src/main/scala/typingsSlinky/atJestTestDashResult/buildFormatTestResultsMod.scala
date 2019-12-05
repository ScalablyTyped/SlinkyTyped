package typingsSlinky.atJestTestDashResult

import typingsSlinky.atJestTestDashResult.buildTypesMod.AggregatedResult
import typingsSlinky.atJestTestDashResult.buildTypesMod.CodeCoverageFormatter
import typingsSlinky.atJestTestDashResult.buildTypesMod.CodeCoverageReporter
import typingsSlinky.atJestTestDashResult.buildTypesMod.FormattedTestResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/test-result/build/formatTestResults", JSImport.Namespace)
@js.native
object buildFormatTestResultsMod extends js.Object {
  def default(results: AggregatedResult): FormattedTestResults = js.native
  def default(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def default(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
}

