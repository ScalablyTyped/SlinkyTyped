package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountSet Class */
@js.native
trait FaxAccountSet extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountSet_typekey")
  var FAXCOMEXLibDotFaxAccountSet_typekey: FaxAccountSet = js.native
  /** Adds a fax account */
  def AddAccount(bstrAccountName: String): FaxAccount = js.native
  /** Get fax account by name */
  def GetAccount(bstrAccountName: String): FaxAccount = js.native
  /** Collection of fax accounts */
  def GetAccounts(): FaxAccounts = js.native
  /** Removes a fax account by name */
  def RemoveAccount(bstrAccountName: String): Unit = js.native
}

object FaxAccountSet {
  @scala.inline
  def apply(
    AddAccount: String => FaxAccount,
    FAXCOMEXLibDotFaxAccountSet_typekey: FaxAccountSet,
    GetAccount: String => FaxAccount,
    GetAccounts: () => FaxAccounts,
    RemoveAccount: String => Unit
  ): FaxAccountSet = {
    val __obj = js.Dynamic.literal(AddAccount = js.Any.fromFunction1(AddAccount), GetAccount = js.Any.fromFunction1(GetAccount), GetAccounts = js.Any.fromFunction0(GetAccounts), RemoveAccount = js.Any.fromFunction1(RemoveAccount))
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountSet_typekey")(FAXCOMEXLibDotFaxAccountSet_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountSet]
  }
  @scala.inline
  implicit class FaxAccountSetOps[Self <: FaxAccountSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAccount(value: String => FaxAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxAccountSet_typekey(value: FaxAccountSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxAccountSet_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAccount(value: String => FaxAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAccounts(value: () => FaxAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAccounts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveAccount(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveAccount")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

