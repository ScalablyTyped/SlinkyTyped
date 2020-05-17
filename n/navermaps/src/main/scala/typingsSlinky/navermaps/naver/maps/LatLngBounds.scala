package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.navermaps.naver.maps.Bounds because Already inherited */ @js.native
trait LatLngBounds extends PointBounds {
  def east(): Double = js.native
  def equals(bounds: LatLngBoundsLiteral): Boolean = js.native
  def extend(latlng: LatLngLiteral): LatLngBounds = js.native
  def getNE(): LatLng = js.native
  def getSW(): LatLng = js.native
  def hasLatLng(latlng: Coord): Boolean = js.native
  def hasLatLng(latlng: LatLngLiteral): Boolean = js.native
  def intersects(bounds: LatLngBoundsLiteral): Boolean = js.native
  def north(): Double = js.native
  def south(): Double = js.native
  def toPointBounds(): PointBounds = js.native
  def union(bounds: LatLngBoundsLiteral): LatLngBounds = js.native
  def west(): Double = js.native
}

