package typingsSlinky.offlineJs

import org.scalajs.dom.raw.Event
import typingsSlinky.offlineJs.offlineJsStrings.`confirmed-down`
import typingsSlinky.offlineJs.offlineJsStrings.`confirmed-up`
import typingsSlinky.offlineJs.offlineJsStrings.checking
import typingsSlinky.offlineJs.offlineJsStrings.down
import typingsSlinky.offlineJs.offlineJsStrings.reconnectColonconnecting
import typingsSlinky.offlineJs.offlineJsStrings.reconnectColonfailure
import typingsSlinky.offlineJs.offlineJsStrings.reconnectColonstarted
import typingsSlinky.offlineJs.offlineJsStrings.reconnectColonstopped
import typingsSlinky.offlineJs.offlineJsStrings.reconnectColontick
import typingsSlinky.offlineJs.offlineJsStrings.requestsColonflush
import typingsSlinky.offlineJs.offlineJsStrings.requestsColonhold
import typingsSlinky.offlineJs.offlineJsStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Offline extends js.Object {
    
    def check(): Unit = js.native
    
    def off(event: String): Unit = js.native
    def off(event: String, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("off")
    def off_checking(event: checking): Unit = js.native
    @JSName("off")
    def off_checking(event: checking, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("off")
    def off_confirmeddown(event: `confirmed-down`): Unit = js.native
    @JSName("off")
    def off_confirmeddown(event: `confirmed-down`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("off")
    def off_confirmedup(event: `confirmed-up`): Unit = js.native
    @JSName("off")
    def off_confirmedup(event: `confirmed-up`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("off")
    def off_down(event: down): Unit = js.native
    @JSName("off")
    def off_down(event: down, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("off")
    def off_reconnectconnecting(event: reconnectColonconnecting): Unit = js.native
    @JSName("off")
    def off_reconnectconnecting(event: reconnectColonconnecting, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("off")
    def off_reconnectfailure(event: reconnectColonfailure): Unit = js.native
    @JSName("off")
    def off_reconnectfailure(event: reconnectColonfailure, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("off")
    def off_reconnectstarted(event: reconnectColonstarted): Unit = js.native
    @JSName("off")
    def off_reconnectstarted(event: reconnectColonstarted, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("off")
    def off_reconnectstopped(event: reconnectColonstopped): Unit = js.native
    @JSName("off")
    def off_reconnectstopped(event: reconnectColonstopped, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("off")
    def off_reconnecttick(event: reconnectColontick): Unit = js.native
    @JSName("off")
    def off_reconnecttick(event: reconnectColontick, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("off")
    def off_requestsflush(event: requestsColonflush): Unit = js.native
    @JSName("off")
    def off_requestsflush(event: requestsColonflush, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("off")
    def off_requestshold(event: requestsColonhold): Unit = js.native
    @JSName("off")
    def off_requestshold(event: requestsColonhold, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("off")
    def off_up(event: up): Unit = js.native
    @JSName("off")
    def off_up(event: up, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    
    def on(event: String, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    def on(event: String, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    @JSName("on")
    def on_checking(event: checking, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("on")
    def on_checking(event: checking, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    @JSName("on")
    def on_confirmeddown(event: `confirmed-down`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("on")
    def on_confirmeddown(event: `confirmed-down`, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    @JSName("on")
    def on_confirmedup(event: `confirmed-up`, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("on")
    def on_confirmedup(event: `confirmed-up`, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    @JSName("on")
    def on_down(event: down, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("on")
    def on_down(event: down, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    @JSName("on")
    def on_reconnectconnecting(event: reconnectColonconnecting, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("on")
    def on_reconnectconnecting(event: reconnectColonconnecting, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    @JSName("on")
    def on_reconnectfailure(event: reconnectColonfailure, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("on")
    def on_reconnectfailure(event: reconnectColonfailure, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    @JSName("on")
    def on_reconnectstarted(event: reconnectColonstarted, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("on")
    def on_reconnectstarted(event: reconnectColonstarted, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    @JSName("on")
    def on_reconnectstopped(event: reconnectColonstopped, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("on")
    def on_reconnectstopped(event: reconnectColonstopped, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    @JSName("on")
    def on_reconnecttick(event: reconnectColontick, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("on")
    def on_reconnecttick(event: reconnectColontick, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    @JSName("on")
    def on_requestsflush(event: requestsColonflush, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("on")
    def on_requestsflush(event: requestsColonflush, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    @JSName("on")
    def on_requestshold(event: requestsColonhold, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("on")
    def on_requestshold(event: requestsColonhold, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    @JSName("on")
    def on_up(event: up, handler: js.Function1[/* e */ Event, _]): Unit = js.native
    @JSName("on")
    def on_up(event: up, handler: js.Function1[/* e */ Event, _], context: js.Any): Unit = js.native
    
    var options: OfflineOptions = js.native
    
    var state: String = js.native
  }
}
