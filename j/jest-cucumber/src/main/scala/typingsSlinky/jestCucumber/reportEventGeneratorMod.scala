package typingsSlinky.jestCucumber

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/reporting/report-event-generation/ReportEventGenerator", JSImport.Namespace)
@js.native
object reportEventGeneratorMod extends js.Object {
  
  @js.native
  class ReportEventGenerator () extends js.Object {
    
    var calculateTotalDuration: js.Any = js.native
    
    var eventBroadcaster: EventEmitter = js.native
    
    var eventDataCollector: js.Any = js.native
    
    var featureFileEventGenerator: js.Any = js.native
    
    def onScenarioComplete(jestTestResult: js.Any): js.Promise[js.Tuple10[_, _, _, _, _, _, _, _, _, _]] = js.native
    
    def onTestRunComplete(jestTestResult: js.Any): Unit = js.native
    
    var testCaseEventGenerator: js.Any = js.native
  }
}
