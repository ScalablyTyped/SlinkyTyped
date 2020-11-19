package typingsSlinky.lockfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lockfile", "lock")
@js.native
object lock extends js.Object {
  
  def apply(path: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  def apply(path: String, opts: Options, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
}
