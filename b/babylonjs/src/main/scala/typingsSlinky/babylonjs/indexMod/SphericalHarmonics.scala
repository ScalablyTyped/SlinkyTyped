package typingsSlinky.babylonjs.indexMod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SphericalHarmonics")
@js.native
class SphericalHarmonics ()
  extends typingsSlinky.babylonjs.mathsIndexMod.SphericalHarmonics
/* static members */
@JSImport("babylonjs/index", "SphericalHarmonics")
@js.native
object SphericalHarmonics extends js.Object {
  
  /**
    * Constructs a spherical harmonics from an array.
    * @param data defines the 9x3 coefficients (l00, l1-1, l10, l11, l2-2, l2-1, l20, l21, l22)
    * @returns the spherical harmonics
    */
  def FromArray(data: ArrayLike[ArrayLike[Double]]): typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalHarmonics = js.native
  
  /**
    * Gets the spherical harmonics from polynomial
    * @param polynomial the spherical polynomial
    * @returns the spherical harmonics
    */
  def FromPolynomial(polynomial: typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalPolynomial): typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalHarmonics = js.native
}
