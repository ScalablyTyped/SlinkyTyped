package typingsSlinky.koaGenericSession.mod.koaAugmentingMod

import typingsSlinky.koaGenericSession.mod.Session
import typingsSlinky.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var session: Session | Null = js.native
  var sessionSave: Boolean | Null = js.native
  def regenerateSession(): Generator[_, _, _] = js.native
}

object Context {
  @scala.inline
  def apply(regenerateSession: () => Generator[_, _, _]): Context = {
    val __obj = js.Dynamic.literal(regenerateSession = js.Any.fromFunction0(regenerateSession))
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegenerateSession(value: () => Generator[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regenerateSession")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSession(value: Session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(null)
        ret
    }
    @scala.inline
    def withSessionSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionSaveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionSave")(null)
        ret
    }
  }
  
}

