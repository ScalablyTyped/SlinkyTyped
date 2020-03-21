package typingsSlinky.naverWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cookies.get")
@js.native
object get extends js.Object {
  def apply(
    details: typingsSlinky.chrome.chrome.cookies.Details,
    callback: js.Function1[/* cookie */ typingsSlinky.chrome.chrome.cookies.Cookie | Null, Unit]
  ): Unit = js.native
}

