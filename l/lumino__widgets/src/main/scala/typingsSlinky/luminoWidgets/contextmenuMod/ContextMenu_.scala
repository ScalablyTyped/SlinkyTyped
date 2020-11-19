package typingsSlinky.luminoWidgets.contextmenuMod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoWidgets.contextmenuMod.ContextMenu.IItemOptions
import typingsSlinky.luminoWidgets.contextmenuMod.ContextMenu.IOptions
import typingsSlinky.luminoWidgets.menuMod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets/types/contextmenu", "ContextMenu")
@js.native
class ContextMenu_ protected () extends js.Object {
  /**
    * Construct a new context menu.
    *
    * @param options - The options for initializing the menu.
    */
  def this(options: IOptions) = this()
  
  var _idTick: js.Any = js.native
  
  var _items: js.Any = js.native
  
  /**
    * Add an item to the context menu.
    *
    * @param options - The options for creating the item.
    *
    * @returns A disposable which will remove the item from the menu.
    */
  def addItem(options: IItemOptions): IDisposable = js.native
  
  /**
    * The menu widget which displays the matched context items.
    */
  val menu: Menu = js.native
  
  /**
    * Open the context menu in response to a `'contextmenu'` event.
    *
    * @param event - The `'contextmenu'` event of interest.
    *
    * @returns `true` if the menu was opened, or `false` if no items
    *   matched the event and the menu was not opened.
    *
    * #### Notes
    * This method will populate the context menu with items which match
    * the propagation path of the event, then open the menu at the mouse
    * position indicated by the event.
    */
  def open(event: MouseEvent): Boolean = js.native
}
