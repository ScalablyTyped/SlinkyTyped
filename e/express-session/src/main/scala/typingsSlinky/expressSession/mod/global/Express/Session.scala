package typingsSlinky.expressSession.mod.global.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends SessionData {
  @JSName("cookie")
  var cookie_Session: SessionCookie = js.native
  var id: String = js.native
  def destroy(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def regenerate(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def reload(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def save(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def touch(): Unit = js.native
}

object Session {
  @scala.inline
  def apply(
    cookie: SessionCookie,
    destroy: js.Function1[/* err */ js.Any, Unit] => Unit,
    id: String,
    regenerate: js.Function1[/* err */ js.Any, Unit] => Unit,
    reload: js.Function1[/* err */ js.Any, Unit] => Unit,
    save: js.Function1[/* err */ js.Any, Unit] => Unit,
    touch: () => Unit
  ): Session = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], destroy = js.Any.fromFunction1(destroy), id = id.asInstanceOf[js.Any], regenerate = js.Any.fromFunction1(regenerate), reload = js.Any.fromFunction1(reload), save = js.Any.fromFunction1(save), touch = js.Any.fromFunction0(touch))
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookie(value: SessionCookie): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: js.Function1[/* err */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegenerate(value: js.Function1[/* err */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regenerate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReload(value: js.Function1[/* err */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSave(value: js.Function1[/* err */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTouch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

