package typingsSlinky.navermaps.global.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.UTMK")
@js.native
object UTMK extends js.Object {
  
  def apply(): Unit = js.native
  
  def fromCoordToPoint(latlng: typingsSlinky.navermaps.naver.maps.LatLng): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromCoordToUTMK(latlng: typingsSlinky.navermaps.naver.maps.LatLng): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromLatLngToPoint(latlng: typingsSlinky.navermaps.naver.maps.LatLng): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromLatLngToUTMK(latlng: typingsSlinky.navermaps.naver.maps.LatLng): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromPointToCoord(point: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  def fromPointToLatLng(point: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  def fromPointToUTMK(point: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromUTMKToCoord(utmk: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  def fromUTMKToLatLng(utmk: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  def fromUTMKToPoint(utmk: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def getDestinationCoord(fromLatLng: typingsSlinky.navermaps.naver.maps.LatLng, angle: Double, meter: Double): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  def getDistance(
    latlng1: typingsSlinky.navermaps.naver.maps.LatLng,
    latlng2: typingsSlinky.navermaps.naver.maps.LatLng
  ): Double = js.native
  
  var name: String = js.native
  
  var pointPerMeter: Double = js.native
}
