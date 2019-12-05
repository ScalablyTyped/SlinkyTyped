package typingsSlinky.kendoDashUi.kendo.ui

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLCollection
import typingsSlinky.kendoDashUi.JQuery
import typingsSlinky.kendoDashUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.TabStrip")
@js.native
class TabStrip protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: TabStripOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_TabStrip: TabStripOptions = js.native
  var tabGroup: JQuery = js.native
  var wrapper: JQuery = js.native
  def activateTab(item: JQuery): Unit = js.native
  def append(tab: js.Any): TabStrip = js.native
  def contentElement(itemIndex: Double): Element = js.native
  def contentHolder(itemIndex: Double): Element = js.native
  def deactivateTab(item: JQuery): Unit = js.native
  def disable(element: String): TabStrip = js.native
  def disable(element: JQuery): TabStrip = js.native
  def disable(element: typingsSlinky.std.Element): TabStrip = js.native
  def enable(element: String): TabStrip = js.native
  def enable(element: String, enable: Boolean): TabStrip = js.native
  def enable(element: JQuery): TabStrip = js.native
  def enable(element: JQuery, enable: Boolean): TabStrip = js.native
  def enable(element: typingsSlinky.std.Element): TabStrip = js.native
  def enable(element: typingsSlinky.std.Element, enable: Boolean): TabStrip = js.native
  def insertAfter(item: String, referenceTab: String): TabStrip = js.native
  def insertAfter(item: String, referenceTab: JQuery): TabStrip = js.native
  def insertAfter(item: String, referenceTab: typingsSlinky.std.Element): TabStrip = js.native
  def insertAfter(item: js.Any, referenceTab: String): TabStrip = js.native
  def insertAfter(item: js.Any, referenceTab: JQuery): TabStrip = js.native
  def insertAfter(item: js.Any, referenceTab: typingsSlinky.std.Element): TabStrip = js.native
  def insertAfter(item: JQuery, referenceTab: String): TabStrip = js.native
  def insertAfter(item: JQuery, referenceTab: JQuery): TabStrip = js.native
  def insertAfter(item: JQuery, referenceTab: typingsSlinky.std.Element): TabStrip = js.native
  def insertAfter(item: typingsSlinky.std.Element, referenceTab: String): TabStrip = js.native
  def insertAfter(item: typingsSlinky.std.Element, referenceTab: JQuery): TabStrip = js.native
  def insertAfter(item: typingsSlinky.std.Element, referenceTab: typingsSlinky.std.Element): TabStrip = js.native
  def insertBefore(item: String, referenceTab: String): TabStrip = js.native
  def insertBefore(item: String, referenceTab: JQuery): TabStrip = js.native
  def insertBefore(item: String, referenceTab: typingsSlinky.std.Element): TabStrip = js.native
  def insertBefore(item: js.Any, referenceTab: String): TabStrip = js.native
  def insertBefore(item: js.Any, referenceTab: JQuery): TabStrip = js.native
  def insertBefore(item: js.Any, referenceTab: typingsSlinky.std.Element): TabStrip = js.native
  def insertBefore(item: JQuery, referenceTab: String): TabStrip = js.native
  def insertBefore(item: JQuery, referenceTab: JQuery): TabStrip = js.native
  def insertBefore(item: JQuery, referenceTab: typingsSlinky.std.Element): TabStrip = js.native
  def insertBefore(item: typingsSlinky.std.Element, referenceTab: String): TabStrip = js.native
  def insertBefore(item: typingsSlinky.std.Element, referenceTab: JQuery): TabStrip = js.native
  def insertBefore(item: typingsSlinky.std.Element, referenceTab: typingsSlinky.std.Element): TabStrip = js.native
  def items(): HTMLCollection = js.native
  def reload(element: String): TabStrip = js.native
  def reload(element: JQuery): TabStrip = js.native
  def reload(element: typingsSlinky.std.Element): TabStrip = js.native
  def remove(element: String): TabStrip = js.native
  def remove(element: Double): TabStrip = js.native
  def remove(element: JQuery): TabStrip = js.native
  def select(): JQuery = js.native
  def select(element: String): Unit = js.native
  def select(element: Double): Unit = js.native
  def select(element: JQuery): Unit = js.native
  def select(element: typingsSlinky.std.Element): Unit = js.native
  def setDataSource(dataSource: js.Any): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.TabStrip")
@js.native
object TabStrip extends js.Object {
  var fn: TabStrip = js.native
  def extend(proto: js.Object): TabStrip = js.native
}

