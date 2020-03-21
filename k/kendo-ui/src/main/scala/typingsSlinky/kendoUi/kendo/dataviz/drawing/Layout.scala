package typingsSlinky.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Layout")
@js.native
class Layout protected ()
  extends typingsSlinky.kendoUi.kendo.drawing.Group {
  def this(rect: typingsSlinky.kendoUi.kendo.geometry.Rect) = this()
  def this(rect: typingsSlinky.kendoUi.kendo.geometry.Rect, options: LayoutOptions) = this()
  @JSName("options")
  var options_Layout: LayoutOptions = js.native
  def rect(): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  def rect(rect: typingsSlinky.kendoUi.kendo.geometry.Rect): Unit = js.native
  def reflow(): Unit = js.native
}

