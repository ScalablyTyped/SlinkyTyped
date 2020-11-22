package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "lchown")
@js.native
object lchown extends js.Object {
  
  def apply(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def apply(path: PathLike, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
