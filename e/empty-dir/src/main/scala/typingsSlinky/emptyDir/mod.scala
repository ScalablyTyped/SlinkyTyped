package typingsSlinky.emptyDir

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("empty-dir", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(dir: String): js.Promise[Boolean] = js.native
  def apply(dir: String, cb: js.Function2[/* err */ ErrnoException, /* isEmpty */ Boolean, Unit]): Unit = js.native
  def apply(dir: String, filter: js.Function1[/* path */ String, Boolean]): js.Promise[Boolean] = js.native
  def apply(
    dir: String,
    filter: js.Function1[/* path */ String, Boolean],
    cb: js.Function2[/* err */ ErrnoException, /* isEmpty */ Boolean, Unit]
  ): Unit = js.native
  
  def sync(dir: String): Boolean = js.native
  def sync(dir: String, filter: js.Function1[/* path */ String, Boolean]): Boolean = js.native
}
