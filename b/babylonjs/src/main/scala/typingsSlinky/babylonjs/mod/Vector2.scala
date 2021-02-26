package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Vector2")
@js.native
/**
  * Creates a new Vector2 from the given x and y coordinates
  * @param x defines the first coordinate
  * @param y defines the second coordinate
  */
class Vector2 ()
  extends typingsSlinky.babylonjs.legacyMod.Vector2 {
  def this(/** defines the first coordinate */
  x: Double) = this()
  def this(
    /** defines the first coordinate */
  x: js.UndefOr[scala.Nothing],
    /** defines the second coordinate */
  y: Double
  ) = this()
  def this(/** defines the first coordinate */
  x: Double, /** defines the second coordinate */
  y: Double) = this()
}
/* static members */
object Vector2 {
  
  /**
    * Gets a new Vector2 located for "amount" (float) on the CatmullRom spline defined by the given four Vector2
    * @param value1 defines 1st point of control
    * @param value2 defines 2nd point of control
    * @param value3 defines 3rd point of control
    * @param value4 defines 4th point of control
    * @param amount defines the interpolation factor
    * @returns a new Vector2
    */
  @JSImport("babylonjs", "Vector2.CatmullRom")
  @js.native
  def CatmullRom(
    value1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    value2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    value3: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    value4: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    amount: Double
  ): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
  
  /**
    * Gets a new Vector2 located at the center of the vectors "value1" and "value2"
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @returns a new Vector2
    */
  @JSImport("babylonjs", "Vector2.Center")
  @js.native
  def Center(
    value1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    value2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
  
  /**
    * Returns a new Vector2 set with same the coordinates than "value" ones if the vector "value" is in the square defined by "min" and "max".
    * If a coordinate of "value" is lower than "min" coordinates, the returned Vector2 is given this "min" coordinate.
    * If a coordinate of "value" is greater than "max" coordinates, the returned Vector2 is given this "max" coordinate
    * @param value defines the value to clamp
    * @param min defines the lower limit
    * @param max defines the upper limit
    * @returns a new Vector2
    */
  @JSImport("babylonjs", "Vector2.Clamp")
  @js.native
  def Clamp(
    value: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    min: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    max: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
  
  /**
    * Gets the distance between the vectors "value1" and "value2"
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @returns the distance between vectors
    */
  @JSImport("babylonjs", "Vector2.Distance")
  @js.native
  def Distance(
    value1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    value2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2]
  ): Double = js.native
  
  /**
    * Gets the shortest distance (float) between the point "p" and the segment defined by the two points "segA" and "segB".
    * @param p defines the middle point
    * @param segA defines one point of the segment
    * @param segB defines the other point of the segment
    * @returns the shortest distance
    */
  @JSImport("babylonjs", "Vector2.DistanceOfPointFromSegment")
  @js.native
  def DistanceOfPointFromSegment(
    p: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    segA: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    segB: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2]
  ): Double = js.native
  
