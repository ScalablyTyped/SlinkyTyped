package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Deprecated. For spreadsheets created in the newer version of Google Sheets, use the more powerful
  *     Protection class instead. Although this class is deprecated, it remains available
  *     for compatibility with the older version of Sheets.
  * Access and modify protected sheets in the older version of Google Sheets.
  */
@js.native
trait PageProtection extends js.Object {
  /** @deprecated DO NOT USE */ def addUser(email: String): Unit = js.native
  /** @deprecated DO NOT USE */ def getUsers(): js.Array[String] = js.native
  /** @deprecated DO NOT USE */ def isProtected(): Boolean = js.native
  /** @deprecated DO NOT USE */ def removeUser(user: String): Unit = js.native
  /** @deprecated DO NOT USE */ def setProtected(protection: Boolean): Unit = js.native
}

object PageProtection {
  @scala.inline
  def apply(
    addUser: String => Unit,
    getUsers: () => js.Array[String],
    isProtected: () => Boolean,
    removeUser: String => Unit,
    setProtected: Boolean => Unit
  ): PageProtection = {
    val __obj = js.Dynamic.literal(addUser = js.Any.fromFunction1(addUser), getUsers = js.Any.fromFunction0(getUsers), isProtected = js.Any.fromFunction0(isProtected), removeUser = js.Any.fromFunction1(removeUser), setProtected = js.Any.fromFunction1(setProtected))
    __obj.asInstanceOf[PageProtection]
  }
  @scala.inline
  implicit class PageProtectionOps[Self <: PageProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddUser(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUsers(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsProtected(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProtected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveUser(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetProtected(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProtected")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

