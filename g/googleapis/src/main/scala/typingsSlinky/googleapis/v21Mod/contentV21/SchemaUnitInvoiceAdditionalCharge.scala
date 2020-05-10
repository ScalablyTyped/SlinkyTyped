package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUnitInvoiceAdditionalCharge extends js.Object {
  /**
    * [required] Amount of the additional charge.
    */
  var additionalChargeAmount: js.UndefOr[SchemaAmount] = js.native
  /**
    * [required] Type of the additional charge.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaUnitInvoiceAdditionalCharge {
  @scala.inline
  def apply(): SchemaUnitInvoiceAdditionalCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnitInvoiceAdditionalCharge]
  }
  @scala.inline
  implicit class SchemaUnitInvoiceAdditionalChargeOps[Self <: SchemaUnitInvoiceAdditionalCharge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalChargeAmount(value: SchemaAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChargeAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalChargeAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChargeAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

