package typingsSlinky.navermaps.global.naver.maps

import typingsSlinky.navermaps.naver.maps.Coord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EPSG3857 {
  
  // Projection
  @JSGlobal("naver.maps.EPSG3857")
  @js.native
  def apply(): Unit = js.native
  
  // implements Projection
  @JSGlobal("naver.maps.EPSG3857.fromCoordToPoint")
  @js.native
  def fromCoordToPoint(coord: Coord): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.EPSG3857.fromLatLngToPoint")
  @js.native
  def fromLatLngToPoint(latlng: typingsSlinky.navermaps.naver.maps.LatLng): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  @JSGlobal("naver.maps.EPSG3857.fromPointToCoord")
  @js.native
  def fromPointToCoord(point: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.EPSG3857.fromPointToLatLng")
  @js.native
  def fromPointToLatLng(point: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.EPSG3857.getDestinationCoord")
  @js.native
  def getDestinationCoord(fromLatLng: typingsSlinky.navermaps.naver.maps.LatLng, angle: Double, meter: Double): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  @JSGlobal("naver.maps.EPSG3857.getDistance")
  @js.native
  def getDistance(
    latlng1: typingsSlinky.navermaps.naver.maps.LatLng,
    latlng2: typingsSlinky.navermaps.naver.maps.LatLng
  ): Double = js.native
}
