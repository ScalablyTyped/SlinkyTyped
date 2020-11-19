package typingsSlinky.aos.mod

import typingsSlinky.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait Document extends js.Object {
    
    def addEventListener(`type`: AosEventType, listener: js.Function1[/* event */ AosEvent, Unit]): Unit = js.native
    def addEventListener(`type`: AosEventType, listener: js.Function1[/* event */ AosEvent, Unit], options: Boolean): Unit = js.native
    def addEventListener(
      `type`: AosEventType,
      listener: js.Function1[/* event */ AosEvent, Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
  }
}
