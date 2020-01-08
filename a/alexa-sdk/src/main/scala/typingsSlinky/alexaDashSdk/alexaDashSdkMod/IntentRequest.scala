package typingsSlinky.alexaDashSdk.alexaDashSdkMod

import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDotItemsCreated
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDotItemsDeleted
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDotItemsUpdated
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDotListCreated
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDotListDeleted
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDotListUpdated
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDotSkillAccountLinked
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDotSkillDisabled
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDotSkillEnabled
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDotSkillPermissionAccepted
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDotSkillPermissionChanged
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotPlaybackFinished
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotPlaybackNearlyFinished
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotPlaybackStarted
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotPlaybackStopped
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDotNextCommandIssued
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDotPauseCommandIssued
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDotPlayCommandIssued
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDotPreviousCommandIssued
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.SystemDotExceptionEncountered
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
    `type`: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.LaunchRequest | typingsSlinky.alexaDashSdk.alexaDashSdkStrings.IntentRequest | typingsSlinky.alexaDashSdk.alexaDashSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted,
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

