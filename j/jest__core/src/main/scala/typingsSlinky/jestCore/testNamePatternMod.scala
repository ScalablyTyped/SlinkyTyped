package typingsSlinky.jestCore

import typingsSlinky.jestCore.anon.Stdin
import typingsSlinky.jestCore.jestCoreBooleans.`true`
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestWatcher.mod.BaseWatchPlugin
import typingsSlinky.jestWatcher.mod.Prompt
import typingsSlinky.jestWatcher.typesMod.UpdateConfigCallback
import typingsSlinky.jestWatcher.typesMod.UsageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/plugins/test_name_pattern", JSImport.Namespace)
@js.native
object testNamePatternMod extends js.Object {
  @js.native
  trait TestNamePatternPlugin extends BaseWatchPlugin {
    var _prompt: Prompt = js.native
    @JSName("isInternal")
    var isInternal_TestNamePatternPlugin: `true` = js.native
    @JSName("getUsageInfo")
    def getUsageInfo_MTestNamePatternPlugin(): UsageData = js.native
    @JSName("onKey")
    def onKey_MTestNamePatternPlugin(key: String): Unit = js.native
    @JSName("run")
    def run_MTestNamePatternPlugin(globalConfig: GlobalConfig, updateConfigAndRun: UpdateConfigCallback): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default protected () extends TestNamePatternPlugin {
    def this(options: Stdin) = this()
  }
  
}

