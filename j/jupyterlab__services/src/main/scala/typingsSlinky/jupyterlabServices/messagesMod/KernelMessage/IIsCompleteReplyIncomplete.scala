package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.incomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An 'incomplete' completion reply
  */
@js.native
trait IIsCompleteReplyIncomplete extends js.Object {
  var indent: String = js.native
  var status: incomplete = js.native
}

object IIsCompleteReplyIncomplete {
  @scala.inline
  def apply(indent: String, status: incomplete): IIsCompleteReplyIncomplete = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteReplyIncomplete]
  }
  @scala.inline
  implicit class IIsCompleteReplyIncompleteOps[Self <: IIsCompleteReplyIncomplete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: incomplete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

