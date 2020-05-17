package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plane extends js.Object {
  /**
    * d component of the plane
    */
  var d: Double = js.native
  /**
    * Normal of the plane (a,b,c)
    */
  var normal: Vector3 = js.native
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
    * Calcualtte the dot product between the point and the plane normal
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
    * Checks if the plane is facing a given direction
    * @param direction the direction to check if the plane is facing
    * @param epsilon value the dot product is compared against (returns true if dot <= epsilon)
    * @returns True is the vector "direction"  is the same side than the plane normal.
    */
  def isFrontFacingTo(direction: DeepImmutable[Vector3], epsilon: Double): Boolean = js.native
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

object Plane {
  @scala.inline
  def apply(
    asArray: () => js.Array[Double],
    copyFromPoints: (DeepImmutable[Vector3], DeepImmutable[Vector3], DeepImmutable[Vector3]) => Plane,
    d: Double,
    dotCoordinate: DeepImmutable[Vector3] => Double,
    getClassName: () => String,
    getHashCode: () => Double,
    isFrontFacingTo: (DeepImmutable[Vector3], Double) => Boolean,
    normal: Vector3,
    normalize: () => Plane,
    signedDistanceTo: DeepImmutable[Vector3] => Double,
    transform: DeepImmutable[Matrix] => Plane
  ): Plane = {
    val __obj = js.Dynamic.literal(asArray = js.Any.fromFunction0(asArray), copyFromPoints = js.Any.fromFunction3(copyFromPoints), d = d.asInstanceOf[js.Any], dotCoordinate = js.Any.fromFunction1(dotCoordinate), getClassName = js.Any.fromFunction0(getClassName), getHashCode = js.Any.fromFunction0(getHashCode), isFrontFacingTo = js.Any.fromFunction2(isFrontFacingTo), normal = normal.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), signedDistanceTo = js.Any.fromFunction1(signedDistanceTo), transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Plane]
  }
  @scala.inline
  implicit class PlaneOps[Self <: Plane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsArray(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCopyFromPoints(value: (DeepImmutable[Vector3], DeepImmutable[Vector3], DeepImmutable[Vector3]) => Plane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFromPoints")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotCoordinate(value: DeepImmutable[Vector3] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotCoordinate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetClassName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHashCode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHashCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFrontFacingTo(value: (DeepImmutable[Vector3], Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFrontFacingTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNormal(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalize(value: () => Plane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSignedDistanceTo(value: DeepImmutable[Vector3] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedDistanceTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransform(value: DeepImmutable[Matrix] => Plane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

