package typingsSlinky.peerjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnswerOption extends js.Object {
  var sdpTransform: js.UndefOr[js.Function] = js.native
}

object AnswerOption {
  @scala.inline
  def apply(): AnswerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerOption]
  }
  @scala.inline
  implicit class AnswerOptionOps[Self <: AnswerOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSdpTransform(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdpTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpTransform")(js.undefined)
        ret
    }
  }
  
}

