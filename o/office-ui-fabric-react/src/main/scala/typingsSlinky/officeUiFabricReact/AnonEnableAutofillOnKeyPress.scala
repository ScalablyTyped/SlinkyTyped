package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnableAutofillOnKeyPress extends js.Object {
  var enableAutofillOnKeyPress: js.Array[Double] = js.native
}

object AnonEnableAutofillOnKeyPress {
  @scala.inline
  def apply(enableAutofillOnKeyPress: js.Array[Double]): AnonEnableAutofillOnKeyPress = {
    val __obj = js.Dynamic.literal(enableAutofillOnKeyPress = enableAutofillOnKeyPress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnableAutofillOnKeyPress]
  }
  @scala.inline
  implicit class AnonEnableAutofillOnKeyPressOps[Self <: AnonEnableAutofillOnKeyPress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableAutofillOnKeyPress(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutofillOnKeyPress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

