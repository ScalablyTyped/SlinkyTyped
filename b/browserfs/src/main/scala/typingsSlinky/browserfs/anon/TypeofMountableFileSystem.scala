package typingsSlinky.browserfs.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.browserfs.mountableFileSystemMod.MountableFileSystem
import typingsSlinky.browserfs.mountableFileSystemMod.MountableFileSystemOptions
import typingsSlinky.browserfs.mountableFileSystemMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMountableFileSystem extends Instantiable0[default] {
  
  /**
    * Creates a MountableFileSystem instance with the given options.
    */
  def Create(opts: MountableFileSystemOptions, cb: BFSCallback[MountableFileSystem]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
