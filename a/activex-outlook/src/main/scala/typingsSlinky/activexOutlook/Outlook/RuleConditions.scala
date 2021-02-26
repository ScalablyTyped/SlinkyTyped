package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleConditions extends StObject {
  
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
  
  def Item(Index: Double): RuleCondition = js.native
  
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
  implicit class RuleConditionsMutableBuilder[Self <: RuleConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: AccountRuleCondition): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyCategory(value: RuleCondition): Self = StObject.set(x, "AnyCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: TextRuleCondition): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyOrSubject(value: TextRuleCondition): Self = StObject.set(x, "BodyOrSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCC(value: RuleCondition): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: CategoryRuleCondition): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormName(value: FormNameRuleCondition): Self = StObject.set(x, "FormName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: ToOrFromRuleCondition): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromAnyRSSFeed(value: RuleCondition): Self = StObject.set(x, "FromAnyRSSFeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromRssFeed(value: FromRssFeedRuleCondition): Self = StObject.set(x, "FromRssFeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAttachment(value: RuleCondition): Self = StObject.set(x, "HasAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportance(value: ImportanceRuleCondition): Self = StObject.set(x, "Importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => RuleCondition): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMeetingInviteOrUpdate(value: RuleCondition): Self = StObject.set(x, "MeetingInviteOrUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageHeader(value: TextRuleCondition): Self = StObject.set(x, "MessageHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotTo(value: RuleCondition): Self = StObject.set(x, "NotTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLocalMachine(value: RuleCondition): Self = StObject.set(x, "OnLocalMachine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOtherMachine(value: RuleCondition): Self = StObject.set(x, "OnOtherMachine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyToMe(value: RuleCondition): Self = StObject.set(x, "OnlyToMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotRuleConditions_typekey(value: RuleConditions): Self = StObject.set(x, "Outlook.RuleConditions_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientAddress(value: AddressRuleCondition): Self = StObject.set(x, "RecipientAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderAddress(value: AddressRuleCondition): Self = StObject.set(x, "SenderAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderInAddressList(value: SenderInAddressListRuleCondition): Self = StObject.set(x, "SenderInAddressList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentTo(value: ToOrFromRuleCondition): Self = StObject.set(x, "SentTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: TextRuleCondition): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToMe(value: RuleCondition): Self = StObject.set(x, "ToMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToOrCc(value: RuleCondition): Self = StObject.set(x, "ToOrCc", value.asInstanceOf[js.Any])
  }
}
