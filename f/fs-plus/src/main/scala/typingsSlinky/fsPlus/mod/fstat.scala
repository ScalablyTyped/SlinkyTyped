package typingsSlinky.fsPlus.mod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "fstat")
@js.native
object fstat extends js.Object {
  def apply(
    fd: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typingsSlinky.node.fsMod.Stats, Unit]
  ): Unit = js.native
  /**
    * Asynchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  @JSName("__promisify__")
  def promisify(fd: Double): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
}

