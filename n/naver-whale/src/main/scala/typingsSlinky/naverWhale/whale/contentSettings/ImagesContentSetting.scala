package typingsSlinky.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesContentSetting
  extends typingsSlinky.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typingsSlinky.chrome.chrome.contentSettings.ImagesSetDetails): Unit = js.native
  def set(
    details: typingsSlinky.chrome.chrome.contentSettings.ImagesSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

