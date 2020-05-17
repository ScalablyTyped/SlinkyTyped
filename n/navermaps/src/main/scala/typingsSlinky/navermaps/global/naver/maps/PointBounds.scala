package typingsSlinky.navermaps.global.naver.maps

import typingsSlinky.navermaps.naver.maps.Coord
import typingsSlinky.navermaps.naver.maps.PointLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.PointBounds")
@js.native
class PointBounds protected ()
  extends typingsSlinky.navermaps.naver.maps.PointBounds {
  def this(
    minPoint: typingsSlinky.navermaps.naver.maps.Point,
    maxPoint: typingsSlinky.navermaps.naver.maps.Point
  ) = this()
}

/* static members */
@JSGlobal("naver.maps.PointBounds")
@js.native
object PointBounds extends js.Object {
  def bounds(point: Coord, pointN: Coord): typingsSlinky.navermaps.naver.maps.PointBounds = js.native
  def bounds(point: Coord, pointN: PointLiteral): typingsSlinky.navermaps.naver.maps.PointBounds = js.native
  def bounds(point: PointLiteral, pointN: Coord): typingsSlinky.navermaps.naver.maps.PointBounds = js.native
  def bounds(point: PointLiteral, pointN: PointLiteral): typingsSlinky.navermaps.naver.maps.PointBounds = js.native
}

