package typingsSlinky.fsExtra.mod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "futimes")
@js.native
object futimes extends js.Object {
  
  def apply(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: Double, mtime: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(fd: Double, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: js.Date, mtime: js.Date, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
