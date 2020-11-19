package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Rectangle")
@js.native
class Rectangle () extends Packable {
  def this(west: Double) = this()
  def this(west: js.UndefOr[scala.Nothing], south: Double) = this()
  def this(west: Double, south: Double) = this()
  def this(west: js.UndefOr[scala.Nothing], south: js.UndefOr[scala.Nothing], east: Double) = this()
  def this(west: js.UndefOr[scala.Nothing], south: Double, east: Double) = this()
  def this(west: Double, south: js.UndefOr[scala.Nothing], east: Double) = this()
  def this(west: Double, south: Double, east: Double) = this()
  def this(
    west: js.UndefOr[scala.Nothing],
    south: js.UndefOr[scala.Nothing],
    east: js.UndefOr[scala.Nothing],
    north: Double
  ) = this()
  def this(west: js.UndefOr[scala.Nothing], south: js.UndefOr[scala.Nothing], east: Double, north: Double) = this()
  def this(west: js.UndefOr[scala.Nothing], south: Double, east: js.UndefOr[scala.Nothing], north: Double) = this()
  def this(west: js.UndefOr[scala.Nothing], south: Double, east: Double, north: Double) = this()
  def this(west: Double, south: js.UndefOr[scala.Nothing], east: js.UndefOr[scala.Nothing], north: Double) = this()
  def this(west: Double, south: js.UndefOr[scala.Nothing], east: Double, north: Double) = this()
  def this(west: Double, south: Double, east: js.UndefOr[scala.Nothing], north: Double) = this()
  def this(west: Double, south: Double, east: Double, north: Double) = this()
  
  def clone(result: Rectangle): Rectangle = js.native
  
  var east: Double = js.native
  
  def equals(): Boolean = js.native
  def equals(other: Rectangle): Boolean = js.native
  
  def equalsEpsilon(other: Rectangle, epsilon: Double): Boolean = js.native
  
  var height: Double = js.native
  
  var north: Double = js.native
  
  var south: Double = js.native
  
  var west: Double = js.native
  
  var width: Double = js.native
}
/* static members */
@JSImport("cesium", "Rectangle")
@js.native
object Rectangle extends js.Object {
  
  var MAX_VALUE: Rectangle = js.native
  
  def center(rectangle: Rectangle): Cartographic = js.native
  def center(rectangle: Rectangle, result: Cartographic): Cartographic = js.native
  
  def clone(rectangle: Rectangle): Rectangle = js.native
  def clone(rectangle: Rectangle, result: Rectangle): Rectangle = js.native
  
  def computeHeight(rectangle: Rectangle): Double = js.native
  
  def computeWidth(rectangle: Rectangle): Double = js.native
  
  def contains(rectangle: Rectangle, cartographic: Cartographic): Boolean = js.native
  
