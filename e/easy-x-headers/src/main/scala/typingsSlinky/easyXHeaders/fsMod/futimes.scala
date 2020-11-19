package typingsSlinky.easyXHeaders.fsMod

import typingsSlinky.easyXHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "futimes")
@js.native
object futimes extends js.Object {
  
  def apply(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def apply(
    fd: Double,
    atime: Double,
    mtime: Double,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  def apply(fd: Double, atime: js.Date, mtime: js.Date): Unit = js.native
  def apply(
    fd: Double,
    atime: js.Date,
    mtime: js.Date,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
}
