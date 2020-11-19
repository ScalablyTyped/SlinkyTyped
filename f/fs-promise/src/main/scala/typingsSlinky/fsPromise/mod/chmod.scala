package typingsSlinky.fsPromise.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "chmod")
@js.native
object chmod extends js.Object {
  
  def apply(path: String, mode: String): js.Promise[Unit] = js.native
  def apply(path: String, mode: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: String, mode: Double): js.Promise[Unit] = js.native
  def apply(path: String, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer, mode: String): js.Promise[Unit] = js.native
  def apply(path: Buffer, mode: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer, mode: Double): js.Promise[Unit] = js.native
  def apply(path: Buffer, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: PathLike, mode: String): js.Promise[Unit] = js.native
  def apply(path: PathLike, mode: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  def apply(path: PathLike, mode: Double, callback: NoParamCallback): Unit = js.native
}
