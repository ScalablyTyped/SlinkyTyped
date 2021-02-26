package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WebMercatorProjection")
@js.native
class WebMercatorProjection () extends StObject {
  def this(ellipsoid: Ellipsoid) = this()
  
  var ellipsoid: Ellipsoid = js.native
  
  def project(cartographic: Cartographic): Cartesian3 = js.native
  def project(cartographic: Cartographic, result: Cartesian3): Cartesian3 = js.native
  
  def unproject(cartesian: Cartesian3): Cartographic = js.native
  def unproject(cartesian: Cartesian3, result: Cartographic): Cartographic = js.native
}
object WebMercatorProjection {
  
  @JSImport("cesium", "WebMercatorProjection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "WebMercatorProjection.MaximumLatitude")
  @js.native
  def MaximumLatitude: Double = js.native
  @scala.inline
  def MaximumLatitude_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaximumLatitude")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "WebMercatorProjection.geodeticLatitudeToMercatorAngle")
  @js.native
  def geodeticLatitudeToMercatorAngle(latitude: Double): Double = js.native
  
  /* static member */
  @JSImport("cesium", "WebMercatorProjection.mercatorAngleToGeodeticLatitude")
  @js.native
  def mercatorAngleToGeodeticLatitude(mercatorAngle: Double): Double = js.native
}
