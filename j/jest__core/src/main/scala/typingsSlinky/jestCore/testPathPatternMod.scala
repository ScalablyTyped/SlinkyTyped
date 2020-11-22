package typingsSlinky.jestCore

import typingsSlinky.jestCore.anon.Stdin
import typingsSlinky.jestCore.jestCoreBooleans.`true`
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestWatcher.mod.BaseWatchPlugin
import typingsSlinky.jestWatcher.typesMod.UpdateConfigCallback
import typingsSlinky.jestWatcher.typesMod.UsageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/plugins/TestPathPattern", JSImport.Namespace)
@js.native
object testPathPatternMod extends js.Object {
  
  @js.native
  trait TestPathPatternPlugin extends BaseWatchPlugin {
    
    var _prompt: js.Any = js.native
    
    @JSName("getUsageInfo")
    def getUsageInfo_MTestPathPatternPlugin(): UsageData = js.native
    
    @JSName("isInternal")
    var isInternal_TestPathPatternPlugin: `true` = js.native
    
    @JSName("onKey")
    def onKey_MTestPathPatternPlugin(key: String): Unit = js.native
    
    @JSName("run")
    def run_MTestPathPatternPlugin(globalConfig: GlobalConfig, updateConfigAndRun: UpdateConfigCallback): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default protected () extends TestPathPatternPlugin {
    def this(options: Stdin) = this()
  }
}
