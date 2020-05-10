package typingsSlinky.reactNativeForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallbackProp extends js.Object {
  var callbackProp: String = js.native
  var controlled: Boolean = js.native
  var valueProp: String = js.native
}

object AnonCallbackProp {
  @scala.inline
  def apply(callbackProp: String, controlled: Boolean, valueProp: String): AnonCallbackProp = {
    val __obj = js.Dynamic.literal(callbackProp = callbackProp.asInstanceOf[js.Any], controlled = controlled.asInstanceOf[js.Any], valueProp = valueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallbackProp]
  }
  @scala.inline
  implicit class AnonCallbackPropOps[Self <: AnonCallbackProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueProp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

