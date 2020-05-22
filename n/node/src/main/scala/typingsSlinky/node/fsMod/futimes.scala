package typingsSlinky.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "futimes")
@js.native
object futimes extends js.Object {
  def apply(fd: Double, atime: String, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: String, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: String, mtime: js.Date, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: js.Date, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: js.Date, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: js.Date, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: js.Date, mtime: js.Date, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  @JSName("__promisify__")
  def promisify(fd: Double, atime: String, mtime: String): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, atime: String, mtime: Double): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, atime: String, mtime: js.Date): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, atime: Double, mtime: String): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, atime: js.Date, mtime: String): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
}

