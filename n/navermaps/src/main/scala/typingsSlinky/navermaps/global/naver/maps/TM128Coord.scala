package typingsSlinky.navermaps.global.naver.maps

import typingsSlinky.navermaps.naver.maps.Coord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.TM128Coord")
@js.native
object TM128Coord extends js.Object {
  
  def apply(): Unit = js.native
  
  // extends UTMK
  def fromCoordToLatLng(tm128: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  def fromCoordToPoint(tm128: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromLatLngToCoord(latlng: Coord): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromLatLngToTM128(latlng: Coord): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromPointToCoord(point: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromPointToTM128(point: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromTM128ToLatLng(tm128: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  def fromTM128ToPoint(tm128: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromTM128ToUTMK(tm128: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromUTMKToTM128(utmk: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.Point = js.native
}
