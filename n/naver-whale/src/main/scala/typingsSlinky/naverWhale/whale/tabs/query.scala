package typingsSlinky.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.query")
@js.native
object query extends js.Object {
  def apply(
    queryInfo: typingsSlinky.chrome.chrome.tabs.QueryInfo,
    callback: js.Function1[/* result */ js.Array[typingsSlinky.chrome.chrome.tabs.Tab], Unit]
  ): Unit = js.native
}

