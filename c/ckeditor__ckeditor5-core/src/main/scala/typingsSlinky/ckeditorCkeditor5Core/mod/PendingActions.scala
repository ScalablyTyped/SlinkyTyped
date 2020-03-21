package typingsSlinky.ckeditorCkeditor5Core.mod

import typingsSlinky.ckeditorCkeditor5Core.Observablemessagestring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "PendingActions")
@js.native
class PendingActions () extends Plugin[Unit] {
  var first: Null | Observablemessagestring = js.native
  val hasAny: Boolean = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[Observablemessagestring]] = js.native
  def add(message: String): Observablemessagestring = js.native
  def remove(action: Observablemessagestring): Unit = js.native
}

/* static members */
@JSImport("@ckeditor/ckeditor5-core", "PendingActions")
@js.native
object PendingActions extends js.Object {
  val pluginName: typingsSlinky.ckeditorCkeditor5Core.ckeditorCkeditor5CoreStrings.PendingActions = js.native
}

