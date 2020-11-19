package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draggable extends Widget {
  
  def cancelHold(): Unit = js.native
  
  var currentTarget: JQuery = js.native
  
  @JSName("options")
  var options_Draggable: DraggableOptions = js.native
}
