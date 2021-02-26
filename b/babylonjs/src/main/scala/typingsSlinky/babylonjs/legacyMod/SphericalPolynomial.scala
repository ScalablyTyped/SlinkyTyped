package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "SphericalPolynomial")
@js.native
class SphericalPolynomial ()
  extends typingsSlinky.babylonjs.indexMod.SphericalPolynomial
/* static members */
object SphericalPolynomial {
  
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  @JSImport("babylonjs/Legacy/legacy", "SphericalPolynomial.FromArray")
  @js.native
  def FromArray(data: ArrayLike[ArrayLike[Double]]): typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
  
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  @JSImport("babylonjs/Legacy/legacy", "SphericalPolynomial.FromHarmonics")
  @js.native
  def FromHarmonics(harmonics: typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalHarmonics): typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
}
