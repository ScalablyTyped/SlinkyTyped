package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Quaternion")
@js.native
/**
  * Creates a new Quaternion from the given floats
  * @param x defines the first component (0 by default)
  * @param y defines the second component (0 by default)
  * @param z defines the third component (0 by default)
  * @param w defines the fourth component (1.0 by default)
  */
class Quaternion ()
  extends typingsSlinky.babylonjs.indexMod.Quaternion {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    w: Double
  ) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "Quaternion")
@js.native
object Quaternion extends js.Object {
  
  /**
    * Checks if the two quaternions are close to each other
    * @param quat0 defines the first quaternion to check
    * @param quat1 defines the second quaternion to check
    * @returns true if the two quaternions are close to each other
    */
  def AreClose(
    quat0: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion],
    quat1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion]
  ): Boolean = js.native
  
  /**
    * Returns the dot product (float) between the quaternions "left" and "right"
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the dot product
    */
  def Dot(
    left: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion],
    right: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion]
  ): Double = js.native
  
  /**
    * Creates a new quaternion from data stored into an array
    * @param array defines the data source
    * @param offset defines the offset in the source array where the data starts
    * @returns a new quaternion
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Updates the given quaternion "result" from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the quaternion to store the result in
    */
  def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typingsSlinky.babylonjs.mathVectorMod.Quaternion
  ): Unit = js.native
  
  /**
    * Create a quaternion from Euler rotation angles
    * @param x Pitch
    * @param y Yaw
    * @param z Roll
    * @returns the new Quaternion
    */
  def FromEulerAngles(x: Double, y: Double, z: Double): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Updates a quaternion from Euler rotation angles
    * @param x Pitch
    * @param y Yaw
    * @param z Roll
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  def FromEulerAnglesToRef(x: Double, y: Double, z: Double, result: typingsSlinky.babylonjs.mathVectorMod.Quaternion): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Create a quaternion from Euler rotation vector
    * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
    * @returns the new Quaternion
    */
  def FromEulerVector(vec: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Updates a quaternion from Euler rotation vector
    * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
    * @param result the quaternion to store the result
    * @returns the updated quaternion
    */
  def FromEulerVectorToRef(
    vec: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    result: typingsSlinky.babylonjs.mathVectorMod.Quaternion
  ): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Creates a new quaternion from a rotation matrix
    * @param matrix defines the source matrix
    * @returns a new quaternion created from the given rotation matrix values
    */
  def FromRotationMatrix(matrix: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix]): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Updates the given quaternion with the given rotation matrix values
    * @param matrix defines the source matrix
    * @param result defines the target quaternion
    */
  def FromRotationMatrixToRef(
    matrix: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    result: typingsSlinky.babylonjs.mathVectorMod.Quaternion
  ): Unit = js.native
  
  /**
    * Interpolate between two quaternions using Hermite interpolation
    * @param value1 defines first quaternion
    * @param tangent1 defines the incoming tangent
    * @param value2 defines second quaternion
    * @param tangent2 defines the outgoing tangent
    * @param amount defines the target quaternion
    * @returns the new interpolated quaternion
    */
  def Hermite(
    value1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion],
    tangent1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion],
    value2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion],
    tangent2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion],
    amount: Double
  ): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Creates an identity quaternion
    * @returns the identity quaternion
    */
  def Identity(): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Inverse a given quaternion
    * @param q defines the source quaternion
    * @returns a new quaternion as the inverted current quaternion
    */
  def Inverse(q: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion]): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Inverse a given quaternion
    * @param q defines the source quaternion
    * @param result the quaternion the result will be stored in
    * @returns the result quaternion
    */
  def InverseToRef(
    q: typingsSlinky.babylonjs.mathVectorMod.Quaternion,
    result: typingsSlinky.babylonjs.mathVectorMod.Quaternion
  ): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Gets a boolean indicating if the given quaternion is identity
    * @param quaternion defines the quaternion to check
    * @returns true if the quaternion is identity
    */
  def IsIdentity(quaternion: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion]): Boolean = js.native
  
  /**
    * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation
    * @param alpha defines the rotation around first axis
    * @param beta defines the rotation around second axis
    * @param gamma defines the rotation around third axis
    * @returns the new quaternion
    */
  def RotationAlphaBetaGamma(alpha: Double, beta: Double, gamma: Double): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation and stores it in the target quaternion
    * @param alpha defines the rotation around first axis
    * @param beta defines the rotation around second axis
    * @param gamma defines the rotation around third axis
    * @param result defines the target quaternion
    */
  def RotationAlphaBetaGammaToRef(
    alpha: Double,
    beta: Double,
    gamma: Double,
    result: typingsSlinky.babylonjs.mathVectorMod.Quaternion
  ): Unit = js.native
  
  /**
    * Creates a quaternion from a rotation around an axis
    * @param axis defines the axis to use
    * @param angle defines the angle to use
    * @returns a new quaternion created from the given axis (Vector3) and angle in radians (float)
    */
  def RotationAxis(axis: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3], angle: Double): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Creates a rotation around an axis and stores it into the given quaternion
    * @param axis defines the axis to use
    * @param angle defines the angle to use
    * @param result defines the target quaternion
    * @returns the target quaternion
    */
  def RotationAxisToRef(
    axis: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    angle: Double,
    result: typingsSlinky.babylonjs.mathVectorMod.Quaternion
  ): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Creates a new quaternion containing the rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation)
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @returns the new quaternion
    */
  def RotationQuaternionFromAxis(
    axis1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    axis2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    axis3: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Creates a rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation) and stores it in the target quaternion
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @param ref defines the target quaternion
    */
  def RotationQuaternionFromAxisToRef(
    axis1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    axis2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    axis3: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    ref: typingsSlinky.babylonjs.mathVectorMod.Quaternion
  ): Unit = js.native
  
  /**
    * Creates a new quaternion from the given Euler float angles (y, x, z)
    * @param yaw defines the rotation around Y axis
    * @param pitch defines the rotation around X axis
    * @param roll defines the rotation around Z axis
    * @returns the new quaternion
    */
  def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Creates a new rotation from the given Euler float angles (y, x, z) and stores it in the target quaternion
    * @param yaw defines the rotation around Y axis
    * @param pitch defines the rotation around X axis
    * @param roll defines the rotation around Z axis
    * @param result defines the target quaternion
    */
  def RotationYawPitchRollToRef(yaw: Double, pitch: Double, roll: Double, result: typingsSlinky.babylonjs.mathVectorMod.Quaternion): Unit = js.native
  
  /**
    * Interpolates between two quaternions
    * @param left defines first quaternion
    * @param right defines second quaternion
    * @param amount defines the gradient to use
    * @returns the new interpolated quaternion
    */
  def Slerp(
    left: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion],
    right: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion],
    amount: Double
  ): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  
  /**
    * Interpolates between two quaternions and stores it into a target quaternion
    * @param left defines first quaternion
    * @param right defines second quaternion
    * @param amount defines the gradient to use
    * @param result defines the target quaternion
    */
  def SlerpToRef(
    left: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion],
    right: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Quaternion],
    amount: Double,
    result: typingsSlinky.babylonjs.mathVectorMod.Quaternion
  ): Unit = js.native
  
  /**
    * Creates an empty quaternion
    * @returns a new quaternion set to (0.0, 0.0, 0.0)
    */
  def Zero(): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
}
