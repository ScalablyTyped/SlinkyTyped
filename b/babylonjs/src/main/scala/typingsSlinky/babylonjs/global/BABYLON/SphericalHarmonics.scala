package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SphericalHarmonics")
@js.native
class SphericalHarmonics ()
  extends typingsSlinky.babylonjs.BABYLON.SphericalHarmonics
/* static members */
object SphericalHarmonics {
  
  /**
    * Constructs a spherical harmonics from an array.
    * @param data defines the 9x3 coefficients (l00, l1-1, l10, l11, l2-2, l2-1, l20, l21, l22)
    * @returns the spherical harmonics
    */
  @JSGlobal("BABYLON.SphericalHarmonics.FromArray")
  @js.native
  def FromArray(data: ArrayLike[ArrayLike[Double]]): typingsSlinky.babylonjs.BABYLON.SphericalHarmonics = js.native
  
  /**
    * Gets the spherical harmonics from polynomial
    * @param polynomial the spherical polynomial
    * @returns the spherical harmonics
    */
  @JSGlobal("BABYLON.SphericalHarmonics.FromPolynomial")
  @js.native
  def FromPolynomial(polynomial: typingsSlinky.babylonjs.BABYLON.SphericalPolynomial): typingsSlinky.babylonjs.BABYLON.SphericalHarmonics = js.native
}
