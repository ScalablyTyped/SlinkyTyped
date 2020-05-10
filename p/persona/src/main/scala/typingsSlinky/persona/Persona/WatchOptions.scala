package typingsSlinky.persona.Persona

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchOptions extends js.Object {
  var loggedInUser: String = js.native
  var onready: js.UndefOr[js.Function0[Unit]] = js.native
  def onlogin(s: String): Unit = js.native
  def onlogout(): Unit = js.native
}

object WatchOptions {
  @scala.inline
  def apply(loggedInUser: String, onlogin: String => Unit, onlogout: () => Unit): WatchOptions = {
    val __obj = js.Dynamic.literal(loggedInUser = loggedInUser.asInstanceOf[js.Any], onlogin = js.Any.fromFunction1(onlogin), onlogout = js.Any.fromFunction0(onlogout))
    __obj.asInstanceOf[WatchOptions]
  }
  @scala.inline
  implicit class WatchOptionsOps[Self <: WatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggedInUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggedInUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlogin(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlogin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnlogout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlogout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnready(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnready: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onready")(js.undefined)
        ret
    }
  }
  
}

