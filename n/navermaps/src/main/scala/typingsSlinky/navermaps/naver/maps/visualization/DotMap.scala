package typingsSlinky.navermaps.naver.maps.visualization

import typingsSlinky.navermaps.naver.maps.KVO
import typingsSlinky.navermaps.naver.maps.Map
import typingsSlinky.navermaps.naver.maps.MapEventListener
import typingsSlinky.navermaps.naver.maps.drawing.DrawingEvent
import typingsSlinky.navermaps.naver.maps.drawing.DrawingMode
import typingsSlinky.navermaps.naver.maps.drawing.DrawingOverlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DotMap extends KVO {
  
  def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode): Unit = js.native
  def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode, id: String): Unit = js.native
  
  def addListener(eventName: DrawingEvent, listener: js.Function1[/* overlay */ DrawingOverlay, Unit]): MapEventListener = js.native
  
  def destroy(): Unit = js.native
  
  def getDrawing(id: String): DrawingOverlay = js.native
  
  def getDrawings(): js.Any = js.native
  
  def getMap(): Map | Null = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def toGeoJson(): js.Any = js.native
}
