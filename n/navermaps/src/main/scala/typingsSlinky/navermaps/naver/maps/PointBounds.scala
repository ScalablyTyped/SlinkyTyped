package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointBounds extends Bounds {
  
  def equals(bounds: Bounds): Boolean = js.native
  def equals(bounds: PointBoundsLiteral): Boolean = js.native
  
  def extend(point: Coord): PointBounds = js.native
  def extend(point: PointLiteral): PointBounds = js.native
  
  def getCenter(): Point = js.native
  
  def getMax(): Point = js.native
  
  def getMin(): Point = js.native
  
  def hasBounds(bounds: Bounds): Boolean = js.native
  def hasBounds(bounds: PointBoundsLiteral): Boolean = js.native
  
  def hasPoint(point: Coord): Boolean = js.native
  def hasPoint(point: PointLiteral): Boolean = js.native
  
  def intersects(bounds: Bounds): Boolean = js.native
  def intersects(bounds: PointBoundsLiteral): Boolean = js.native
  
  def maxX(): Double = js.native
  
  def maxY(): Double = js.native
  
  def minX(): Double = js.native
  
  def minY(): Double = js.native
  
  def union(bounds: Bounds): PointBounds = js.native
  def union(bounds: PointBoundsLiteral): PointBounds = js.native
}
