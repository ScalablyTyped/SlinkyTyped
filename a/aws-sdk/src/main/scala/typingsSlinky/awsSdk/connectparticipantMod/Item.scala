package typingsSlinky.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  /**
    * The time when the message or event was sent. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.native
  /**
    * The content of the message or event.
    */
  var Content: js.UndefOr[ChatContent] = js.native
  /**
    * The type of content of the item.
    */
  var ContentType: js.UndefOr[ChatContentType] = js.native
  /**
    * The chat display name of the sender.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.DisplayName] = js.native
  /**
    * The ID of the item.
    */
  var Id: js.UndefOr[ChatItemId] = js.native
  /**
    * The ID of the sender in the session.
    */
  var ParticipantId: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.ParticipantId] = js.native
  /**
    * The role of the sender. For example, is it a customer, agent, or system.
    */
  var ParticipantRole: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.ParticipantRole] = js.native
  /**
    * Type of the item: message or event. 
    */
  var Type: js.UndefOr[ChatItemType] = js.native
}

object Item {
  @scala.inline
  def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteTime(value: Instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbsoluteTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsoluteTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbsoluteTime")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: ChatContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: ChatContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ChatItemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withParticipantId(value: ParticipantId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParticipantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParticipantId")(js.undefined)
        ret
    }
    @scala.inline
    def withParticipantRole(value: ParticipantRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParticipantRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipantRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParticipantRole")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ChatItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

