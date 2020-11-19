package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import typingsSlinky.babylonjs.typesMod.float
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Vector3")
@js.native
/**
  * Creates a new Vector3 object from the given x, y, z (floats) coordinates.
  * @param x defines the first coordinates (on X axis)
  * @param y defines the second coordinates (on Y axis)
  * @param z defines the third coordinates (on Z axis)
  */
class Vector3 ()
  extends typingsSlinky.babylonjs.mathsIndexMod.Vector3 {
  def this(/**
    * Defines the first coordinates (on X axis)
    */
  x: Double) = this()
  def this(
    /**
    * Defines the first coordinates (on X axis)
    */
  x: js.UndefOr[scala.Nothing],
    /**
    * Defines the second coordinates (on Y axis)
    */
  y: Double
  ) = this()
  def this(
    /**
    * Defines the first coordinates (on X axis)
    */
  x: Double,
    /**
    * Defines the second coordinates (on Y axis)
    */
  y: Double
  ) = this()
  def this(
    /**
    * Defines the first coordinates (on X axis)
    */
  x: js.UndefOr[scala.Nothing],
    /**
    * Defines the second coordinates (on Y axis)
    */
  y: js.UndefOr[scala.Nothing],
    /**
    * Defines the third coordinates (on Z axis)
    */
  z: Double
  ) = this()
  def this(
    /**
    * Defines the first coordinates (on X axis)
    */
  x: js.UndefOr[scala.Nothing],
    /**
    * Defines the second coordinates (on Y axis)
    */
  y: Double,
    /**
    * Defines the third coordinates (on Z axis)
    */
  z: Double
  ) = this()
  def this(
    /**
    * Defines the first coordinates (on X axis)
    */
  x: Double,
    /**
    * Defines the second coordinates (on Y axis)
    */
  y: js.UndefOr[scala.Nothing],
    /**
    * Defines the third coordinates (on Z axis)
    */
  z: Double
  ) = this()
  def this(
    /**
    * Defines the first coordinates (on X axis)
    */
  x: Double,
    /**
    * Defines the second coordinates (on Y axis)
    */
  y: Double,
    /**
    * Defines the third coordinates (on Z axis)
    */
  z: Double
  ) = this()
}
/* static members */
@JSImport("babylonjs/index", "Vector3")
@js.native
object Vector3 extends js.Object {
  
