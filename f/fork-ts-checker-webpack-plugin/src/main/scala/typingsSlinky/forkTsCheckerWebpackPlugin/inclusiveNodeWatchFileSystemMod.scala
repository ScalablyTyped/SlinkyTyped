package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.chokidar.mod.FSWatcher
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStateMod.ForkTsCheckerWebpackPluginState
import typingsSlinky.forkTsCheckerWebpackPlugin.watchFileSystemMod.WatchFileSystem
import typingsSlinky.forkTsCheckerWebpackPlugin.watchFileSystemMod.Watchpack
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/watch/InclusiveNodeWatchFileSystem", JSImport.Namespace)
@js.native
object inclusiveNodeWatchFileSystemMod extends js.Object {
  
  @js.native
  class InclusiveNodeWatchFileSystem protected () extends WatchFileSystem {
    def this(watchFileSystem: WatchFileSystem, pluginState: ForkTsCheckerWebpackPluginState) = this()
    
    val changedFiles: Set[String] = js.native
    
    val dirsWatchers: Map[String, js.UndefOr[FSWatcher]] = js.native
    
    var paused: js.Any = js.native
    
    var pluginState: js.Any = js.native
    
    val removedFiles: Set[String] = js.native
    
    var watchFileSystem: js.Any = js.native
    
    @JSName("watcher")
    def watcher_MInclusiveNodeWatchFileSystem: Watchpack = js.native
  }
}
