package typingsSlinky.chownr.mod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chownr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: PathLike, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}

