package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxActivityLogging Class */
@js.native
trait FaxActivityLogging extends js.Object {
  /** Activity log database files path */
  var DatabasePath: String = js.native
  @JSName("FAXCOMEXLib.FaxActivityLogging_typekey")
  var FAXCOMEXLibDotFaxActivityLogging_typekey: FaxActivityLogging = js.native
  /** Does the server log incoming fax activity */
  var LogIncoming: Boolean = js.native
  /** Does the server log outgoing fax activity */
  var LogOutgoing: Boolean = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

object FaxActivityLogging {
  @scala.inline
  def apply(
    DatabasePath: String,
    FAXCOMEXLibDotFaxActivityLogging_typekey: FaxActivityLogging,
    LogIncoming: Boolean,
    LogOutgoing: Boolean,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxActivityLogging = {
    val __obj = js.Dynamic.literal(DatabasePath = DatabasePath.asInstanceOf[js.Any], LogIncoming = LogIncoming.asInstanceOf[js.Any], LogOutgoing = LogOutgoing.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxActivityLogging_typekey")(FAXCOMEXLibDotFaxActivityLogging_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxActivityLogging]
  }
  @scala.inline
  implicit class FaxActivityLoggingOps[Self <: FaxActivityLogging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabasePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxActivityLogging_typekey(value: FaxActivityLogging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxActivityLogging_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogIncoming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogIncoming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogOutgoing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogOutgoing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

