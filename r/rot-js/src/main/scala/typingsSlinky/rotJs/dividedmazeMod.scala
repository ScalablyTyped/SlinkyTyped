package typingsSlinky.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividedmazeMod {
  
  @JSImport("rot-js/lib/map/dividedmaze", JSImport.Default)
  @js.native
  class default () extends DividedMaze
  
  @js.native
  trait DividedMaze
    extends typingsSlinky.rotJs.mapMapMod.default {
    
    var _map: js.Array[js.Array[Double]] = js.native
    
    def _partitionRoom(room: Room): Unit = js.native
    
    def _process(): Unit = js.native
    
    var _stack: js.Array[Room] = js.native
  }
  
  type Room = js.Tuple4[Double, Double, Double, Double]
}
