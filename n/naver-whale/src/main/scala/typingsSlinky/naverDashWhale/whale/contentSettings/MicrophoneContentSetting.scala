package typingsSlinky.naverDashWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MicrophoneContentSetting
  extends typingsSlinky.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typingsSlinky.chrome.chrome.contentSettings.MicrophoneSetDetails): Unit = js.native
  def set(
    details: typingsSlinky.chrome.chrome.contentSettings.MicrophoneSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

