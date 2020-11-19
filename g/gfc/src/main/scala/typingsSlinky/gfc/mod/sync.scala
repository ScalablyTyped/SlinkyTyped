package typingsSlinky.gfc.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.childProcessMod.ExecSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gfc", "sync")
@js.native
object sync extends js.Object {
  
  def apply(): String | Buffer = js.native
  def apply(cwd: String): String | Buffer = js.native
  def apply(cwd: String, options: Options[ExecSyncOptions]): String | Buffer = js.native
  def apply(options: Options[ExecSyncOptions]): String | Buffer = js.native
}
