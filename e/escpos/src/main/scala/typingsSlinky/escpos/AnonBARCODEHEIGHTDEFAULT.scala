package typingsSlinky.escpos

import typingsSlinky.escpos.escposStrings.InformationseparatorthreehCentsign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBARCODEHEIGHTDEFAULT extends js.Object {
  var BARCODE_HEIGHT_DEFAULT: InformationseparatorthreehCentsign = js.native
  var BARCODE_MODE: AnonOFF = js.native
   // Barcode height default=162
  var CODE2D_FORMAT: AnonLENOFFSET = js.native
}

object AnonBARCODEHEIGHTDEFAULT {
  @scala.inline
  def apply(
    BARCODE_HEIGHT_DEFAULT: InformationseparatorthreehCentsign,
    BARCODE_MODE: AnonOFF,
    CODE2D_FORMAT: AnonLENOFFSET
  ): AnonBARCODEHEIGHTDEFAULT = {
    val __obj = js.Dynamic.literal(BARCODE_HEIGHT_DEFAULT = BARCODE_HEIGHT_DEFAULT.asInstanceOf[js.Any], BARCODE_MODE = BARCODE_MODE.asInstanceOf[js.Any], CODE2D_FORMAT = CODE2D_FORMAT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBARCODEHEIGHTDEFAULT]
  }
  @scala.inline
  implicit class AnonBARCODEHEIGHTDEFAULTOps[Self <: AnonBARCODEHEIGHTDEFAULT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBARCODE_HEIGHT_DEFAULT(value: InformationseparatorthreehCentsign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_HEIGHT_DEFAULT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBARCODE_MODE(value: AnonOFF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCODE2D_FORMAT(value: AnonLENOFFSET): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CODE2D_FORMAT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

