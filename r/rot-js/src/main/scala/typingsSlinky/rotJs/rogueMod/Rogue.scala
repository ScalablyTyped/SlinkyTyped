package typingsSlinky.rotJs.rogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rogue
  extends typingsSlinky.rotJs.mapMapMod.default {
  
  def _calculateRoomSize(size: Double, cell: Double): js.Tuple2[Double, Double] = js.native
  
  def _connectRooms(): Unit = js.native
  
  def _connectUnconnectedRooms(): Unit = js.native
  
  def _createCorridors(): Unit = js.native
  
  def _createRandomRoomConnections(): Unit = js.native
  
  def _createRooms(): Unit = js.native
  
  def _drawCorridor(startPosition: Point, endPosition: Point): Unit = js.native
  
  def _getWallPosition(aRoom: Room, aDirection: Double): Point = js.native
  
  def _initRooms(): Unit = js.native
  
  var _options: js.Any = js.native
  
  var connectedCells: js.Any = js.native
  
  var map: js.Any = js.native
  
  var rooms: js.Any = js.native
}
