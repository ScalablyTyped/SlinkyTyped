package typingsSlinky.fsPromise.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.RmDirAsyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "rmdir")
@js.native
object rmdir extends js.Object {
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer): js.Promise[Unit] = js.native
  def apply(path: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: PathLike): js.Promise[Unit] = js.native
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, options: RmDirAsyncOptions): js.Promise[Unit] = js.native
  def apply(path: PathLike, options: RmDirAsyncOptions, callback: NoParamCallback): Unit = js.native
}

