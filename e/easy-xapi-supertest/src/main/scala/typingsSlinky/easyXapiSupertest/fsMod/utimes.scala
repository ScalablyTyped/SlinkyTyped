package typingsSlinky.easyXapiSupertest.fsMod

import typingsSlinky.easyXapiSupertest.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "utimes")
@js.native
object utimes extends js.Object {
  
  def apply(path: String, atime: Double, mtime: Double): Unit = js.native
  def apply(
    path: String,
    atime: Double,
    mtime: Double,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  def apply(path: String, atime: js.Date, mtime: js.Date): Unit = js.native
  def apply(
    path: String,
    atime: js.Date,
    mtime: js.Date,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
}
