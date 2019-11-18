package typingsSlinky.history

import typingsSlinky.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typingsSlinky.history.historyMod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Options extends js.Object {
  def apply[S](): History[S] = js.native
  def apply[S](options: BrowserHistoryBuildOptions): History[S] = js.native
}

