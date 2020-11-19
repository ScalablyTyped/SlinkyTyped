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
    
    var frameState: FrameState = js.native
    
    var map: typingsSlinky.ol.pluggableMapMod.default = js.native
  }
  
  @js.native
  class default protected () extends MapEvent {
    def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default) = this()
    def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
  }
}
