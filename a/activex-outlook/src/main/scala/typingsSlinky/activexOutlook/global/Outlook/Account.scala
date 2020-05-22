package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlAccountType
import typingsSlinky.activexOutlook.Outlook.OlAutoDiscoverConnectionMode
import typingsSlinky.activexOutlook.Outlook.OlExchangeConnectionMode
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Account")
@js.native
class Account protected ()
  extends typingsSlinky.activexOutlook.Outlook.Account {
  /* CompleteClass */
  override val AccountType: OlAccountType = js.native
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val AutoDiscoverConnectionMode: OlAutoDiscoverConnectionMode = js.native
  /* CompleteClass */
  override val AutoDiscoverXml: String = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val CurrentUser: typingsSlinky.activexOutlook.Outlook.Recipient = js.native
  /* CompleteClass */
  override val DeliveryStore: typingsSlinky.activexOutlook.Outlook.Store = js.native
  /* CompleteClass */
  override val DisplayName: String = js.native
  /* CompleteClass */
  override val ExchangeConnectionMode: OlExchangeConnectionMode = js.native
  /* CompleteClass */
  override val ExchangeMailboxServerName: String = js.native
  /* CompleteClass */
  override val ExchangeMailboxServerVersion: String = js.native
  /* CompleteClass */
  @JSName("Outlook.Account_typekey")
  override var OutlookDotAccount_typekey: typingsSlinky.activexOutlook.Outlook.Account = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override val SmtpAddress: String = js.native
  /* CompleteClass */
  override val UserName: String = js.native
  /* CompleteClass */
  override def GetAddressEntryFromID(ID: String): typingsSlinky.activexOutlook.Outlook.AddressEntry = js.native
  /* CompleteClass */
  override def GetRecipientFromID(EntryID: String): typingsSlinky.activexOutlook.Outlook.Recipient = js.native
}

