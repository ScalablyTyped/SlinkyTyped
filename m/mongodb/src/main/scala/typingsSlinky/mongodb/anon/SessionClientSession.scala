package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionClientSession extends js.Object {
  var session: js.UndefOr[ClientSession] = js.native
}

object SessionClientSession {
  @scala.inline
  def apply(): SessionClientSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionClientSession]
  }
  @scala.inline
  implicit class SessionClientSessionOps[Self <: SessionClientSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

