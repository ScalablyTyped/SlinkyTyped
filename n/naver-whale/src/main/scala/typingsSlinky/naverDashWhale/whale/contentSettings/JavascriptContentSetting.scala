package typingsSlinky.naverDashWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JavascriptContentSetting
  extends typingsSlinky.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typingsSlinky.chrome.chrome.contentSettings.JavascriptSetDetails): Unit = js.native
  def set(
    details: typingsSlinky.chrome.chrome.contentSettings.JavascriptSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