  def equals(): Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: Rectangle): Boolean = js.native
  def equals(left: Rectangle): Boolean = js.native
  def equals(left: Rectangle, right: Rectangle): Boolean = js.native
  
  def fromCartographicArray(cartographics: js.Array[Cartographic]): Rectangle = js.native
  def fromCartographicArray(cartographics: js.Array[Cartographic], result: Rectangle): Rectangle = js.native
  
  def fromDegrees(): Rectangle = js.native
  def fromDegrees(
    west: js.UndefOr[scala.Nothing],
    south: js.UndefOr[scala.Nothing],
    east: js.UndefOr[scala.Nothing],
    north: js.UndefOr[scala.Nothing],
    result: Rectangle
  ): Rectangle = js.native
  def fromDegrees(
    west: js.UndefOr[scala.Nothing],
    south: js.UndefOr[scala.Nothing],
    east: js.UndefOr[scala.Nothing],
    north: Double
  ): Rectangle = js.native
  def fromDegrees(
    west: js.UndefOr[scala.Nothing],
    south: js.UndefOr[scala.Nothing],
    east: js.UndefOr[scala.Nothing],
    north: Double,
    result: Rectangle
  ): Rectangle = js.native
  def fromDegrees(west: js.UndefOr[scala.Nothing], south: js.UndefOr[scala.Nothing], east: Double): Rectangle = js.native
  def fromDegrees(
    west: js.UndefOr[scala.Nothing],
    south: js.UndefOr[scala.Nothing],
    east: Double,
    north: js.UndefOr[scala.Nothing],
    result: Rectangle
  ): Rectangle = js.native
  def fromDegrees(west: js.UndefOr[scala.Nothing], south: js.UndefOr[scala.Nothing], east: Double, north: Double): Rectangle = js.native
  def fromDegrees(
    west: js.UndefOr[scala.Nothing],
    south: js.UndefOr[scala.Nothing],
    east: Double,
    north: Double,
    result: Rectangle
  ): Rectangle = js.native
  def fromDegrees(west: js.UndefOr[scala.Nothing], south: Double): Rectangle = js.native
  def fromDegrees(
    west: js.UndefOr[scala.Nothing],
    south: Double,
    east: js.UndefOr[scala.Nothing],
    north: js.UndefOr[scala.Nothing],
    result: Rectangle
  ): Rectangle = js.native
  def fromDegrees(west: js.UndefOr[scala.Nothing], south: Double, east: js.UndefOr[scala.Nothing], north: Double): Rectangle = js.native
  def fromDegrees(
    west: js.UndefOr[scala.Nothing],
    south: Double,
    east: js.UndefOr[scala.Nothing],
    north: Double,
    result: Rectangle
  ): Rectangle = js.native
  def fromDegrees(west: js.UndefOr[scala.Nothing], south: Double, east: Double): Rectangle = js.native
  def fromDegrees(
    west: js.UndefOr[scala.Nothing],
    south: Double,
    east: Double,
    north: js.UndefOr[scala.Nothing],
    result: Rectangle
  ): Rectangle = js.native
  def fromDegrees(west: js.UndefOr[scala.Nothing], south: Double, east: Double, north: Double): Rectangle = js.native
  def fromDegrees(west: js.UndefOr[scala.Nothing], south: Double, east: Double, north: Double, result: Rectangle): Rectangle = js.native
  def fromDegrees(west: Double): Rectangle = js.native
  def fromDegrees(
    west: Double,
    south: js.UndefOr[scala.Nothing],
    east: js.UndefOr[scala.Nothing],
    north: js.UndefOr[scala.Nothing],
    result: Rectangle
  ): Rectangle = js.native
  def fromDegrees(west: Double, south: js.UndefOr[scala.Nothing], east: js.UndefOr[scala.Nothing], north: Double): Rectangle = js.native
  def fromDegrees(
    west: Double,
    south: js.UndefOr[scala.Nothing],
    east: js.UndefOr[scala.Nothing],
    north: Double,
    result: Rectangle
  ): Rectangle = js.native
  def fromDegrees(west: Double, south: js.UndefOr[scala.Nothing], east: Double): Rectangle = js.native
  def fromDegrees(
    west: Double,
    south: js.UndefOr[scala.Nothing],
    east: Double,
    north: js.UndefOr[scala.Nothing],
    result: Rectangle
  ): Rectangle = js.native
  def fromDegrees(west: Double, south: js.UndefOr[scala.Nothing], east: Double, north: Double): Rectangle = js.native
  def fromDegrees(west: Double, south: js.UndefOr[scala.Nothing], east: Double, north: Double, result: Rectangle): Rectangle = js.native
  def fromDegrees(west: Double, south: Double): Rectangle = js.native
  def fromDegrees(
    west: Double,
    south: Double,
    east: js.UndefOr[scala.Nothing],
    north: js.UndefOr[scala.Nothing],
    result: Rectangle
  ): Rectangle = js.native
  def fromDegrees(west: Double, south: Double, east: js.UndefOr[scala.Nothing], north: Double): Rectangle = js.native
  def fromDegrees(west: Double, south: Double, east: js.UndefOr[scala.Nothing], north: Double, result: Rectangle): Rectangle = js.native
  def fromDegrees(west: Double, south: Double, east: Double): Rectangle = js.native
  def fromDegrees(west: Double, south: Double, east: Double, north: js.UndefOr[scala.Nothing], result: Rectangle): Rectangle = js.native
  def fromDegrees(west: Double, south: Double, east: Double, north: Double): Rectangle = js.native
  def fromDegrees(west: Double, south: Double, east: Double, north: Double, result: Rectangle): Rectangle = js.native
  
  def intersection(rectangle: Rectangle, otherRectangle: Rectangle): Rectangle = js.native
  def intersection(rectangle: Rectangle, otherRectangle: Rectangle, result: Rectangle): Rectangle = js.native
  
  def northeast(rectangle: Rectangle): Cartographic = js.native
  def northeast(rectangle: Rectangle, result: Cartographic): Cartographic = js.native
  
  def northwest(rectangle: Rectangle): Cartographic = js.native
  def northwest(rectangle: Rectangle, result: Cartographic): Cartographic = js.native
  
  def pack(value: Rectangle, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: Rectangle, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  def southeast(rectangle: Rectangle): Cartographic = js.native
  def southeast(rectangle: Rectangle, result: Cartographic): Cartographic = js.native
  
  def southwest(rectangle: Rectangle): Cartographic = js.native
  def southwest(rectangle: Rectangle, result: Cartographic): Cartographic = js.native
  
  def subsample(rectangle: Rectangle): js.Array[Cartesian3] = js.native
  def subsample(
    rectangle: Rectangle,
    ellipsoid: js.UndefOr[scala.Nothing],
    surfaceHeight: js.UndefOr[scala.Nothing],
    result: js.Array[Cartesian3]
  ): js.Array[Cartesian3] = js.native
  def subsample(rectangle: Rectangle, ellipsoid: js.UndefOr[scala.Nothing], surfaceHeight: Double): js.Array[Cartesian3] = js.native
  def subsample(
    rectangle: Rectangle,
    ellipsoid: js.UndefOr[scala.Nothing],
    surfaceHeight: Double,
    result: js.Array[Cartesian3]
  ): js.Array[Cartesian3] = js.native
  def subsample(rectangle: Rectangle, ellipsoid: Ellipsoid): js.Array[Cartesian3] = js.native
  def subsample(
    rectangle: Rectangle,
    ellipsoid: Ellipsoid,
    surfaceHeight: js.UndefOr[scala.Nothing],
    result: js.Array[Cartesian3]
  ): js.Array[Cartesian3] = js.native
  def subsample(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Double): js.Array[Cartesian3] = js.native
  def subsample(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Double, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  def unpack(array: js.Array[Double]): Rectangle = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Rectangle): Rectangle = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Rectangle = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Rectangle): Rectangle = js.native
  
  def validate(rectangle: Rectangle): Unit = js.native
}
