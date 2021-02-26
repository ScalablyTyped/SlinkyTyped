package typingsSlinky.phaser.mod

import typingsSlinky.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Vector` module contains methods for creating and manipulating vectors.
  * Vectors are the basis of all the geometry related operations in the engine.
  * A `Matter.Vector` object is of the form `{ x: 0, y: 0 }`.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Vector
  */
@JSImport("matter", "Vector")
@js.native
class Vector ()
  extends typingsSlinky.phaser.MatterJS.Vector
object Vector {
  
  /**
    * Adds the two vectors.
    * @method add
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB added
    */
  /* static member */
  @JSImport("matter", "Vector.add")
  @js.native
  def add(vectorA: typingsSlinky.phaser.MatterJS.Vector, vectorB: typingsSlinky.phaser.MatterJS.Vector): typingsSlinky.phaser.MatterJS.Vector = js.native
  @JSImport("matter", "Vector.add")
  @js.native
  def add(
    vectorA: typingsSlinky.phaser.MatterJS.Vector,
    vectorB: typingsSlinky.phaser.MatterJS.Vector,
    output: typingsSlinky.phaser.MatterJS.Vector
  ): typingsSlinky.phaser.MatterJS.Vector = js.native
  
  /**
    * Returns the angle in radians between the two vectors relative to the x-axis.
    * @method angle
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The angle in radians
    */
  /* static member */
  @JSImport("matter", "Vector.angle")
  @js.native
  def angle(vectorA: typingsSlinky.phaser.MatterJS.Vector, vectorB: typingsSlinky.phaser.MatterJS.Vector): Double = js.native
  
  /**
    * Returns a new vector with `x` and `y` copied from the given `vector`.
    * @method clone
    * @param {vector} vector
    * @return {vector} A new cloned vector
    */
  /* static member */
  @JSImport("matter", "Vector.clone")
  @js.native
  def clone_(vector: typingsSlinky.phaser.MatterJS.Vector): typingsSlinky.phaser.MatterJS.Vector = js.native
  
  /**
    * Creates a new vector.
    * @method create
    * @param {number} x
    * @param {number} y
    * @return {vector} A new vector
    */
  /* static member */
  @JSImport("matter", "Vector.create")
  @js.native
  def create(): typingsSlinky.phaser.MatterJS.Vector = js.native
  @JSImport("matter", "Vector.create")
  @js.native
  def create(x: js.UndefOr[scala.Nothing], y: Double): typingsSlinky.phaser.MatterJS.Vector = js.native
  @JSImport("matter", "Vector.create")
  @js.native
  def create(x: Double): typingsSlinky.phaser.MatterJS.Vector = js.native
  @JSImport("matter", "Vector.create")
  @js.native
  def create(x: Double, y: Double): typingsSlinky.phaser.MatterJS.Vector = js.native
  
  /**
    * Returns the cross-product of two vectors.
    * @method cross
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The cross product of the two vectors
    */
  /* static member */
  @JSImport("matter", "Vector.cross")
  @js.native
  def cross(vectorA: typingsSlinky.phaser.MatterJS.Vector, vectorB: typingsSlinky.phaser.MatterJS.Vector): Double = js.native
  
  /**
    * Returns the cross-product of three vectors.
    * @method cross3
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} vectorC
    * @return {number} The cross product of the three vectors
    */
  /* static member */
  @JSImport("matter", "Vector.cross3")
  @js.native
  def cross3(
    vectorA: typingsSlinky.phaser.MatterJS.Vector,
    vectorB: typingsSlinky.phaser.MatterJS.Vector,
    vectorC: typingsSlinky.phaser.MatterJS.Vector
  ): Double = js.native
  
  /**
    * Divides a vector and a scalar.
    * @method div
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector divided by scalar
    */
  /* static member */
  @JSImport("matter", "Vector.div")
  @js.native
  def div(vector: typingsSlinky.phaser.MatterJS.Vector, scalar: Double): typingsSlinky.phaser.MatterJS.Vector = js.native
  
  /**
    * Returns the dot-product of two vectors.
    * @method dot
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The dot product of the two vectors
    */
  /* static member */
  @JSImport("matter", "Vector.dot")
  @js.native
  def dot(vectorA: typingsSlinky.phaser.MatterJS.Vector, vectorB: typingsSlinky.phaser.MatterJS.Vector): Number = js.native
  
  /**
    * Returns the magnitude (length) of a vector.
    * @method magnitude
    * @param {vector} vector
    * @return {number} The magnitude of the vector
    */
  /* static member */
  @JSImport("matter", "Vector.magnitude")
  @js.native
  def magnitude(vector: typingsSlinky.phaser.MatterJS.Vector): Double = js.native
  
  /**
    * Returns the magnitude (length) of a vector (therefore saving a `sqrt` operation).
    * @method magnitudeSquared
    * @param {vector} vector
    * @return {number} The squared magnitude of the vector
    */
  /* static member */
  @JSImport("matter", "Vector.magnitudeSquared")
  @js.native
  def magnitudeSquared(vector: typingsSlinky.phaser.MatterJS.Vector): Double = js.native
  
  /**
    * Multiplies a vector and a scalar.
    * @method mult
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector multiplied by scalar
    */
  /* static member */
  @JSImport("matter", "Vector.mult")
  @js.native
  def mult(vector: typingsSlinky.phaser.MatterJS.Vector, scalar: Double): typingsSlinky.phaser.MatterJS.Vector = js.native
  
  /**
    * Negates both components of a vector such that it points in the opposite direction.
    * @method neg
    * @param {vector} vector
    * @return {vector} The negated vector
    */
  /* static member */
  @JSImport("matter", "Vector.neg")
  @js.native
  def neg(vector: typingsSlinky.phaser.MatterJS.Vector): typingsSlinky.phaser.MatterJS.Vector = js.native
  
  /**
    * Normalises a vector (such that its magnitude is `1`).
    * @method normalise
    * @param {vector} vector
    * @return {vector} A new vector normalised
    */
  /* static member */
  @JSImport("matter", "Vector.normalise")
  @js.native
  def normalise(vector: typingsSlinky.phaser.MatterJS.Vector): typingsSlinky.phaser.MatterJS.Vector = js.native
  
  /**
    * Returns the perpendicular vector. Set `negate` to true for the perpendicular in the opposite direction.
    * @method perp
    * @param {vector} vector
    * @param {bool} [negate=false]
    * @return {vector} The perpendicular vector
    */
  /* static member */
  @JSImport("matter", "Vector.perp")
  @js.native
  def perp(vector: typingsSlinky.phaser.MatterJS.Vector): typingsSlinky.phaser.MatterJS.Vector = js.native
  @JSImport("matter", "Vector.perp")
  @js.native
  def perp(vector: typingsSlinky.phaser.MatterJS.Vector, negate: Boolean): typingsSlinky.phaser.MatterJS.Vector = js.native
  
  /**
    * Rotates the vector about (0, 0) by specified angle.
    * @method rotate
    * @param {vector} vector
    * @param {number} angle
    * @return {vector} A new vector rotated about (0, 0)
    */
  /* static member */
  @JSImport("matter", "Vector.rotate")
  @js.native
  def rotate(vector: typingsSlinky.phaser.MatterJS.Vector, angle: Double): typingsSlinky.phaser.MatterJS.Vector = js.native
  
  /**
    * Rotates the vector about a specified point by specified angle.
    * @method rotateAbout
    * @param {vector} vector
    * @param {number} angle
    * @param {vector} point
    * @param {vector} [output]
    * @return {vector} A new vector rotated about the point
    */
  /* static member */
  @JSImport("matter", "Vector.rotateAbout")
  @js.native
  def rotateAbout(
    vector: typingsSlinky.phaser.MatterJS.Vector,
    angle: Double,
    point: typingsSlinky.phaser.MatterJS.Vector
  ): typingsSlinky.phaser.MatterJS.Vector = js.native
  @JSImport("matter", "Vector.rotateAbout")
  @js.native
  def rotateAbout(
    vector: typingsSlinky.phaser.MatterJS.Vector,
    angle: Double,
    point: typingsSlinky.phaser.MatterJS.Vector,
    output: typingsSlinky.phaser.MatterJS.Vector
  ): typingsSlinky.phaser.MatterJS.Vector = js.native
  
  /**
    * Subtracts the two vectors.
    * @method sub
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB subtracted
    */
  /* static member */
  @JSImport("matter", "Vector.sub")
  @js.native
  def sub(vectorA: typingsSlinky.phaser.MatterJS.Vector, vectorB: typingsSlinky.phaser.MatterJS.Vector): typingsSlinky.phaser.MatterJS.Vector = js.native
  @JSImport("matter", "Vector.sub")
  @js.native
  def sub(
    vectorA: typingsSlinky.phaser.MatterJS.Vector,
    vectorB: typingsSlinky.phaser.MatterJS.Vector,
    optional: typingsSlinky.phaser.MatterJS.Vector
  ): typingsSlinky.phaser.MatterJS.Vector = js.native
}
