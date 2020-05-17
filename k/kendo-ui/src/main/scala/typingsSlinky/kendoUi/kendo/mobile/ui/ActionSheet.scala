package typingsSlinky.kendoUi.kendo.mobile.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionSheet
  extends typingsSlinky.kendoUi.kendo.ui.Widget {
  @JSName("options")
  var options_ActionSheet: ActionSheetOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def open(target: JQuery, context: js.Any): Unit = js.native
}

