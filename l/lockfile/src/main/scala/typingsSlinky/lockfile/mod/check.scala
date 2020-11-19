package typingsSlinky.lockfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lockfile", "check")
@js.native
object check extends js.Object {
  
  def apply(path: String, callback: js.Function2[/* err */ js.Error | Null, /* isLocked */ Boolean, Unit]): Unit = js.native
  def apply(
    path: String,
    opts: Options,
    callback: js.Function2[/* err */ js.Error | Null, /* isLocked */ Boolean, Unit]
  ): Unit = js.native
}
