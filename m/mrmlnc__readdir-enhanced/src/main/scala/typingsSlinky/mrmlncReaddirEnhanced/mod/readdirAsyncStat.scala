package typingsSlinky.mrmlncReaddirEnhanced.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mrmlnc/readdir-enhanced", "readdirAsyncStat")
@js.native
object readdirAsyncStat extends js.Object {
  
  def apply(root: String): js.Promise[js.Array[Entry]] = js.native
  def apply(root: String, callback: CallbackEntry): Unit = js.native
  def apply(root: String, options: Options): js.Promise[js.Array[Entry]] = js.native
  def apply(root: String, options: Options, callback: CallbackEntry): Unit = js.native
}
