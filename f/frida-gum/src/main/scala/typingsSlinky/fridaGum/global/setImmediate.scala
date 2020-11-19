package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.ImmediateId
import typingsSlinky.fridaGum.ScheduledCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("setImmediate")
@js.native
object setImmediate extends js.Object {
  
  /**
    * Schedules `func` to be called on Frida's JavaScript thread, optionally passing it the provided params.
    * Returns an id that can be passed to clearImmediate() to cancel it.
    */
  def apply(func: ScheduledCallback, params: js.Any*): ImmediateId = js.native
}
