package typingsSlinky.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.move")
@js.native
object move extends js.Object {
  def apply(tabId: Double, moveProperties: typingsSlinky.chrome.chrome.tabs.MoveProperties): Unit = js.native
  def apply(
    tabId: Double,
    moveProperties: typingsSlinky.chrome.chrome.tabs.MoveProperties,
    callback: js.Function1[/* tab */ typingsSlinky.chrome.chrome.tabs.Tab, Unit]
  ): Unit = js.native
  def apply(tabIds: js.Array[Double], moveProperties: typingsSlinky.chrome.chrome.tabs.MoveProperties): Unit = js.native
  def apply(
    tabIds: js.Array[Double],
    moveProperties: typingsSlinky.chrome.chrome.tabs.MoveProperties,
    callback: js.Function1[/* tabs */ js.Array[typingsSlinky.chrome.chrome.tabs.Tab], Unit]
  ): Unit = js.native
}

