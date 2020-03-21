package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.ionicUtilsFs.ionicUtilsFsStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.FSWatcher
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "watch")
@js.native
object watch_buffer extends js.Object {
  def apply(filename: PathLike, options: buffer): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
}

