package typingsSlinky.jestReporters

import typingsSlinky.jestReporters.baseReporterMod.BaseReporter
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/reporters/build/summary_reporter", JSImport.Namespace)
@js.native
object summaryReporterMod extends js.Object {
  
  @js.native
  trait SummaryReporter extends BaseReporter {
    
    var _estimatedTime: js.Any = js.native
    
    var _getTestSummary: js.Any = js.native
    
    var _globalConfig: js.Any = js.native
    
    var _printSnapshotSummary: js.Any = js.native
    
    var _printSummary: js.Any = js.native
    
    var _write: js.Any = js.native
  }
  
  @js.native
  class default protected () extends SummaryReporter {
    def this(globalConfig: GlobalConfig) = this()
  }
}
