package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new Vec3 object.
  * @example
  * var v = new pc.Vec3(1, 2, 3);
  * @param [x] - The x value. If x is an array of length 3, the array will be used to populate all components.
  * @param [y] - The y value.
  * @param [z] - The z value.
  */
@js.native
trait Vec3 extends js.Object {
  
  /**
    * Adds a 3-dimensional vector to another in place.
    * @example
    * var a = new pc.Vec3(10, 10, 10);
    var b = new pc.Vec3(20, 20, 20);
    
    a.add(b);
    
    // Should output [30, 30, 30]
    console.log("The result of the addition is: " + a.toString());
    * @param rhs - The vector to add to the specified vector.
    * @returns Self for chaining.
    */
  def add(rhs: Vec3): Vec3 = js.native
  
  /**
    * Adds two 3-dimensional vectors together and returns the result.
    * @example
    * var a = new pc.Vec3(10, 10, 10);
    var b = new pc.Vec3(20, 20, 20);
    var r = new pc.Vec3();
    
    r.add2(a, b);
    // Should output [30, 30, 30]
    
    console.log("The result of the addition is: " + r.toString());
    * @param lhs - The first vector operand for the addition.
    * @param rhs - The second vector operand for the addition.
    * @returns Self for chaining.
    */
  def add2(lhs: Vec3, rhs: Vec3): Vec3 = js.native
  
  /**
    * Copied the contents of a source 3-dimensional vector to a destination 3-dimensional vector.
    * @example
    * var src = new pc.Vec3(10, 20, 30);
    var dst = new pc.Vec3();
    
    dst.copy(src);
    
    console.log("The two vectors are " + (dst.equals(src) ? "equal" : "different"));
    * @param rhs - A vector to copy to the specified vector.
    * @returns Self for chaining.
    */
  def copy(rhs: Vec3): Vec3 = js.native
  
  /**
    * Returns the result of a cross product operation performed on the two specified 3-dimensional vectors.
    * @example
    * var back = new pc.Vec3().cross(pc.Vec3.RIGHT, pc.Vec3.UP);
    
    // Should print the Z axis (i.e. [0, 0, 1])
    console.log("The result of the cross product is: " + back.toString());
    * @param lhs - The first 3-dimensional vector operand of the cross product.
    * @param rhs - The second 3-dimensional vector operand of the cross product.
    * @returns Self for chaining.
    */
  def cross(lhs: Vec3, rhs: Vec3): Vec3 = js.native
  
  /**
    * Returns the distance between the two specified 3-dimensional vectors.
    * @example
    * var v1 = new pc.Vec3(5, 10, 20);
    var v2 = new pc.Vec3(10, 20, 40);
    var d = v1.distance(v2);
    console.log("The between v1 and v2 is: " + d);
    * @param rhs - The second 3-dimensional vector to test.
    * @returns The distance between the two vectors.
    */
  def distance(rhs: Vec3): Double = js.native
  
  /**
    * Returns the result of a dot product operation performed on the two specified 3-dimensional vectors.
    * @example
    * var v1 = new pc.Vec3(5, 10, 20);
    var v2 = new pc.Vec3(10, 20, 40);
    var v1dotv2 = v1.dot(v2);
    console.log("The result of the dot product is: " + v1dotv2);
    * @param rhs - The second 3-dimensional vector operand of the dot product.
    * @returns The result of the dot product operation.
    */
  def dot(rhs: Vec3): Double = js.native
  
  /**
    * Reports whether two vectors are equal.
    * @example
    * var a = new pc.Vec3(1, 2, 3);
    var b = new pc.Vec3(4, 5, 6);
    console.log("The two vectors are " + (a.equals(b) ? "equal" : "different"));
    * @param rhs - The vector to compare to the specified vector.
    * @returns True if the vectors are equal and false otherwise.
    */
  def equals(rhs: Vec3): Boolean = js.native
  
  /**
    * Returns the magnitude of the specified 3-dimensional vector.
    * @example
    * var vec = new pc.Vec3(3, 4, 0);
    var len = vec.length();
    // Should output 5
    console.log("The length of the vector is: " + len);
    * @returns The magnitude of the specified 3-dimensional vector.
    */
  def length(): Double = js.native
  
  /**
    * Returns the magnitude squared of the specified 3-dimensional vector.
    * @example
    * var vec = new pc.Vec3(3, 4, 0);
    var len = vec.lengthSq();
    // Should output 25
    console.log("The length squared of the vector is: " + len);
    * @returns The magnitude of the specified 3-dimensional vector.
    */
  def lengthSq(): Double = js.native
  
