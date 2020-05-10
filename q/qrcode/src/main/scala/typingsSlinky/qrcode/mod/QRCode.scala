package typingsSlinky.qrcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCode extends js.Object {
  /**
    * Error Correction Level
    */
  var errorCorrectionLevel: Double = js.native
  /**
    * Calculated Mask pattern
    */
  var maskPattern: js.Any = js.native
  /**
    * Bitmatrix class with modules data
    */
  var modules: js.Any = js.native
  /**
    * Generated segments
    */
  var segments: js.Array[QRCodeSegment] = js.native
  /**
    * Calculated QR Code version
    */
  var version: Double = js.native
}

object QRCode {
  @scala.inline
  def apply(
    errorCorrectionLevel: Double,
    maskPattern: js.Any,
    modules: js.Any,
    segments: js.Array[QRCodeSegment],
    version: Double
  ): QRCode = {
    val __obj = js.Dynamic.literal(errorCorrectionLevel = errorCorrectionLevel.asInstanceOf[js.Any], maskPattern = maskPattern.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCode]
  }
  @scala.inline
  implicit class QRCodeOps[Self <: QRCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCorrectionLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCorrectionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaskPattern(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[QRCodeSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

