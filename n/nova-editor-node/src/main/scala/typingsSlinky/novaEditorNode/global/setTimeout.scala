package typingsSlinky.novaEditorNode.global

import typingsSlinky.novaEditorNode.TimerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("setTimeout")
@js.native
object setTimeout extends js.Object {
  
  def apply(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
  def apply(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
}
