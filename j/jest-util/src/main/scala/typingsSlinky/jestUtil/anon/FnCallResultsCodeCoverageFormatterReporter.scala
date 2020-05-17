package typingsSlinky.jestUtil.anon

import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.CodeCoverageFormatter
import typingsSlinky.jestTestResult.typesMod.CodeCoverageReporter
import typingsSlinky.jestTestResult.typesMod.FormattedTestResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallResultsCodeCoverageFormatterReporter extends js.Object {
  def apply(results: AggregatedResult): FormattedTestResults = js.native
  def apply(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def apply(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
}

