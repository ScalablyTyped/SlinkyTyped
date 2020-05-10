package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAmount extends js.Object {
  /**
    * [required] Value before taxes.
    */
  var pretax: js.UndefOr[SchemaPrice] = js.native
  /**
    * [required] Tax value.
    */
  var tax: js.UndefOr[SchemaPrice] = js.native
}

object SchemaAmount {
  @scala.inline
  def apply(): SchemaAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAmount]
  }
  @scala.inline
  implicit class SchemaAmountOps[Self <: SchemaAmount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPretax(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretax")(js.undefined)
        ret
    }
    @scala.inline
    def withTax(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(js.undefined)
        ret
    }
  }
  
}

