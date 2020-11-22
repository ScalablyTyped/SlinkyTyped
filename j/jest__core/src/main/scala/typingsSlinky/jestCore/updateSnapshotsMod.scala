package typingsSlinky.jestCore

import typingsSlinky.jestCore.anon.Stdin
import typingsSlinky.jestCore.jestCoreBooleans.`true`
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestWatcher.mod.BaseWatchPlugin
import typingsSlinky.jestWatcher.typesMod.JestHookSubscriber
import typingsSlinky.jestWatcher.typesMod.UpdateConfigCallback
import typingsSlinky.jestWatcher.typesMod.UsageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/plugins/UpdateSnapshots", JSImport.Namespace)
@js.native
object updateSnapshotsMod extends js.Object {
  
  @js.native
  trait UpdateSnapshotsPlugin extends BaseWatchPlugin {
    
    var _hasSnapshotFailure: js.Any = js.native
    
    @JSName("apply")
    def apply_MUpdateSnapshotsPlugin(hooks: JestHookSubscriber): Unit = js.native
    
    @JSName("getUsageInfo")
    def getUsageInfo_MUpdateSnapshotsPlugin(): UsageData | Null = js.native
    
    @JSName("isInternal")
    var isInternal_UpdateSnapshotsPlugin: `true` = js.native
    
    @JSName("run")
    def run_MUpdateSnapshotsPlugin(_globalConfig: GlobalConfig, updateConfigAndRun: UpdateConfigCallback): js.Promise[Boolean] = js.native
  }
  
  @js.native
  class default protected () extends UpdateSnapshotsPlugin {
    def this(options: Stdin) = this()
  }
}
