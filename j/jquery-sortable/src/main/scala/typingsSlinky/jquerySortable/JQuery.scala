package typingsSlinky.jquerySortable

import typingsSlinky.jquerySortable.JQuerySortable.Options
import typingsSlinky.jquerySortable.jquerySortableStrings.destroy
import typingsSlinky.jquerySortable.jquerySortableStrings.disable
import typingsSlinky.jquerySortable.jquerySortableStrings.enable
import typingsSlinky.jquerySortable.jquerySortableStrings.refresh
import typingsSlinky.jquerySortable.jquerySortableStrings.serialize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def sortable(): JQuery = js.native
  def sortable(methodName: String): JQuery = js.native
  def sortable(options: Options): JQuery = js.native
  @JSName("sortable")
  def sortable_destroy(methodName: destroy): JQuery = js.native
  @JSName("sortable")
  def sortable_disable(methodName: disable): JQuery = js.native
  @JSName("sortable")
  def sortable_enable(methodName: enable): JQuery = js.native
  @JSName("sortable")
  def sortable_refresh(methodName: refresh): JQuery = js.native
  @JSName("sortable")
  def sortable_serialize(methodName: serialize): JQuery = js.native
}

