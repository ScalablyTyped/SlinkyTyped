package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.fileSystemMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passiveFileSystemMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/file-system/PassiveFileSystem", "createPassiveFileSystem")
  @js.native
  def createPassiveFileSystem(caseSensitive: js.UndefOr[scala.Nothing], realFileSystem: FileSystem): FileSystem = js.native
  /**
    * It's an implementation of FileSystem interface which reads from the real file system, but write to the in-memory file system.
    *
    * @param caseSensitive
    * @param realFileSystem
    */
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/file-system/PassiveFileSystem", "createPassiveFileSystem")
  @js.native
  def createPassiveFileSystem(caseSensitive: Boolean, realFileSystem: FileSystem): FileSystem = js.native
}
