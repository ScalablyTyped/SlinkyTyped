package typingsSlinky.kendoUi.kendo.mobile.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.ActionSheet")
@js.native
class ActionSheet protected ()
  extends typingsSlinky.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ActionSheetOptions) = this()
  @JSName("options")
  var options_ActionSheet: ActionSheetOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def open(target: JQuery, context: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.ActionSheet")
@js.native
object ActionSheet extends js.Object {
  var fn: ActionSheet = js.native
  def extend(proto: js.Object): ActionSheet = js.native
}

