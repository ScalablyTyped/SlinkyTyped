package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidTangentPlane")
@js.native
class EllipsoidTangentPlane protected () extends js.Object {
  def this(ellipsoid: Ellipsoid, origin: Cartesian3) = this()
  
  var ellipsoid: Ellipsoid = js.native
  
  var origin: Cartesian3 = js.native
  
  def projectPointOntoPlane(cartesian: Cartesian3): Cartesian2 = js.native
  def projectPointOntoPlane(cartesian: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  
  def projectPointsOntoEllipsoid(cartesians: js.Array[Cartesian2]): js.Array[Cartesian3] = js.native
  def projectPointsOntoEllipsoid(cartesians: js.Array[Cartesian2], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  def projectPointsOntoPlane(cartesians: js.Array[Cartesian3]): js.Array[Cartesian2] = js.native
  def projectPointsOntoPlane(cartesians: js.Array[Cartesian3], result: js.Array[Cartesian2]): js.Array[Cartesian2] = js.native
}
/* static members */
@JSImport("cesium", "EllipsoidTangentPlane")
@js.native
object EllipsoidTangentPlane extends js.Object {
  
  def fromPoints(cartesians: js.Array[Cartesian3]): EllipsoidTangentPlane = js.native
  def fromPoints(cartesians: js.Array[Cartesian3], ellipsoid: Ellipsoid): EllipsoidTangentPlane = js.native
}
