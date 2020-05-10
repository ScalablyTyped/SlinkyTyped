package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.UsersCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.AutoForwarding
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.BatchDeleteMessagesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.BatchModifyMessagesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.Delegate
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.Draft
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.Filter
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.FilterAction
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.FilterCriteria
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.ForwardingAddress
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.ImapSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.Label
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.LabelColor
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.Message
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.MessagePart
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.MessagePartBody
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.MessagePartHeader
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.ModifyMessageRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.ModifyThreadRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.PopSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SmimeInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SmtpMsa
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.VacationSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.WatchRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gmail_ extends js.Object {
  var Users: js.UndefOr[UsersCollection] = js.native
  // Create a new instance of AutoForwarding
  def newAutoForwarding(): AutoForwarding = js.native
  // Create a new instance of BatchDeleteMessagesRequest
  def newBatchDeleteMessagesRequest(): BatchDeleteMessagesRequest = js.native
  // Create a new instance of BatchModifyMessagesRequest
  def newBatchModifyMessagesRequest(): BatchModifyMessagesRequest = js.native
  // Create a new instance of Delegate
  def newDelegate(): Delegate = js.native
  // Create a new instance of Draft
  def newDraft(): Draft = js.native
  // Create a new instance of Filter
  def newFilter(): Filter = js.native
  // Create a new instance of FilterAction
  def newFilterAction(): FilterAction = js.native
  // Create a new instance of FilterCriteria
  def newFilterCriteria(): FilterCriteria = js.native
  // Create a new instance of ForwardingAddress
  def newForwardingAddress(): ForwardingAddress = js.native
  // Create a new instance of ImapSettings
  def newImapSettings(): ImapSettings = js.native
  // Create a new instance of Label
  def newLabel(): Label = js.native
  // Create a new instance of LabelColor
  def newLabelColor(): LabelColor = js.native
  // Create a new instance of Message
  def newMessage(): Message = js.native
  // Create a new instance of MessagePart
  def newMessagePart(): MessagePart = js.native
  // Create a new instance of MessagePartBody
  def newMessagePartBody(): MessagePartBody = js.native
  // Create a new instance of MessagePartHeader
  def newMessagePartHeader(): MessagePartHeader = js.native
  // Create a new instance of ModifyMessageRequest
  def newModifyMessageRequest(): ModifyMessageRequest = js.native
  // Create a new instance of ModifyThreadRequest
  def newModifyThreadRequest(): ModifyThreadRequest = js.native
  // Create a new instance of PopSettings
  def newPopSettings(): PopSettings = js.native
  // Create a new instance of SendAs
  def newSendAs(): SendAs = js.native
  // Create a new instance of SmimeInfo
  def newSmimeInfo(): SmimeInfo = js.native
  // Create a new instance of SmtpMsa
  def newSmtpMsa(): SmtpMsa = js.native
  // Create a new instance of VacationSettings
  def newVacationSettings(): VacationSettings = js.native
  // Create a new instance of WatchRequest
  def newWatchRequest(): WatchRequest = js.native
}

object Gmail_ {
  @scala.inline
  def apply(
    newAutoForwarding: () => AutoForwarding,
    newBatchDeleteMessagesRequest: () => BatchDeleteMessagesRequest,
    newBatchModifyMessagesRequest: () => BatchModifyMessagesRequest,
    newDelegate: () => Delegate,
    newDraft: () => Draft,
    newFilter: () => Filter,
    newFilterAction: () => FilterAction,
    newFilterCriteria: () => FilterCriteria,
    newForwardingAddress: () => ForwardingAddress,
    newImapSettings: () => ImapSettings,
    newLabel: () => Label,
    newLabelColor: () => LabelColor,
    newMessage: () => Message,
    newMessagePart: () => MessagePart,
    newMessagePartBody: () => MessagePartBody,
    newMessagePartHeader: () => MessagePartHeader,
    newModifyMessageRequest: () => ModifyMessageRequest,
    newModifyThreadRequest: () => ModifyThreadRequest,
    newPopSettings: () => PopSettings,
    newSendAs: () => SendAs,
    newSmimeInfo: () => SmimeInfo,
    newSmtpMsa: () => SmtpMsa,
    newVacationSettings: () => VacationSettings,
    newWatchRequest: () => WatchRequest
  ): Gmail_ = {
    val __obj = js.Dynamic.literal(newAutoForwarding = js.Any.fromFunction0(newAutoForwarding), newBatchDeleteMessagesRequest = js.Any.fromFunction0(newBatchDeleteMessagesRequest), newBatchModifyMessagesRequest = js.Any.fromFunction0(newBatchModifyMessagesRequest), newDelegate = js.Any.fromFunction0(newDelegate), newDraft = js.Any.fromFunction0(newDraft), newFilter = js.Any.fromFunction0(newFilter), newFilterAction = js.Any.fromFunction0(newFilterAction), newFilterCriteria = js.Any.fromFunction0(newFilterCriteria), newForwardingAddress = js.Any.fromFunction0(newForwardingAddress), newImapSettings = js.Any.fromFunction0(newImapSettings), newLabel = js.Any.fromFunction0(newLabel), newLabelColor = js.Any.fromFunction0(newLabelColor), newMessage = js.Any.fromFunction0(newMessage), newMessagePart = js.Any.fromFunction0(newMessagePart), newMessagePartBody = js.Any.fromFunction0(newMessagePartBody), newMessagePartHeader = js.Any.fromFunction0(newMessagePartHeader), newModifyMessageRequest = js.Any.fromFunction0(newModifyMessageRequest), newModifyThreadRequest = js.Any.fromFunction0(newModifyThreadRequest), newPopSettings = js.Any.fromFunction0(newPopSettings), newSendAs = js.Any.fromFunction0(newSendAs), newSmimeInfo = js.Any.fromFunction0(newSmimeInfo), newSmtpMsa = js.Any.fromFunction0(newSmtpMsa), newVacationSettings = js.Any.fromFunction0(newVacationSettings), newWatchRequest = js.Any.fromFunction0(newWatchRequest))
    __obj.asInstanceOf[Gmail_]
  }
  @scala.inline
  implicit class Gmail_Ops[Self <: Gmail_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAutoForwarding(value: () => AutoForwarding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAutoForwarding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBatchDeleteMessagesRequest(value: () => BatchDeleteMessagesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBatchDeleteMessagesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBatchModifyMessagesRequest(value: () => BatchModifyMessagesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBatchModifyMessagesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDelegate(value: () => Delegate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDelegate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDraft(value: () => Draft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDraft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFilter(value: () => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFilterAction(value: () => FilterAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFilterAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFilterCriteria(value: () => FilterCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFilterCriteria")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewForwardingAddress(value: () => ForwardingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newForwardingAddress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewImapSettings(value: () => ImapSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newImapSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLabel(value: () => Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLabelColor(value: () => LabelColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLabelColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMessage(value: () => Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMessagePart(value: () => MessagePart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMessagePart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMessagePartBody(value: () => MessagePartBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMessagePartBody")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMessagePartHeader(value: () => MessagePartHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMessagePartHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewModifyMessageRequest(value: () => ModifyMessageRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newModifyMessageRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewModifyThreadRequest(value: () => ModifyThreadRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newModifyThreadRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPopSettings(value: () => PopSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPopSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSendAs(value: () => SendAs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSendAs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSmimeInfo(value: () => SmimeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSmimeInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSmtpMsa(value: () => SmtpMsa): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSmtpMsa")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVacationSettings(value: () => VacationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVacationSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWatchRequest(value: () => WatchRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWatchRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUsers(value: UsersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(js.undefined)
        ret
    }
  }
  
}

