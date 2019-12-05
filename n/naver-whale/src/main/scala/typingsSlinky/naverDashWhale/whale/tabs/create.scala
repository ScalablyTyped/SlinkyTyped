package typingsSlinky.naverDashWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.create")
@js.native
object create extends js.Object {
  def apply(createProperties: typingsSlinky.chrome.chrome.tabs.CreateProperties): Unit = js.native
  def apply(
    createProperties: typingsSlinky.chrome.chrome.tabs.CreateProperties,
    callback: js.Function1[/* tab */ typingsSlinky.chrome.chrome.tabs.Tab, Unit]
  ): Unit = js.native
}

