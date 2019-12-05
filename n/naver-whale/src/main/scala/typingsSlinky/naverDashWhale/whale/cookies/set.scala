package typingsSlinky.naverDashWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cookies.set")
@js.native
object set extends js.Object {
  def apply(details: typingsSlinky.chrome.chrome.cookies.SetDetails): Unit = js.native
  def apply(
    details: typingsSlinky.chrome.chrome.cookies.SetDetails,
    callback: js.Function1[/* cookie */ typingsSlinky.chrome.chrome.cookies.Cookie | Null, Unit]
  ): Unit = js.native
}

