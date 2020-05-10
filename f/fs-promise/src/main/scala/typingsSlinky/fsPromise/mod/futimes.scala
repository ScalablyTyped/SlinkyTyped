package typingsSlinky.fsPromise.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "futimes")
@js.native
object futimes extends js.Object {
  def apply(fd: Double, atime: String, mtime: String): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: String, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: String, mtime: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: String, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: String, mtime: js.Date): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: String, mtime: js.Date, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: String): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: Double, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def apply(
    fd: Double,
    atime: Double,
    mtime: Double,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: Double, mtime: js.Date, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: js.Date, mtime: String): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: js.Date, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: js.Date, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
  def apply(
    fd: Double,
    atime: js.Date,
    mtime: js.Date,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
}

