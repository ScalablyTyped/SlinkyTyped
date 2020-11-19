package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "readlink")
@js.native
object readlink extends js.Object {
  
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
  def apply(path: Buffer): js.Promise[String] = js.native
  def apply(path: Buffer, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
}
