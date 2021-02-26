package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Curve3")
@js.native
class Curve3 protected ()
  extends typingsSlinky.babylonjs.BABYLON.Curve3 {
  /**
    * A Curve3 object is a logical object, so not a mesh, to handle curves in the 3D geometric space.
    * A Curve3 is designed from a series of successive Vector3.
    * Tuto : https://doc.babylonjs.com/how_to/how_to_use_curve3#curve3-object
    * @param points points which make up the curve
    */
  def this(points: js.Array[typingsSlinky.babylonjs.BABYLON.Vector3]) = this()
}
/* static members */
object Curve3 {
  
  /**
    * Returns a Curve3 object along a CatmullRom Spline curve :
    * @param points (array of Vector3) the points the spline must pass through. At least, four points required
    * @param nbPoints (integer) the wanted number of points between each curve control points
    * @param closed (boolean) optional with default false, when true forms a closed loop from the points
    * @returns the created Curve3
    */
  @JSGlobal("BABYLON.Curve3.CreateCatmullRomSpline")
  @js.native
  def CreateCatmullRomSpline(points: DeepImmutable[js.Array[typingsSlinky.babylonjs.BABYLON.Vector3]], nbPoints: Double): typingsSlinky.babylonjs.BABYLON.Curve3 = js.native
  @JSGlobal("BABYLON.Curve3.CreateCatmullRomSpline")
  @js.native
  def CreateCatmullRomSpline(
    points: DeepImmutable[js.Array[typingsSlinky.babylonjs.BABYLON.Vector3]],
    nbPoints: Double,
    closed: Boolean
  ): typingsSlinky.babylonjs.BABYLON.Curve3 = js.native
  
  /**
    * Returns a Curve3 object along a Cubic Bezier curve : https://doc.babylonjs.com/how_to/how_to_use_curve3#cubic-bezier-curve
    * @param v0 (Vector3) the origin point of the Cubic Bezier
    * @param v1 (Vector3) the first control point
    * @param v2 (Vector3) the second control point
    * @param v3 (Vector3) the end point of the Cubic Bezier
    * @param nbPoints (integer) the wanted number of points in the curve
    * @returns the created Curve3
    */
  @JSGlobal("BABYLON.Curve3.CreateCubicBezier")
  @js.native
  def CreateCubicBezier(
    v0: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    v1: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    v2: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    v3: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    nbPoints: Double
  ): typingsSlinky.babylonjs.BABYLON.Curve3 = js.native
  
  /**
    * Returns a Curve3 object along a Hermite Spline curve : https://doc.babylonjs.com/how_to/how_to_use_curve3#hermite-spline
    * @param p1 (Vector3) the origin point of the Hermite Spline
    * @param t1 (Vector3) the tangent vector at the origin point
    * @param p2 (Vector3) the end point of the Hermite Spline
    * @param t2 (Vector3) the tangent vector at the end point
    * @param nbPoints (integer) the wanted number of points in the curve
    * @returns the created Curve3
    */
  @JSGlobal("BABYLON.Curve3.CreateHermiteSpline")
  @js.native
  def CreateHermiteSpline(
    p1: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    t1: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    p2: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    t2: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    nbPoints: Double
  ): typingsSlinky.babylonjs.BABYLON.Curve3 = js.native
  
  /**
    * Returns a Curve3 object along a Quadratic Bezier curve : https://doc.babylonjs.com/how_to/how_to_use_curve3#quadratic-bezier-curve
    * @param v0 (Vector3) the origin point of the Quadratic Bezier
    * @param v1 (Vector3) the control point
    * @param v2 (Vector3) the end point of the Quadratic Bezier
    * @param nbPoints (integer) the wanted number of points in the curve
    * @returns the created Curve3
    */
  @JSGlobal("BABYLON.Curve3.CreateQuadraticBezier")
  @js.native
  def CreateQuadraticBezier(
    v0: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    v1: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    v2: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    nbPoints: Double
  ): typingsSlinky.babylonjs.BABYLON.Curve3 = js.native
}
