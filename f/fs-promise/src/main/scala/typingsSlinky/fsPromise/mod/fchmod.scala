package typingsSlinky.fsPromise.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "fchmod")
@js.native
object fchmod extends js.Object {
  
  def apply(fd: Double, mode: String): js.Promise[Unit] = js.native
  def apply(
    fd: Double,
    mode: String,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
  def apply(fd: Double, mode: Double): js.Promise[Unit] = js.native
  def apply(
    fd: Double,
    mode: Double,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
}
