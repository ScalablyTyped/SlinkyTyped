package typingsSlinky.qhistory.mod

import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qhistory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(
    history: History[LocationState],
    stringify: js.Function1[/* query */ js.Object, String],
    parse: js.Function1[/* search */ String, js.Object]
  ): History[LocationState] = js.native
}

