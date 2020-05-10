package typingsSlinky.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Session class provides access to session information, such as the user's email address (in
  * some circumstances) and language setting.
  */
@js.native
trait Session extends js.Object {
  def getActiveUser(): User = js.native
  def getActiveUserLocale(): String = js.native
  def getEffectiveUser(): User = js.native
  def getScriptTimeZone(): String = js.native
  def getTemporaryActiveUserKey(): String = js.native
  /** @deprecated DO NOT USE */ def getTimeZone(): String = js.native
  /** @deprecated DO NOT USE */ def getUser(): User = js.native
}

object Session {
  @scala.inline
  def apply(
    getActiveUser: () => User,
    getActiveUserLocale: () => String,
    getEffectiveUser: () => User,
    getScriptTimeZone: () => String,
    getTemporaryActiveUserKey: () => String,
    getTimeZone: () => String,
    getUser: () => User
  ): Session = {
    val __obj = js.Dynamic.literal(getActiveUser = js.Any.fromFunction0(getActiveUser), getActiveUserLocale = js.Any.fromFunction0(getActiveUserLocale), getEffectiveUser = js.Any.fromFunction0(getEffectiveUser), getScriptTimeZone = js.Any.fromFunction0(getScriptTimeZone), getTemporaryActiveUserKey = js.Any.fromFunction0(getTemporaryActiveUserKey), getTimeZone = js.Any.fromFunction0(getTimeZone), getUser = js.Any.fromFunction0(getUser))
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetActiveUser(value: () => User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveUser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetActiveUserLocale(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveUserLocale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEffectiveUser(value: () => User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEffectiveUser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScriptTimeZone(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptTimeZone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTemporaryActiveUserKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemporaryActiveUserKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimeZone(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeZone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUser(value: () => User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUser")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

