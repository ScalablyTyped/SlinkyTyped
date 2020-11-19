package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Plane")
@js.native
class Plane protected ()
  extends typingsSlinky.babylonjs.mathsIndexMod.Plane {
  /**
    * Creates a Plane object according to the given floats a, b, c, d and the plane equation : ax + by + cz + d = 0
    * @param a a component of the plane
    * @param b b component of the plane
    * @param c c component of the plane
    * @param d d component of the plane
    */
  def this(a: Double, b: Double, c: Double, d: Double) = this()
}
/* static members */
@JSImport("babylonjs/index", "Plane")
@js.native
object Plane extends js.Object {
  
  /**
    * Creates a plane from an  array
    * @param array the array to create a plane from
    * @returns a new Plane from the given array.
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): typingsSlinky.babylonjs.mathPlaneMod.Plane = js.native
  
  /**
    * Creates a plane from three points
    * @param point1 point used to create the plane
    * @param point2 point used to create the plane
    * @param point3 point used to create the plane
    * @returns a new Plane defined by the three given points.
    */
  def FromPoints(
    point1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    point2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    point3: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): typingsSlinky.babylonjs.mathPlaneMod.Plane = js.native
  
  /**
    * Creates a plane from an origin point and a normal
    * @param origin origin of the plane to be constructed
    * @param normal normal of the plane to be constructed
    * @returns a new Plane the normal vector to this plane at the given origin point.
    * Note : the vector "normal" is updated because normalized.
    */
  def FromPositionAndNormal(
    origin: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    normal: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): typingsSlinky.babylonjs.mathPlaneMod.Plane = js.native
  
  /**
    * Calculates the distance from a plane and a point
    * @param origin origin of the plane to be constructed
    * @param normal normal of the plane to be constructed
    * @param point point to calculate distance to
    * @returns the signed distance between the plane defined by the normal vector at the "origin"" point and the given other point.
    */
  def SignedDistanceToPlaneFromPositionAndNormal(
    origin: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    normal: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    point: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): Double = js.native
  
  var _TmpMatrix: js.Any = js.native
}
