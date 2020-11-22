package typingsSlinky.ol

import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/MapEvent", JSImport.Namespace)
@js.native
object mapEventMod extends js.Object {
  
  @js.native
  trait MapEvent
    extends typingsSlinky.ol.eventMod.default {
    
    /**
      * The frame state at the time of the event.
      */
    var frameState: FrameState = js.native
    
    /**
      * The map where the event occurred.
      */
    var map: typingsSlinky.ol.pluggableMapMod.default = js.native
  }
  
  @js.native
  class default protected () extends MapEvent {
    def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default) = this()
    def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
  }
}
