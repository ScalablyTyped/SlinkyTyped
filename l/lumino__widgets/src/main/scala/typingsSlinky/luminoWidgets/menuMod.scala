package typingsSlinky.luminoWidgets

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLUListElement
import typingsSlinky.luminoCommands.mod.CommandRegistry
import typingsSlinky.luminoCommands.mod.CommandRegistry.Dataset
import typingsSlinky.luminoCommands.mod.CommandRegistry.IKeyBinding
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyJSONObject
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoVirtualdom.mod.ElementDataset
import typingsSlinky.luminoVirtualdom.mod.VirtualElement
import typingsSlinky.luminoVirtualdom.mod.h.Child
import typingsSlinky.luminoWidgets.luminoWidgetsStrings.next
import typingsSlinky.luminoWidgets.luminoWidgetsStrings.previous
import typingsSlinky.luminoWidgets.menuMod.Menu.IItem
import typingsSlinky.luminoWidgets.menuMod.Menu.IItemOptions
import typingsSlinky.luminoWidgets.menuMod.Menu.IOpenOptions
import typingsSlinky.luminoWidgets.menuMod.Menu.IOptions
import typingsSlinky.luminoWidgets.menuMod.Menu.IRenderer
import typingsSlinky.luminoWidgets.widgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("@lumino/widgets/types/menu", "Menu")
  @js.native
  class Menu protected () extends Widget {
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
  object Menu {
    
    /**
      * The default implementation of `IRenderer`.
      *
      * #### Notes
      * Subclasses are free to reimplement rendering methods as needed.
      */
    @JSImport("@lumino/widgets/types/menu", "Menu.Renderer")
    @js.native
    /**
      * Construct a new renderer.
      */
    class Renderer () extends IRenderer {
      
      /**
        * Create the class name for the menu item icon.
        *
        * @param data - The data to use for the class name.
        *
        * @returns The full class name for the item icon.
        */
      def createIconClass(data: IRenderData): String = js.native
      
      /**
        * Create the class name for the menu item.
        *
        * @param data - The data to use for the class name.
        *
        * @returns The full class name for the menu item.
        */
      def createItemClass(data: IRenderData): String = js.native
      
      /**
        * Create the dataset for the menu item.
        *
        * @param data - The data to use for creating the dataset.
        *
        * @returns The dataset for the menu item.
        */
      def createItemDataset(data: IRenderData): ElementDataset = js.native
      
      /**
        * Create the render content for the label node.
        *
        * @param data - The data to use for the label content.
        *
        * @returns The content to add to the label node.
        */
      def formatLabel(data: IRenderData): Child = js.native
      
      /**
        * Create the render content for the shortcut node.
        *
        * @param data - The data to use for the shortcut content.
        *
        * @returns The content to add to the shortcut node.
        */
      def formatShortcut(data: IRenderData): Child = js.native
      
      /**
        * Render the icon element for a menu item.
        *
        * @param data - The data to use for rendering the icon.
        *
        * @returns A virtual element representing the item icon.
        */
      def renderIcon(data: IRenderData): VirtualElement = js.native
      
      /**
        * Render the label element for a menu item.
        *
        * @param data - The data to use for rendering the label.
        *
        * @returns A virtual element representing the item label.
        */
      def renderLabel(data: IRenderData): VirtualElement = js.native
      
      /**
        * Render the shortcut element for a menu item.
        *
        * @param data - The data to use for rendering the shortcut.
        *
        * @returns A virtual element representing the item shortcut.
        */
      def renderShortcut(data: IRenderData): VirtualElement = js.native
      
      /**
        * Render the submenu icon element for a menu item.
        *
        * @param data - The data to use for rendering the submenu icon.
        *
        * @returns A virtual element representing the submenu icon.
        */
      def renderSubmenu(data: IRenderData): VirtualElement = js.native
    }
    
    /**
      * The default `Renderer` instance.
      */
    @JSImport("@lumino/widgets/types/menu", "Menu.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    /**
      * An object which represents a menu item.
      *
      * #### Notes
      * Item objects are created automatically by a menu.
      */
    @js.native
    trait IItem extends StObject {
      
      /**
        * The arguments for the command.
        */
      val args: ReadonlyJSONObject = js.native
      
      /**
        * The display caption for the menu item.
        */
      val caption: String = js.native
      
      /**
        * The extra class name for the menu item.
        */
      val className: String = js.native
      
      /**
        * The command to execute when the item is triggered.
        */
      val command: String = js.native
      
      /**
        * The dataset for the menu item.
        */
      val dataset: Dataset = js.native
      
      /**
        * The icon renderer for the menu item.
        */
      val icon: js.UndefOr[typingsSlinky.luminoVirtualdom.mod.VirtualElement.IRenderer | String] = js.native
      
      /**
        * The icon class for the menu item.
        */
      val iconClass: String = js.native
      
      /**
        * The icon label for the menu item.
        */
      val iconLabel: String = js.native
      
      /**
        * Whether the menu item is enabled.
        */
      val isEnabled: Boolean = js.native
      
      /**
        * Whether the menu item is toggled.
        */
      val isToggled: Boolean = js.native
      
      /**
        * Whether the menu item is visible.
        */
      val isVisible: Boolean = js.native
      
      /**
        * The key binding for the menu item.
        */
      val keyBinding: IKeyBinding | Null = js.native
      
      /**
        * The display label for the menu item.
        */
      val label: String = js.native
      
      /**
        * The mnemonic index for the menu item.
        */
      val mnemonic: Double = js.native
      
      /**
        * The submenu for a `'submenu'` type item.
        */
      val submenu: Menu | Null = js.native
      
      /**
        * The type of the menu item.
        */
      val `type`: ItemType = js.native
    }
    object IItem {
      
      @scala.inline
      def apply(
        args: ReadonlyJSONObject,
        caption: String,
        className: String,
        command: String,
        dataset: Dataset,
        iconClass: String,
        iconLabel: String,
        isEnabled: Boolean,
        isToggled: Boolean,
        isVisible: Boolean,
        label: String,
        mnemonic: Double,
        `type`: ItemType
      ): IItem = {
        val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isToggled = isToggled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IItem]
      }
      
      @scala.inline
      implicit class IItemMutableBuilder[Self <: IItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArgs(value: ReadonlyJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
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
        def setMnemonic(value: Double): Self = StObject.set(x, "mnemonic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubmenu(value: Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubmenuNull: Self = StObject.set(x, "submenu", null)
        
        @scala.inline
        def setType(value: ItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An options object for creating a menu item.
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
        * The command to execute when the item is triggered.
        *
        * The default value is an empty string.
        */
      var command: js.UndefOr[String] = js.native
      
      /**
        * The submenu for a `'submenu'` type item.
        *
        * The default value is `null`.
        */
      var submenu: js.UndefOr[Menu | Null] = js.native
      
      /**
        * The type of the menu item.
        *
        * The default value is `'command'`.
        */
      var `type`: js.UndefOr[ItemType] = js.native
    }
    object IItemOptions {
      
      @scala.inline
      def apply(): IItemOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IItemOptions]
      }
      
      @scala.inline
      implicit class IItemOptionsMutableBuilder[Self <: IItemOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArgs(value: ReadonlyJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        @scala.inline
        def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
        
        @scala.inline
        def setSubmenu(value: Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubmenuNull: Self = StObject.set(x, "submenu", null)
        
        @scala.inline
        def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
        
        @scala.inline
        def setType(value: ItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * An options object for the `open` method on a menu.
      */
    @js.native
    trait IOpenOptions extends StObject {
      
      /**
        * Whether to force the X position of the menu.
        *
        * Setting to `true` will disable the logic which repositions the
        * X coordinate of the menu if it will not fit entirely on screen.
        *
        * The default is `false`.
        */
      var forceX: js.UndefOr[Boolean] = js.native
      
      /**
        * Whether to force the Y position of the menu.
        *
        * Setting to `true` will disable the logic which repositions the
        * Y coordinate of the menu if it will not fit entirely on screen.
        *
        * The default is `false`.
        */
      var forceY: js.UndefOr[Boolean] = js.native
    }
    object IOpenOptions {
      
      @scala.inline
      def apply(): IOpenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOpenOptions]
      }
      
      @scala.inline
      implicit class IOpenOptionsMutableBuilder[Self <: IOpenOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setForceX(value: Boolean): Self = StObject.set(x, "forceX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceXUndefined: Self = StObject.set(x, "forceX", js.undefined)
        
        @scala.inline
        def setForceY(value: Boolean): Self = StObject.set(x, "forceY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceYUndefined: Self = StObject.set(x, "forceY", js.undefined)
      }
    }
    
    /**
      * An options object for creating a menu.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The command registry for use with the menu.
        */
      var commands: CommandRegistry = js.native
      
      /**
        * A custom renderer for use with the menu.
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
      * An object which holds the data to render a menu item.
      */
    @js.native
    trait IRenderData extends StObject {
      
      /**
        * Whether the item is the active item.
        */
      val active: Boolean = js.native
      
      /**
        * Whether the item should be collapsed.
        */
      val collapsed: Boolean = js.native
      
      /**
        * The item to be rendered.
        */
      val item: IItem = js.native
    }
    object IRenderData {
      
      @scala.inline
      def apply(active: Boolean, collapsed: Boolean, item: IItem): IRenderData = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderData]
      }
      
      @scala.inline
      implicit class IRenderDataMutableBuilder[Self <: IRenderData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItem(value: IItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A renderer for use with a menu.
      */
    @js.native
    trait IRenderer extends StObject {
      
      /**
        * Render the virtual element for a menu item.
        *
        * @param data - The data to use for rendering the item.
        *
        * @returns A virtual element representing the item.
        */
      def renderItem(data: IRenderData): VirtualElement = js.native
    }
    object IRenderer {
      
      @scala.inline
      def apply(renderItem: IRenderData => VirtualElement): IRenderer = {
        val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction1(renderItem))
        __obj.asInstanceOf[IRenderer]
      }
      
      @scala.inline
      implicit class IRendererMutableBuilder[Self <: IRenderer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRenderItem(value: IRenderData => VirtualElement): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * A type alias for a menu item type.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.command
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.submenu
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.separator
    */
    trait ItemType extends StObject
    object ItemType {
      
      @scala.inline
      def command: typingsSlinky.luminoWidgets.luminoWidgetsStrings.command = "command".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.command]
      
      @scala.inline
      def separator: typingsSlinky.luminoWidgets.luminoWidgetsStrings.separator = "separator".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.separator]
      
      @scala.inline
      def submenu: typingsSlinky.luminoWidgets.luminoWidgetsStrings.submenu = "submenu".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.submenu]
    }
  }
}
