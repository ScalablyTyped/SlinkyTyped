package typingsSlinky.kendoDashUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoDashUi.JQuery
import typingsSlinky.kendoDashUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ContextMenu")
@js.native
class ContextMenu protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ContextMenuOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_ContextMenu: ContextMenuOptions = js.native
  var wrapper: JQuery = js.native
  def append(item: js.Any): ContextMenu = js.native
  def append(item: js.Any, referenceItem: String): ContextMenu = js.native
  def append(item: js.Any, referenceItem: JQuery): ContextMenu = js.native
  def close(element: JQuery): ContextMenu = js.native
  def close(element: typingsSlinky.std.Element): ContextMenu = js.native
  def enable(element: String, enable: Boolean): ContextMenu = js.native
  def enable(element: JQuery, enable: Boolean): ContextMenu = js.native
  def enable(element: typingsSlinky.std.Element, enable: Boolean): ContextMenu = js.native
  def findByUid(uid: String): JQuery = js.native
  def insertAfter(item: js.Any, referenceItem: String): ContextMenu = js.native
  def insertAfter(item: js.Any, referenceItem: JQuery): ContextMenu = js.native
  def insertAfter(item: js.Any, referenceItem: typingsSlinky.std.Element): ContextMenu = js.native
  def insertBefore(item: js.Any, referenceItem: String): ContextMenu = js.native
  def insertBefore(item: js.Any, referenceItem: JQuery): ContextMenu = js.native
  def insertBefore(item: js.Any, referenceItem: typingsSlinky.std.Element): ContextMenu = js.native
  def open(x: Double): ContextMenu = js.native
  def open(x: Double, y: Double): ContextMenu = js.native
  def open(x: JQuery): ContextMenu = js.native
  def open(x: JQuery, y: Double): ContextMenu = js.native
  def open(x: typingsSlinky.std.Element): ContextMenu = js.native
  def open(x: typingsSlinky.std.Element, y: Double): ContextMenu = js.native
  def remove(element: String): ContextMenu = js.native
  def remove(element: JQuery): ContextMenu = js.native
  def remove(element: typingsSlinky.std.Element): ContextMenu = js.native
}

/* static members */
@JSGlobal("kendo.ui.ContextMenu")
@js.native
object ContextMenu extends js.Object {
  var fn: ContextMenu = js.native
  def extend(proto: js.Object): ContextMenu = js.native
}

