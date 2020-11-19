package typingsSlinky.rotJs.uniformMod

import typingsSlinky.rotJs.featuresMod.Room
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uniform
  extends typingsSlinky.rotJs.dungeonMod.default {
  
  def _canBeDugCallback(x: Double, y: Double): Boolean = js.native
  
  /**
    * For a given room, find the closest one from the list
    */
  def _closestRoom(rooms: js.Array[Room], room: Room): Room | Null = js.native
  
  def _connectRooms(room1: Room, room2: Room): Boolean = js.native
  
  var _connected: js.Array[Room] = js.native
  
  var _corridorAttempts: Double = js.native
  
  def _digCallback(x: Double, y: Double, value: Double): Unit = js.native
  
  /**
    * Dig a polyline.
    */
  def _digLine(points: js.Array[Point]): Unit = js.native
  
  var _dug: Double = js.native
  
  /**
    * Generates connectors beween rooms
    * @returns {bool} success Was this attempt successfull?
    */
  def _generateCorridors(): Boolean = js.native
  
  /**
    * Try to generate one room
    */
  def _generateRoom(): Room | Null = js.native
  
  /**
    * Generates a suitable amount of rooms
    */
  def _generateRooms(): Unit = js.native
  
  def _isWallCallback(x: Double, y: Double): Boolean = js.native
  
  var _map: js.Array[js.Array[Double]] = js.native
  
  var _options: Options = js.native
  
  def _placeInWall(room: Room, dirIndex: Double): Point | Null = js.native
  
  var _roomAttempts: Double = js.native
  
  var _unconnected: js.Array[Room] = js.native
}
