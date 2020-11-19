package typingsSlinky.nodeDir.mod

import typingsSlinky.nodeDir.anon.Sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-dir", "files")
@js.native
object files extends js.Object {
  
  def apply(dir: String, callback: js.Function2[/* error */ js.Any, /* files */ js.Array[String], Unit]): Unit = js.native
  def apply(dir: String, syncOption: Sync): js.Array[String] = js.native
}
