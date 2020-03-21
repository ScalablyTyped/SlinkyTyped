package typingsSlinky.kendoUi.kendo

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.Typeofui
import typingsSlinky.kendoUi.TypeofuiActionSheet
import typingsSlinky.kendoUi.TypeofuiArcGauge
import typingsSlinky.kendoUi.kendo.ui.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.widgetInstance")
@js.native
object widgetInstance extends js.Object {
  def apply(element: JQuery): Widget = js.native
  def apply(element: JQuery, suite: Typeofui): Widget = js.native
  def apply(element: JQuery, suite: TypeofuiActionSheet): Widget = js.native
  def apply(element: JQuery, suite: TypeofuiArcGauge): Widget = js.native
}

