package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "readlink")
@js.native
object readlink extends js.Object {
  
  def apply(path: PathLike): js.Promise[String] = js.native
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
}
