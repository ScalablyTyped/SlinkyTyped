package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVoiceConnectorGroupRequest extends js.Object {
  /**
    * The name of the Amazon Chime Voice Connector group.
    */
  var Name: VoiceConnectorGroupName = js.native
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString = js.native
  /**
    * The VoiceConnectorItems to associate with the group.
    */
  var VoiceConnectorItems: VoiceConnectorItemList = js.native
}

object UpdateVoiceConnectorGroupRequest {
  @scala.inline
  def apply(
    Name: VoiceConnectorGroupName,
    VoiceConnectorGroupId: NonEmptyString,
    VoiceConnectorItems: VoiceConnectorItemList
  ): UpdateVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any], VoiceConnectorItems = VoiceConnectorItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceConnectorGroupRequest]
  }
  @scala.inline
  implicit class UpdateVoiceConnectorGroupRequestOps[Self <: UpdateVoiceConnectorGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: VoiceConnectorGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoiceConnectorGroupId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnectorGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoiceConnectorItems(value: VoiceConnectorItemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnectorItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

