package typingsSlinky.jestReporters

import typingsSlinky.jestReporters.coverageReporterMod.default
import typingsSlinky.jestReporters.typesMod.CoverageReporterOptions
import typingsSlinky.jestReporters.typesMod.TestSchedulerContext
import typingsSlinky.jestTestResult.typesMod.AssertionResult
import typingsSlinky.jestTestResult.typesMod.Suite
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BaseReporter ()
    extends typingsSlinky.jestReporters.baseReporterMod.BaseReporter
  
  @js.native
  class CoverageReporter protected () extends default {
    def this(globalConfig: GlobalConfig) = this()
    def this(globalConfig: GlobalConfig, options: CoverageReporterOptions) = this()
  }
  
  @js.native
  class DefaultReporter protected ()
    extends typingsSlinky.jestReporters.defaultReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  @js.native
  class NotifyReporter protected ()
    extends typingsSlinky.jestReporters.notifyReporterMod.default {
    def this(
      globalConfig: GlobalConfig,
      startRun: js.Function1[/* globalConfig */ GlobalConfig, _],
      context: TestSchedulerContext
    ) = this()
  }
  
  @js.native
  class SummaryReporter protected ()
    extends typingsSlinky.jestReporters.summaryReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  @js.native
  class VerboseReporter protected ()
    extends typingsSlinky.jestReporters.verboseReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  /* static members */
  @js.native
  object VerboseReporter extends js.Object {
    def filterTestResults(testResults: js.Array[AssertionResult]): js.Array[AssertionResult] = js.native
    def groupTestsBySuites(testResults: js.Array[AssertionResult]): Suite = js.native
  }
  
}

