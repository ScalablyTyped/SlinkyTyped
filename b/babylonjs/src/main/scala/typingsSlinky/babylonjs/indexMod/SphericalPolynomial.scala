package typingsSlinky.babylonjs.indexMod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SphericalPolynomial")
@js.native
class SphericalPolynomial ()
  extends typingsSlinky.babylonjs.mathsIndexMod.SphericalPolynomial
/* static members */
@JSImport("babylonjs/index", "SphericalPolynomial")
@js.native
object SphericalPolynomial extends js.Object {
  
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  def FromArray(data: ArrayLike[ArrayLike[Double]]): typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
  
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  def FromHarmonics(harmonics: typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalHarmonics): typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
}
