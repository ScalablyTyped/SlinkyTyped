package typingsSlinky.openseadragon.mod

import typingsSlinky.std.Document_
import typingsSlinky.std.EventSource
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "TileSource")
@js.native
class TileSource protected () extends EventSource {
  def this(options: TileSourceOptions) = this()
  var aspectRatio: Double = js.native
  var dimensions: Point = js.native
  var maxLevel: Double = js.native
  var minlevel: Double = js.native
  var ready: Boolean = js.native
  var tileOverlap: Double = js.native
  def addHandler(eventName: String, handler: EventHandler[TileSourceEvent]): Unit = js.native
  def addHandler(eventName: String, handler: EventHandler[TileSourceEvent], userData: js.Object): Unit = js.native
  def addOnceHandler(eventName: String, handler: EventHandler[TileSourceEvent]): Unit = js.native
  def addOnceHandler(eventName: String, handler: EventHandler[TileSourceEvent], userData: js.Object): Unit = js.native
  def addOnceHandler(eventName: String, handler: EventHandler[TileSourceEvent], userData: js.Object, times: Double): Unit = js.native
  def configure(data: String): js.Object = js.native
  def configure(data: js.Array[_]): js.Object = js.native
  def configure(data: js.Object): js.Object = js.native
  def configure(data: Document_): js.Object = js.native
  def getClosestLevel(): Double = js.native
  def getHandler(eventName: String): js.Function1[/* event */ Event_, Unit] = js.native
  def getImageInfo(url: String): Unit = js.native
  def getLevelScale(level: Double): Double = js.native
  def getNumTiles(level: Double): Double = js.native
  def getPixelRatio(level: Double): Double = js.native
  def getTileAjaxHeaders(level: Double, x: Double, y: Double): js.Object = js.native
  def getTileAtPoint(level: Double, point: Point): Tile = js.native
  def getTileBounds(level: Double, x: Double, y: Double): Rect = js.native
  def getTileBounds(level: Double, x: Double, y: Double, isSource: Boolean): Rect = js.native
  def getTileHeight(level: Double): Double = js.native
  def getTileUrl(level: Double, x: Double, y: Double): String = js.native
  def getTileWidth(level: Double): Double = js.native
  def raiseEvent(eventName: String, eventArgs: js.Object): Unit = js.native
  def removeAllHandlers(eventName: String): Unit = js.native
  def removeHandler(eventName: String, handler: js.Function1[/* event */ Event_, Unit]): Unit = js.native
  def supports(data: String, url: String): Boolean = js.native
  def supports(data: js.Array[_], url: String): Boolean = js.native
  def supports(data: js.Object, url: String): Boolean = js.native
  def supports(data: Document_, url: String): Boolean = js.native
  def tileExists(level: Double, x: Double, y: Double): Boolean = js.native
}

