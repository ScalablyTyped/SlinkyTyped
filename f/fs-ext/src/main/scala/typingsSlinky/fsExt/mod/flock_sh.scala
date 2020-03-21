package typingsSlinky.fsExt.mod

import typingsSlinky.fsExt.fsExtStrings.sh
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-ext", "flock")
@js.native
object flock_sh extends js.Object {
  def apply(fd: Double, flags: sh, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
}

