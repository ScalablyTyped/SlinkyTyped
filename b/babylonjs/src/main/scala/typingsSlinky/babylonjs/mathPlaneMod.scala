package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathVectorMod.Matrix
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.typesMod.DeepImmutable
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathPlaneMod {
  
  @JSImport("babylonjs/Maths/math.plane", "Plane")
  @js.native
  class Plane protected () extends StObject {
    /**
      * Creates a Plane object according to the given floats a, b, c, d and the plane equation : ax + by + cz + d = 0
      * @param a a component of the plane
      * @param b b component of the plane
      * @param c c component of the plane
      * @param d d component of the plane
      */
    def this(a: Double, b: Double, c: Double, d: Double) = this()
    
    /**
      * @returns the plane coordinates as a new array of 4 elements [a, b, c, d].
      */
    def asArray(): js.Array[Double] = js.native
    
    /**
      * Updates the current Plane from the plane defined by the three given points.
      * @param point1 one of the points used to contruct the plane
      * @param point2 one of the points used to contruct the plane
      * @param point3 one of the points used to contruct the plane
      * @returns the updated Plane.
      */
    def copyFromPoints(point1: DeepImmutable[Vector3], point2: DeepImmutable[Vector3], point3: DeepImmutable[Vector3]): Plane = js.native
    
    /**
      * d component of the plane
      */
    var d: Double = js.native
    
    /**
      * Compute the dot product between the point and the plane normal
      * @param point point to calculate the dot product with
      * @returns the dot product (float) of the point coordinates and the plane normal.
      */
    def dotCoordinate(point: DeepImmutable[Vector3]): Double = js.native
    
    /**
      * @returns the string "Plane".
      */
    def getClassName(): String = js.native
    
    /**
      * @returns the Plane hash code.
      */
    def getHashCode(): Double = js.native
    
    /**
      * Checks if the plane is facing a given direction (meaning if the plane's normal is pointing in the opposite direction of the given vector).
      * Note that for this function to work as expected you should make sure that:
      *   - direction and the plane normal are normalized
      *   - epsilon is a number just bigger than -1, something like -0.99 for eg
      * @param direction the direction to check if the plane is facing
      * @param epsilon value the dot product is compared against (returns true if dot <= epsilon)
      * @returns True if the plane is facing the given direction
      */
    def isFrontFacingTo(direction: DeepImmutable[Vector3], epsilon: Double): Boolean = js.native
    
    /**
      * Normal of the plane (a,b,c)
      */
    var normal: Vector3 = js.native
    
    /**
      * Normalize the current Plane in place.
      * @returns the updated Plane.
      */
    def normalize(): Plane = js.native
    
    /**
      * Calculates the distance to a point
      * @param point point to calculate distance to
      * @returns the signed distance (float) from the given point to the Plane.
      */
    def signedDistanceTo(point: DeepImmutable[Vector3]): Double = js.native
    
    /**
      * Applies a transformation the plane and returns the result
      * @param transformation the transformation matrix to be applied to the plane
      * @returns a new Plane as the result of the transformation of the current Plane by the given matrix.
      */
    def transform(transformation: DeepImmutable[Matrix]): Plane = js.native
  }
  /* static members */
  object Plane {
    
    @JSImport("babylonjs/Maths/math.plane", "Plane")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a plane from an  array
      * @param array the array to create a plane from
      * @returns a new Plane from the given array.
      */
    @JSImport("babylonjs/Maths/math.plane", "Plane.FromArray")
    @js.native
    def FromArray(array: DeepImmutable[ArrayLike[Double]]): Plane = js.native
    
    /**
      * Creates a plane from three points
      * @param point1 point used to create the plane
      * @param point2 point used to create the plane
      * @param point3 point used to create the plane
      * @returns a new Plane defined by the three given points.
      */
    @JSImport("babylonjs/Maths/math.plane", "Plane.FromPoints")
    @js.native
    def FromPoints(point1: DeepImmutable[Vector3], point2: DeepImmutable[Vector3], point3: DeepImmutable[Vector3]): Plane = js.native
    
    /**
      * Creates a plane from an origin point and a normal
      * @param origin origin of the plane to be constructed
      * @param normal normal of the plane to be constructed
      * @returns a new Plane the normal vector to this plane at the given origin point.
      * Note : the vector "normal" is updated because normalized.
      */
    @JSImport("babylonjs/Maths/math.plane", "Plane.FromPositionAndNormal")
    @js.native
    def FromPositionAndNormal(origin: DeepImmutable[Vector3], normal: Vector3): Plane = js.native
    
    /**
      * Calculates the distance from a plane and a point
      * @param origin origin of the plane to be constructed
      * @param normal normal of the plane to be constructed
      * @param point point to calculate distance to
      * @returns the signed distance between the plane defined by the normal vector at the "origin"" point and the given other point.
      */
    @JSImport("babylonjs/Maths/math.plane", "Plane.SignedDistanceToPlaneFromPositionAndNormal")
    @js.native
    def SignedDistanceToPlaneFromPositionAndNormal(origin: DeepImmutable[Vector3], normal: DeepImmutable[Vector3], point: DeepImmutable[Vector3]): Double = js.native
    
    @JSImport("babylonjs/Maths/math.plane", "Plane._TmpMatrix")
    @js.native
    def _TmpMatrix: js.Any = js.native
    @scala.inline
    def _TmpMatrix_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMatrix")(x.asInstanceOf[js.Any])
  }
}
