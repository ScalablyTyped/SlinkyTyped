package typingsSlinky.bootstrapNotify

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyReturn extends js.Object {
  @JSName("$ele")
  var $ele: JQuery_[HTMLElement] = js.native
  def close(): Unit = js.native
  def update(command: String, update: js.Any): Unit = js.native
}

