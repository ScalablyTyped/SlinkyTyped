package typingsSlinky.asn1js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsIndefiniteForm extends js.Object {
  var isIndefiniteForm: js.UndefOr[Boolean] = js.native
  var length: Double = js.native
  var longFormUsed: js.UndefOr[Boolean] = js.native
}

object AnonIsIndefiniteForm {
  @scala.inline
  def apply(length: Double): AnonIsIndefiniteForm = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsIndefiniteForm]
  }
  @scala.inline
  implicit class AnonIsIndefiniteFormOps[Self <: AnonIsIndefiniteForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIndefiniteForm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIndefiniteForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIndefiniteForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIndefiniteForm")(js.undefined)
        ret
    }
    @scala.inline
    def withLongFormUsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longFormUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongFormUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longFormUsed")(js.undefined)
        ret
    }
  }
  
}