  /**
    * Returns a new Vector3 set to (0.0, 0.0, -1.0)
    * @returns a new forward Vector3
    */
  def Backward(): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 located for "amount" on the CatmullRom interpolation spline defined by the vectors "value1", "value2", "value3", "value4"
    * @param value1 defines the first control point
    * @param value2 defines the second control point
    * @param value3 defines the third control point
    * @param value4 defines the fourth control point
    * @param amount defines the amount on the spline to use
    * @returns the new Vector3
    */
  def CatmullRom(
    value1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    value2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    value3: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    value4: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    amount: Double
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 located at the center between "value1" and "value2"
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the new Vector3
    */
  def Center(
    value1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    value2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Checks if a given vector is inside a specific range
    * @param v defines the vector to test
    * @param min defines the minimum range
    * @param max defines the maximum range
    */
  def CheckExtends(
    v: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    min: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    max: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 set with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
    * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
    * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
    * @param value defines the current value
    * @param min defines the lower range value
    * @param max defines the upper range value
    * @returns the new Vector3
    */
  def Clamp(
    value: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    min: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    max: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
    * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
    * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
    * @param value defines the current value
    * @param min defines the lower range value
    * @param max defines the upper range value
    * @param result defines the Vector3 where to store the result
    */
  def ClampToRef(
    value: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    min: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    max: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 as the cross product of the vectors "left" and "right"
    * The cross product is then orthogonal to both "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the cross product
    */
  def Cross(
    left: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    right: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the cross product of "left" and "right"
    * The cross product is then orthogonal to both "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @param result defines the Vector3 where to store the result
    */
  def CrossToRef(
    left: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    right: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns the distance between the vectors "value1" and "value2"
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the distance
    */
  def Distance(
    value1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    value2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): Double = js.native
  
  /**
    * Returns the squared distance between the vectors "value1" and "value2"
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the squared distance
    */
  def DistanceSquared(
    value1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    value2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): Double = js.native
  
  /**
    * Returns the dot product (float) between the vectors "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the dot product
    */
  def Dot(
    left: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    right: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): Double = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, -1.0, 0.0)
    * @returns a new down Vector3
    */
  def Down(): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, 0.0, 1.0)
    * @returns a new forward Vector3
    */
  def Forward(): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 set from the index "offset" of the given array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @returns the new Vector3
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the element values from the index "offset" of the given array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param result defines the Vector3 where to store the result
    */
  def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 set from the index "offset" of the given Float32Array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @returns the new Vector3
    * @deprecated Please use FromArray instead.
    */
  def FromFloatArray(array: DeepImmutable[js.typedarray.Float32Array]): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  def FromFloatArray(array: DeepImmutable[js.typedarray.Float32Array], offset: Double): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the element values from the index "offset" of the given Float32Array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param result defines the Vector3 where to store the result
    * @deprecated Please use FromArrayToRef instead.
    */
  def FromFloatArrayToRef(
    array: DeepImmutable[js.typedarray.Float32Array],
    offset: Double,
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Sets the given vector "result" with the given floats.
    * @param x defines the x coordinate of the source
    * @param y defines the y coordinate of the source
    * @param z defines the z coordinate of the source
    * @param result defines the Vector3 where to store the result
    */
  def FromFloatsToRef(x: Double, y: Double, z: Double, result: typingsSlinky.babylonjs.mathVectorMod.Vector3): Unit = js.native
  
  /**
    * Get angle between two vectors
    * @param vector0 angle between vector0 and vector1
    * @param vector1 angle between vector0 and vector1
    * @param normal direction of the normal
    * @return the angle between vector0 and vector1
    */
  def GetAngleBetweenVectors(
    vector0: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    vector1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    normal: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): Double = js.native
  
  /**
    * Get the clip factor between two vectors
    * @param vector0 defines the first operand
    * @param vector1 defines the second operand
    * @param axis defines the axis to use
    * @param size defines the size along the axis
    * @returns the clip factor
    */
  def GetClipFactor(
    vector0: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    vector1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    axis: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    size: Double
  ): Double = js.native
  
  /**
    * Returns a new Vector3 located for "amount" (float) on the Hermite interpolation spline defined by the vectors "value1", "tangent1", "value2", "tangent2"
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent vector
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent vector
    * @param amount defines the amount on the interpolation spline (between 0 and 1)
    * @returns the new Vector3
    */
  def Hermite(
    value1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    tangent1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    value2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    tangent2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    amount: Double
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 set to (-1.0, 0.0, 0.0)
    * @returns a new left Vector3
    */
  def Left(): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 located for "amount" (float) on the linear interpolation between the vectors "start" and "end"
    * @param start defines the start value
    * @param end defines the end value
    * @param amount max defines amount between both (between 0 and 1)
    * @returns the new Vector3
    */
  def Lerp(
    start: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    end: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    amount: Double
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the result of the linear interpolation from the vector "start" for "amount" to the vector "end"
    * @param start defines the start value
    * @param end defines the end value
    * @param amount max defines amount between both (between 0 and 1)
    * @param result defines the Vector3 where to store the result
    */
  def LerpToRef(
    start: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    end: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    amount: Double,
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Gets the maximal coordinate values between two Vector3
    * @param left defines the first operand
    * @param right defines the second operand
    * @returns the new Vector3
    */
  def Maximize(
    left: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    right: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Gets the minimal coordinate values between two Vector3
    * @param left defines the first operand
    * @param right defines the second operand
    * @returns the new Vector3
    */
  def Minimize(
    left: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    right: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 as the normalization of the given vector
    * @param vector defines the Vector3 to normalize
    * @returns the new Vector3
    */
  def Normalize(vector: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the normalization of the given first vector
    * @param vector defines the Vector3 to normalize
    * @param result defines the Vector3 where to store the result
    */
  def NormalizeToRef(
    vector: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 set to (1.0, 1.0, 1.0)
    * @returns a new unit Vector3
    */
  def One(): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Project a Vector3 onto screen space
    * @param vector defines the Vector3 to project
    * @param world defines the world matrix to use
    * @param transform defines the transform (view x projection) matrix to use
    * @param viewport defines the screen viewport to use
    * @returns the new Vector3
    */
  def Project(
    vector: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    world: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    viewport: DeepImmutable[typingsSlinky.babylonjs.mathViewportMod.Viewport]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Returns a new Vector3 set to (1.0, 0.0, 0.0)
    * @returns a new right Vector3
    */
  def Right(): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Given three orthogonal normalized left-handed oriented Vector3 axis in space (target system),
    * RotationFromAxis() returns the rotation Euler angles (ex : rotation.x, rotation.y, rotation.z) to apply
    * to something in order to rotate it from its local system to the given target system
    * Note: axis1, axis2 and axis3 are normalized during this operation
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @returns a new Vector3
    */
  def RotationFromAxis(
    axis1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    axis2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    axis3: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * The same than RotationFromAxis but updates the given ref Vector3 parameter instead of returning a new Vector3
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @param ref defines the Vector3 where to store the result
    */
  def RotationFromAxisToRef(
    axis1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    axis2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    axis3: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    ref: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 set with the result of the transformation by the given matrix of the given vector.
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the transformed Vector3
    */
  def TransformCoordinates(
    vector: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    transformation: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given floats (x, y, z)
    * This method computes tranformed coordinates only, not transformed direction vectors
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  def TransformCoordinatesFromFloatsToRef(
    x: Double,
    y: Double,
    z: Double,
    transformation: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
    * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  def TransformCoordinatesToRef(
    vector: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    transformation: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 set with the result of the normal transformation by the given matrix of the given vector
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the new Vector3
    */
  def TransformNormal(
    vector: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    transformation: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z)
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  def TransformNormalFromFloatsToRef(
    x: Double,
    y: Double,
    z: Double,
    transformation: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  def TransformNormalToRef(
    vector: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    transformation: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Unproject from screen space to object space
    * @param source defines the screen space Vector3 to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    * @returns the new Vector3
    */
  def Unproject(
    source: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    view: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    projection: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Unproject from screen space to object space
    * @param sourceX defines the screen space x coordinate to use
    * @param sourceY defines the screen space y coordinate to use
    * @param sourceZ defines the screen space z coordinate to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    * @param result defines the Vector3 where to store the result
    */
  def UnprojectFloatsToRef(
    sourceX: float,
    sourceY: float,
    sourceZ: float,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    view: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    projection: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Unproject from screen space to object space
    * @param source defines the screen space Vector3 to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param transform defines the transform (view x projection) matrix to use
    * @returns the new Vector3
    */
  def UnprojectFromTransform(
    source: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Unproject from screen space to object space
    * @param source defines the screen space Vector3 to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    * @param result defines the Vector3 where to store the result
    */
  def UnprojectToRef(
    source: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    view: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    projection: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, 1.0, 0.0)
    * @returns a new up Vector3
    */
  def Up(): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Gets a up Vector3 that must not be updated
    */
  def UpReadOnly: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3] = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, 0.0, 0.0)
    * @returns a new empty Vector3
    */
  def Zero(): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Gets a zero Vector3 that must not be updated
    */
  def ZeroReadOnly: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3] = js.native
  
  /** @hidden */
  def _UnprojectFromInvertedMatrixToRef(
    source: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    matrix: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    result: typingsSlinky.babylonjs.mathVectorMod.Vector3
  ): Unit = js.native
  
  var _UpReadOnly: js.Any = js.native
  
  var _ZeroReadOnly: js.Any = js.native
}
