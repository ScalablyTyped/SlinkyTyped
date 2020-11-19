package typingsSlinky.fsPromise.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "chown")
@js.native
object chown extends js.Object {
  
  def apply(path: String, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def apply(path: String, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def apply(path: Buffer, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def apply(path: PathLike, uid: Double, gid: Double, callback: NoParamCallback): Unit = js.native
}
