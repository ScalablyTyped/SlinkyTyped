package typingsSlinky.fsPromise.mod

import typingsSlinky.fsExtra.mod.Mode
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "chmod")
@js.native
object chmod extends js.Object {
  
  def apply(path: PathLike, mode: String): js.Promise[Unit] = js.native
  def apply(path: PathLike, mode: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  def apply(path: PathLike, mode: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
  def apply(path: PathLike, mode: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
