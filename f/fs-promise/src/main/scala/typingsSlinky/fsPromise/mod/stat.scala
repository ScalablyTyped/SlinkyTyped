package typingsSlinky.fsPromise.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "stat")
@js.native
object stat extends js.Object {
  def apply(path: String): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
  def apply(
    path: String,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typingsSlinky.node.fsMod.Stats, _]
  ): Unit = js.native
  def apply(path: Buffer): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
  def apply(
    path: Buffer,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typingsSlinky.node.fsMod.Stats, _]
  ): Unit = js.native
  def apply(path: PathLike): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typingsSlinky.node.fsMod.Stats, Unit]
  ): Unit = js.native
}

