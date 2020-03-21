package typingsSlinky.naverWhale.whale.tabs

import typingsSlinky.chrome.chrome.windows.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.highlight")
@js.native
object highlight extends js.Object {
  def apply(highlightInfo: typingsSlinky.chrome.chrome.tabs.HighlightInfo): Unit = js.native
  def apply(
    highlightInfo: typingsSlinky.chrome.chrome.tabs.HighlightInfo,
    callback: js.Function1[/* window */ Window, Unit]
  ): Unit = js.native
}

