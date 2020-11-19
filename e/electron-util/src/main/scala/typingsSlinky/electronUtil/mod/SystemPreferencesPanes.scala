package typingsSlinky.electronUtil.mod

import typingsSlinky.electronUtil.electronUtilStrings.Advanced
import typingsSlinky.electronUtil.electronUtilStrings.Captioning
import typingsSlinky.electronUtil.electronUtilStrings.Dictation
import typingsSlinky.electronUtil.electronUtilStrings.FDE
import typingsSlinky.electronUtil.electronUtilStrings.Firewall
import typingsSlinky.electronUtil.electronUtilStrings.General
import typingsSlinky.electronUtil.electronUtilStrings.Hearing
import typingsSlinky.electronUtil.electronUtilStrings.Internet
import typingsSlinky.electronUtil.electronUtilStrings.Keyboard
import typingsSlinky.electronUtil.electronUtilStrings.Media_Descriptions
import typingsSlinky.electronUtil.electronUtilStrings.Mouse
import typingsSlinky.electronUtil.electronUtilStrings.Privacy
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Accessibility
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Advertising
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_AllFiles
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Assistive
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Automation
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Calendars
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Camera
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Contacts
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_DesktopFolder
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Diagnostics
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_DocumentsFolder
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_DownloadsFolder
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_LocationServices
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Microphone
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Photos
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Reminders
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_ScreenCapture
import typingsSlinky.electronUtil.electronUtilStrings.Seeing_Display
import typingsSlinky.electronUtil.electronUtilStrings.Seeing_VoiceOver
import typingsSlinky.electronUtil.electronUtilStrings.Seeing_Zoom
import typingsSlinky.electronUtil.electronUtilStrings.Services_ARDService
import typingsSlinky.electronUtil.electronUtilStrings.Services_BluetoothSharing
import typingsSlinky.electronUtil.electronUtilStrings.Services_PersonalFileSharing
import typingsSlinky.electronUtil.electronUtilStrings.Services_PrinterSharing
import typingsSlinky.electronUtil.electronUtilStrings.Services_RemoteAppleEvent
import typingsSlinky.electronUtil.electronUtilStrings.Services_RemoteLogin
import typingsSlinky.electronUtil.electronUtilStrings.Services_ScreenSharing
import typingsSlinky.electronUtil.electronUtilStrings.SpeakableItems
import typingsSlinky.electronUtil.electronUtilStrings.Switch
import typingsSlinky.electronUtil.electronUtilStrings.TTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemPreferencesPanes extends js.Object {
  
  var security: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture = js.native
  
  var sharing: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing = js.native
  
  var speech: Dictation | TTS = js.native
  
  var universalaccess: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch = js.native
}
object SystemPreferencesPanes {
  
  @scala.inline
  def apply(
    security: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture,
    sharing: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing,
    speech: Dictation | TTS,
    universalaccess: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
  ): SystemPreferencesPanes = {
    val __obj = js.Dynamic.literal(security = security.asInstanceOf[js.Any], sharing = sharing.asInstanceOf[js.Any], speech = speech.asInstanceOf[js.Any], universalaccess = universalaccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemPreferencesPanes]
  }
  
  @scala.inline
  implicit class SystemPreferencesPanesOps[Self <: SystemPreferencesPanes] (val x: Self) extends AnyVal {
    
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
    def setSecurity(
      value: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
    ): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharing(
      value: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
    ): Self = this.set("sharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeech(value: Dictation | TTS): Self = this.set("speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniversalaccess(
      value: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
    ): Self = this.set("universalaccess", value.asInstanceOf[js.Any])
  }
}
