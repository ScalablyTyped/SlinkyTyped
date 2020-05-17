package typingsSlinky.kendoUi.global.kendo

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.anon.Typeofui
import typingsSlinky.kendoUi.anon.TypeofuiActionSheet
import typingsSlinky.kendoUi.anon.TypeofuiArcGauge
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

