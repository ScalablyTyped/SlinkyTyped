package typingsSlinky.bingmaps.global.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a traffic incident and flow data to the map.
  * @requires The Microsoft.Maps.Traffic module.
  */
@JSGlobal("Microsoft.Maps.Traffic")
@js.native
object Traffic extends js.Object {
  
  @js.native
  class TrafficManager protected ()
    extends typingsSlinky.bingmaps.Microsoft.Maps.Traffic.TrafficManager {
    /**
      * @constructor
      * @requires The Microsoft.Maps.Traffic module.
      * @param map A map instnce to attach the traffic manager to.
      */
    def this(map: typingsSlinky.bingmaps.Microsoft.Maps.Map) = this()
  }
}
