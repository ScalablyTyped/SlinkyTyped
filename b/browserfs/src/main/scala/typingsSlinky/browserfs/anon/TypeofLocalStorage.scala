package typingsSlinky.browserfs.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.browserfs.localStorageMod.LocalStorageFileSystem
import typingsSlinky.browserfs.localStorageMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLocalStorage extends Instantiable0[default] {
  
  /**
    * Creates a LocalStorageFileSystem instance.
    */
  def Create(options: js.Any, cb: BFSCallback[LocalStorageFileSystem]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
