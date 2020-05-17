package typingsSlinky.hexoFs.mod

import typingsSlinky.hexoFs.anon.AutoClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "ensureWriteStream")
@js.native
object ensureWriteStream extends js.Object {
  def apply(path: String): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
  def apply(
    path: String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typingsSlinky.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
  def apply(path: String, options: String): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
  def apply(
    path: String,
    options: String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typingsSlinky.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
  def apply(path: String, options: AutoClose): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
  def apply(
    path: String,
    options: AutoClose,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typingsSlinky.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.WriteStream] = js.native
}

