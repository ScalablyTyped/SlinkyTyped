package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.atom.mod.ContextMenuItemOptions
  - typingsSlinky.atom.AnonType
*/
trait ContextMenuOptions extends js.Object

object ContextMenuOptions {
  @scala.inline
  def ContextMenuItemOptions(): ContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuOptions]
  }
  @scala.inline
  def AnonType(`type`: separator): ContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuOptions]
  }
}

