package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.complete
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.invalid
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A completion reply for completion or invalid states.
  */
@js.native
trait IIsCompleteReplyOther extends js.Object {
  var status: complete | invalid | unknown = js.native
}

object IIsCompleteReplyOther {
  @scala.inline
  def apply(status: complete | invalid | unknown): IIsCompleteReplyOther = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteReplyOther]
  }
  @scala.inline
  implicit class IIsCompleteReplyOtherOps[Self <: IIsCompleteReplyOther] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: complete | invalid | unknown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

