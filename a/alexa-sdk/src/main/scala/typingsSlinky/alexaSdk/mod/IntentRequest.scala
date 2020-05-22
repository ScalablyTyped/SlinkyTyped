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

trait IntentRequest extends Request {
  var dialogState: js.UndefOr[DialogStates] = js.undefined
  var intent: js.UndefOr[Intent] = js.undefined
}

object IntentRequest {
  @scala.inline
  def apply(
    requestId: String,
    timestamp: String,
    `type`: typingsSlinky.alexaSdk.alexaSdkStrings.LaunchRequest | typingsSlinky.alexaSdk.alexaSdkStrings.IntentRequest | typingsSlinky.alexaSdk.alexaSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted,
    dialogState: DialogStates = null,
    intent: Intent = null,
    locale: String = null
  ): IntentRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dialogState != null) __obj.updateDynamic("dialogState")(dialogState.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentRequest]
  }
}

