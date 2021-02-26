package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.anon.Typeofts
import typingsSlinky.typescript.mod.DirectoryWatcherCallback
import typingsSlinky.typescript.mod.FileWatcher
import typingsSlinky.typescript.mod.FileWatcherCallback
import typingsSlinky.typescript.mod.System
import typingsSlinky.typescript.mod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlledTypeScriptSystemMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/ControlledTypeScriptSystem", "createControlledTypeScriptSystem")
  @js.native
  def createControlledTypeScriptSystem(typescript: Typeofts): ControlledTypeScriptSystem = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/ControlledTypeScriptSystem", "createControlledTypeScriptSystem")
  @js.native
  def createControlledTypeScriptSystem(typescript: Typeofts, mode: FileSystemMode): ControlledTypeScriptSystem = js.native
  
  @js.native
  trait ControlledTypeScriptSystem extends System {
    
    def clearCache(): Unit = js.native
    
    @JSName("clearTimeout")
    def clearTimeout_MControlledTypeScriptSystem(timeoutId: js.Any): Unit = js.native
    
    @JSName("deleteFile")
    def deleteFile_MControlledTypeScriptSystem(path: String): Unit = js.native
    
    @JSName("getFileSize")
    def getFileSize_MControlledTypeScriptSystem(path: String): Double = js.native
    
    @JSName("getModifiedTime")
    def getModifiedTime_MControlledTypeScriptSystem(path: String): js.UndefOr[js.Date] = js.native
    
    def invokeFileChanged(path: String): Unit = js.native
    
    def invokeFileCreated(path: String): Unit = js.native
    
    def invokeFileDeleted(path: String): Unit = js.native
    
    @JSName("setModifiedTime")
    def setModifiedTime_MControlledTypeScriptSystem(path: String, time: js.Date): Unit = js.native
    
    @JSName("setTimeout")
    def setTimeout_MControlledTypeScriptSystem(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): js.Any = js.native
    
    def waitForQueued(): js.Promise[Unit] = js.native
    
    @JSName("watchDirectory")
    def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
    @JSName("watchDirectory")
    def watchDirectory_MControlledTypeScriptSystem(
      path: String,
      callback: DirectoryWatcherCallback,
      recursive: js.UndefOr[scala.Nothing],
      options: WatchOptions
    ): FileWatcher = js.native
    @JSName("watchDirectory")
    def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
    @JSName("watchDirectory")
    def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: WatchOptions): FileWatcher = js.native
    
    @JSName("watchFile")
    def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback): FileWatcher = js.native
    @JSName("watchFile")
    def watchFile_MControlledTypeScriptSystem(
      path: String,
      callback: FileWatcherCallback,
      pollingInterval: js.UndefOr[scala.Nothing],
      options: WatchOptions
    ): FileWatcher = js.native
    @JSName("watchFile")
    def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
    @JSName("watchFile")
    def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: WatchOptions): FileWatcher = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.readonly
    - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-tsbuildinfo`
    - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-references`
  */
  trait FileSystemMode extends StObject
  object FileSystemMode {
    
    @scala.inline
    def readonly: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.readonly = "readonly".asInstanceOf[typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.readonly]
    
    @scala.inline
    def `write-references`: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-references` = "write-references".asInstanceOf[typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-references`]
    
    @scala.inline
    def `write-tsbuildinfo`: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-tsbuildinfo` = "write-tsbuildinfo".asInstanceOf[typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-tsbuildinfo`]
  }
}
