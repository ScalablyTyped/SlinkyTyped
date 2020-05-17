package typingsSlinky.reactDnd.anon

import typingsSlinky.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerIds extends js.Object {
  var handlerIds: js.UndefOr[js.Array[Identifier]] = js.native
}

object HandlerIds {
  @scala.inline
  def apply(): HandlerIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerIds]
  }
  @scala.inline
  implicit class HandlerIdsOps[Self <: HandlerIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlerIds(value: js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlerIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlerIds")(js.undefined)
        ret
    }
  }
  
}