  /**
    * Returns the squared distance between the vectors "value1" and "value2"
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @returns the squared distance between vectors
    */
  @JSImport("babylonjs", "Vector2.DistanceSquared")
  @js.native
  def DistanceSquared(
    value1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    value2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2]
  ): Double = js.native
  
  /**
    * Gets the dot product of the vector "left" and the vector "right"
    * @param left defines first vector
    * @param right defines second vector
    * @returns the dot product (float)
    */
  @JSImport("babylonjs", "Vector2.Dot")
  @js.native
  def Dot(
    left: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    right: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2]
  ): Double = js.native
  
  /**
    * Gets a new Vector2 set from the given index element of the given array
    * @param array defines the data source
    * @param offset defines the offset in the data source
    * @returns a new Vector2
    */
  @JSImport("babylonjs", "Vector2.FromArray")
  @js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
  @JSImport("babylonjs", "Vector2.FromArray")
  @js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
  
  /**
    * Sets "result" from the given index element of the given array
    * @param array defines the data source
    * @param offset defines the offset in the data source
    * @param result defines the target vector
    */
  @JSImport("babylonjs", "Vector2.FromArrayToRef")
  @js.native
  def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typingsSlinky.babylonjs.mathVectorMod.Vector2
  ): Unit = js.native
  
  /**
    * Returns a new Vector2 located for "amount" (float) on the Hermite spline defined by the vectors "value1", "value3", "tangent1", "tangent2"
    * @param value1 defines the 1st control point
    * @param tangent1 defines the outgoing tangent
    * @param value2 defines the 2nd control point
    * @param tangent2 defines the incoming tangent
    * @param amount defines the interpolation factor
    * @returns a new Vector2
    */
  @JSImport("babylonjs", "Vector2.Hermite")
  @js.native
  def Hermite(
    value1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    tangent1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    value2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    tangent2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    amount: Double
  ): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
  
  /**
    * Returns a new Vector2 located for "amount" (float) on the linear interpolation between the vector "start" adn the vector "end".
    * @param start defines the start vector
    * @param end defines the end vector
    * @param amount defines the interpolation factor
    * @returns a new Vector2
    */
  @JSImport("babylonjs", "Vector2.Lerp")
  @js.native
  def Lerp(
    start: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    end: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    amount: Double
  ): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
  
  /**
    * Gets a new Vecto2 set with the maximal coordinate values from the "left" and "right" vectors
    * @param left defines 1st vector
    * @param right defines 2nd vector
    * @returns a new Vector2
    */
  @JSImport("babylonjs", "Vector2.Maximize")
  @js.native
  def Maximize(
    left: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    right: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
  
  /**
    * Gets a new Vector2 set with the minimal coordinate values from the "left" and "right" vectors
    * @param left defines 1st vector
    * @param right defines 2nd vector
    * @returns a new Vector2
    */
  @JSImport("babylonjs", "Vector2.Minimize")
  @js.native
  def Minimize(
    left: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    right: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
  
  /**
    * Returns a new Vector2 equal to the normalized given vector
    * @param vector defines the vector to normalize
    * @returns a new Vector2
    */
  @JSImport("babylonjs", "Vector2.Normalize")
  @js.native
  def Normalize(vector: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2]): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
  
  /**
    * Gets a new Vector2(1, 1)
    * @returns a new Vector2
    */
  @JSImport("babylonjs", "Vector2.One")
  @js.native
  def One(): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
  
  /**
    * Determines if a given vector is included in a triangle
    * @param p defines the vector to test
    * @param p0 defines 1st triangle point
    * @param p1 defines 2nd triangle point
    * @param p2 defines 3rd triangle point
    * @returns true if the point "p" is in the triangle defined by the vertors "p0", "p1", "p2"
    */
  @JSImport("babylonjs", "Vector2.PointInTriangle")
  @js.native
  def PointInTriangle(
    p: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    p0: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    p1: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    p2: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2]
  ): Boolean = js.native
  
  /**
    * Gets a new Vector2 set with the transformed coordinates of the given vector by the given transformation matrix
    * @param vector defines the vector to transform
    * @param transformation defines the matrix to apply
    * @returns a new Vector2
    */
  @JSImport("babylonjs", "Vector2.Transform")
  @js.native
  def Transform(
    vector: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    transformation: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix]
  ): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
  
  /**
    * Transforms the given vector coordinates by the given transformation matrix and stores the result in the vector "result" coordinates
    * @param vector defines the vector to transform
    * @param transformation defines the matrix to apply
    * @param result defines the target vector
    */
  @JSImport("babylonjs", "Vector2.TransformToRef")
  @js.native
  def TransformToRef(
    vector: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    transformation: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    result: typingsSlinky.babylonjs.mathVectorMod.Vector2
  ): Unit = js.native
  
  /**
    * Gets a new Vector2(0, 0)
    * @returns a new Vector2
    */
  @JSImport("babylonjs", "Vector2.Zero")
  @js.native
  def Zero(): typingsSlinky.babylonjs.mathVectorMod.Vector2 = js.native
}
