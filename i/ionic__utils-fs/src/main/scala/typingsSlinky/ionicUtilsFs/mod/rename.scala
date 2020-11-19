package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "rename")
@js.native
object rename extends js.Object {
  
  def apply(oldPath: String, newPath: String): js.Promise[Unit] = js.native
  def apply(oldPath: String, newPath: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
