package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents `RecipientsChangedEventArgs.changedRecipientFields` object.
  *
  * [Api set: Mailbox 1.7]
  */
@js.native
trait RecipientsChangedFields extends js.Object {
  /**
    * Gets if recipients in the **bcc** field were changed.
    *
    * [Api set: Mailbox 1.7]
    */
  var bcc: Boolean = js.native
  /**
    * Gets if recipients in the **cc** field were changed.
    *
    * [Api set: Mailbox 1.7]
    */
  var cc: Boolean = js.native
  /**
    * Gets if optional attendees were changed.
    *
    * [Api set: Mailbox 1.7]
    */
  var optionalAttendees: Boolean = js.native
  /**
    * Gets if required attendees were changed.
    *
    * [Api set: Mailbox 1.7]
    */
  var requiredAttendees: Boolean = js.native
  /**
    * Gets if resources were changed.
    *
    * [Api set: Mailbox 1.7]
    */
  var resources: Boolean = js.native
  /**
    * Gets if recipients in the **to** field were changed.
    *
    * [Api set: Mailbox 1.7]
    */
  var to: Boolean = js.native
}

object RecipientsChangedFields {
  @scala.inline
  def apply(
    bcc: Boolean,
    cc: Boolean,
    optionalAttendees: Boolean,
    requiredAttendees: Boolean,
    resources: Boolean,
    to: Boolean
  ): RecipientsChangedFields = {
    val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], optionalAttendees = optionalAttendees.asInstanceOf[js.Any], requiredAttendees = requiredAttendees.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientsChangedFields]
  }
  @scala.inline
  implicit class RecipientsChangedFieldsOps[Self <: RecipientsChangedFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBcc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalAttendees(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalAttendees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredAttendees(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredAttendees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

