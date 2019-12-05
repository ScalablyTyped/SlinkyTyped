package typingsSlinky.easyDashXDashHeaders

import typingsSlinky.easyDashXDashHeaders.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  @js.native
  class EventEmitter ()
    extends typingsSlinky.easyDashXDashHeaders.NodeJS.EventEmitter
  
  /* static members */
  @js.native
  object EventEmitter extends js.Object {
    def listenerCount(emitter: EventEmitter, event: String): Double = js.native
  }
  
}

