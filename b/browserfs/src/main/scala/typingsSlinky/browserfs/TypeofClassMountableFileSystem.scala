package typingsSlinky.browserfs

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.browserfs.distNodeBackendMountableFileSystemMod.MountableFileSystem
import typingsSlinky.browserfs.distNodeBackendMountableFileSystemMod.MountableFileSystemOptions
import typingsSlinky.browserfs.distNodeBackendMountableFileSystemMod.default
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassMountableFileSystem extends Instantiable0[default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a MountableFileSystem instance with the given options.
    */
  def Create(opts: MountableFileSystemOptions, cb: BFSCallback[MountableFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

