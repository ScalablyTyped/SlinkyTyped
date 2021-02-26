package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.DeepImmutable
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Vector4")
@js.native
class Vector4 protected ()
  extends typingsSlinky.babylonjs.BABYLON.Vector4 {
  /**
    * Creates a Vector4 object from the given floats.
    * @param x x value of the vector
    * @param y y value of the vector
    * @param z z value of the vector
    * @param w w value of the vector
    */
  def this(
    /** x value of the vector */
  x: Double,
    /** y value of the vector */
  y: Double,
    /** z value of the vector */
  z: Double,
    /** w value of the vector */
  w: Double
  ) = this()
}
/* static members */
object Vector4 {
  
  /**
    * Returns a new Vector4 located at the center between the vectors "value1" and "value2".
    * @param value1 value to calulate the center between
    * @param value2 value to calulate the center between
    * @return the center between the two vectors
    */
  @JSGlobal("BABYLON.Vector4.Center")
  @js.native
  def Center(
    value1: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4],
    value2: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4]
  ): typingsSlinky.babylonjs.BABYLON.Vector4 = js.native
  
  /**
    * Returns the distance (float) between the vectors "value1" and "value2".
    * @param value1 value to calulate the distance between
    * @param value2 value to calulate the distance between
    * @return the distance between the two vectors
    */
  @JSGlobal("BABYLON.Vector4.Distance")
  @js.native
  def Distance(
    value1: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4],
    value2: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4]
  ): Double = js.native
  
  /**
    * Returns the squared distance (float) between the vectors "value1" and "value2".
    * @param value1 value to calulate the distance between
    * @param value2 value to calulate the distance between
    * @return the distance between the two vectors squared
    */
  @JSGlobal("BABYLON.Vector4.DistanceSquared")
  @js.native
  def DistanceSquared(
    value1: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4],
    value2: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4]
  ): Double = js.native
  
  /**
    * Returns a new Vector4 set from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @returns the new vector
    */
  @JSGlobal("BABYLON.Vector4.FromArray")
  @js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): typingsSlinky.babylonjs.BABYLON.Vector4 = js.native
  @JSGlobal("BABYLON.Vector4.FromArray")
  @js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typingsSlinky.babylonjs.BABYLON.Vector4 = js.native
  
  /**
    * Updates the given vector "result" from the starting index of the given array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the vector to store the result in
    */
  @JSGlobal("BABYLON.Vector4.FromArrayToRef")
  @js.native
  def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typingsSlinky.babylonjs.BABYLON.Vector4
  ): Unit = js.native
  
  /**
    * Updates the given vector "result" from the starting index of the given Float32Array.
    * @param array the array to pull values from
    * @param offset the offset into the array to start at
    * @param result the vector to store the result in
    */
  @JSGlobal("BABYLON.Vector4.FromFloatArrayToRef")
  @js.native
  def FromFloatArrayToRef(
    array: DeepImmutable[js.typedarray.Float32Array],
    offset: Double,
    result: typingsSlinky.babylonjs.BABYLON.Vector4
  ): Unit = js.native
  
  /**
    * Updates the given vector "result" coordinates from the given floats.
    * @param x float to set from
    * @param y float to set from
    * @param z float to set from
    * @param w float to set from
    * @param result the vector to the floats in
    */
  @JSGlobal("BABYLON.Vector4.FromFloatsToRef")
  @js.native
  def FromFloatsToRef(x: Double, y: Double, z: Double, w: Double, result: typingsSlinky.babylonjs.BABYLON.Vector4): Unit = js.native
  
  /**
    * Creates a new Vector4 from a Vector3
    * @param source defines the source data
    * @param w defines the 4th component (default is 0)
    * @returns a new Vector4
    */
  @JSGlobal("BABYLON.Vector4.FromVector3")
  @js.native
  def FromVector3(source: typingsSlinky.babylonjs.BABYLON.Vector3): typingsSlinky.babylonjs.BABYLON.Vector4 = js.native
  @JSGlobal("BABYLON.Vector4.FromVector3")
  @js.native
  def FromVector3(source: typingsSlinky.babylonjs.BABYLON.Vector3, w: Double): typingsSlinky.babylonjs.BABYLON.Vector4 = js.native
  
  /**
    * Returns a vector with the maximum values from the left and right vectors
    * @param left left vector to maximize
    * @param right right vector to maximize
    * @returns a new vector with the maximum of the left and right vector values
    */
  @JSGlobal("BABYLON.Vector4.Maximize")
  @js.native
  def Maximize(
    left: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4],
    right: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4]
  ): typingsSlinky.babylonjs.BABYLON.Vector4 = js.native
  
  /**
    * Returns a vector with the minimum values from the left and right vectors
    * @param left left vector to minimize
    * @param right right vector to minimize
    * @returns a new vector with the minimum of the left and right vector values
    */
  @JSGlobal("BABYLON.Vector4.Minimize")
  @js.native
  def Minimize(
    left: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4],
    right: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4]
  ): typingsSlinky.babylonjs.BABYLON.Vector4 = js.native
  
  /**
    * Returns a new normalized Vector4 from the given one.
    * @param vector the vector to normalize
    * @returns the vector
    */
  @JSGlobal("BABYLON.Vector4.Normalize")
  @js.native
  def Normalize(vector: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4]): typingsSlinky.babylonjs.BABYLON.Vector4 = js.native
  
  /**
    * Updates the given vector "result" from the normalization of the given one.
    * @param vector the vector to normalize
    * @param result the vector to store the result in
    */
  @JSGlobal("BABYLON.Vector4.NormalizeToRef")
  @js.native
  def NormalizeToRef(
    vector: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4],
    result: typingsSlinky.babylonjs.BABYLON.Vector4
  ): Unit = js.native
  
  /**
    * Returns a new Vector4 set to (1.0, 1.0, 1.0, 1.0)
    * @returns the new vector
    */
  @JSGlobal("BABYLON.Vector4.One")
  @js.native
  def One(): typingsSlinky.babylonjs.BABYLON.Vector4 = js.native
  
  /**
    * Returns a new Vector4 set with the result of the normal transformation by the given matrix of the given vector.
    * This methods computes transformed normalized direction vectors only.
    * @param vector the vector to transform
    * @param transformation the transformation matrix to apply
    * @returns the new vector
    */
  @JSGlobal("BABYLON.Vector4.TransformNormal")
  @js.native
  def TransformNormal(
    vector: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4],
    transformation: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix]
  ): typingsSlinky.babylonjs.BABYLON.Vector4 = js.native
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z, w).
    * This methods computes transformed normalized direction vectors only.
    * @param x value to transform
    * @param y value to transform
    * @param z value to transform
    * @param w value to transform
    * @param transformation the transformation matrix to apply
    * @param result the vector to store the results in
    */
  @JSGlobal("BABYLON.Vector4.TransformNormalFromFloatsToRef")
  @js.native
  def TransformNormalFromFloatsToRef(
    x: Double,
    y: Double,
    z: Double,
    w: Double,
    transformation: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    result: typingsSlinky.babylonjs.BABYLON.Vector4
  ): Unit = js.native
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector.
    * This methods computes transformed normalized direction vectors only.
    * @param vector the vector to transform
    * @param transformation the transformation matrix to apply
    * @param result the vector to store the result in
    */
  @JSGlobal("BABYLON.Vector4.TransformNormalToRef")
  @js.native
  def TransformNormalToRef(
    vector: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector4],
    transformation: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    result: typingsSlinky.babylonjs.BABYLON.Vector4
  ): Unit = js.native
  
  /**
    * Returns a new Vector4 set to (0.0, 0.0, 0.0, 0.0)
    * @returns the new vector
    */
  @JSGlobal("BABYLON.Vector4.Zero")
  @js.native
  def Zero(): typingsSlinky.babylonjs.BABYLON.Vector4 = js.native
}