  /**
    * Returns the result of a linear interpolation between two specified 3-dimensional vectors.
    * @example
    * var a = new pc.Vec3(0, 0, 0);
    var b = new pc.Vec3(10, 10, 10);
    var r = new pc.Vec3();
    
    r.lerp(a, b, 0);   // r is equal to a
    r.lerp(a, b, 0.5); // r is 5, 5, 5
    r.lerp(a, b, 1);   // r is equal to b
    * @param lhs - The 3-dimensional to interpolate from.
    * @param rhs - The 3-dimensional to interpolate to.
    * @param alpha - The value controlling the point of interpolation. Between 0 and 1, the linear interpolant
    will occur on a straight line between lhs and rhs. Outside of this range, the linear interpolant will occur on
    a ray extrapolated from this line.
    * @returns Self for chaining.
    */
  def lerp(lhs: Vec3, rhs: Vec3, alpha: Double): Vec3 = js.native
  
  /**
    * Multiplies a 3-dimensional vector to another in place.
    * @example
    * var a = new pc.Vec3(2, 3, 4);
    var b = new pc.Vec3(4, 5, 6);
    
    a.mul(b);
    
    // Should output 8, 15, 24
    console.log("The result of the multiplication is: " + a.toString());
    * @param rhs - The 3-dimensional vector used as the second multiplicand of the operation.
    * @returns Self for chaining.
    */
  def mul(rhs: Vec3): Vec3 = js.native
  
  /**
    * Returns the result of multiplying the specified 3-dimensional vectors together.
    * @example
    * var a = new pc.Vec3(2, 3, 4);
    var b = new pc.Vec3(4, 5, 6);
    var r = new pc.Vec3();
    
    r.mul2(a, b);
    
    // Should output 8, 15, 24
    console.log("The result of the multiplication is: " + r.toString());
    * @param lhs - The 3-dimensional vector used as the first multiplicand of the operation.
    * @param rhs - The 3-dimensional vector used as the second multiplicand of the operation.
    * @returns Self for chaining.
    */
  def mul2(lhs: Vec3, rhs: Vec3): Vec3 = js.native
  
  /**
    * Returns this 3-dimensional vector converted to a unit vector in place.
    If the vector has a length of zero, the vector's elements will be set to zero.
    * @example
    * var v = new pc.Vec3(25, 0, 0);
    
    v.normalize();
    
    // Should output 1, 0, 0
    console.log("The result of the vector normalization is: " + v.toString());
    * @returns Self for chaining.
    */
  def normalize(): Vec3 = js.native
  
  /**
    * Projects this 3-dimensional vector onto the specified vector.
    * @example
    * var v = new pc.Vec3(5, 5, 5);
    var normal = new pc.Vec3(1, 0, 0);
    
    v.project(normal);
    
    // Should output 5, 0, 0
    console.log("The result of the vector projection is: " + v.toString());
    * @param rhs - The vector onto which the original vector will be projected on.
    * @returns Self for chaining.
    */
  def project(rhs: Vec3): Vec3 = js.native
  
  /**
    * Scales each dimension of the specified 3-dimensional vector by the supplied
    scalar value.
    * @example
    * var v = new pc.Vec3(2, 4, 8);
    
    // Multiply by 2
    v.scale(2);
    
    // Negate
    v.scale(-1);
    
    // Divide by 2
    v.scale(0.5);
    * @param scalar - The value by which each vector component is multiplied.
    * @returns Self for chaining.
    */
  def scale(scalar: Double): Vec3 = js.native
  
  /**
    * Sets the specified 3-dimensional vector to the supplied numerical values.
    * @example
    * var v = new pc.Vec3();
    v.set(5, 10, 20);
    
    // Should output 5, 10, 20
    console.log("The result of the vector set is: " + v.toString());
    * @param x - The value to set on the first component of the vector.
    * @param y - The value to set on the second component of the vector.
    * @param z - The value to set on the third component of the vector.
    * @returns Self for chaining.
    */
  def set(x: Double, y: Double, z: Double): Vec3 = js.native
  
  /**
    * Subtracts a 3-dimensional vector from another in place.
    * @example
    * var a = new pc.Vec3(10, 10, 10);
    var b = new pc.Vec3(20, 20, 20);
    
    a.sub(b);
    
    // Should output [-10, -10, -10]
    console.log("The result of the subtraction is: " + a.toString());
    * @param rhs - The vector to add to the specified vector.
    * @returns Self for chaining.
    */
  def sub(rhs: Vec3): Vec3 = js.native
  
