package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SphericalPolynomial")
@js.native
class SphericalPolynomial ()
  extends typingsSlinky.babylonjs.BABYLON.SphericalPolynomial {
  /* CompleteClass */
  override var _harmonics: js.Any = js.native
  /**
    * The x coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var x: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The xx coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var xx: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The xy coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var xy: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The y coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var y: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The yy coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var yy: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The yz coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var yz: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The z coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var z: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The zx coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var zx: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The zz coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var zz: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
  /**
    * Adds an ambient color to the spherical polynomial
    * @param color the color to add
    */
  /* CompleteClass */
  override def addAmbient(color: typingsSlinky.babylonjs.BABYLON.Color3): Unit = js.native
  /**
    * The spherical harmonics used to create the polynomials.
    */
  /* CompleteClass */
  override def preScaledHarmonics: typingsSlinky.babylonjs.BABYLON.SphericalHarmonics = js.native
  /**
    * Scales the spherical polynomial by the given amount
    * @param scale the amount to scale
    */
  /* CompleteClass */
  override def scaleInPlace(scale: Double): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.SphericalPolynomial")
@js.native
object SphericalPolynomial extends js.Object {
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  def FromArray(data: ArrayLike[ArrayLike[Double]]): typingsSlinky.babylonjs.BABYLON.SphericalPolynomial = js.native
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  def FromHarmonics(harmonics: typingsSlinky.babylonjs.BABYLON.SphericalHarmonics): typingsSlinky.babylonjs.BABYLON.SphericalPolynomial = js.native
}

