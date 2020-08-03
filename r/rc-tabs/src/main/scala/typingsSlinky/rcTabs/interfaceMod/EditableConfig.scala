package typingsSlinky.rcTabs.interfaceMod

import slinky.core.facade.ReactElement
import typingsSlinky.rcTabs.anon.Event
import typingsSlinky.rcTabs.rcTabsStrings.add
import typingsSlinky.rcTabs.rcTabsStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditableConfig extends js.Object {
  var addIcon: js.UndefOr[ReactElement] = js.native
  var removeIcon: js.UndefOr[ReactElement] = js.native
  var showAdd: js.UndefOr[Boolean] = js.native
  @JSName("onEdit")
  def onEdit_add(`type`: add, info: Event): Unit = js.native
  @JSName("onEdit")
  def onEdit_remove(`type`: remove, info: Event): Unit = js.native
}

