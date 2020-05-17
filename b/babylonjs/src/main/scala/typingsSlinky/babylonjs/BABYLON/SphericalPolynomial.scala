package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SphericalPolynomial extends js.Object {
  var _harmonics: js.Any = js.native
  /**
    * The x coefficients of the spherical polynomial
    */
  var x: Vector3 = js.native
  /**
    * The xx coefficients of the spherical polynomial
    */
  var xx: Vector3 = js.native
  /**
    * The xy coefficients of the spherical polynomial
    */
  var xy: Vector3 = js.native
  /**
    * The y coefficients of the spherical polynomial
    */
  var y: Vector3 = js.native
  /**
    * The yy coefficients of the spherical polynomial
    */
  var yy: Vector3 = js.native
  /**
    * The yz coefficients of the spherical polynomial
    */
  var yz: Vector3 = js.native
  /**
    * The z coefficients of the spherical polynomial
    */
  var z: Vector3 = js.native
  /**
    * The zx coefficients of the spherical polynomial
    */
  var zx: Vector3 = js.native
  /**
    * The zz coefficients of the spherical polynomial
    */
  var zz: Vector3 = js.native
  /**
    * Adds an ambient color to the spherical polynomial
    * @param color the color to add
    */
  def addAmbient(color: Color3): Unit = js.native
  /**
    * The spherical harmonics used to create the polynomials.
    */
  def preScaledHarmonics: SphericalHarmonics = js.native
  /**
    * Scales the spherical polynomial by the given amount
    * @param scale the amount to scale
    */
  def scaleInPlace(scale: Double): Unit = js.native
}

object SphericalPolynomial {
  @scala.inline
  def apply(
    _harmonics: js.Any,
    addAmbient: Color3 => Unit,
    preScaledHarmonics: () => SphericalHarmonics,
    scaleInPlace: Double => Unit,
    x: Vector3,
    xx: Vector3,
    xy: Vector3,
    y: Vector3,
    yy: Vector3,
    yz: Vector3,
    z: Vector3,
    zx: Vector3,
    zz: Vector3
  ): SphericalPolynomial = {
    val __obj = js.Dynamic.literal(_harmonics = _harmonics.asInstanceOf[js.Any], addAmbient = js.Any.fromFunction1(addAmbient), preScaledHarmonics = js.Any.fromFunction0(preScaledHarmonics), scaleInPlace = js.Any.fromFunction1(scaleInPlace), x = x.asInstanceOf[js.Any], xx = xx.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yy = yy.asInstanceOf[js.Any], yz = yz.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], zx = zx.asInstanceOf[js.Any], zz = zz.asInstanceOf[js.Any])
    __obj.asInstanceOf[SphericalPolynomial]
  }
  @scala.inline
  implicit class SphericalPolynomialOps[Self <: SphericalPolynomial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_harmonics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_harmonics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddAmbient(value: Color3 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAmbient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreScaledHarmonics(value: () => SphericalHarmonics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preScaledHarmonics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScaleInPlace(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleInPlace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withX(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXx(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXy(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYy(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYz(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZx(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZz(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zz")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

