package typingsSlinky.iitc

import typingsSlinky.leaflet.mod.LatLngBounds_
import typingsSlinky.leaflet.mod.LayerGroup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapDataDebugMod {
  
  @JSImport("iitc/core/map_data_debug", "RenderDebugTiles")
  @js.native
  class RenderDebugTiles () extends StObject {
    
    var CLEAR_CHECK_TIME: Double = js.native
    
    // = 0.1;
    var FADE_TIME: Double = js.native
    
    def create(id: String, bounds: LatLngBounds_): Unit = js.native
    
    //  = 1.0;
    var debugTileLayer: LayerGroup_[_] = js.native
    
    def reset(): Unit = js.native
    
    def runClearPass(): Unit = js.native
    
    def setColour(id: String, borercol: String, fillcol: String): Unit = js.native
    
    def setState(id: String, state: DebugTileState): Unit = js.native
    
    /**
      * @param waitTime in msec
      */
    def startTimer(waitTime: Double): Unit = js.native
    
    var timer: js.UndefOr[Double] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.iitc.iitcStrings.ok
    - typingsSlinky.iitc.iitcStrings.error
    - typingsSlinky.iitc.iitcStrings.`cache-fresh`
    - typingsSlinky.iitc.iitcStrings.`cache-stale`
    - typingsSlinky.iitc.iitcStrings.requested
    - typingsSlinky.iitc.iitcStrings.retrying
    - typingsSlinky.iitc.iitcStrings.`request-fail`
    - typingsSlinky.iitc.iitcStrings.`tile-fail`
    - typingsSlinky.iitc.iitcStrings.`tile-timeout`
    - typingsSlinky.iitc.iitcStrings.`render-queue`
  */
  trait DebugTileState extends StObject
  object DebugTileState {
    
    @scala.inline
    def `cache-fresh`: typingsSlinky.iitc.iitcStrings.`cache-fresh` = "cache-fresh".asInstanceOf[typingsSlinky.iitc.iitcStrings.`cache-fresh`]
    
    @scala.inline
    def `cache-stale`: typingsSlinky.iitc.iitcStrings.`cache-stale` = "cache-stale".asInstanceOf[typingsSlinky.iitc.iitcStrings.`cache-stale`]
    
    @scala.inline
    def error: typingsSlinky.iitc.iitcStrings.error = "error".asInstanceOf[typingsSlinky.iitc.iitcStrings.error]
    
    @scala.inline
    def ok: typingsSlinky.iitc.iitcStrings.ok = "ok".asInstanceOf[typingsSlinky.iitc.iitcStrings.ok]
    
    @scala.inline
    def `render-queue`: typingsSlinky.iitc.iitcStrings.`render-queue` = "render-queue".asInstanceOf[typingsSlinky.iitc.iitcStrings.`render-queue`]
    
    @scala.inline
    def `request-fail`: typingsSlinky.iitc.iitcStrings.`request-fail` = "request-fail".asInstanceOf[typingsSlinky.iitc.iitcStrings.`request-fail`]
    
    @scala.inline
    def requested: typingsSlinky.iitc.iitcStrings.requested = "requested".asInstanceOf[typingsSlinky.iitc.iitcStrings.requested]
    
    @scala.inline
    def retrying: typingsSlinky.iitc.iitcStrings.retrying = "retrying".asInstanceOf[typingsSlinky.iitc.iitcStrings.retrying]
    
    @scala.inline
    def `tile-fail`: typingsSlinky.iitc.iitcStrings.`tile-fail` = "tile-fail".asInstanceOf[typingsSlinky.iitc.iitcStrings.`tile-fail`]
    
    @scala.inline
    def `tile-timeout`: typingsSlinky.iitc.iitcStrings.`tile-timeout` = "tile-timeout".asInstanceOf[typingsSlinky.iitc.iitcStrings.`tile-timeout`]
  }
}
