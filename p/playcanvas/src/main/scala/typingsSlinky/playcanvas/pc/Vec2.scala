package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Vec2
  * @classdesc A 2-dimensional vector.
  * @description Creates a new Vec2 object.
  * @param {number|number[]} [x] - The x value. If x is an array of length 2, the array will be used to populate all components.
  * @param {number} [y] - The y value.
  * @example
  * var v = new pc.Vec2(1, 2);
  */
@js.native
trait Vec2 extends js.Object {
  /**
    * @field
    * @name pc.Vec2#x
    * @type {number}
    * @description The first element of the vector.
    * @example
    * var vec = new pc.Vec2(10, 20);
    *
    * // Get x
    * var x = vec.x;
    *
    * // Set x
    * vec.x = 0;
    */
  var x: Double = js.native
  /**
    * @field
    * @name pc.Vec2#y
    * @type {number}
    * @description The second element of the vector.
    * @example
    * var vec = new pc.Vec2(10, 20);
    *
    * // Get y
    * var y = vec.y;
    *
    * // Set y
    * vec.y = 0;
    */
  var y: Double = js.native
  /**
    * @function
    * @name pc.Vec2#add
    * @description Adds a 2-dimensional vector to another in place.
    * @param {pc.Vec2} rhs - The vector to add to the specified vector.
    * @returns {pc.Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(10, 10);
    * var b = new pc.Vec2(20, 20);
    *
    * a.add(b);
    *
    * // Should output [30, 30]
    * console.log("The result of the addition is: " + a.toString());
    */
  def add(rhs: Vec2): Vec2 = js.native
  /**
    * @function
    * @name pc.Vec2#add2
    * @description Adds two 2-dimensional vectors together and returns the result.
    * @param {pc.Vec2} lhs - The first vector operand for the addition.
    * @param {pc.Vec2} rhs - The second vector operand for the addition.
    * @returns {pc.Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(10, 10);
    * var b = new pc.Vec2(20, 20);
    * var r = new pc.Vec2();
    *
    * r.add2(a, b);
    * // Should output [30, 30]
    *
    * console.log("The result of the addition is: " + r.toString());
    */
  def add2(lhs: Vec2, rhs: Vec2): Vec2 = js.native
  /**
    * @function
    * @name pc.Vec2#copy
    * @description Copied the contents of a source 2-dimensional vector to a destination 2-dimensional vector.
    * @param {pc.Vec2} rhs - A vector to copy to the specified vector.
    * @returns {pc.Vec2} Self for chaining.
    * @example
    * var src = new pc.Vec2(10, 20);
    * var dst = new pc.Vec2();
    *
    * dst.copy(src);
    *
    * console.log("The two vectors are " + (dst.equals(src) ? "equal" : "different"));
    */
  def copy(rhs: Vec2): Vec2 = js.native
  /**
    * @function
    * @name pc.Vec2#distance
    * @description Returns the distance between the two specified 2-dimensional vectors.
    * @param {pc.Vec2} rhs - The second 2-dimensional vector to test.
    * @returns {number} The distance between the two vectors.
    * @example
    * var v1 = new pc.Vec2(5, 10);
    * var v2 = new pc.Vec2(10, 20);
    * var d = v1.distance(v2);
    * console.log("The between v1 and v2 is: " + d);
    */
  def distance(rhs: Vec2): Double = js.native
  /**
    * @function
    * @name pc.Vec2#dot
    * @description Returns the result of a dot product operation performed on the two specified 2-dimensional vectors.
    * @param {pc.Vec2} rhs - The second 2-dimensional vector operand of the dot product.
    * @returns {number} The result of the dot product operation.
    * @example
    * var v1 = new pc.Vec2(5, 10);
    * var v2 = new pc.Vec2(10, 20);
    * var v1dotv2 = v1.dot(v2);
    * console.log("The result of the dot product is: " + v1dotv2);
    */
  def dot(rhs: Vec2): Double = js.native
  /**
    * @function
    * @name pc.Vec2#equals
    * @description Reports whether two vectors are equal.
    * @param {pc.Vec2} rhs - The vector to compare to the specified vector.
    * @returns {boolean} True if the vectors are equal and false otherwise.
    * @example
    * var a = new pc.Vec2(1, 2);
    * var b = new pc.Vec2(4, 5);
    * console.log("The two vectors are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Vec2): Boolean = js.native
  /**
    * @function
    * @name pc.Vec2#length
    * @description Returns the magnitude of the specified 2-dimensional vector.
    * @returns {number} The magnitude of the specified 2-dimensional vector.
    * @example
    * var vec = new pc.Vec2(3, 4);
    * var len = vec.length();
    * // Should output 5
    * console.log("The length of the vector is: " + len);
    */
  def length(): Double = js.native
  /**
    * @function
    * @name pc.Vec2#lengthSq
    * @description Returns the magnitude squared of the specified 2-dimensional vector.
    * @returns {number} The magnitude of the specified 2-dimensional vector.
    * @example
    * var vec = new pc.Vec2(3, 4);
    * var len = vec.lengthSq();
    * // Should output 25
    * console.log("The length squared of the vector is: " + len);
    */
  def lengthSq(): Double = js.native
  /**
    * @function
    * @name pc.Vec2#lerp
    * @description Returns the result of a linear interpolation between two specified 2-dimensional vectors.
    * @param {pc.Vec2} lhs - The 2-dimensional to interpolate from.
    * @param {pc.Vec2} rhs - The 2-dimensional to interpolate to.
    * @param {number} alpha - The value controlling the point of interpolation. Between 0 and 1, the linear interpolant
    * will occur on a straight line between lhs and rhs. Outside of this range, the linear interpolant will occur on
    * a ray extrapolated from this line.
    * @returns {pc.Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(0, 0);
    * var b = new pc.Vec2(10, 10);
    * var r = new pc.Vec2();
    *
    * r.lerp(a, b, 0);   // r is equal to a
    * r.lerp(a, b, 0.5); // r is 5, 5
    * r.lerp(a, b, 1);   // r is equal to b
    */
  def lerp(lhs: Vec2, rhs: Vec2, alpha: Double): Vec2 = js.native
  /**
    * @function
    * @name pc.Vec2#mul
    * @description Multiplies a 2-dimensional vector to another in place.
    * @param {pc.Vec2} rhs - The 2-dimensional vector used as the second multiplicand of the operation.
    * @returns {pc.Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(2, 3);
    * var b = new pc.Vec2(4, 5);
    *
    * a.mul(b);
    *
    * // Should output 8, 15
    * console.log("The result of the multiplication is: " + a.toString());
    */
  def mul(rhs: Vec2): Vec2 = js.native
  /**
    * @function
    * @name pc.Vec2#mul2
    * @description Returns the result of multiplying the specified 2-dimensional vectors together.
    * @param {pc.Vec2} lhs - The 2-dimensional vector used as the first multiplicand of the operation.
    * @param {pc.Vec2} rhs - The 2-dimensional vector used as the second multiplicand of the operation.
    * @returns {pc.Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(2, 3);
    * var b = new pc.Vec2(4, 5);
    * var r = new pc.Vec2();
    *
    * r.mul2(a, b);
    *
    * // Should output 8, 15
    * console.log("The result of the multiplication is: " + r.toString());
    */
  def mul2(lhs: Vec2, rhs: Vec2): Vec2 = js.native
  /**
    * @function
    * @name pc.Vec2#normalize
    * @description Returns this 2-dimensional vector converted to a unit vector in place.
    * If the vector has a length of zero, the vector's elements will be set to zero.
    * @returns {pc.Vec2} Self for chaining.
    * @example
    * var v = new pc.Vec2(25, 0);
    *
    * v.normalize();
    *
    * // Should output 1, 0
    * console.log("The result of the vector normalization is: " + v.toString());
    */
  def normalize(): Vec2 = js.native
  /**
    * @function
    * @name pc.Vec2#scale
    * @description Scales each component of the specified 2-dimensional vector by the supplied
    * scalar value.
    * @param {number} scalar - The value by which each vector component is multiplied.
    * @returns {pc.Vec2} Self for chaining.
    * @example
    * var v = new pc.Vec2(2, 4);
    *
    * // Multiply by 2
    * v.scale(2);
    *
    * // Negate
    * v.scale(-1);
    *
    * // Divide by 2
    * v.scale(0.5);
    */
  def scale(scalar: Double): Vec2 = js.native
  /**
    * @function
    * @name pc.Vec2#set
    * @description Sets the specified 2-dimensional vector to the supplied numerical values.
    * @param {number} x - The value to set on the first component of the vector.
    * @param {number} y - The value to set on the second component of the vector.
    * @returns {pc.Vec2} Self for chaining.
    * @example
    * var v = new pc.Vec2();
    * v.set(5, 10);
    *
    * // Should output 5, 10
    * console.log("The result of the vector set is: " + v.toString());
    */
  def set(x: Double, y: Double): Vec2 = js.native
  /**
    * @function
    * @name pc.Vec2#sub
    * @description Subtracts a 2-dimensional vector from another in place.
    * @param {pc.Vec2} rhs - The vector to add to the specified vector.
    * @returns {pc.Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(10, 10);
    * var b = new pc.Vec2(20, 20);
    *
    * a.sub(b);
    *
    * // Should output [-10, -10]
    * console.log("The result of the addition is: " + a.toString());
    */
  def sub(rhs: Vec2): Vec2 = js.native
  /**
    * @function
    * @name pc.Vec2#sub2
    * @description Subtracts two 2-dimensional vectors from one another and returns the result.
    * @param {pc.Vec2} lhs - The first vector operand for the addition.
    * @param {pc.Vec2} rhs - The second vector operand for the addition.
    * @returns {pc.Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(10, 10);
    * var b = new pc.Vec2(20, 20);
    * var r = new pc.Vec2();
    *
    * r.sub2(a, b);
    *
    * // Should output [-10, -10]
    * console.log("The result of the addition is: " + r.toString());
    */
  def sub2(lhs: Vec2, rhs: Vec2): Vec2 = js.native
}

