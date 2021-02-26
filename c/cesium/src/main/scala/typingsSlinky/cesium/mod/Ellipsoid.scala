package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Ellipsoid")
@js.native
class Ellipsoid () extends Packable {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  
  def cartesianArrayToCartographicArray(cartesians: js.Array[Cartesian3]): js.Array[Cartographic] = js.native
  def cartesianArrayToCartographicArray(cartesians: js.Array[Cartesian3], result: js.Array[Cartographic]): js.Array[Cartographic] = js.native
  
  def cartesianToCartographic(cartesian: Cartesian3): Cartographic = js.native
  def cartesianToCartographic(cartesian: Cartesian3, result: Cartographic): Cartographic = js.native
  
  def cartographicArrayToCartesianArray(cartographics: js.Array[Cartographic]): js.Array[Cartesian3] = js.native
  def cartographicArrayToCartesianArray(cartographics: js.Array[Cartographic], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  def cartographicToCartesian(cartographic: Cartographic): Cartesian3 = js.native
  def cartographicToCartesian(cartographic: Cartographic, result: Cartesian3): Cartesian3 = js.native
  
  def clone(result: Ellipsoid): Ellipsoid = js.native
  
  def equals(): Boolean = js.native
  def equals(right: Ellipsoid): Boolean = js.native
  
  def geocentricSurfaceNormal(cartesian: Cartesian3): Cartesian3 = js.native
  def geocentricSurfaceNormal(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def geodeticSurfaceNormal(cartesian: Cartesian3): Cartesian3 = js.native
  def geodeticSurfaceNormal(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def geodeticSurfaceNormalCartographic(cartographic: Cartographic): Cartesian3 = js.native
  def geodeticSurfaceNormalCartographic(cartographic: Cartographic, result: Cartesian3): Cartesian3 = js.native
  
  var maximumRadius: Double = js.native
  
  var minimumRadius: Double = js.native
  
  var oneOverRadii: Cartesian3 = js.native
  
  var oneOverRadiiSquared: Cartesian3 = js.native
  
  var radii: Cartesian3 = js.native
  
  var radiiSquared: Cartesian3 = js.native
  
  var radiiToTheFourth: Cartesian3 = js.native
  
  def scaleToGeocentricSurface(cartesian: Cartesian3): Cartesian3 = js.native
  def scaleToGeocentricSurface(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def scaleToGeodeticSurface(cartesian: Cartesian3): Cartesian3 = js.native
  def scaleToGeodeticSurface(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def transformPositionFromScaledSpace(position: Cartesian3): Cartesian3 = js.native
  def transformPositionFromScaledSpace(position: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def transformPositionToScaledSpace(position: Cartesian3): Cartesian3 = js.native
  def transformPositionToScaledSpace(position: Cartesian3, result: Cartesian3): Cartesian3 = js.native
}
object Ellipsoid {
  
  @JSImport("cesium", "Ellipsoid")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Ellipsoid.MOON")
  @js.native
  def MOON: Ellipsoid = js.native
  @scala.inline
  def MOON_=(x: Ellipsoid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOON")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Ellipsoid.UNIT_SPHERE")
  @js.native
  def UNIT_SPHERE: Ellipsoid = js.native
  @scala.inline
  def UNIT_SPHERE_=(x: Ellipsoid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_SPHERE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Ellipsoid.WGS84")
  @js.native
  def WGS84: Ellipsoid = js.native
  @scala.inline
  def WGS84_=(x: Ellipsoid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WGS84")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Ellipsoid.clone")
  @js.native
  def clone_(ellipsoid: Ellipsoid): Ellipsoid = js.native
  @JSImport("cesium", "Ellipsoid.clone")
  @js.native
  def clone_(ellipsoid: Ellipsoid, result: Ellipsoid): Ellipsoid = js.native
  
  /* static member */
  @JSImport("cesium", "Ellipsoid.fromCartesian3")
  @js.native
  def fromCartesian3(): Ellipsoid = js.native
  @JSImport("cesium", "Ellipsoid.fromCartesian3")
  @js.native
  def fromCartesian3(radii: Cartesian3): Ellipsoid = js.native
  
  /* static member */
  @JSImport("cesium", "Ellipsoid.unpack")
  @js.native
  def unpack(array: js.Array[Double]): Ellipsoid = js.native
  @JSImport("cesium", "Ellipsoid.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Ellipsoid): Ellipsoid = js.native
  @JSImport("cesium", "Ellipsoid.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Ellipsoid = js.native
  @JSImport("cesium", "Ellipsoid.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Ellipsoid): Ellipsoid = js.native
}
