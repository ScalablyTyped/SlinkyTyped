package typingsSlinky.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropPayload extends js.Object {
  var dropResult: js.Any = js.native
}

object DropPayload {
  @scala.inline
  def apply(dropResult: js.Any): DropPayload = {
    val __obj = js.Dynamic.literal(dropResult = dropResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropPayload]
  }
  @scala.inline
  implicit class DropPayloadOps[Self <: DropPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

