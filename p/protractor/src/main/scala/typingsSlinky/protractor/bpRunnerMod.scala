package typingsSlinky.protractor

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.protractor.configMod.Config
import typingsSlinky.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bpRunnerMod {
  
  @JSImport("protractor/built/bpRunner", "BlockingProxyRunner")
  @js.native
  class BlockingProxyRunner protected () extends StObject {
    def this(config: Config) = this()
    
    var bpProcess: ChildProcess = js.native
    
    def checkSupportedConfig(): Unit = js.native
    
    var config: js.Any = js.native
    
    var port: Double = js.native
    
    def start(): Promise[js.Object] = js.native
  }
}
