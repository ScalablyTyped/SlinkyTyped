package typingsSlinky.atMaterialDashUiCore.tabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsActions extends js.Object {
  def updateIndicator(): Unit
}

object TabsActions {
  @scala.inline
  def apply(updateIndicator: () => Unit): TabsActions = {
    val __obj = js.Dynamic.literal(updateIndicator = js.Any.fromFunction0(updateIndicator))
  
    __obj.asInstanceOf[TabsActions]
  }
}

