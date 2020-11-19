package typingsSlinky.navermaps.global.naver.maps

import typingsSlinky.navermaps.naver.maps.Coord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.UTMK_NAVERCoord")
@js.native
object UTMKNAVERCoord extends js.Object {
  
  def apply(): Unit = js.native
  
  // extends UTMK_NAVER
  def fromCoordToLatLng(n: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.LatLng = js.native
  
  def fromCoordToPoint(n: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromLatLngToCoord(latlng: Coord): typingsSlinky.navermaps.naver.maps.Point = js.native
  
  def fromPointToCoord(point: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.Point = js.native
}
