package typingsSlinky.jestReporters

import typingsSlinky.jestReporters.baseReporterMod.BaseReporter
import typingsSlinky.jestReporters.typesMod.Test
import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/reporters/build/DefaultReporter", JSImport.Namespace)
@js.native
object defaultReporterMod extends js.Object {
  
  @js.native
  trait DefaultReporter extends BaseReporter {
    
    var _bufferedOutput: js.Any = js.native
    
    var _clear: js.Any = js.native
    
    var _clearStatus: js.Any = js.native
    
    var _err: js.Any = js.native
    
    var _globalConfig: GlobalConfig = js.native
    
    var _out: js.Any = js.native
    
    var _printStatus: js.Any = js.native
    
    var _status: js.Any = js.native
    
    var _wrapStdio: js.Any = js.native
    
    def forceFlushBufferedOutput(): Unit = js.native
    
    @JSName("onTestCaseResult")
    def onTestCaseResult_MDefaultReporter(
      test: Test,
      testCaseResult: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ js.Any
    ): Unit = js.native
    
    @JSName("onTestResult")
    def onTestResult_MDefaultReporter(test: Test, testResult: TestResult, aggregatedResults: AggregatedResult): Unit = js.native
    
    @JSName("onTestStart")
    def onTestStart_MDefaultReporter(test: Test): Unit = js.native
    
    def printTestFileFailureMessage(_testPath: Path, _config: ProjectConfig, result: TestResult): Unit = js.native
    
    def printTestFileHeader(_testPath: Path, config: ProjectConfig, result: TestResult): Unit = js.native
    
    def testFinished(config: ProjectConfig, testResult: TestResult, aggregatedResults: AggregatedResult): Unit = js.native
  }
  
  @js.native
  class default protected () extends DefaultReporter {
    def this(globalConfig: GlobalConfig) = this()
  }
}
