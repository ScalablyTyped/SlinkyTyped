package typingsSlinky.protractor.taskRunnerMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.protractor.configMod.Config
import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor/built/taskRunner", "TaskRunner")
@js.native
class TaskRunner protected () extends EventEmitter {
  def this(configFile: String, additionalConfig: Config, task: js.Any, runInFork: Boolean) = this()
  
  var additionalConfig: js.Any = js.native
  
  var configFile: js.Any = js.native
  
  /**
    * Sends the run command.
    * @return {q.Promise} A promise that will resolve when the task finishes
    *     running. The promise contains the following parameters representing the
    *     result of the run:
    *       taskId, specs, capabilities, failedCount, exitCode, specResults
    */
  def run(): Promise[_] = js.native
  
  var runInFork: js.Any = js.native
  
  var task: js.Any = js.native
}
