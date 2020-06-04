package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraCalibrationData extends js.Object {
  var extrinsicMatrix: Matrix
  var intrinsicMatrix: Matrix
  var intrinsicMatrixReferenceDimensions: Size
  var inverseLensDistortionLookupTable: js.Any
  var lensDistortionCenter: Vector3
  var lensDistortionLookupTable: js.Any
  var pixelSize: Double
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtrinsicMatrix(value: Matrix): Self = this.set("extrinsicMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntrinsicMatrix(value: Matrix): Self = this.set("intrinsicMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntrinsicMatrixReferenceDimensions(value: Size): Self = this.set("intrinsicMatrixReferenceDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setInverseLensDistortionLookupTable(value: js.Any): Self = this.set("inverseLensDistortionLookupTable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLensDistortionCenter(value: Vector3): Self = this.set("lensDistortionCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setLensDistortionLookupTable(value: js.Any): Self = this.set("lensDistortionLookupTable", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelSize(value: Double): Self = this.set("pixelSize", value.asInstanceOf[js.Any])
  }
  
}

