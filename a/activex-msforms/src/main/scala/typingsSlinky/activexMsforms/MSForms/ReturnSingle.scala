package typingsSlinky.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnSingle extends js.Object {
  @JSName("MSForms.ReturnSingle_typekey")
  var MSFormsDotReturnSingle_typekey: ReturnSingle = js.native
  var Value: Double = js.native
}

object ReturnSingle {
  @scala.inline
  def apply(MSFormsDotReturnSingle_typekey: ReturnSingle, Value: Double): ReturnSingle = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnSingle_typekey")(MSFormsDotReturnSingle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnSingle]
  }
  @scala.inline
  implicit class ReturnSingleOps[Self <: ReturnSingle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSFormsDotReturnSingle_typekey(value: ReturnSingle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.ReturnSingle_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

