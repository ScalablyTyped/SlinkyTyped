package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValidation extends js.Object {
  var RegularExpression: String = js.native
  var VBScript: String = js.native
  def Clone(): IValidation = js.native
}

object IValidation {
  @scala.inline
  def apply(Clone: () => IValidation, RegularExpression: String, VBScript: String): IValidation = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), RegularExpression = RegularExpression.asInstanceOf[js.Any], VBScript = VBScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidation]
  }
  @scala.inline
  implicit class IValidationOps[Self <: IValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IValidation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegularExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegularExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVBScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VBScript")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

