package typingsSlinky.kendoUi.kendo.mobile.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View
  extends typingsSlinky.kendoUi.kendo.ui.Widget {
  @JSName("options")
  var options_View: ViewOptions = js.native
  var wrapper: JQuery = js.native
  def contentElement(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
}

