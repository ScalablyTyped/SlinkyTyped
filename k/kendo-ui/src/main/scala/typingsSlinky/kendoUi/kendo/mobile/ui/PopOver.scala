package typingsSlinky.kendoUi.kendo.mobile.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopOver
  extends typingsSlinky.kendoUi.kendo.ui.Widget {
  @JSName("options")
  var options_PopOver: PopOverOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def open(target: JQuery): Unit = js.native
}

