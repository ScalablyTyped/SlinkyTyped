package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignaturePromptInfoSelectable extends js.Object {
  var PromptInfos: ISignaturePromptInfos = js.native
  def Clone(): ISignaturePromptInfoSelectable = js.native
}

object ISignaturePromptInfoSelectable {
  @scala.inline
  def apply(Clone: () => ISignaturePromptInfoSelectable, PromptInfos: ISignaturePromptInfos): ISignaturePromptInfoSelectable = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PromptInfos = PromptInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignaturePromptInfoSelectable]
  }
  @scala.inline
  implicit class ISignaturePromptInfoSelectableOps[Self <: ISignaturePromptInfoSelectable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => ISignaturePromptInfoSelectable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPromptInfos(value: ISignaturePromptInfos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PromptInfos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

