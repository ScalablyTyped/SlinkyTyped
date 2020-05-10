package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignaturePromptInfo extends js.Object {
  var Meaning: String = js.native
  var Reason: String = js.native
  def Clone(): ISignaturePromptInfo = js.native
}

object ISignaturePromptInfo {
  @scala.inline
  def apply(Clone: () => ISignaturePromptInfo, Meaning: String, Reason: String): ISignaturePromptInfo = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Meaning = Meaning.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignaturePromptInfo]
  }
  @scala.inline
  implicit class ISignaturePromptInfoOps[Self <: ISignaturePromptInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => ISignaturePromptInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMeaning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Meaning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

