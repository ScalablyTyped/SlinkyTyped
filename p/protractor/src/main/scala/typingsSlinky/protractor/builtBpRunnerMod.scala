package typingsSlinky.protractor

import typingsSlinky.node.childUnderscoreProcessMod.ChildProcess
import typingsSlinky.protractor.builtConfigMod.Config
import typingsSlinky.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/bpRunner", JSImport.Namespace)
@js.native
object builtBpRunnerMod extends js.Object {
  @js.native
  class BlockingProxyRunner protected () extends js.Object {
    def this(config: Config) = this()
    var bpProcess: ChildProcess = js.native
    var config: js.Any = js.native
    var port: Double = js.native
    def checkSupportedConfig(): Unit = js.native
    def start(): Promise[js.Object] = js.native
  }
  
}

