package typingsSlinky.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalConstructedValueBlockParams extends LocalBaseBlockParams {
  var isIndefiniteForm: js.UndefOr[scala.Boolean] = js.native
  var value: js.UndefOr[LocalValueBlock] = js.native
}

object LocalConstructedValueBlockParams {
  @scala.inline
  def apply(): LocalConstructedValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalConstructedValueBlockParams]
  }
  @scala.inline
  implicit class LocalConstructedValueBlockParamsOps[Self <: LocalConstructedValueBlockParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsIndefiniteForm(value: scala.Boolean): Self = {
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
    def withValue(value: LocalValueBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

