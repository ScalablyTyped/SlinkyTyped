package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/file-system/FileSystem", JSImport.Namespace)
@js.native
object fileSystemMod extends js.Object {
  
  /**
    * Interface to abstract file system implementation details.
    */
  @js.native
  trait FileSystem extends js.Object {
    
    def clearCache(): Unit = js.native
    
    def createDir(path: String): Unit = js.native
    
    def deleteFile(path: String): Unit = js.native
    
    def exists(path: String): Boolean = js.native
    
    def normalizePath(path: String): String = js.native
    
    def readDir(path: String): js.Array[Dirent] = js.native
    
    def readFile(path: String): js.UndefOr[String] = js.native
    def readFile(path: String, encoding: String): js.UndefOr[String] = js.native
    
    def readStats(path: String): js.UndefOr[Stats] = js.native
    
    def realPath(path: String): String = js.native
    
    def updateTimes(path: String, atime: js.Date, mtime: js.Date): Unit = js.native
    
    def writeFile(path: String, data: String): Unit = js.native
  }
}
