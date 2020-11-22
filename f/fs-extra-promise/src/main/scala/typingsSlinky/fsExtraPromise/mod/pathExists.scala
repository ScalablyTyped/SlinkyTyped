package typingsSlinky.fsExtraPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "pathExists")
@js.native
object pathExists extends js.Object {
  
  def apply(path: String): js.Promise[Boolean] = js.native
  def apply(path: String, callback: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]): Unit = js.native
}
