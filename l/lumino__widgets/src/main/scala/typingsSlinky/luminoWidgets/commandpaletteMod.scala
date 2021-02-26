package typingsSlinky.luminoWidgets

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLUListElement
import typingsSlinky.luminoCommands.mod.CommandRegistry
import typingsSlinky.luminoCommands.mod.CommandRegistry.Dataset
import typingsSlinky.luminoCommands.mod.CommandRegistry.IKeyBinding
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyJSONObject
import typingsSlinky.luminoVirtualdom.mod.ElementDataset
import typingsSlinky.luminoVirtualdom.mod.VirtualElement
import typingsSlinky.luminoVirtualdom.mod.h.Child
import typingsSlinky.luminoWidgets.commandpaletteMod.CommandPalette.IItem
import typingsSlinky.luminoWidgets.commandpaletteMod.CommandPalette.IItemOptions
import typingsSlinky.luminoWidgets.commandpaletteMod.CommandPalette.IOptions
import typingsSlinky.luminoWidgets.commandpaletteMod.CommandPalette.IRenderer
import typingsSlinky.luminoWidgets.widgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandpaletteMod {
  
  @JSImport("@lumino/widgets/types/commandpalette", "CommandPalette")
  @js.native
  class CommandPalette protected () extends Widget {
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
  object CommandPalette {
    
    /**
      * The default implementation of `IRenderer`.
      */
    @JSImport("@lumino/widgets/types/commandpalette", "CommandPalette.Renderer")
    @js.native
    class Renderer () extends IRenderer {
      
      /**
        * Create the class name for the command item icon.
        *
        * @param data - The data to use for the class name.
        *
        * @returns The full class name for the item icon.
        */
      def createIconClass(data: IItemRenderData): String = js.native
      
      /**
        * Create the class name for the command palette item.
        *
        * @param data - The data to use for the class name.
        *
        * @returns The full class name for the command palette item.
        */
      def createItemClass(data: IItemRenderData): String = js.native
      
      /**
        * Create the dataset for the command palette item.
        *
        * @param data - The data to use for creating the dataset.
        *
        * @returns The dataset for the command palette item.
        */
      def createItemDataset(data: IItemRenderData): ElementDataset = js.native
      
      /**
        * Create the render content for the empty message node.
        *
        * @param data - The data to use for the empty message content.
        *
        * @returns The content to add to the empty message node.
        */
      def formatEmptyMessage(data: IEmptyMessageRenderData): Child = js.native
      
      /**
        * Create the render content for the header node.
        *
        * @param data - The data to use for the header content.
        *
        * @returns The content to add to the header node.
        */
      def formatHeader(data: IHeaderRenderData): Child = js.native
      
      /**
        * Create the render content for the item caption node.
        *
        * @param data - The data to use for the caption content.
        *
        * @returns The content to add to the caption node.
        */
      def formatItemCaption(data: IItemRenderData): Child = js.native
      
      /**
        * Create the render content for the item label node.
        *
        * @param data - The data to use for the label content.
        *
        * @returns The content to add to the label node.
        */
      def formatItemLabel(data: IItemRenderData): Child = js.native
      
      /**
        * Create the render content for the item shortcut node.
        *
        * @param data - The data to use for the shortcut content.
        *
        * @returns The content to add to the shortcut node.
        */
      def formatItemShortcut(data: IItemRenderData): Child = js.native
      
      /**
        * Render the caption for a command palette item.
        *
        * @param data - The data to use for rendering the caption.
        *
        * @returns A virtual element representing the caption.
        */
      def renderItemCaption(data: IItemRenderData): VirtualElement = js.native
      
      /**
        * Render the content for a command palette item.
        *
        * @param data - The data to use for rendering the content.
        *
        * @returns A virtual element representing the content.
        */
      def renderItemContent(data: IItemRenderData): VirtualElement = js.native
      
      /**
        * Render the icon for a command palette item.
        *
        * @param data - The data to use for rendering the icon.
        *
        * @returns A virtual element representing the icon.
        */
      def renderItemIcon(data: IItemRenderData): VirtualElement = js.native
      
      /**
        * Render the label for a command palette item.
        *
        * @param data - The data to use for rendering the label.
        *
        * @returns A virtual element representing the label.
        */
      def renderItemLabel(data: IItemRenderData): VirtualElement = js.native
      
      /**
        * Render the shortcut for a command palette item.
        *
        * @param data - The data to use for rendering the shortcut.
        *
        * @returns A virtual element representing the shortcut.
        */
      def renderItemShortcut(data: IItemRenderData): VirtualElement = js.native
    }
    
    /**
      * The default `Renderer` instance.
      */
    @JSImport("@lumino/widgets/types/commandpalette", "CommandPalette.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    /**
      * The render data for a command palette empty message.
      */
    @js.native
    trait IEmptyMessageRenderData extends StObject {
      
      /**
        * The query which failed to match any commands.
        */
      var query: String = js.native
    }
    object IEmptyMessageRenderData {
      
      @scala.inline
      def apply(query: String): IEmptyMessageRenderData = {
        val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
        __obj.asInstanceOf[IEmptyMessageRenderData]
      }
      
      @scala.inline
      implicit class IEmptyMessageRenderDataMutableBuilder[Self <: IEmptyMessageRenderData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The render data for a command palette header.
      */
    @js.native
    trait IHeaderRenderData extends StObject {
      
      /**
        * The category of the header.
        */
      val category: String = js.native
      
      /**
        * The indices of the matched characters in the category.
        */
      val indices: js.Array[Double] | Null = js.native
    }
    object IHeaderRenderData {
      
      @scala.inline
      def apply(category: String): IHeaderRenderData = {
        val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
        __obj.asInstanceOf[IHeaderRenderData]
      }
      
      @scala.inline
      implicit class IHeaderRenderDataMutableBuilder[Self <: IHeaderRenderData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndicesNull: Self = StObject.set(x, "indices", null)
        
        @scala.inline
        def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
      }
    }
    
    /**
      * An object which represents an item in a command palette.
      *
      * #### Notes
      * Item objects are created automatically by a command palette.
      */
    @js.native
    trait IItem extends StObject {
      
      /**
        * The arguments for the command.
        */
      val args: ReadonlyJSONObject = js.native
      
      /**
        * The display caption for the command item.
        */
      val caption: String = js.native
      
      /**
        * The category for the command item.
        */
      val category: String = js.native
      
      /**
        * The extra class name for the command item.
        */
      val className: String = js.native
      
      /**
        * The command to execute when the item is triggered.
        */
      val command: String = js.native
      
      /**
        * The dataset for the command item.
        */
      val dataset: Dataset = js.native
      
      /**
        * The icon renderer for the command item.
        */
      val icon: js.UndefOr[typingsSlinky.luminoVirtualdom.mod.VirtualElement.IRenderer | String] = js.native
      
      /**
        * The icon class for the command item.
        */
      val iconClass: String = js.native
      
      /**
        * The icon label for the command item.
        */
      val iconLabel: String = js.native
      
      /**
        * Whether the command item is enabled.
        */
      val isEnabled: Boolean = js.native
      
      /**
        * Whether the command item is toggled.
        */
      val isToggled: Boolean = js.native
      
      /**
        * Whether the command item is visible.
        */
      val isVisible: Boolean = js.native
      
      /**
        * The key binding for the command item.
        */
      val keyBinding: IKeyBinding | Null = js.native
      
      /**
        * The display label for the command item.
        */
      val label: String = js.native
      
      /**
        * The rank for the command item.
        */
      val rank: Double = js.native
    }
    object IItem {
      
      @scala.inline
      def apply(
        args: ReadonlyJSONObject,
        caption: String,
        category: String,
        className: String,
        command: String,
        dataset: Dataset,
        iconClass: String,
        iconLabel: String,
        isEnabled: Boolean,
        isToggled: Boolean,
        isVisible: Boolean,
        label: String,
        rank: Double
      ): IItem = {
        val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isToggled = isToggled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
        __obj.asInstanceOf[IItem]
      }
      
      @scala.inline
      implicit class IItemMutableBuilder[Self <: IItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArgs(value: ReadonlyJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIcon(value: typingsSlinky.luminoVirtualdom.mod.VirtualElement.IRenderer | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsToggled(value: Boolean): Self = StObject.set(x, "isToggled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyBinding(value: IKeyBinding): Self = StObject.set(x, "keyBinding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyBindingNull: Self = StObject.set(x, "keyBinding", null)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An options object for creating a command item.
      */
    @js.native
    trait IItemOptions extends StObject {
      
      /**
        * The arguments for the command.
        *
        * The default value is an empty object.
        */
      var args: js.UndefOr[ReadonlyJSONObject] = js.native
      
      /**
        * The category for the item.
        */
      var category: String = js.native
      
      /**
        * The command to execute when the item is triggered.
        */
      var command: String = js.native
      
      /**
        * The rank for the command item.
        *
        * The rank is used as a tie-breaker when ordering command items
        * for display. Items are sorted in the following order:
        *   1. Text match (lower is better)
        *   2. Category (locale order)
        *   3. Rank (lower is better)
        *   4. Label (locale order)
        *
        * The default rank is `Infinity`.
        */
      var rank: js.UndefOr[Double] = js.native
    }
    object IItemOptions {
      
      @scala.inline
      def apply(category: String, command: String): IItemOptions = {
        val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
        __obj.asInstanceOf[IItemOptions]
      }
      
      @scala.inline
      implicit class IItemOptionsMutableBuilder[Self <: IItemOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArgs(value: ReadonlyJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        @scala.inline
        def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      }
    }
    
    /**
      * The render data for a command palette item.
      */
    @js.native
    trait IItemRenderData extends StObject {
      
      /**
        * Whether the item is the active item.
        */
      val active: Boolean = js.native
      
      /**
        * The indices of the matched characters in the label.
        */
      val indices: js.Array[Double] | Null = js.native
      
      /**
        * The command palette item to render.
        */
      val item: IItem = js.native
    }
    object IItemRenderData {
      
      @scala.inline
      def apply(active: Boolean, item: IItem): IItemRenderData = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
        __obj.asInstanceOf[IItemRenderData]
      }
      
      @scala.inline
      implicit class IItemRenderDataMutableBuilder[Self <: IItemRenderData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndicesNull: Self = StObject.set(x, "indices", null)
        
        @scala.inline
        def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
        
        @scala.inline
        def setItem(value: IItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An options object for creating a command palette.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The command registry for use with the command palette.
        */
      var commands: CommandRegistry = js.native
      
      /**
        * A custom renderer for use with the command palette.
        *
        * The default is a shared renderer instance.
        */
      var renderer: js.UndefOr[IRenderer] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(commands: CommandRegistry): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCommands(value: CommandRegistry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      }
    }
    
    /**
      * A renderer for use with a command palette.
      */
    @js.native
    trait IRenderer extends StObject {
      
      /**
        * Render the empty results message for a command palette.
        *
        * @param data - The data to use for rendering the message.
        *
        * @returns A virtual element representing the message.
        */
      def renderEmptyMessage(data: IEmptyMessageRenderData): VirtualElement = js.native
      
      /**
        * Render the virtual element for a command palette header.
        *
        * @param data - The data to use for rendering the header.
        *
        * @returns A virtual element representing the header.
        */
      def renderHeader(data: IHeaderRenderData): VirtualElement = js.native
      
      /**
        * Render the virtual element for a command palette item.
        *
        * @param data - The data to use for rendering the item.
        *
        * @returns A virtual element representing the item.
        *
        * #### Notes
        * The command palette will not render invisible items.
        */
      def renderItem(data: IItemRenderData): VirtualElement = js.native
    }
    object IRenderer {
      
      @scala.inline
      def apply(
        renderEmptyMessage: IEmptyMessageRenderData => VirtualElement,
        renderHeader: IHeaderRenderData => VirtualElement,
        renderItem: IItemRenderData => VirtualElement
      ): IRenderer = {
        val __obj = js.Dynamic.literal(renderEmptyMessage = js.Any.fromFunction1(renderEmptyMessage), renderHeader = js.Any.fromFunction1(renderHeader), renderItem = js.Any.fromFunction1(renderItem))
        __obj.asInstanceOf[IRenderer]
      }
      
      @scala.inline
      implicit class IRendererMutableBuilder[Self <: IRenderer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRenderEmptyMessage(value: IEmptyMessageRenderData => VirtualElement): Self = StObject.set(x, "renderEmptyMessage", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRenderHeader(value: IHeaderRenderData => VirtualElement): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRenderItem(value: IItemRenderData => VirtualElement): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      }
    }
  }
}
