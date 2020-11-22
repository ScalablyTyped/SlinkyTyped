package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "link")
@js.native
object link extends js.Object {
  
  def apply(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  def apply(existingPath: PathLike, newPath: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
