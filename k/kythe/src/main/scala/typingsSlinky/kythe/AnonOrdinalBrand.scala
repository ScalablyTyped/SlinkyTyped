package typingsSlinky.kythe

import typingsSlinky.kythe.kytheStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOrdinalBrand extends js.Object {
  var __ordinalBrand: ordinal = js.native
}

object AnonOrdinalBrand {
  @scala.inline
  def apply(__ordinalBrand: ordinal): AnonOrdinalBrand = {
    val __obj = js.Dynamic.literal(__ordinalBrand = __ordinalBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrdinalBrand]
  }
  @scala.inline
  implicit class AnonOrdinalBrandOps[Self <: AnonOrdinalBrand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__ordinalBrand(value: ordinal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__ordinalBrand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

