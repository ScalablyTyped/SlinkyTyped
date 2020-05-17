package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SphericalHarmonics extends js.Object {
  /**
    * The l0,0 coefficients of the spherical harmonics
    */
  var l00: Vector3 = js.native
  /**
    * The l1,0 coefficients of the spherical harmonics
    */
  var l10: Vector3 = js.native
  /**
    * The l1,1 coefficients of the spherical harmonics
    */
  var l11: Vector3 = js.native
  /**
    * The l1,-1 coefficients of the spherical harmonics
    */
  var l1_1: Vector3 = js.native
  /**
    * The l2,0 coefficients of the spherical harmonics
    */
  var l20: Vector3 = js.native
  /**
    * The l2,1 coefficients of the spherical harmonics
    */
  var l21: Vector3 = js.native
  /**
    * The l2,2 coefficients of the spherical harmonics
    */
  var l22: Vector3 = js.native
  /**
    * The l2,-1 coefficients of the spherical harmonics
    */
  var l2_1: Vector3 = js.native
  /**
    * The l2,-2 coefficients of the spherical harmonics
    */
  var l2_2: Vector3 = js.native
  /**
    * Defines whether or not the harmonics have been prescaled for rendering.
    */
  var preScaled: Boolean = js.native
  /**
    * Adds a light to the spherical harmonics
    * @param direction the direction of the light
    * @param color the color of the light
    * @param deltaSolidAngle the delta solid angle of the light
    */
  def addLight(direction: Vector3, color: Color3, deltaSolidAngle: Double): Unit = js.native
  /**
    * Convert from incident radiance (Li) to irradiance (E) by applying convolution with the cosine-weighted hemisphere.
    *
    * ```
    * E_lm = A_l * L_lm
    * ```
    *
    * In spherical harmonics this convolution amounts to scaling factors for each frequency band.
    * This corresponds to equation 5 in "An Efficient Representation for Irradiance Environment Maps", where
    * the scaling factors are given in equation 9.
    */
  def convertIncidentRadianceToIrradiance(): Unit = js.native
  /**
    * Convert from irradiance to outgoing radiance for Lambertian BDRF, suitable for efficient shader evaluation.
    *
    * ```
    * L = (1/pi) * E * rho
    * ```
    *
    * This is done by an additional scale by 1/pi, so is a fairly trivial operation but important conceptually.
    */
  def convertIrradianceToLambertianRadiance(): Unit = js.native
  /**
    * Integrates the reconstruction coefficients directly in to the SH preventing further
    * required operations at run time.
    *
    * This is simply done by scaling back the SH with Ylm constants parameter.
    * The trigonometric part being applied by the shader at run time.
    */
  def preScaleForRendering(): Unit = js.native
  /**
    * Scales the spherical harmonics by the given amount
    * @param scale the amount to scale
    */
  def scaleInPlace(scale: Double): Unit = js.native
}

object SphericalHarmonics {
  @scala.inline
  def apply(
    addLight: (Vector3, Color3, Double) => Unit,
    convertIncidentRadianceToIrradiance: () => Unit,
    convertIrradianceToLambertianRadiance: () => Unit,
    l00: Vector3,
    l10: Vector3,
    l11: Vector3,
    l1_1: Vector3,
    l20: Vector3,
    l21: Vector3,
    l22: Vector3,
    l2_1: Vector3,
    l2_2: Vector3,
    preScaleForRendering: () => Unit,
    preScaled: Boolean,
    scaleInPlace: Double => Unit
  ): SphericalHarmonics = {
    val __obj = js.Dynamic.literal(addLight = js.Any.fromFunction3(addLight), convertIncidentRadianceToIrradiance = js.Any.fromFunction0(convertIncidentRadianceToIrradiance), convertIrradianceToLambertianRadiance = js.Any.fromFunction0(convertIrradianceToLambertianRadiance), l00 = l00.asInstanceOf[js.Any], l10 = l10.asInstanceOf[js.Any], l11 = l11.asInstanceOf[js.Any], l1_1 = l1_1.asInstanceOf[js.Any], l20 = l20.asInstanceOf[js.Any], l21 = l21.asInstanceOf[js.Any], l22 = l22.asInstanceOf[js.Any], l2_1 = l2_1.asInstanceOf[js.Any], l2_2 = l2_2.asInstanceOf[js.Any], preScaleForRendering = js.Any.fromFunction0(preScaleForRendering), preScaled = preScaled.asInstanceOf[js.Any], scaleInPlace = js.Any.fromFunction1(scaleInPlace))
    __obj.asInstanceOf[SphericalHarmonics]
  }
  @scala.inline
  implicit class SphericalHarmonicsOps[Self <: SphericalHarmonics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddLight(value: (Vector3, Color3, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLight")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withConvertIncidentRadianceToIrradiance(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertIncidentRadianceToIrradiance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConvertIrradianceToLambertianRadiance(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertIrradianceToLambertianRadiance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withL00(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l00")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL10(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL11(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l11")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL1_1(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l1_1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL20(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l20")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL21(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l21")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL22(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l22")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL2_1(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l2_1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL2_2(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l2_2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreScaleForRendering(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preScaleForRendering")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreScaled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preScaled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleInPlace(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleInPlace")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

