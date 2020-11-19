package typingsSlinky.jestCore

import typingsSlinky.jestCore.jestCoreBooleans.`true`
import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.AssertionLocation
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestWatcher.mod.BaseWatchPlugin
import typingsSlinky.jestWatcher.typesMod.JestHookSubscriber
import typingsSlinky.jestWatcher.typesMod.UsageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/plugins/update_snapshots_interactive", JSImport.Namespace)
@js.native
object updateSnapshotsInteractiveMod extends js.Object {
  
  @js.native
  trait UpdateSnapshotInteractivePlugin extends BaseWatchPlugin {
    
    var _failedSnapshotTestAssertions: js.Any = js.native
    
    var _snapshotInteractiveMode: js.Any = js.native
    
    @JSName("apply")
    def apply_MUpdateSnapshotInteractivePlugin(hooks: JestHookSubscriber): Unit = js.native
    
    def getFailedSnapshotTestAssertions(testResults: AggregatedResult): js.Array[AssertionLocation] = js.native
    
    @JSName("getUsageInfo")
    def getUsageInfo_MUpdateSnapshotInteractivePlugin(): UsageData | Null = js.native
    
    @JSName("isInternal")
    var isInternal_UpdateSnapshotInteractivePlugin: `true` = js.native
    
    @JSName("onKey")
    def onKey_MUpdateSnapshotInteractivePlugin(key: String): Unit = js.native
    
    @JSName("run")
    def run_MUpdateSnapshotInteractivePlugin(_globalConfig: GlobalConfig, updateConfigAndRun: js.Function): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default () extends UpdateSnapshotInteractivePlugin
}