  /**
    * Subtracts two 3-dimensional vectors from one another and returns the result.
    * @example
    * var a = new pc.Vec3(10, 10, 10);
    var b = new pc.Vec3(20, 20, 20);
    var r = new pc.Vec3();
    
    r.sub2(a, b);
    
    // Should output [-10, -10, -10]
    console.log("The result of the subtraction is: " + r.toString());
    * @param lhs - The first vector operand for the addition.
    * @param rhs - The second vector operand for the addition.
    * @returns Self for chaining.
    */
  def sub2(lhs: Vec3, rhs: Vec3): Vec3 = js.native
  
  /**
    * The first component of the vector.
    * @example
    * var vec = new pc.Vec3(10, 20, 30);
    
    // Get x
    var x = vec.x;
    
    // Set x
    vec.x = 0;
    */
  var x: Double = js.native
  
  /**
    * The second component of the vector.
    * @example
    * var vec = new pc.Vec3(10, 20, 30);
    
    // Get y
    var y = vec.y;
    
    // Set y
    vec.y = 0;
    */
  var y: Double = js.native
  
  /**
    * The third component of the vector.
    * @example
    * var vec = new pc.Vec3(10, 20, 30);
    
    // Get z
    var z = vec.z;
    
    // Set z
    vec.z = 0;
    */
  var z: Double = js.native
}
object Vec3 {
  
  @scala.inline
  def apply(
    add: Vec3 => Vec3,
    add2: (Vec3, Vec3) => Vec3,
    copy: Vec3 => Vec3,
    cross: (Vec3, Vec3) => Vec3,
    distance: Vec3 => Double,
    dot: Vec3 => Double,
    equals: Vec3 => Boolean,
    length: () => Double,
    lengthSq: () => Double,
    lerp: (Vec3, Vec3, Double) => Vec3,
    mul: Vec3 => Vec3,
    mul2: (Vec3, Vec3) => Vec3,
    normalize: () => Vec3,
    project: Vec3 => Vec3,
    scale: Double => Vec3,
    set: (Double, Double, Double) => Vec3,
    sub: Vec3 => Vec3,
    sub2: (Vec3, Vec3) => Vec3,
    x: Double,
    y: Double,
    z: Double
  ): Vec3 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), add2 = js.Any.fromFunction2(add2), copy = js.Any.fromFunction1(copy), cross = js.Any.fromFunction2(cross), distance = js.Any.fromFunction1(distance), dot = js.Any.fromFunction1(dot), equals = js.Any.fromFunction1(equals), length = js.Any.fromFunction0(length), lengthSq = js.Any.fromFunction0(lengthSq), lerp = js.Any.fromFunction3(lerp), mul = js.Any.fromFunction1(mul), mul2 = js.Any.fromFunction2(mul2), normalize = js.Any.fromFunction0(normalize), project = js.Any.fromFunction1(project), scale = js.Any.fromFunction1(scale), set = js.Any.fromFunction3(set), sub = js.Any.fromFunction1(sub), sub2 = js.Any.fromFunction2(sub2), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vec3]
  }
  
  @scala.inline
  implicit class Vec3Ops[Self <: Vec3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: Vec3 => Vec3): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd2(value: (Vec3, Vec3) => Vec3): Self = this.set("add2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopy(value: Vec3 => Vec3): Self = this.set("copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCross(value: (Vec3, Vec3) => Vec3): Self = this.set("cross", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDistance(value: Vec3 => Double): Self = this.set("distance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDot(value: Vec3 => Double): Self = this.set("dot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: Vec3 => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLengthSq(value: () => Double): Self = this.set("lengthSq", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLerp(value: (Vec3, Vec3, Double) => Vec3): Self = this.set("lerp", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMul(value: Vec3 => Vec3): Self = this.set("mul", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMul2(value: (Vec3, Vec3) => Vec3): Self = this.set("mul2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNormalize(value: () => Vec3): Self = this.set("normalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProject(value: Vec3 => Vec3): Self = this.set("project", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScale(value: Double => Vec3): Self = this.set("scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (Double, Double, Double) => Vec3): Self = this.set("set", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSub(value: Vec3 => Vec3): Self = this.set("sub", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSub2(value: (Vec3, Vec3) => Vec3): Self = this.set("sub2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
