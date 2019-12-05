package typingsSlinky.naverDashWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.update")
@js.native
object update extends js.Object {
  def apply(tabId: Double, updateProperties: typingsSlinky.chrome.chrome.tabs.UpdateProperties): Unit = js.native
  def apply(
    tabId: Double,
    updateProperties: typingsSlinky.chrome.chrome.tabs.UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[typingsSlinky.chrome.chrome.tabs.Tab], Unit]
  ): Unit = js.native
  def apply(updateProperties: typingsSlinky.chrome.chrome.tabs.UpdateProperties): Unit = js.native
  def apply(
    updateProperties: typingsSlinky.chrome.chrome.tabs.UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[typingsSlinky.chrome.chrome.tabs.Tab], Unit]
  ): Unit = js.native
}

