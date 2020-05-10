package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunTimeSetting extends js.Object {
  var barcodeFormatIds: Double = js.native
  var binarizationModes: js.Array[Double] = js.native
  var deblurLevel: Double = js.native
  var expectedBarcodesCount: Double = js.native
  var localizationModes: js.Array[Double] = js.native
  var minBarcodeTextLength: Double = js.native
  var minResultConfidence: Double = js.native
  var region: Region = js.native
  var resultCoordinateType: Double = js.native
  var scaleDownThreshold: Double = js.native
  var textResultOrderModes: js.Array[Double] = js.native
  var timeout: Double = js.native
}

object RunTimeSetting {
  @scala.inline
  def apply(
    barcodeFormatIds: Double,
    binarizationModes: js.Array[Double],
    deblurLevel: Double,
    expectedBarcodesCount: Double,
    localizationModes: js.Array[Double],
    minBarcodeTextLength: Double,
    minResultConfidence: Double,
    region: Region,
    resultCoordinateType: Double,
    scaleDownThreshold: Double,
    textResultOrderModes: js.Array[Double],
    timeout: Double
  ): RunTimeSetting = {
    val __obj = js.Dynamic.literal(barcodeFormatIds = barcodeFormatIds.asInstanceOf[js.Any], binarizationModes = binarizationModes.asInstanceOf[js.Any], deblurLevel = deblurLevel.asInstanceOf[js.Any], expectedBarcodesCount = expectedBarcodesCount.asInstanceOf[js.Any], localizationModes = localizationModes.asInstanceOf[js.Any], minBarcodeTextLength = minBarcodeTextLength.asInstanceOf[js.Any], minResultConfidence = minResultConfidence.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resultCoordinateType = resultCoordinateType.asInstanceOf[js.Any], scaleDownThreshold = scaleDownThreshold.asInstanceOf[js.Any], textResultOrderModes = textResultOrderModes.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunTimeSetting]
  }
  @scala.inline
  implicit class RunTimeSettingOps[Self <: RunTimeSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarcodeFormatIds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barcodeFormatIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinarizationModes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binarizationModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeblurLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deblurLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpectedBarcodesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedBarcodesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalizationModes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizationModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinBarcodeTextLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBarcodeTextLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinResultConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResultConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultCoordinateType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCoordinateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleDownThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleDownThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextResultOrderModes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textResultOrderModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

