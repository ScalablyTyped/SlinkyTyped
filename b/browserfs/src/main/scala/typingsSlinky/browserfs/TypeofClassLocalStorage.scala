package typingsSlinky.browserfs

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.browserfs.distNodeBackendLocalStorageMod.LocalStorageFileSystem
import typingsSlinky.browserfs.distNodeBackendLocalStorageMod.default
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassLocalStorage extends Instantiable0[default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a LocalStorageFileSystem instance.
    */
  def Create(options: js.Any, cb: BFSCallback[LocalStorageFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

