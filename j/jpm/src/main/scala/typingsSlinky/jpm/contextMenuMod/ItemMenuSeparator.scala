package typingsSlinky.jpm.contextMenuMod

import org.scalajs.dom.experimental.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jpm.contextMenuMod.Item
  - typingsSlinky.jpm.contextMenuMod.Menu
  - typingsSlinky.jpm.contextMenuMod.Separator
*/
trait ItemMenuSeparator extends js.Object
object ItemMenuSeparator {
  
  @scala.inline
  def Item(context: ItemContext, data: js.Any, destroy: () => Unit, image: String | URL, label: String): ItemMenuSeparator = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), image = image.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMenuSeparator]
  }
  
  @scala.inline
  def Menu(
    addItem: ItemMenuSeparator => Unit,
    contentScript: String | js.Array[String],
    contentScriptFile: String | js.Array[String],
    context: ItemContext,
    destroy: () => Unit,
    image: String | URL,
    items: js.Array[ItemMenuSeparator],
    label: String,
    removeItem: ItemMenuSeparator => Unit
  ): ItemMenuSeparator = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1(addItem), contentScript = contentScript.asInstanceOf[js.Any], contentScriptFile = contentScriptFile.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), image = image.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem))
    __obj.asInstanceOf[ItemMenuSeparator]
  }
  
  @scala.inline
  def Separator(destroy: () => Unit, parentMenu: Menu): ItemMenuSeparator = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), parentMenu = parentMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMenuSeparator]
  }
}
