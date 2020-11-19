package typingsSlinky.protractor

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.protractor.configMod.Config
import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor/built/bpRunner", JSImport.Namespace)
@js.native
object bpRunnerMod extends js.Object {
  
  @js.native
  class BlockingProxyRunner protected () extends js.Object {
    def this(config: Config) = this()
    
    var bpProcess: ChildProcess = js.native
    
    def checkSupportedConfig(): Unit = js.native
    
    var config: js.Any = js.native
    
    var port: Double = js.native
    
    def start(): Promise[js.Object] = js.native
  }
}
