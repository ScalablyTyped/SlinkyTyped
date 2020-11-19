package typingsSlinky.luminoWidgets.menuMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLUListElement
import typingsSlinky.luminoCommands.mod.CommandRegistry
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoWidgets.luminoWidgetsStrings.next
import typingsSlinky.luminoWidgets.luminoWidgetsStrings.previous
import typingsSlinky.luminoWidgets.menuMod.Menu.IItem
import typingsSlinky.luminoWidgets.menuMod.Menu.IItemOptions
import typingsSlinky.luminoWidgets.menuMod.Menu.IOpenOptions
import typingsSlinky.luminoWidgets.menuMod.Menu.IOptions
import typingsSlinky.luminoWidgets.menuMod.Menu.IRenderer
import typingsSlinky.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets/types/menu", "Menu")
@js.native
class Menu_ protected () extends Widget {
  /**
    * Construct a new menu.
    *
    * @param options - The options for initializing the menu.
    */
  def this(options: IOptions) = this()
  
  var _aboutToClose: js.Any = js.native
  
  var _activeIndex: js.Any = js.native
  
  /**
    * Cancel the close timer, if the timer is pending.
    */
  var _cancelCloseTimer: js.Any = js.native
  
  /**
    * Cancel the open timer, if the timer is pending.
    */
  var _cancelOpenTimer: js.Any = js.native
  
  var _childIndex: js.Any = js.native
  
  var _childMenu: js.Any = js.native
  
  /**
    * Close the child menu immediately.
    *
    * This is a no-op if a child menu is not open.
    */
  var _closeChildMenu: js.Any = js.native
  
  var _closeTimerID: js.Any = js.native
  
  /**
    * Handle the `'keydown'` event for the menu.
    *
    * #### Notes
    * This listener is attached to the menu node.
    */
  var _evtKeyDown: js.Any = js.native
  
  /**
    * Handle the `'mousedown'` event for the menu.
    *
    * #### Notes
    * This listener is attached to the document node.
    */
  var _evtMouseDown: js.Any = js.native
  
  /**
    * Handle the `'mouseenter'` event for the menu.
    *
    * #### Notes
    * This listener is attached to the menu node.
    */
  var _evtMouseEnter: js.Any = js.native
  
  /**
    * Handle the `'mouseleave'` event for the menu.
    *
    * #### Notes
    * This listener is attached to the menu node.
    */
  var _evtMouseLeave: js.Any = js.native
  
  /**
    * Handle the `'mousemove'` event for the menu.
    *
    * #### Notes
    * This listener is attached to the menu node.
    */
  var _evtMouseMove: js.Any = js.native
  
  /**
    * Handle the `'mouseup'` event for the menu.
    *
    * #### Notes
    * This listener is attached to the menu node.
    */
  var _evtMouseUp: js.Any = js.native
  
  var _items: js.Any = js.native
  
  var _menuRequested: js.Any = js.native
  
  /**
    * Open the child menu at the active index immediately.
    *
    * If a different child menu is already open, it will be closed,
    * even if the active item is not a valid submenu.
    */
  var _openChildMenu: js.Any = js.native
  
  var _openTimerID: js.Any = js.native
  
  var _parentMenu: js.Any = js.native
  
  /**
    * Start the close timer, unless it is already pending.
    */
  var _startCloseTimer: js.Any = js.native
  
  /**
    * Start the open timer, unless it is already pending.
    */
  var _startOpenTimer: js.Any = js.native
  
  /**
    * A signal emitted just before the menu is closed.
    *
    * #### Notes
    * This signal is emitted when the menu receives a `'close-request'`
    * message, just before it removes itself from the DOM.
    *
    * This signal is not emitted if the menu is already detached from
    * the DOM when it receives the `'close-request'` message.
    */
  val aboutToClose: ISignal[this.type, Unit] = js.native
  
  /**
    * Activate the next selectable item in the menu.
    *
    * #### Notes
    * If no item is selectable, the index will be set to `-1`.
    */
  def activateNextItem(): Unit = js.native
  
  /**
    * Activate the previous selectable item in the menu.
    *
    * #### Notes
    * If no item is selectable, the index will be set to `-1`.
    */
  def activatePreviousItem(): Unit = js.native
  
