package typingsSlinky.jestCore

import typingsSlinky.jestCore.anon.Stdin
import typingsSlinky.jestCore.jestCoreBooleans.`true`
import typingsSlinky.jestWatcher.mod.BaseWatchPlugin
import typingsSlinky.jestWatcher.typesMod.UsageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/plugins/quit", JSImport.Namespace)
@js.native
object quitMod extends js.Object {
  @js.native
  trait QuitPlugin extends BaseWatchPlugin {
    @JSName("isInternal")
    var isInternal_QuitPlugin: `true` = js.native
    @JSName("getUsageInfo")
    def getUsageInfo_MQuitPlugin(): UsageData = js.native
    @JSName("run")
    def run_MQuitPlugin(): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default protected () extends QuitPlugin {
    def this(options: Stdin) = this()
  }
  
}

