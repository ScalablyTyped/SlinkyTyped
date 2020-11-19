package typingsSlinky.easyXapiSupertest.fsMod

import typingsSlinky.easyXapiSupertest.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "fchmod")
@js.native
object fchmod extends js.Object {
  
  def apply(fd: Double, mode: String): Unit = js.native
  def apply(fd: Double, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(fd: Double, mode: Double): Unit = js.native
  def apply(fd: Double, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
}
