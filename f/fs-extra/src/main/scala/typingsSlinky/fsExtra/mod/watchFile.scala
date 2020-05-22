package typingsSlinky.fsExtra.mod

import typingsSlinky.node.anon.Interval
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "watchFile")
@js.native
object watchFile extends js.Object {
  def apply(
    filename: PathLike,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
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

