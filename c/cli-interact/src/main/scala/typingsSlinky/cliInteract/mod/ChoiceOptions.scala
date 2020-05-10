package typingsSlinky.cliInteract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChoiceOptions extends js.Object {
  var allowNoAnswer: js.UndefOr[Boolean] = js.native
  var returnNumeric: js.UndefOr[Boolean] = js.native
}

object ChoiceOptions {
  @scala.inline
  def apply(): ChoiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceOptions]
  }
  @scala.inline
  implicit class ChoiceOptionsOps[Self <: ChoiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNoAnswer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNoAnswer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNoAnswer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNoAnswer")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnNumeric")(js.undefined)
        ret
    }
  }
  
}

