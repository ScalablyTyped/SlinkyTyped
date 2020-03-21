package typingsSlinky.browserfs.browserfsMod

import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/browserfs", "getFileSystem")
@js.native
object getFileSystem extends js.Object {
  def apply(config: FileSystemConfiguration, cb: BFSCallback[typingsSlinky.browserfs.fileSystemMod.FileSystem]): Unit = js.native
}

