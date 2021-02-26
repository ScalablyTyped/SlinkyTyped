package typingsSlinky.ol

import typingsSlinky.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapEventMod {
  
  @JSImport("ol/MapEvent", JSImport.Default)
  @js.native
  class default protected () extends MapEvent {
    def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default) = this()
    def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
  }
  
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
}
