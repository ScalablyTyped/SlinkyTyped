package typingsSlinky.rmcCascader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPickerValueChangeProp extends js.Object {
  var pickerValueChangeProp: String = js.native
  var pickerValueProp: String = js.native
}

object AnonPickerValueChangeProp {
  @scala.inline
  def apply(pickerValueChangeProp: String, pickerValueProp: String): AnonPickerValueChangeProp = {
    val __obj = js.Dynamic.literal(pickerValueChangeProp = pickerValueChangeProp.asInstanceOf[js.Any], pickerValueProp = pickerValueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPickerValueChangeProp]
  }
  @scala.inline
  implicit class AnonPickerValueChangePropOps[Self <: AnonPickerValueChangeProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPickerValueChangeProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerValueChangeProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickerValueProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerValueProp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