  /**
    * Get the index of the currently active menu item.
    *
    * #### Notes
    * This will be `-1` if no menu item is active.
    */
  /**
    * Set the index of the currently active menu item.
    *
    * #### Notes
    * If the item cannot be activated, the index will be set to `-1`.
    */
  var activeIndex: Double = js.native
  
  /**
    * Get the currently active menu item.
    */
  /**
    * Set the currently active menu item.
    *
    * #### Notes
    * If the item cannot be activated, the item will be set to `null`.
    */
  var activeItem: IItem | Null = js.native
  
  /**
    * Add a menu item to the end of the menu.
    *
    * @param options - The options for creating the menu item.
    *
    * @returns The menu item added to the menu.
    */
  def addItem(options: IItemOptions): IItem = js.native
  
  /**
    * The child menu of the menu.
    *
    * #### Notes
    * This is `null` unless the menu has an open submenu.
    */
  val childMenu: Menu | Null = js.native
  
  /**
    * Remove all menu items from the menu.
    */
  def clearItems(): Unit = js.native
  
  /**
    * The command registry used by the menu.
    */
  val commands: CommandRegistry = js.native
  
  /**
    * The menu content node.
    *
    * #### Notes
    * This is the node which holds the menu item nodes.
    *
    * Modifying this node directly can lead to undefined behavior.
    */
  val contentNode: HTMLUListElement = js.native
  
  /**
    * Handle the DOM events for the menu.
    *
    * @param event - The DOM event sent to the menu.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the menu's DOM nodes. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  
  /**
    * Insert a menu item into the menu at the specified index.
    *
    * @param index - The index at which to insert the item.
    *
    * @param options - The options for creating the menu item.
    *
    * @returns The menu item added to the menu.
    *
    * #### Notes
    * The index will be clamped to the bounds of the items.
    */
  def insertItem(index: Double, options: IItemOptions): IItem = js.native
  
  /**
    * A read-only array of the menu items in the menu.
    */
  val items: js.Array[IItem] = js.native
  
  /**
    * The leaf menu of the menu hierarchy.
    */
  val leafMenu: Menu = js.native
  
  /**
    * A signal emitted when a new menu is requested by the user.
    *
    * #### Notes
    * This signal is emitted whenever the user presses the right or left
    * arrow keys, and a submenu cannot be opened or closed in response.
    *
    * This signal is useful when implementing menu bars in order to open
    * the next or previous menu in response to a user key press.
    *
    * This signal is only emitted for the root menu in a hierarchy.
    */
  val menuRequested: ISignal[this.type, next | previous] = js.native
  
  /**
    * Open the menu at the specified location.
    *
    * @param x - The client X coordinate of the menu location.
    *
    * @param y - The client Y coordinate of the menu location.
    *
    * @param options - The additional options for opening the menu.
    *
    * #### Notes
    * The menu will be opened at the given location unless it will not
    * fully fit on the screen. If it will not fit, it will be adjusted
    * to fit naturally on the screen.
    *
    * This is a no-op if the menu is already attached to the DOM.
    */
  def open(x: Double, y: Double): Unit = js.native
  def open(x: Double, y: Double, options: IOpenOptions): Unit = js.native
  
  /**
    * The parent menu of the menu.
    *
    * #### Notes
    * This is `null` unless the menu is an open submenu.
    */
  val parentMenu: Menu | Null = js.native
  
  /**
    * Remove an item from the menu.
    *
    * @param item - The item to remove from the menu.
    *
    * #### Notes
    * This is a no-op if the item is not in the menu.
    */
  def removeItem(item: IItem): Unit = js.native
  
  /**
    * Remove the item at a given index from the menu.
    *
    * @param index - The index of the item to remove.
    *
    * #### Notes
    * This is a no-op if the index is out of range.
    */
  def removeItemAt(index: Double): Unit = js.native
  
  /**
    * The renderer used by the menu.
    */
  val renderer: IRenderer = js.native
  
  /**
    * The root menu of the menu hierarchy.
    */
  val rootMenu: Menu = js.native
  
  /**
    * Trigger the active menu item.
    *
    * #### Notes
    * If the active item is a submenu, it will be opened and the first
    * item will be activated.
    *
    * If the active item is a command, the command will be executed.
    *
    * If the menu is not attached, this is a no-op.
    *
    * If there is no active item, this is a no-op.
    */
  def triggerActiveItem(): Unit = js.native
}
