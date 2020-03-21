package typingsSlinky.browserfs.utilMod

import typingsSlinky.browserfs.fileSystemMod.BFSOneArgCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/util", "checkOptions")
@js.native
object checkOptions extends js.Object {
  def apply(fsType: FileSystemConstructor, opts: js.Any, cb: BFSOneArgCallback): Unit = js.native
}

