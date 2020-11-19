package typingsSlinky.luminoWidgets.commandpaletteMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLUListElement
import typingsSlinky.luminoCommands.mod.CommandRegistry
import typingsSlinky.luminoWidgets.commandpaletteMod.CommandPalette.IItem
import typingsSlinky.luminoWidgets.commandpaletteMod.CommandPalette.IItemOptions
import typingsSlinky.luminoWidgets.commandpaletteMod.CommandPalette.IOptions
import typingsSlinky.luminoWidgets.commandpaletteMod.CommandPalette.IRenderer
import typingsSlinky.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets/types/commandpalette", "CommandPalette")
@js.native
class CommandPalette_ protected () extends Widget {
  /**
    * Construct a new command palette.
    *
    * @param options - The options for initializing the palette.
    */
  def this(options: IOptions) = this()
  
  /**
    * Activate the next enabled command item.
    */
  var _activateNextItem: js.Any = js.native
  
  /**
    * Activate the previous enabled command item.
    */
  var _activatePreviousItem: js.Any = js.native
  
  var _activeIndex: js.Any = js.native
  
  /**
    * Handle the `'click'` event for the command palette.
    */
  var _evtClick: js.Any = js.native
  
  /**
    * Handle the `'keydown'` event for the command palette.
    */
  var _evtKeyDown: js.Any = js.native
  
  /**
    * Execute the command item at the given index, if possible.
    */
  var _execute: js.Any = js.native
  
  var _items: js.Any = js.native
  
  /**
    * A signal handler for generic command changes.
    */
  var _onGenericChange: js.Any = js.native
  
  var _results: js.Any = js.native
  
  /**
    * Toggle the focused modifier based on the input node focus state.
    */
  var _toggleFocused: js.Any = js.native
  
  /**
    * Add a command item to the command palette.
    *
    * @param options - The options for creating the command item.
    *
    * @returns The command item added to the palette.
    */
  def addItem(options: IItemOptions): IItem = js.native
  
  /**
    * Remove all items from the command palette.
    */
  def clearItems(): Unit = js.native
  
  /**
    * The command registry used by the command palette.
    */
  val commands: CommandRegistry = js.native
  
  /**
    * The command palette content node.
    *
    * #### Notes
    * This is the node which holds the command item nodes.
    *
    * Modifying this node directly can lead to undefined behavior.
    */
  val contentNode: HTMLUListElement = js.native
  
  /**
    * Handle the DOM events for the command palette.
    *
    * @param event - The DOM event sent to the command palette.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the command palette's DOM node.
    * It should not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  
  /**
    * The command palette input node.
    *
    * #### Notes
    * This is the actual input node for the search area.
    */
  val inputNode: HTMLInputElement = js.native
  
  /**
    * A read-only array of the command items in the palette.
    */
  val items: js.Array[IItem] = js.native
  
  /**
    * Clear the search results and schedule an update.
    *
    * #### Notes
    * This should be called whenever the search results of the palette
    * should be updated.
    *
    * This is typically called automatically by the palette as needed,
    * but can be called manually if the input text is programatically
    * changed.
    *
    * The rendered results are updated asynchronously.
    */
  def refresh(): Unit = js.native
  
  /**
    * Remove an item from the command palette.
    *
    * @param item - The item to remove from the palette.
    *
    * #### Notes
    * This is a no-op if the item is not in the palette.
    */
  def removeItem(item: IItem): Unit = js.native
  
  /**
    * Remove the item at a given index from the command palette.
    *
    * @param index - The index of the item to remove.
    *
    * #### Notes
    * This is a no-op if the index is out of range.
    */
  def removeItemAt(index: Double): Unit = js.native
  
  /**
    * The renderer used by the command palette.
    */
  val renderer: IRenderer = js.native
  
  /**
    * The command palette search node.
    *
    * #### Notes
    * This is the node which contains the search-related elements.
    */
  val searchNode: HTMLDivElement = js.native
}
