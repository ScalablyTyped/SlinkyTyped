package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraCalibrationData extends js.Object {
  var extrinsicMatrix: Matrix = js.native
  var intrinsicMatrix: Matrix = js.native
  var intrinsicMatrixReferenceDimensions: Size = js.native
  var inverseLensDistortionLookupTable: js.Any = js.native
  var lensDistortionCenter: Vector3 = js.native
  var lensDistortionLookupTable: js.Any = js.native
  var pixelSize: Double = js.native
}

object CameraCalibrationData {
  @scala.inline
  def apply(
    extrinsicMatrix: Matrix,
    intrinsicMatrix: Matrix,
    intrinsicMatrixReferenceDimensions: Size,
    inverseLensDistortionLookupTable: js.Any,
    lensDistortionCenter: Vector3,
    lensDistortionLookupTable: js.Any,
    pixelSize: Double
  ): CameraCalibrationData = {
    val __obj = js.Dynamic.literal(extrinsicMatrix = extrinsicMatrix.asInstanceOf[js.Any], intrinsicMatrix = intrinsicMatrix.asInstanceOf[js.Any], intrinsicMatrixReferenceDimensions = intrinsicMatrixReferenceDimensions.asInstanceOf[js.Any], inverseLensDistortionLookupTable = inverseLensDistortionLookupTable.asInstanceOf[js.Any], lensDistortionCenter = lensDistortionCenter.asInstanceOf[js.Any], lensDistortionLookupTable = lensDistortionLookupTable.asInstanceOf[js.Any], pixelSize = pixelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraCalibrationData]
  }
  @scala.inline
  implicit class CameraCalibrationDataOps[Self <: CameraCalibrationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtrinsicMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrinsicMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntrinsicMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intrinsicMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntrinsicMatrixReferenceDimensions(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intrinsicMatrixReferenceDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverseLensDistortionLookupTable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseLensDistortionLookupTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLensDistortionCenter(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensDistortionCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLensDistortionLookupTable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lensDistortionLookupTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

