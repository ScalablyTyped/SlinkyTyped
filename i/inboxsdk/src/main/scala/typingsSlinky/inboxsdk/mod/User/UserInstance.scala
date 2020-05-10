package typingsSlinky.inboxsdk.mod.User

import typingsSlinky.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserInstance extends js.Object {
  def getAccountSwitcherContactList(): js.Array[Contact] = js.native
  def getEmailAddress(): String = js.native
  def getLanguage(): String = js.native
  def isConversationViewDisabled(): Boolean = js.native
  def isUsingGmailMaterialUI(): Boolean = js.native
}

object UserInstance {
  @scala.inline
  def apply(
    getAccountSwitcherContactList: () => js.Array[Contact],
    getEmailAddress: () => String,
    getLanguage: () => String,
    isConversationViewDisabled: () => Boolean,
    isUsingGmailMaterialUI: () => Boolean
  ): UserInstance = {
    val __obj = js.Dynamic.literal(getAccountSwitcherContactList = js.Any.fromFunction0(getAccountSwitcherContactList), getEmailAddress = js.Any.fromFunction0(getEmailAddress), getLanguage = js.Any.fromFunction0(getLanguage), isConversationViewDisabled = js.Any.fromFunction0(isConversationViewDisabled), isUsingGmailMaterialUI = js.Any.fromFunction0(isUsingGmailMaterialUI))
    __obj.asInstanceOf[UserInstance]
  }
  @scala.inline
  implicit class UserInstanceOps[Self <: UserInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAccountSwitcherContactList(value: () => js.Array[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountSwitcherContactList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEmailAddress(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmailAddress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLanguage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLanguage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsConversationViewDisabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConversationViewDisabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUsingGmailMaterialUI(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUsingGmailMaterialUI")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

