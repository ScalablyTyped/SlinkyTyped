package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draggable extends Widget {
  var currentTarget: JQuery = js.native
  @JSName("options")
  var options_Draggable: DraggableOptions = js.native
  def cancelHold(): Unit = js.native
}

