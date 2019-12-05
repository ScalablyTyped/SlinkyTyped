package typingsSlinky.debug

import typingsSlinky.debug.debugMod.Debug
import typingsSlinky.debug.debugMod.Debugger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Debug extends js.Object {
  @JSName("debug")
  var debug_Original: Debug = js.native
  @JSName("default")
  var default_Original: Debug = js.native
  def debug(namespace: String): Debugger = js.native
  def default(namespace: String): Debugger = js.native
}

