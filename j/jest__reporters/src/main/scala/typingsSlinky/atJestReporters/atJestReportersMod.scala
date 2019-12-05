package typingsSlinky.atJestReporters

import typingsSlinky.atJestReporters.buildCoverageUnderscoreReporterMod.default
import typingsSlinky.atJestReporters.buildTypesMod.Context
import typingsSlinky.atJestReporters.buildTypesMod.CoverageReporterOptions
import typingsSlinky.atJestReporters.buildTypesMod.ReporterOnStartOptions
import typingsSlinky.atJestReporters.buildTypesMod.Test
import typingsSlinky.atJestReporters.buildTypesMod.TestSchedulerContext
import typingsSlinky.atJestTestDashResult.buildTypesMod.AggregatedResult
import typingsSlinky.atJestTestDashResult.buildTypesMod.AssertionResult
import typingsSlinky.atJestTestDashResult.buildTypesMod.Suite
import typingsSlinky.atJestTestDashResult.buildTypesMod.TestResult
import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters", JSImport.Namespace)
@js.native
object atJestReportersMod extends js.Object {
  @js.native
  class BaseReporter ()
    extends typingsSlinky.atJestReporters.buildBaseUnderscoreReporterMod.BaseReporter {
    /* CompleteClass */
    /* protected */ override def _setError(error: js.Error): Unit = js.native
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
  
  @js.native
  class CoverageReporter protected () extends default {
    def this(globalConfig: GlobalConfig) = this()
    def this(globalConfig: GlobalConfig, options: CoverageReporterOptions) = this()
  }
  
  @js.native
  class DefaultReporter protected ()
    extends typingsSlinky.atJestReporters.buildDefaultUnderscoreReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  @js.native
  class NotifyReporter protected ()
    extends typingsSlinky.atJestReporters.buildNotifyUnderscoreReporterMod.default {
    def this(
      globalConfig: GlobalConfig,
      startRun: js.Function1[/* globalConfig */ GlobalConfig, _],
      context: TestSchedulerContext
    ) = this()
  }
  
  @js.native
  class SummaryReporter protected ()
    extends typingsSlinky.atJestReporters.buildSummaryUnderscoreReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  @js.native
  class VerboseReporter protected ()
    extends typingsSlinky.atJestReporters.buildVerboseUnderscoreReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  /* static members */
  @js.native
  object VerboseReporter extends js.Object {
    def filterTestResults(testResults: js.Array[AssertionResult]): js.Array[AssertionResult] = js.native
    def groupTestsBySuites(testResults: js.Array[AssertionResult]): Suite = js.native
  }
  
}

