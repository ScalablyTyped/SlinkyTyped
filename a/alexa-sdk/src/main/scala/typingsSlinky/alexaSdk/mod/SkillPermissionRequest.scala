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
trait SkillPermissionRequest extends Request {
  
  var body: SkillPermissionBody = js.native
}
object SkillPermissionRequest {
  
  @scala.inline
  def apply(
    body: SkillPermissionBody,
    requestId: String,
    timestamp: String,
    `type`: typingsSlinky.alexaSdk.alexaSdkStrings.LaunchRequest | typingsSlinky.alexaSdk.alexaSdkStrings.IntentRequest | typingsSlinky.alexaSdk.alexaSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted
  ): SkillPermissionRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillPermissionRequest]
  }
  
  @scala.inline
  implicit class SkillPermissionRequestOps[Self <: SkillPermissionRequest] (val x: Self) extends AnyVal {
    
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
    def setBody(value: SkillPermissionBody): Self = this.set("body", value.asInstanceOf[js.Any])
  }
}
