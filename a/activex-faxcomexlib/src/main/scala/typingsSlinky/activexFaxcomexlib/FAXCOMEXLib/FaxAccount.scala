package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccount Class */
@js.native
trait FaxAccount extends js.Object {
  /** Name of the fax account */
  val AccountName: String = js.native
  @JSName("FAXCOMEXLib.FaxAccount_typekey")
  var FAXCOMEXLibDotFaxAccount_typekey: FaxAccount = js.native
  /** Folders belonging to the account */
  val Folders: FaxAccountFolders = js.native
  /** Events the fax account is listening to */
  val RegisteredEvents: FAX_ACCOUNT_EVENTS_TYPE_ENUM = js.native
  /** Set bit-wise combination of events the fax account listens to */
  def ListenToAccountEvents(EventTypes: FAX_ACCOUNT_EVENTS_TYPE_ENUM): Unit = js.native
}

object FaxAccount {
  @scala.inline
  def apply(
    AccountName: String,
    FAXCOMEXLibDotFaxAccount_typekey: FaxAccount,
    Folders: FaxAccountFolders,
    ListenToAccountEvents: FAX_ACCOUNT_EVENTS_TYPE_ENUM => Unit,
    RegisteredEvents: FAX_ACCOUNT_EVENTS_TYPE_ENUM
  ): FaxAccount = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], Folders = Folders.asInstanceOf[js.Any], ListenToAccountEvents = js.Any.fromFunction1(ListenToAccountEvents), RegisteredEvents = RegisteredEvents.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxAccount_typekey")(FAXCOMEXLibDotFaxAccount_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccount]
  }
  @scala.inline
  implicit class FaxAccountOps[Self <: FaxAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxAccount_typekey(value: FaxAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxAccount_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolders(value: FaxAccountFolders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListenToAccountEvents(value: FAX_ACCOUNT_EVENTS_TYPE_ENUM => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListenToAccountEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisteredEvents(value: FAX_ACCOUNT_EVENTS_TYPE_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredEvents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

