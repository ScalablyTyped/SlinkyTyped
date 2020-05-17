package typingsSlinky.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnBoolean extends js.Object {
  @JSName("MSForms.ReturnBoolean_typekey")
  var MSFormsDotReturnBoolean_typekey: ReturnBoolean = js.native
  var Value: Boolean = js.native
}

object ReturnBoolean {
  @scala.inline
  def apply(MSFormsDotReturnBoolean_typekey: ReturnBoolean, Value: Boolean): ReturnBoolean = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnBoolean_typekey")(MSFormsDotReturnBoolean_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnBoolean]
  }
  @scala.inline
  implicit class ReturnBooleanOps[Self <: ReturnBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSFormsDotReturnBoolean_typekey(value: ReturnBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.ReturnBoolean_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

