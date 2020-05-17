package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRCameraMetrics extends js.Object {
  /**
    * Define the chromatic aberration correction factors for the VR post process.
    */
  var chromaAbCorrection: js.Array[Double] = js.native
  /**
    * Define if the current vr camera should compensate the distortion of the lense or not.
    */
  var compensateDistortion: Boolean = js.native
  /**
    * Define the distortion factor of the VR postprocess.
    * Please, touch with care.
    */
  var distortionK: js.Array[Double] = js.native
  /**
    * Define the distance of the eyes to the screen.
    */
  var eyeToScreenDistance: Double = js.native
  /**
    * Define the horizontal resolution off the screen.
    */
  var hResolution: Double = js.native
  /**
    * Define the horizontal screen size.
    */
  var hScreenSize: Double = js.native
  /**
    * Define the distance between both viewer's eyes.
    */
  var interpupillaryDistance: Double = js.native
  /**
    * Define an offset for the lens center.
    */
  var lensCenterOffset: Double = js.native
  /**
    * Define the distance between both lenses
    */
  var lensSeparationDistance: Double = js.native
  /**
    * Defines if multiview should be enabled when rendering (Default: false)
    */
  var multiviewEnabled: Boolean = js.native
  /**
    * Define the scale factor of the post process.
    * The smaller the better but the slower.
    */
  var postProcessScaleFactor: Double = js.native
  /**
    * Define the vertical resolution off the screen.
    */
  var vResolution: Double = js.native
  /**
    * Define the vertical screen center position.
    */
  var vScreenCenter: Double = js.native
  /**
    * Define the vertical screen size.
    */
  var vScreenSize: Double = js.native
  /**
    * Gets the rendering aspect ratio based on the provided resolutions.
    */
  def aspectRatio: Double = js.native
  /**
    * Gets the aspect ratio based on the FOV, scale factors, and real screen sizes.
    */
  def aspectRatioFov: Double = js.native
  /**
    * @hidden
    */
  def leftHMatrix: Matrix = js.native
  /**
    * @hidden
    */
  def leftPreViewMatrix: Matrix = js.native
  /**
    * @hidden
    */
  def rightHMatrix: Matrix = js.native
  /**
    * @hidden
    */
  def rightPreViewMatrix: Matrix = js.native
}

object VRCameraMetrics {
  @scala.inline
  def apply(
    aspectRatio: () => Double,
    aspectRatioFov: () => Double,
    chromaAbCorrection: js.Array[Double],
    compensateDistortion: Boolean,
    distortionK: js.Array[Double],
    eyeToScreenDistance: Double,
    hResolution: Double,
    hScreenSize: Double,
    interpupillaryDistance: Double,
    leftHMatrix: () => Matrix,
    leftPreViewMatrix: () => Matrix,
    lensCenterOffset: Double,
    lensSeparationDistance: Double,
    multiviewEnabled: Boolean,
    postProcessScaleFactor: Double,
    rightHMatrix: () => Matrix,
    rightPreViewMatrix: () => Matrix,
    vResolution: Double,
    vScreenCenter: Double,
    vScreenSize: Double
  ): VRCameraMetrics = {
    val __obj = js.Dynamic.literal(aspectRatio = js.Any.fromFunction0(aspectRatio), aspectRatioFov = js.Any.fromFunction0(aspectRatioFov), chromaAbCorrection = chromaAbCorrection.asInstanceOf[js.Any], compensateDistortion = compensateDistortion.asInstanceOf[js.Any], distortionK = distortionK.asInstanceOf[js.Any], eyeToScreenDistance = eyeToScreenDistance.asInstanceOf[js.Any], hResolution = hResolution.asInstanceOf[js.Any], hScreenSize = hScreenSize.asInstanceOf[js.Any], interpupillaryDistance = interpupillaryDistance.asInstanceOf[js.Any], leftHMatrix = js.Any.fromFunction0(leftHMatrix), leftPreViewMatrix = js.Any.fromFunction0(leftPreViewMatrix), lensCenterOffset = lensCenterOffset.asInstanceOf[js.Any], lensSeparationDistance = lensSeparationDistance.asInstanceOf[js.Any], multiviewEnabled = multiviewEnabled.asInstanceOf[js.Any], postProcessScaleFactor = postProcessScaleFactor.asInstanceOf[js.Any], rightHMatrix = js.Any.fromFunction0(rightHMatrix), rightPreViewMatrix = js.Any.fromFunction0(rightPreViewMatrix), vResolution = vResolution.asInstanceOf[js.Any], vScreenCenter = vScreenCenter.asInstanceOf[js.Any], vScreenSize = vScreenSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRCameraMetrics]
  }
  @scala.inline
  implicit class VRCameraMetricsOps[Self <: VRCameraMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAspectRatioFov(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatioFov")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChromaAbCorrection(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromaAbCorrection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompensateDistortion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensateDistortion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistortionK(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distortionK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyeToScreenDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeToScreenDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHScreenSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hScreenSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterpupillaryDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpupillaryDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftHMatrix(value: () => Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftHMatrix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLeftPreViewMatrix(value: () => Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPreViewMatrix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLensCenterOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensCenterOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLensSeparationDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensSeparationDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiviewEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiviewEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostProcessScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessScaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightHMatrix(value: () => Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightHMatrix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRightPreViewMatrix(value: () => Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPreViewMatrix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVScreenCenter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vScreenCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVScreenSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vScreenSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

