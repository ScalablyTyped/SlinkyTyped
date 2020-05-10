package typingsSlinky.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Barcodeformat extends js.Object {
  var AZTEC: Boolean = js.native
  var CODE_128: Boolean = js.native
  var CODE_39: Boolean = js.native
  var DATA_MATRIX: Boolean = js.native
  var EAN_13: Boolean = js.native
  var EAN_8: Boolean = js.native
  var ITF: Boolean = js.native
  var PDF_417: Boolean = js.native
  var QR_CODE: Boolean = js.native
  var UPC_A: Boolean = js.native
  var UPC_E: Boolean = js.native
}

object Barcodeformat {
  @scala.inline
  def apply(
    AZTEC: Boolean,
    CODE_128: Boolean,
    CODE_39: Boolean,
    DATA_MATRIX: Boolean,
    EAN_13: Boolean,
    EAN_8: Boolean,
    ITF: Boolean,
    PDF_417: Boolean,
    QR_CODE: Boolean,
    UPC_A: Boolean,
    UPC_E: Boolean
  ): Barcodeformat = {
    val __obj = js.Dynamic.literal(AZTEC = AZTEC.asInstanceOf[js.Any], CODE_128 = CODE_128.asInstanceOf[js.Any], CODE_39 = CODE_39.asInstanceOf[js.Any], DATA_MATRIX = DATA_MATRIX.asInstanceOf[js.Any], EAN_13 = EAN_13.asInstanceOf[js.Any], EAN_8 = EAN_8.asInstanceOf[js.Any], ITF = ITF.asInstanceOf[js.Any], PDF_417 = PDF_417.asInstanceOf[js.Any], QR_CODE = QR_CODE.asInstanceOf[js.Any], UPC_A = UPC_A.asInstanceOf[js.Any], UPC_E = UPC_E.asInstanceOf[js.Any])
    __obj.asInstanceOf[Barcodeformat]
  }
  @scala.inline
  implicit class BarcodeformatOps[Self <: Barcodeformat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAZTEC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AZTEC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCODE_128(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CODE_128")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCODE_39(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CODE_39")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDATA_MATRIX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATA_MATRIX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEAN_13(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EAN_13")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEAN_8(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EAN_8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withITF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ITF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPDF_417(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PDF_417")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQR_CODE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QR_CODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUPC_A(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPC_A")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUPC_E(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPC_E")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

