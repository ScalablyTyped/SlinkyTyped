package typingsSlinky.electron.originalFsMod

import typingsSlinky.node.anon.Interval
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "watchFile")
@js.native
object watchFile extends js.Object {
  /**
    * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(
    filename: PathLike,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
    */
  def apply(
    filename: PathLike,
    options: js.UndefOr[Interval],
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
}

