package typingsSlinky.jestReporters

import typingsSlinky.jestReporters.baseReporterMod.BaseReporter
import typingsSlinky.jestReporters.typesMod.CoverageReporterOptions
import typingsSlinky.jestReporters.typesMod.Test
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/reporters/build/coverage_reporter", JSImport.Namespace)
@js.native
object coverageReporterMod extends js.Object {
  
  @js.native
  trait CoverageReporter extends BaseReporter {
    
    var _addUntestedFiles: js.Any = js.native
    
    var _checkThreshold: js.Any = js.native
    
    var _coverageMap: js.Any = js.native
    
    var _getCoverageResult: js.Any = js.native
    
    var _globalConfig: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _sourceMapStore: js.Any = js.native
    
    var _v8CoverageResults: js.Any = js.native
    
    @JSName("onTestResult")
    def onTestResult_MCoverageReporter(_test: Test, testResult: TestResult): Unit = js.native
  }
  
  @js.native
  class default protected () extends CoverageReporter {
    def this(globalConfig: GlobalConfig) = this()
    def this(globalConfig: GlobalConfig, options: CoverageReporterOptions) = this()
  }
}
