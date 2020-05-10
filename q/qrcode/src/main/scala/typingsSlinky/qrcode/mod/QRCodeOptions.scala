package typingsSlinky.qrcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeOptions extends js.Object {
  /**
    * Error correction level.
    * Possible values are low, medium, quartile, high or L, M, Q, H.
    * Default: M
    */
  var errorCorrectionLevel: js.UndefOr[QRCodeErrorCorrectionLevel] = js.native
  /**
    * Helper function used internally to convert a kanji to its Shift JIS value.
    * Provide this function if you need support for Kanji mode.
    */
  var toSJISFunc: js.UndefOr[js.Function1[/* codePoint */ String, Double]] = js.native
  /**
    * QR Code version. If not specified the more suitable value will be calculated.
    */
  var version: js.UndefOr[Double] = js.native
}

object QRCodeOptions {
  @scala.inline
  def apply(): QRCodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeOptions]
  }
  @scala.inline
  implicit class QRCodeOptionsOps[Self <: QRCodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCorrectionLevel(value: QRCodeErrorCorrectionLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCorrectionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCorrectionLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCorrectionLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withToSJISFunc(value: /* codePoint */ String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSJISFunc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToSJISFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSJISFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

