package typingsSlinky.jqueryFocusExit.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery_.TriggeredEvent
import typingsSlinky.jqueryFocusExit.AnonDebug
import typingsSlinky.jqueryFocusExit.jqueryFocusExitStrings.focusExit
import typingsSlinky.jqueryFocusExit.jqueryFocusExitStrings.focusin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait JQuery extends js.Object {
    def focusExit(): JQuery = js.native
    def focusExit(options: AnonDebug): JQuery = js.native
    @JSName("on")
    def on_focusExit(
      event: focusExit,
      handler: js.Function2[/* event */ TriggeredEvent[HTMLElement, _, _, _], /* data */ FocusElements, Unit]
    ): JQuery = js.native
    @JSName("one")
    def one_focusin(event: focusin, handler: js.Function1[/* event */ TriggeredEvent[HTMLElement, _, _, _], Unit]): JQuery = js.native
  }
  
}

