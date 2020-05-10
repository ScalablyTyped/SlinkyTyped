package typingsSlinky.officeJsPreview.Office

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.olkRecipientsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientsChangedEventArgs extends js.Object {
  /** 
    * Gets an object that indicates change state of recipients fields. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var changedRecipientFields: RecipientsChangedFields = js.native
  /** 
    * Gets the type of the event. See `Office.EventType` for details. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var `type`: olkRecipientsChanged = js.native
}

object RecipientsChangedEventArgs {
  @scala.inline
  def apply(changedRecipientFields: RecipientsChangedFields, `type`: olkRecipientsChanged): RecipientsChangedEventArgs = {
    val __obj = js.Dynamic.literal(changedRecipientFields = changedRecipientFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientsChangedEventArgs]
  }
  @scala.inline
  implicit class RecipientsChangedEventArgsOps[Self <: RecipientsChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedRecipientFields(value: RecipientsChangedFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedRecipientFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: olkRecipientsChanged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

