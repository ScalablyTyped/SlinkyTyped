package typingsSlinky.fsPromise.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "truncate")
@js.native
object truncate extends js.Object {
  
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: String, len: Double): js.Promise[Unit] = js.native
  def apply(path: String, len: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer): js.Promise[Unit] = js.native
  def apply(path: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer, len: Double): js.Promise[Unit] = js.native
  def apply(path: Buffer, len: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: PathLike): js.Promise[Unit] = js.native
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, len: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, len: Double): js.Promise[Unit] = js.native
  def apply(path: PathLike, len: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, len: Null, callback: NoParamCallback): Unit = js.native
}
