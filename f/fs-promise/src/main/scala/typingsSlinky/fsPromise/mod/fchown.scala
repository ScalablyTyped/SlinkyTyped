package typingsSlinky.fsPromise.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "fchown")
@js.native
object fchown extends js.Object {
  def apply(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def apply(
    fd: Double,
    uid: Double,
    gid: Double,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
}

