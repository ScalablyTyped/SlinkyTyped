package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/phone-input.Country> */
@js.native
trait ReadonlyCountry extends js.Object {
  val dialCode: String = js.native
  val id: /* keyof baseui.baseui/phone-input.COUNTRIES */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any = js.native
  val label: String = js.native
}

object ReadonlyCountry {
  @scala.inline
  def apply(
    dialCode: String,
    id: /* keyof baseui.baseui/phone-input.COUNTRIES */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any,
    label: String
  ): ReadonlyCountry = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCountry]
  }
  @scala.inline
  implicit class ReadonlyCountryOps[Self <: ReadonlyCountry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(
      value: /* keyof baseui.baseui/phone-input.COUNTRIES */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

