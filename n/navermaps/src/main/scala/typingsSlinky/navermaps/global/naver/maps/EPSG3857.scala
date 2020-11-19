package typingsSlinky.navermaps.global.naver.maps

import typingsSlinky.navermaps.naver.maps.Coord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.EPSG3857")
@js.native
object EPSG3857 extends js.Object {
  
  // Projection
  def apply(): Unit = js.native
  
  // implements Projection
  def fromCoordToPoint(coord: Coord): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromLatLngToPoint(latlng: typingsSlinky.navermaps.naver.maps.LatLng): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromPointToCoord(point: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  def fromPointToLatLng(point: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  def getDestinationCoord(fromLatLng: typingsSlinky.navermaps.naver.maps.LatLng, angle: Double, meter: Double): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  def getDistance(
    latlng1: typingsSlinky.navermaps.naver.maps.LatLng,
    latlng2: typingsSlinky.navermaps.naver.maps.LatLng
  ): Double = js.native
}
