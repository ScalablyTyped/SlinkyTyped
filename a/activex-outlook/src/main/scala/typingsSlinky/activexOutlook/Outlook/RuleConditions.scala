package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleConditions extends js.Object {
  val Account: AccountRuleCondition = js.native
  val AnyCategory: RuleCondition = js.native
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Body: TextRuleCondition = js.native
  val BodyOrSubject: TextRuleCondition = js.native
  val CC: RuleCondition = js.native
  val Category: CategoryRuleCondition = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  val FormName: FormNameRuleCondition = js.native
  val From: ToOrFromRuleCondition = js.native
  val FromAnyRSSFeed: RuleCondition = js.native
  val FromRssFeed: FromRssFeedRuleCondition = js.native
  val HasAttachment: RuleCondition = js.native
  val Importance: ImportanceRuleCondition = js.native
  val MeetingInviteOrUpdate: RuleCondition = js.native
  val MessageHeader: TextRuleCondition = js.native
  val NotTo: RuleCondition = js.native
  val OnLocalMachine: RuleCondition = js.native
  val OnOtherMachine: RuleCondition = js.native
  val OnlyToMe: RuleCondition = js.native
  @JSName("Outlook.RuleConditions_typekey")
  var OutlookDotRuleConditions_typekey: RuleConditions = js.native
  val Parent: js.Any = js.native
  val RecipientAddress: AddressRuleCondition = js.native
  val SenderAddress: AddressRuleCondition = js.native
  val SenderInAddressList: SenderInAddressListRuleCondition = js.native
  val SentTo: ToOrFromRuleCondition = js.native
  val Session: NameSpace = js.native
  val Subject: TextRuleCondition = js.native
  val ToMe: RuleCondition = js.native
  val ToOrCc: RuleCondition = js.native
  def Item(Index: Double): RuleCondition = js.native
}

object RuleConditions {
  @scala.inline
  def apply(
    Account: AccountRuleCondition,
    AnyCategory: RuleCondition,
    Application: Application,
    Body: TextRuleCondition,
    BodyOrSubject: TextRuleCondition,
    CC: RuleCondition,
    Category: CategoryRuleCondition,
    Class: OlObjectClass,
    Count: Double,
    FormName: FormNameRuleCondition,
    From: ToOrFromRuleCondition,
    FromAnyRSSFeed: RuleCondition,
    FromRssFeed: FromRssFeedRuleCondition,
    HasAttachment: RuleCondition,
    Importance: ImportanceRuleCondition,
    Item: Double => RuleCondition,
    MeetingInviteOrUpdate: RuleCondition,
    MessageHeader: TextRuleCondition,
    NotTo: RuleCondition,
    OnLocalMachine: RuleCondition,
    OnOtherMachine: RuleCondition,
    OnlyToMe: RuleCondition,
    OutlookDotRuleConditions_typekey: RuleConditions,
    Parent: js.Any,
    RecipientAddress: AddressRuleCondition,
    SenderAddress: AddressRuleCondition,
    SenderInAddressList: SenderInAddressListRuleCondition,
    SentTo: ToOrFromRuleCondition,
    Session: NameSpace,
    Subject: TextRuleCondition,
    ToMe: RuleCondition,
    ToOrCc: RuleCondition
  ): RuleConditions = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], AnyCategory = AnyCategory.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], BodyOrSubject = BodyOrSubject.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], FormName = FormName.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], FromAnyRSSFeed = FromAnyRSSFeed.asInstanceOf[js.Any], FromRssFeed = FromRssFeed.asInstanceOf[js.Any], HasAttachment = HasAttachment.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MeetingInviteOrUpdate = MeetingInviteOrUpdate.asInstanceOf[js.Any], MessageHeader = MessageHeader.asInstanceOf[js.Any], NotTo = NotTo.asInstanceOf[js.Any], OnLocalMachine = OnLocalMachine.asInstanceOf[js.Any], OnOtherMachine = OnOtherMachine.asInstanceOf[js.Any], OnlyToMe = OnlyToMe.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RecipientAddress = RecipientAddress.asInstanceOf[js.Any], SenderAddress = SenderAddress.asInstanceOf[js.Any], SenderInAddressList = SenderInAddressList.asInstanceOf[js.Any], SentTo = SentTo.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], ToMe = ToMe.asInstanceOf[js.Any], ToOrCc = ToOrCc.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.RuleConditions_typekey")(OutlookDotRuleConditions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleConditions]
  }
  @scala.inline
  implicit class RuleConditionsOps[Self <: RuleConditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: AccountRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnyCategory(value: RuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnyCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: TextRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyOrSubject(value: TextRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BodyOrSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCC(value: RuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: CategoryRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormName(value: FormNameRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: ToOrFromRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("From")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromAnyRSSFeed(value: RuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromAnyRSSFeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromRssFeed(value: FromRssFeedRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromRssFeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasAttachment(value: RuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportance(value: ImportanceRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Importance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double => RuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMeetingInviteOrUpdate(value: RuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeetingInviteOrUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageHeader(value: TextRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotTo(value: RuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnLocalMachine(value: RuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnLocalMachine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnOtherMachine(value: RuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnOtherMachine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyToMe(value: RuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnlyToMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotRuleConditions_typekey(value: RuleConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.RuleConditions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientAddress(value: AddressRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderAddress(value: AddressRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderInAddressList(value: SenderInAddressListRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderInAddressList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSentTo(value: ToOrFromRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SentTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: TextRuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToMe(value: RuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToOrCc(value: RuleCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToOrCc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

