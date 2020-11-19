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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioPlayerPlaybackRequest extends Request {
  
  var offsetInMilliseconds: Double = js.native
  
  var token: String = js.native
}
object AudioPlayerPlaybackRequest {
  
  @scala.inline
  def apply(
    offsetInMilliseconds: Double,
    requestId: String,
    timestamp: String,
    token: String,
    `type`: typingsSlinky.alexaSdk.alexaSdkStrings.LaunchRequest | typingsSlinky.alexaSdk.alexaSdkStrings.IntentRequest | typingsSlinky.alexaSdk.alexaSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted
  ): AudioPlayerPlaybackRequest = {
    val __obj = js.Dynamic.literal(offsetInMilliseconds = offsetInMilliseconds.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerPlaybackRequest]
  }
  
  @scala.inline
  implicit class AudioPlayerPlaybackRequestOps[Self <: AudioPlayerPlaybackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOffsetInMilliseconds(value: Double): Self = this.set("offsetInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
