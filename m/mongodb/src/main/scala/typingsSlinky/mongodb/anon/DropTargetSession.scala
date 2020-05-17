package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropTargetSession extends js.Object {
  var dropTarget: js.UndefOr[Boolean] = js.native
  var session: js.UndefOr[ClientSession] = js.native
}

object DropTargetSession {
  @scala.inline
  def apply(): DropTargetSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetSession]
  }
  @scala.inline
  implicit class DropTargetSessionOps[Self <: DropTargetSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: ClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
  }
  
}

