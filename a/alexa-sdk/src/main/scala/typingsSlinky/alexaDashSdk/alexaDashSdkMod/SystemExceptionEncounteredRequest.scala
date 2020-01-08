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

trait SystemExceptionEncounteredRequest extends Request {
  var cause: ErrorCause
  var error: SystemError
}

object SystemExceptionEncounteredRequest {
  @scala.inline
  def apply(
    cause: ErrorCause,
    error: SystemError,
    requestId: String,
    timestamp: String,
    `type`: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.LaunchRequest | typingsSlinky.alexaDashSdk.alexaDashSdkStrings.IntentRequest | typingsSlinky.alexaDashSdk.alexaDashSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted,
    locale: String = null
  ): SystemExceptionEncounteredRequest = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemExceptionEncounteredRequest]
  }
}

