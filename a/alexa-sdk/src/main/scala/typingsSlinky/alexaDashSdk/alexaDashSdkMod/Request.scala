package typingsSlinky.alexaDashSdk.alexaDashSdkMod

import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDOTItemsCreated
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDOTItemsDeleted
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDOTItemsUpdated
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDOTListCreated
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDOTListDeleted
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDOTListUpdated
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDOTSkillAccountLinked
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDOTSkillDisabled
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDOTSkillEnabled
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDOTSkillPermissionAccepted
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDOTSkillPermissionChanged
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTPlaybackFinished
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTPlaybackNearlyFinished
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTPlaybackStarted
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTPlaybackStopped
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDOTNextCommandIssued
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDOTPauseCommandIssued
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDOTPlayCommandIssued
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDOTPreviousCommandIssued
import typingsSlinky.alexaDashSdk.alexaDashSdkStrings.SystemDOTExceptionEncountered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var locale: js.UndefOr[String] = js.undefined
  var requestId: String
  var timestamp: String
  var `type`: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.LaunchRequest | typingsSlinky.alexaDashSdk.alexaDashSdkStrings.IntentRequest | typingsSlinky.alexaDashSdk.alexaDashSdkStrings.SessionEndedRequest | SystemDOTExceptionEncountered | AudioPlayerDOTPlaybackStarted | AudioPlayerDOTPlaybackFinished | AudioPlayerDOTPlaybackStopped | AudioPlayerDOTPlaybackNearlyFinished | PlaybackControllerDOTNextCommandIssued | PlaybackControllerDOTPauseCommandIssued | PlaybackControllerDOTPlayCommandIssued | PlaybackControllerDOTPreviousCommandIssued | AlexaSkillEventDOTSkillAccountLinked | AlexaSkillEventDOTSkillEnabled | AlexaSkillEventDOTSkillDisabled | AlexaSkillEventDOTSkillPermissionAccepted | AlexaSkillEventDOTSkillPermissionChanged | AlexaHouseholdListEventDOTListCreated | AlexaHouseholdListEventDOTListUpdated | AlexaHouseholdListEventDOTListDeleted | AlexaHouseholdListEventDOTItemsCreated | AlexaHouseholdListEventDOTItemsUpdated | AlexaHouseholdListEventDOTItemsDeleted
}

object Request {
  @scala.inline
  def apply(
    requestId: String,
    timestamp: String,
    `type`: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.LaunchRequest | typingsSlinky.alexaDashSdk.alexaDashSdkStrings.IntentRequest | typingsSlinky.alexaDashSdk.alexaDashSdkStrings.SessionEndedRequest | SystemDOTExceptionEncountered | AudioPlayerDOTPlaybackStarted | AudioPlayerDOTPlaybackFinished | AudioPlayerDOTPlaybackStopped | AudioPlayerDOTPlaybackNearlyFinished | PlaybackControllerDOTNextCommandIssued | PlaybackControllerDOTPauseCommandIssued | PlaybackControllerDOTPlayCommandIssued | PlaybackControllerDOTPreviousCommandIssued | AlexaSkillEventDOTSkillAccountLinked | AlexaSkillEventDOTSkillEnabled | AlexaSkillEventDOTSkillDisabled | AlexaSkillEventDOTSkillPermissionAccepted | AlexaSkillEventDOTSkillPermissionChanged | AlexaHouseholdListEventDOTListCreated | AlexaHouseholdListEventDOTListUpdated | AlexaHouseholdListEventDOTListDeleted | AlexaHouseholdListEventDOTItemsCreated | AlexaHouseholdListEventDOTItemsUpdated | AlexaHouseholdListEventDOTItemsDeleted,
    locale: String = null
  ): Request = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

