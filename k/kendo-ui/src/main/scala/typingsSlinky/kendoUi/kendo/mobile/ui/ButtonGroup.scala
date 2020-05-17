package typingsSlinky.kendoUi.kendo.mobile.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonGroup
  extends typingsSlinky.kendoUi.kendo.ui.Widget {
  @JSName("options")
  var options_ButtonGroup: ButtonGroupOptions = js.native
  var wrapper: JQuery = js.native
  def badge(button: String, value: String): String = js.native
  def badge(button: String, value: Boolean): String = js.native
  def badge(button: Double, value: String): String = js.native
  def badge(button: Double, value: Boolean): String = js.native
  def current(): JQuery = js.native
  def enable(enable: Boolean): Unit = js.native
  def select(li: Double): Unit = js.native
  def select(li: JQuery): Unit = js.native
}

