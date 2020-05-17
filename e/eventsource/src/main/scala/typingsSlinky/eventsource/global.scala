package typingsSlinky.eventsource

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class MessageEvent protected ()
    extends typingsSlinky.eventsource.MessageEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: MessageEventInit) = this()
  }
  
  @js.native
  object MessageEvent
    extends Instantiable1[/* type */ String, typingsSlinky.eventsource.MessageEvent]
       with Instantiable2[
          /* type */ String, 
          /* eventInitDict */ MessageEventInit, 
          typingsSlinky.eventsource.MessageEvent
        ]
  
}

