package typingsSlinky.atJestReporters.buildCoverageUnderscoreReporterMod

import typingsSlinky.atJestReporters.buildTypesMod.Context
import typingsSlinky.atJestReporters.buildTypesMod.CoverageReporterOptions
import typingsSlinky.atJestReporters.buildTypesMod.ReporterOnStartOptions
import typingsSlinky.atJestReporters.buildTypesMod.Test
import typingsSlinky.atJestTestDashResult.buildTypesMod.AggregatedResult
import typingsSlinky.atJestTestDashResult.buildTypesMod.TestResult
import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import typingsSlinky.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod.CoverageMap
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/coverage_reporter", JSImport.Default)
@js.native
class default protected () extends CoverageReporter {
  def this(globalConfig: GlobalConfig) = this()
  def this(globalConfig: GlobalConfig, options: CoverageReporterOptions) = this()
  /* CompleteClass */
  override var _addUntestedFiles: js.Any = js.native
  /* CompleteClass */
  override var _checkThreshold: js.Any = js.native
  /* CompleteClass */
  override var _coverageMap: js.Any = js.native
  /* CompleteClass */
  override var _globalConfig: js.Any = js.native
  /* CompleteClass */
  override var _options: js.Any = js.native
  /* CompleteClass */
  override var _sourceMapStore: js.Any = js.native
  /* CompleteClass */
  /* protected */ override def _setError(error: js.Error): Unit = js.native
  /* CompleteClass */
  override def getCoverageMap(): CoverageMap = js.native
  /* CompleteClass */
  override def getLastError(): js.Error | Unit = js.native
  /* CompleteClass */
  override def log(message: String): Unit = js.native
  /* CompleteClass */
  override def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onTestStart(test: Test): js.Promise[Unit] | Unit = js.native
}

