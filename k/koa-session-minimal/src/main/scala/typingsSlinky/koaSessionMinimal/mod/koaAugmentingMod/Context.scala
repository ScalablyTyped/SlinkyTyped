package typingsSlinky.koaSessionMinimal.mod.koaAugmentingMod

import typingsSlinky.koaSessionMinimal.AnonRegenerateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var session: js.Any = js.native
  var sessionHandler: AnonRegenerateId = js.native
}

object Context {
  @scala.inline
  def apply(session: js.Any, sessionHandler: AnonRegenerateId): Context = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionHandler = sessionHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSession(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionHandler(value: AnonRegenerateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionHandler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

