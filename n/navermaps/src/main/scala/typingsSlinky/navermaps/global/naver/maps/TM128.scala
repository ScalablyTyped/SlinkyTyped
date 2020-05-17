package typingsSlinky.navermaps.global.naver.maps

import typingsSlinky.navermaps.naver.maps.Coord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.TM128")
@js.native
object TM128 extends js.Object {
  def apply(): Unit = js.native
  // extends TM128Coord
  def fromCoordToPoint(latlng: Coord): typingsSlinky.navermaps.naver.maps.Point = js.native
  def fromPointToCoord(point: typingsSlinky.navermaps.naver.maps.Point): typingsSlinky.navermaps.naver.maps.LatLng = js.native
}

