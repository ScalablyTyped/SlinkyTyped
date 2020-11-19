package typingsSlinky.fsPromise.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "fsync")
@js.native
object fsync extends js.Object {
  
  def apply(fd: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = js.native
}
