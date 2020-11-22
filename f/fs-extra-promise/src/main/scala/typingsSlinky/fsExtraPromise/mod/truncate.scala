package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "truncate")
@js.native
object truncate extends js.Object {
  
  def apply(path: PathLike): js.Promise[Unit] = js.native
  def apply(path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: PathLike, len: Double): js.Promise[Unit] = js.native
  def apply(path: PathLike, len: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
