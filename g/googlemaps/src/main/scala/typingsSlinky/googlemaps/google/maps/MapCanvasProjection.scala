package typingsSlinky.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: replace to interface https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapCanvasProjection
@js.native
trait MapCanvasProjection extends MVCObject {
  
  def fromContainerPixelToLatLng(pixel: Point): LatLng = js.native
  def fromContainerPixelToLatLng(pixel: Point, nowrap: Boolean): LatLng = js.native
  
  def fromDivPixelToLatLng(pixel: Point): LatLng = js.native
  def fromDivPixelToLatLng(pixel: Point, nowrap: Boolean): LatLng = js.native
  
  def fromLatLngToContainerPixel(latLng: LatLng): Point = js.native
  
  def fromLatLngToDivPixel(latLng: LatLng): Point = js.native
  
  def getWorldWidth(): Double = js.native
}
