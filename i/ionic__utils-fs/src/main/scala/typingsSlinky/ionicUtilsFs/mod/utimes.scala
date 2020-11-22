package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "utimes")
@js.native
object utimes extends js.Object {
  
  def apply(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def apply(
    path: PathLike,
    atime: Double,
    mtime: Double,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(path: PathLike, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
  def apply(
    path: PathLike,
    atime: js.Date,
    mtime: js.Date,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}