object Vec2 {
  @scala.inline
  def apply(
    add: Vec2 => Vec2,
    add2: (Vec2, Vec2) => Vec2,
    copy: Vec2 => Vec2,
    distance: Vec2 => Double,
    dot: Vec2 => Double,
    equals: Vec2 => Boolean,
    length: () => Double,
    lengthSq: () => Double,
    lerp: (Vec2, Vec2, Double) => Vec2,
    mul: Vec2 => Vec2,
    mul2: (Vec2, Vec2) => Vec2,
    normalize: () => Vec2,
    scale: Double => Vec2,
    set: (Double, Double) => Vec2,
    sub: Vec2 => Vec2,
    sub2: (Vec2, Vec2) => Vec2,
    x: Double,
    y: Double
  ): Vec2 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), add2 = js.Any.fromFunction2(add2), copy = js.Any.fromFunction1(copy), distance = js.Any.fromFunction1(distance), dot = js.Any.fromFunction1(dot), equals = js.Any.fromFunction1(equals), length = js.Any.fromFunction0(length), lengthSq = js.Any.fromFunction0(lengthSq), lerp = js.Any.fromFunction3(lerp), mul = js.Any.fromFunction1(mul), mul2 = js.Any.fromFunction2(mul2), normalize = js.Any.fromFunction0(normalize), scale = js.Any.fromFunction1(scale), set = js.Any.fromFunction2(set), sub = js.Any.fromFunction1(sub), sub2 = js.Any.fromFunction2(sub2), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vec2]
  }
  @scala.inline
  implicit class Vec2Ops[Self <: Vec2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Vec2 => Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdd2(value: (Vec2, Vec2) => Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCopy(value: Vec2 => Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDistance(value: Vec2 => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDot(value: Vec2 => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquals(value: Vec2 => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLengthSq(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthSq")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLerp(value: (Vec2, Vec2, Double) => Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lerp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMul(value: Vec2 => Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mul")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMul2(value: (Vec2, Vec2) => Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mul2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNormalize(value: () => Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScale(value: Double => Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (Double, Double) => Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSub(value: Vec2 => Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSub2(value: (Vec2, Vec2) => Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

