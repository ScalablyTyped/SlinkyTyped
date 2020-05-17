package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullSession extends js.Object {
  var full: Boolean = js.native
  var session: ClientSession = js.native
}

object FullSession {
  @scala.inline
  def apply(full: Boolean, session: ClientSession): FullSession = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullSession]
  }
  @scala.inline
  implicit class FullSessionOps[Self <: FullSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: ClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

