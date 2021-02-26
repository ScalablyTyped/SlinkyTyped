package typingsSlinky.navermaps.global.naver.maps

import typingsSlinky.navermaps.naver.maps.Coord
import typingsSlinky.navermaps.naver.maps.PointLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.PointBounds")
@js.native
class PointBounds protected ()
  extends typingsSlinky.navermaps.naver.maps.PointBounds {
  def this(
    minPoint: typingsSlinky.navermaps.naver.maps.Point,
    maxPoint: typingsSlinky.navermaps.naver.maps.Point
  ) = this()
}
object PointBounds {
  
  /* static member */
  @JSGlobal("naver.maps.PointBounds.bounds")
  @js.native
  def bounds(point: Coord, pointN: Coord): typingsSlinky.navermaps.naver.maps.PointBounds = js.native
  @JSGlobal("naver.maps.PointBounds.bounds")
  @js.native
  def bounds(point: Coord, pointN: PointLiteral): typingsSlinky.navermaps.naver.maps.PointBounds = js.native
  @JSGlobal("naver.maps.PointBounds.bounds")
  @js.native
  def bounds(point: PointLiteral, pointN: Coord): typingsSlinky.navermaps.naver.maps.PointBounds = js.native
  @JSGlobal("naver.maps.PointBounds.bounds")
  @js.native
  def bounds(point: PointLiteral, pointN: PointLiteral): typingsSlinky.navermaps.naver.maps.PointBounds = js.native
}
