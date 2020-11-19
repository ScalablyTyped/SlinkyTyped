package typingsSlinky.jqueryui.anon

import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.jqueryui.JQuery
import typingsSlinky.jqueryui.JQueryUI.MenuOptions
import typingsSlinky.jqueryui.jqueryuiStrings.blur
import typingsSlinky.jqueryui.jqueryuiStrings.collapse
import typingsSlinky.jqueryui.jqueryuiStrings.collapseAll
import typingsSlinky.jqueryui.jqueryuiStrings.destroy
import typingsSlinky.jqueryui.jqueryuiStrings.disable
import typingsSlinky.jqueryui.jqueryuiStrings.enable
import typingsSlinky.jqueryui.jqueryuiStrings.focus
import typingsSlinky.jqueryui.jqueryuiStrings.isFirstItem
import typingsSlinky.jqueryui.jqueryuiStrings.isLastItem
import typingsSlinky.jqueryui.jqueryuiStrings.next
import typingsSlinky.jqueryui.jqueryuiStrings.nextPage
import typingsSlinky.jqueryui.jqueryuiStrings.previous
import typingsSlinky.jqueryui.jqueryuiStrings.previousPage
import typingsSlinky.jqueryui.jqueryuiStrings.refresh
import typingsSlinky.jqueryui.jqueryuiStrings.select
import typingsSlinky.jqueryui.jqueryuiStrings.widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(): JQuery = js.native
  def apply(methodName: String): JQuery = js.native
  def apply(methodName: String, event: JQueryEventObject, item: JQuery): Unit = js.native
  def apply(methodName: blur): Unit = js.native
  def apply(methodName: collapse): Unit = js.native
  def apply(methodName: collapseAll): Unit = js.native
  def apply(methodName: collapseAll, event: js.UndefOr[scala.Nothing], all: Boolean): Unit = js.native
  def apply(methodName: collapseAll, event: JQueryEventObject): Unit = js.native
  def apply(methodName: collapseAll, event: JQueryEventObject, all: Boolean): Unit = js.native
  def apply(methodName: collapse, event: JQueryEventObject): Unit = js.native
  def apply(methodName: destroy): Unit = js.native
  def apply(methodName: disable): Unit = js.native
  def apply(methodName: enable): Unit = js.native
  def apply(methodName: focus, event: JQueryEventObject, item: JQuery): Unit = js.native
  def apply(methodName: isFirstItem): Boolean = js.native
  def apply(methodName: isLastItem): Boolean = js.native
  def apply(methodName: next): Unit = js.native
  def apply(methodName: nextPage): Unit = js.native
  def apply(methodName: nextPage, event: JQueryEventObject): Unit = js.native
  def apply(methodName: next, event: JQueryEventObject): Unit = js.native
  def apply(methodName: previous): Unit = js.native
  def apply(methodName: previousPage): Unit = js.native
  def apply(methodName: previousPage, event: JQueryEventObject): Unit = js.native
  def apply(methodName: previous, event: JQueryEventObject): Unit = js.native
  def apply(methodName: refresh): Unit = js.native
  def apply(methodName: select): Unit = js.native
  def apply(methodName: select, event: JQueryEventObject): Unit = js.native
  def apply(methodName: widget): JQuery = js.native
  def apply(optionLiteral: String, optionName: String): js.Any = js.native
  def apply(optionLiteral: String, optionName: String, optionValue: js.Any): JQuery = js.native
  def apply(optionLiteral: String, options: MenuOptions): js.Any = js.native
  def apply(options: MenuOptions): JQuery = js.native
  
  var active: Boolean = js.native
}
