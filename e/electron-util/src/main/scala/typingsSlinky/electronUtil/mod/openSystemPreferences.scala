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
import typingsSlinky.electronUtil.electronUtilStrings.security
import typingsSlinky.electronUtil.electronUtilStrings.sharing
import typingsSlinky.electronUtil.electronUtilStrings.speech
import typingsSlinky.electronUtil.electronUtilStrings.universalaccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-util", "openSystemPreferences")
@js.native
object openSystemPreferences extends js.Object {
  def apply(): js.Promise[Unit] = js.native
  def apply(
    pane: js.UndefOr[scala.Nothing],
    section: Advanced | Captioning | Dictation | FDE | Firewall | General | Hearing | Internet | Keyboard | Media_Descriptions | Mouse | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing | SpeakableItems | Switch | TTS
  ): js.Promise[Unit] = js.native
  def apply(
    pane: security,
    section: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
  ): js.Promise[Unit] = js.native
  def apply(
    pane: sharing,
    section: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
  ): js.Promise[Unit] = js.native
  def apply(pane: speech, section: Dictation | TTS): js.Promise[Unit] = js.native
  def apply(
    pane: universalaccess,
    section: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
  ): js.Promise[Unit] = js.native
}

