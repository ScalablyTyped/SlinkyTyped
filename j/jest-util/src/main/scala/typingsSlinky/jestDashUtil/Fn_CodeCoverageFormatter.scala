package typingsSlinky.jestDashUtil

import typingsSlinky.atJestTestDashResult.buildTypesMod.AggregatedResult
import typingsSlinky.atJestTestDashResult.buildTypesMod.CodeCoverageFormatter
import typingsSlinky.atJestTestDashResult.buildTypesMod.CodeCoverageReporter
import typingsSlinky.atJestTestDashResult.buildTypesMod.FormattedTestResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CodeCoverageFormatter extends js.Object {
  def apply(results: AggregatedResult): FormattedTestResults = js.native
  def apply(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def apply(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
}

