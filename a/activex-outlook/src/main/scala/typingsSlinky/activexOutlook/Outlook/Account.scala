package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  val AccountType: OlAccountType = js.native
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val AutoDiscoverConnectionMode: OlAutoDiscoverConnectionMode = js.native
  val AutoDiscoverXml: String = js.native
  val Class: OlObjectClass = js.native
  val CurrentUser: Recipient = js.native
  val DeliveryStore: Store = js.native
  val DisplayName: String = js.native
  val ExchangeConnectionMode: OlExchangeConnectionMode = js.native
  val ExchangeMailboxServerName: String = js.native
  val ExchangeMailboxServerVersion: String = js.native
  @JSName("Outlook.Account_typekey")
  var OutlookDotAccount_typekey: Account = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val SmtpAddress: String = js.native
  val UserName: String = js.native
  def GetAddressEntryFromID(ID: String): AddressEntry = js.native
  def GetRecipientFromID(EntryID: String): Recipient = js.native
}

object Account {
  @scala.inline
  def apply(
    AccountType: OlAccountType,
    Application: Application,
    AutoDiscoverConnectionMode: OlAutoDiscoverConnectionMode,
    AutoDiscoverXml: String,
    Class: OlObjectClass,
    CurrentUser: Recipient,
    DeliveryStore: Store,
    DisplayName: String,
    ExchangeConnectionMode: OlExchangeConnectionMode,
    ExchangeMailboxServerName: String,
    ExchangeMailboxServerVersion: String,
    GetAddressEntryFromID: String => AddressEntry,
    GetRecipientFromID: String => Recipient,
    OutlookDotAccount_typekey: Account,
    Parent: js.Any,
    Session: NameSpace,
    SmtpAddress: String,
    UserName: String
  ): Account = {
    val __obj = js.Dynamic.literal(AccountType = AccountType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoDiscoverConnectionMode = AutoDiscoverConnectionMode.asInstanceOf[js.Any], AutoDiscoverXml = AutoDiscoverXml.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], CurrentUser = CurrentUser.asInstanceOf[js.Any], DeliveryStore = DeliveryStore.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ExchangeConnectionMode = ExchangeConnectionMode.asInstanceOf[js.Any], ExchangeMailboxServerName = ExchangeMailboxServerName.asInstanceOf[js.Any], ExchangeMailboxServerVersion = ExchangeMailboxServerVersion.asInstanceOf[js.Any], GetAddressEntryFromID = js.Any.fromFunction1(GetAddressEntryFromID), GetRecipientFromID = js.Any.fromFunction1(GetRecipientFromID), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SmtpAddress = SmtpAddress.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Account_typekey")(OutlookDotAccount_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountType(value: OlAccountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoDiscoverConnectionMode(value: OlAutoDiscoverConnectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDiscoverConnectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoDiscoverXml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDiscoverXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentUser(value: Recipient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryStore(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExchangeConnectionMode(value: OlExchangeConnectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExchangeConnectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExchangeMailboxServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExchangeMailboxServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExchangeMailboxServerVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExchangeMailboxServerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAddressEntryFromID(value: String => AddressEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAddressEntryFromID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRecipientFromID(value: String => Recipient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetRecipientFromID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutlookDotAccount_typekey(value: Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.Account_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmtpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmtpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

