package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileQueueMod {
  
  @JSImport("ol/TileQueue", JSImport.Default)
  @js.native
  class default protected () extends TileQueue {
    def this(tilePriorityFunction: PriorityFunction, tileChangeCallback: js.Function0[_]) = this()
  }
  
  @JSImport("ol/TileQueue", "getTilePriority")
  @js.native
  def getTilePriority(
    frameState: FrameState,
    tile: typingsSlinky.ol.olTileMod.default,
    tileSourceKey: String,
    tileCenter: Coordinate,
    tileResolution: Double
  ): Double = js.native
  
  type PriorityFunction = js.Function4[
    /* p0 */ typingsSlinky.ol.olTileMod.default, 
    /* p1 */ String, 
    /* p2 */ Coordinate, 
    /* p3 */ Double, 
    Double
  ]
  
  @js.native
  trait TileQueue
    extends typingsSlinky.ol.priorityQueueMod.default[js.Any] {
    
    def enqueue(element: js.Array[_]): Boolean = js.native
    
    def getTilesLoading(): Double = js.native
    
    /* protected */ def handleTileChange(event: typingsSlinky.ol.eventMod.default): Unit = js.native
    
    def loadMoreTiles(maxTotalLoading: Double, maxNewLoads: Double): Unit = js.native
  }
}
