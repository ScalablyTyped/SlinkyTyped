package typingsSlinky.alexaSdk.mod

import typingsSlinky.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotItemsCreated
import typingsSlinky.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotItemsDeleted
import typingsSlinky.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotItemsUpdated
import typingsSlinky.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotListCreated
import typingsSlinky.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotListDeleted
import typingsSlinky.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotListUpdated
import typingsSlinky.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillAccountLinked
import typingsSlinky.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillDisabled
import typingsSlinky.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillEnabled
import typingsSlinky.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillPermissionAccepted
import typingsSlinky.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillPermissionChanged
import typingsSlinky.alexaSdk.alexaSdkStrings.AudioPlayerDotPlaybackFinished
import typingsSlinky.alexaSdk.alexaSdkStrings.AudioPlayerDotPlaybackNearlyFinished
import typingsSlinky.alexaSdk.alexaSdkStrings.AudioPlayerDotPlaybackStarted
import typingsSlinky.alexaSdk.alexaSdkStrings.AudioPlayerDotPlaybackStopped
import typingsSlinky.alexaSdk.alexaSdkStrings.PlaybackControllerDotNextCommandIssued
import typingsSlinky.alexaSdk.alexaSdkStrings.PlaybackControllerDotPauseCommandIssued
import typingsSlinky.alexaSdk.alexaSdkStrings.PlaybackControllerDotPlayCommandIssued
import typingsSlinky.alexaSdk.alexaSdkStrings.PlaybackControllerDotPreviousCommandIssued
import typingsSlinky.alexaSdk.alexaSdkStrings.SystemDotExceptionEncountered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntentRequest extends Request {
  var dialogState: js.UndefOr[DialogStates] = js.native
  var intent: js.UndefOr[Intent] = js.native
}

object IntentRequest {
  @scala.inline
  def apply(
    requestId: String,
    timestamp: String,
    `type`: typingsSlinky.alexaSdk.alexaSdkStrings.LaunchRequest | typingsSlinky.alexaSdk.alexaSdkStrings.IntentRequest | typingsSlinky.alexaSdk.alexaSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted
  ): IntentRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentRequest]
  }
  @scala.inline
  implicit class IntentRequestOps[Self <: IntentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialogState(value: DialogStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogState")(js.undefined)
        ret
    }
    @scala.inline
    def withIntent(value: Intent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(js.undefined)
        ret
    }
  }
  
}

