package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SphericalPolynomial")
@js.native
class SphericalPolynomial ()
  extends typingsSlinky.babylonjs.BABYLON.SphericalPolynomial
/* static members */
object SphericalPolynomial {
  
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  @JSGlobal("BABYLON.SphericalPolynomial.FromArray")
  @js.native
  def FromArray(data: ArrayLike[ArrayLike[Double]]): typingsSlinky.babylonjs.BABYLON.SphericalPolynomial = js.native
  
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  @JSGlobal("BABYLON.SphericalPolynomial.FromHarmonics")
  @js.native
  def FromHarmonics(harmonics: typingsSlinky.babylonjs.BABYLON.SphericalHarmonics): typingsSlinky.babylonjs.BABYLON.SphericalPolynomial = js.native
}
