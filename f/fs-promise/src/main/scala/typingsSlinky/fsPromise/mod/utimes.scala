package typingsSlinky.fsPromise.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "utimes")
@js.native
object utimes extends js.Object {
  
  def apply(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
  def apply(path: PathLike, atime: String, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
  def apply(path: PathLike, atime: String, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: js.Date): js.Promise[Unit] = js.native
  def apply(path: PathLike, atime: String, mtime: js.Date, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def apply(
    path: PathLike,
    atime: Double,
    mtime: Double,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: js.Date, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: js.Date, mtime: String): js.Promise[Unit] = js.native
  def apply(path: PathLike, atime: js.Date, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
  def apply(path: PathLike, atime: js.Date, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
  def apply(
    path: PathLike,
    atime: js.Date,
    mtime: js.Date,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
}
