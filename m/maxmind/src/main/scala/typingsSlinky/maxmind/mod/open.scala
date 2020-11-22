package typingsSlinky.maxmind.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maxmind", "open")
@js.native
object open extends js.Object {
  
  def apply[T](filepath: String): js.Promise[typingsSlinky.mmdbLib.mod.default[T]] = js.native
  def apply[T](filepath: String, opts: js.UndefOr[scala.Nothing], cb: Callback): js.Promise[typingsSlinky.mmdbLib.mod.default[T]] = js.native
  def apply[T](filepath: String, opts: OpenOpts): js.Promise[typingsSlinky.mmdbLib.mod.default[T]] = js.native
  def apply[T](filepath: String, opts: OpenOpts, cb: Callback): js.Promise[typingsSlinky.mmdbLib.mod.default[T]] = js.native
}
