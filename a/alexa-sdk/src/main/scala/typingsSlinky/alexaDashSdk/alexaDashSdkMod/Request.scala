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

trait Request extends js.Object {
  var locale: js.UndefOr[String] = js.undefined
  var requestId: String
  var timestamp: String
  var `type`: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.LaunchRequest | typingsSlinky.alexaDashSdk.alexaDashSdkStrings.IntentRequest | typingsSlinky.alexaDashSdk.alexaDashSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted
}

object Request {
  @scala.inline
  def apply(
    requestId: String,
    timestamp: String,
    `type`: typingsSlinky.alexaDashSdk.alexaDashSdkStrings.LaunchRequest | typingsSlinky.alexaDashSdk.alexaDashSdkStrings.IntentRequest | typingsSlinky.alexaDashSdk.alexaDashSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted,
    locale: String = null
  ): Request = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

