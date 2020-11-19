package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.atom.mod.ContextMenuItemOptions
  - typingsSlinky.atom.anon.Type
*/
trait ContextMenuOptions extends js.Object
object ContextMenuOptions {
  
  @scala.inline
  def ContextMenuItemOptions(): ContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuOptions]
  }
  
  @scala.inline
  def Type(`type`: separator): ContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuOptions]
  }
}
