package typingsSlinky.jestTestResult

import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.CodeCoverageFormatter
import typingsSlinky.jestTestResult.typesMod.CodeCoverageReporter
import typingsSlinky.jestTestResult.typesMod.FormattedTestResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatTestResultsMod {
  
  @JSImport("@jest/test-result/build/formatTestResults", JSImport.Default)
  @js.native
  def default(results: AggregatedResult): FormattedTestResults = js.native
  @JSImport("@jest/test-result/build/formatTestResults", JSImport.Default)
  @js.native
  def default(
    results: AggregatedResult,
    codeCoverageFormatter: js.UndefOr[scala.Nothing],
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  @JSImport("@jest/test-result/build/formatTestResults", JSImport.Default)
  @js.native
  def default(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  @JSImport("@jest/test-result/build/formatTestResults", JSImport.Default)
  @js.native
  def default(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
}
