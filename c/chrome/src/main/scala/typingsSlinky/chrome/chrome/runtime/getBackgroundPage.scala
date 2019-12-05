package typingsSlinky.chrome.chrome.runtime

import typingsSlinky.chrome.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.getBackgroundPage")
@js.native
object getBackgroundPage extends js.Object {
  def apply(callback: js.Function1[/* backgroundPage */ js.UndefOr[Window], Unit]): Unit = js.native
}

