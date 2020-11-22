package typingsSlinky.fsExtra.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "rename")
@js.native
object rename extends js.Object {
  
  def apply(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  def apply(oldPath: PathLike, newPath: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
