package typingsSlinky.luminoWidgets

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoWidgets.docklayoutMod.DockLayout.IAddOptions
import typingsSlinky.luminoWidgets.docklayoutMod.DockLayout.ILayoutConfig
import typingsSlinky.luminoWidgets.docklayoutMod.DockLayout.IOptions
import typingsSlinky.luminoWidgets.docklayoutMod.DockLayout.IRenderer
import typingsSlinky.luminoWidgets.docklayoutMod.DockLayout.ITabAreaGeometry
import typingsSlinky.luminoWidgets.layoutMod.Layout
import typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-area`
import typingsSlinky.luminoWidgets.luminoWidgetsStrings.`tab-area`
import typingsSlinky.luminoWidgets.luminoWidgetsStrings.horizontal
import typingsSlinky.luminoWidgets.luminoWidgetsStrings.vertical
import typingsSlinky.luminoWidgets.tabbarMod.TabBar
import typingsSlinky.luminoWidgets.widgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docklayoutMod {
  
  @JSImport("@lumino/widgets/types/docklayout", "DockLayout")
  @js.native
  class DockLayout protected () extends Layout {
    /**
      * Construct a new dock layout.
      *
      * @param options - The options for initializing the layout.
      */
    def this(options: IOptions) = this()
    
    var _box: js.Any = js.native
    
    /**
      * Create a new handle for the dock layout.
      *
      * #### Notes
      * The handle will be attached to the parent if it exists.
      */
    var _createHandle: js.Any = js.native
    
    /**
      * Create a new tab bar for use by the dock layout.
      *
      * #### Notes
      * The tab bar will be attached to the parent if it exists.
      */
    var _createTabBar: js.Any = js.native
    
    var _dirty: js.Any = js.native
    
    /**
      * Fit the layout to the total size required by the widgets.
      */
    var _fit: js.Any = js.native
    
    /**
      * Insert a widget as a new split area.
      *
      * #### Notes
      * This does not attach the widget to the parent widget.
      */
    var _insertSplit: js.Any = js.native
    
    /**
      * Insert a widget next to an existing tab.
      *
      * #### Notes
      * This does not attach the widget to the parent widget.
      */
    var _insertTab: js.Any = js.native
    
    var _items: js.Any = js.native
    
    /**
      * Remove the specified widget from the layout structure.
      *
      * #### Notes
      * This is a no-op if the widget is not in the layout tree.
      *
      * This does not detach the widget from the parent node.
      */
    var _removeWidget: js.Any = js.native
    
    var _root: js.Any = js.native
    
    var _spacing: js.Any = js.native
    
    /**
      * Ensure the root is a split node with the given orientation.
      */
    var _splitRoot: js.Any = js.native
    
    /**
      * Update the layout position and size of the widgets.
      *
      * The parent offset dimensions should be `-1` if unknown.
      */
    var _update: js.Any = js.native
    
    /**
      * Add a widget to the dock layout.
      *
      * @param widget - The widget to add to the dock layout.
      *
      * @param options - The additional options for adding the widget.
      *
      * #### Notes
      * The widget will be moved if it is already contained in the layout.
      *
      * An error will be thrown if the reference widget is invalid.
      */
    def addWidget(widget: Widget): Unit = js.native
    def addWidget(widget: Widget, options: IAddOptions): Unit = js.native
    
    /**
      * Attach the widget to the layout parent widget.
      *
      * @param widget - The widget to attach to the parent.
      *
      * #### Notes
      * This is a no-op if the widget is already attached.
      */
    /* protected */ def attachWidget(widget: Widget): Unit = js.native
    
    /**
      * Detach the widget from the layout parent widget.
      *
      * @param widget - The widget to detach from the parent.
      *
      * #### Notes
      * This is a no-op if the widget is not attached.
      */
    /* protected */ def detachWidget(widget: Widget): Unit = js.native
    
    /**
      * Create an iterator over the handles in the layout.
      *
      * @returns A new iterator over the handles in the layout.
      */
    def handles(): IIterator[HTMLDivElement] = js.native
    
    /**
      * Find the tab area which contains the given client position.
      *
      * @param clientX - The client X position of interest.
      *
      * @param clientY - The client Y position of interest.
      *
      * @returns The geometry of the tab area at the given position, or
      *   `null` if there is no tab area at the given position.
      */
    def hitTestTabAreas(clientX: Double, clientY: Double): ITabAreaGeometry | Null = js.native
    
    /**
      * Whether the dock layout is empty.
      */
    val isEmpty: Boolean = js.native
    
    /**
      * Move a handle to the given offset position.
      *
      * @param handle - The handle to move.
      *
      * @param offsetX - The desired offset X position of the handle.
      *
      * @param offsetY - The desired offset Y position of the handle.
      *
      * #### Notes
      * If the given handle is not contained in the layout, this is no-op.
      *
      * The handle will be moved as close as possible to the desired
      * position without violating any of the layout constraints.
      *
      * Only one of the coordinates is used depending on the orientation
      * of the handle. This method accepts both coordinates to make it
      * easy to invoke from a mouse move event without needing to know
      * the handle orientation.
      */
    def moveHandle(handle: HTMLDivElement, offsetX: Double, offsetY: Double): Unit = js.native
    
    /**
      * The renderer used by the dock layout.
      */
    val renderer: IRenderer = js.native
    
    /**
      * Restore the layout to a previously saved configuration.
      *
      * @param config - The layout configuration to restore.
      *
      * #### Notes
      * Widgets which currently belong to the layout but which are not
      * contained in the config will be unparented.
      */
    def restoreLayout(config: ILayoutConfig): Unit = js.native
    
    /**
      * Save the current configuration of the dock layout.
      *
      * @returns A new config object for the current layout state.
      *
      * #### Notes
      * The return value can be provided to the `restoreLayout` method
      * in order to restore the layout to its current configuration.
      */
    def saveLayout(): ILayoutConfig = js.native
    
    /**
      * Create an iterator over the selected widgets in the layout.
      *
      * @returns A new iterator over the selected user widgets.
      *
      * #### Notes
      * This iterator yields the widgets corresponding to the current tab
      * of each tab bar in the layout.
      */
    def selectedWidgets(): IIterator[Widget] = js.native
    
    /**
      * Get the inter-element spacing for the dock layout.
      */
    /**
      * Set the inter-element spacing for the dock layout.
      */
    var spacing: Double = js.native
    
    /**
      * Create an iterator over the tab bars in the layout.
      *
      * @returns A new iterator over the tab bars in the layout.
      *
      * #### Notes
      * This iterator does not include the user widgets.
      */
    def tabBars(): IIterator[TabBar[Widget]] = js.native
    
    /**
      * Create an iterator over the user widgets in the layout.
      *
      * @returns A new iterator over the user widgets in the layout.
      *
      * #### Notes
      * This iterator does not include the generated tab bars.
      */
    def widgets(): IIterator[Widget] = js.native
  }
  object DockLayout {
    
    /**
      * A type alias for a general area config.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.luminoWidgets.docklayoutMod.DockLayout.ITabAreaConfig
      - typingsSlinky.luminoWidgets.docklayoutMod.DockLayout.ISplitAreaConfig
    */
    trait AreaConfig extends StObject
    object AreaConfig {
      
      @scala.inline
      def ISplitAreaConfig(
        children: js.Array[AreaConfig],
        orientation: horizontal | vertical,
        sizes: js.Array[Double],
        `type`: `split-area`
      ): typingsSlinky.luminoWidgets.docklayoutMod.DockLayout.ISplitAreaConfig = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.luminoWidgets.docklayoutMod.DockLayout.ISplitAreaConfig]
      }
      
      @scala.inline
      def ITabAreaConfig(currentIndex: Double, `type`: `tab-area`, widgets: js.Array[Widget]): typingsSlinky.luminoWidgets.docklayoutMod.DockLayout.ITabAreaConfig = {
        val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.luminoWidgets.docklayoutMod.DockLayout.ITabAreaConfig]
      }
    }
    
    /**
      * An options object for adding a widget to the dock layout.
      */
    @js.native
    trait IAddOptions extends StObject {
      
      /**
        * The insertion mode for adding the widget.
        *
        * The default is `'tab-after'`.
        */
      var mode: js.UndefOr[InsertMode] = js.native
      
      /**
        * The reference widget for the insert location.
        *
        * The default is `null`.
        */
      var ref: js.UndefOr[Widget | Null] = js.native
    }
    object IAddOptions {
      
      @scala.inline
      def apply(): IAddOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAddOptions]
      }
      
      @scala.inline
      implicit class IAddOptionsMutableBuilder[Self <: IAddOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMode(value: InsertMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        @scala.inline
        def setRef(value: Widget): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefNull: Self = StObject.set(x, "ref", null)
        
        @scala.inline
        def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      }
    }
    
    /**
      * A dock layout configuration object.
      */
    @js.native
    trait ILayoutConfig extends StObject {
      
      /**
        * The layout config for the main dock area.
        */
      var main: AreaConfig | Null = js.native
    }
    object ILayoutConfig {
      
      @scala.inline
      def apply(): ILayoutConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ILayoutConfig]
      }
      
      @scala.inline
      implicit class ILayoutConfigMutableBuilder[Self <: ILayoutConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMain(value: AreaConfig): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMainNull: Self = StObject.set(x, "main", null)
      }
    }
    
    /**
      * An options object for creating a dock layout.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The renderer to use for the dock layout.
        */
      var renderer: IRenderer = js.native
      
      /**
        * The spacing between items in the layout.
        *
        * The default is `4`.
        */
      var spacing: js.UndefOr[Double] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(renderer: IRenderer): IOptions = {
        val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      }
    }
    
    /**
      * A renderer for use with a dock layout.
      */
    @js.native
    trait IRenderer extends StObject {
      
      /**
        * Create a new handle node for use with a dock layout.
        *
        * @returns A new handle node for a dock layout.
        */
      def createHandle(): HTMLDivElement = js.native
      
      /**
        * Create a new tab bar for use with a dock layout.
        *
        * @returns A new tab bar for a dock layout.
        */
      def createTabBar(): TabBar[Widget] = js.native
    }
    object IRenderer {
      
      @scala.inline
      def apply(createHandle: () => HTMLDivElement, createTabBar: () => TabBar[Widget]): IRenderer = {
        val __obj = js.Dynamic.literal(createHandle = js.Any.fromFunction0(createHandle), createTabBar = js.Any.fromFunction0(createTabBar))
        __obj.asInstanceOf[IRenderer]
      }
      
      @scala.inline
      implicit class IRendererMutableBuilder[Self <: IRenderer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateHandle(value: () => HTMLDivElement): Self = StObject.set(x, "createHandle", js.Any.fromFunction0(value))
        
        @scala.inline
        def setCreateTabBar(value: () => TabBar[Widget]): Self = StObject.set(x, "createTabBar", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * A layout config object for a split area.
      */
    @js.native
    trait ISplitAreaConfig extends AreaConfig {
      
      /**
        * The children in the split area.
        */
      var children: js.Array[AreaConfig] = js.native
      
      /**
        * The orientation of the split area.
        */
      var orientation: horizontal | vertical = js.native
      
      /**
        * The relative sizes of the children.
        */
      var sizes: js.Array[Double] = js.native
      
      /**
        * The discriminated type of the config object.
        */
      var `type`: `split-area` = js.native
    }
    object ISplitAreaConfig {
      
      @scala.inline
      def apply(
        children: js.Array[AreaConfig],
        orientation: horizontal | vertical,
        sizes: js.Array[Double],
        `type`: `split-area`
      ): ISplitAreaConfig = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISplitAreaConfig]
      }
      
      @scala.inline
      implicit class ISplitAreaConfigMutableBuilder[Self <: ISplitAreaConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: js.Array[AreaConfig]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenVarargs(value: AreaConfig*): Self = StObject.set(x, "children", js.Array(value :_*))
        
        @scala.inline
        def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value :_*))
        
        @scala.inline
        def setType(value: `split-area`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A layout config object for a tab area.
      */
    @js.native
    trait ITabAreaConfig extends AreaConfig {
      
      /**
        * The index of the selected tab.
        */
      var currentIndex: Double = js.native
      
      /**
        * The discriminated type of the config object.
        */
      var `type`: `tab-area` = js.native
      
      /**
        * The widgets contained in the tab area.
        */
      var widgets: js.Array[Widget] = js.native
    }
    object ITabAreaConfig {
      
      @scala.inline
      def apply(currentIndex: Double, `type`: `tab-area`, widgets: js.Array[Widget]): ITabAreaConfig = {
        val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ITabAreaConfig]
      }
      
      @scala.inline
      implicit class ITabAreaConfigMutableBuilder[Self <: ITabAreaConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: `tab-area`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidgets(value: js.Array[Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidgetsVarargs(value: Widget*): Self = StObject.set(x, "widgets", js.Array(value :_*))
      }
    }
    
    /**
      * An object which represents the geometry of a tab area.
      */
    @js.native
    trait ITabAreaGeometry extends StObject {
      
      /**
        * The local coordinate of the bottom edge of the tab area.
        *
        * #### Notes
        * This is the distance from the bottom edge of the layout parent
        * widget, to the bottom edge of the tab area.
        */
      var bottom: Double = js.native
      
      /**
        * The height of the tab area.
        *
        * #### Notes
        * This is total height allocated for the tab area.
        */
      var height: Double = js.native
      
      /**
        * The local coordinate of the left edge of the tab area.
        *
        * #### Notes
        * This is the distance from the left edge of the layout parent
        * widget, to the left edge of the tab area.
        */
      var left: Double = js.native
      
      /**
        * The local coordinate of the right edge of the tab area.
        *
        * #### Notes
        * This is the distance from the right edge of the layout parent
        * widget, to the right edge of the tab area.
        */
      var right: Double = js.native
      
      /**
        * The tab bar for the tab area.
        */
      var tabBar: TabBar[Widget] = js.native
      
      /**
        * The local coordinate of the top edge of the tab area.
        *
        * #### Notes
        * This is the distance from the top edge of the layout parent
        * widget, to the top edge of the tab area.
        */
      var top: Double = js.native
      
      /**
        * The width of the tab area.
        *
        * #### Notes
        * This is total width allocated for the tab area.
        */
      var width: Double = js.native
      
      /**
        * The local X position of the hit test in the dock area.
        *
        * #### Notes
        * This is the distance from the left edge of the layout parent
        * widget, to the local X coordinate of the hit test query.
        */
      var x: Double = js.native
      
      /**
        * The local Y position of the hit test in the dock area.
        *
        * #### Notes
        * This is the distance from the top edge of the layout parent
        * widget, to the local Y coordinate of the hit test query.
        */
      var y: Double = js.native
    }
    object ITabAreaGeometry {
      
      @scala.inline
      def apply(
        bottom: Double,
        height: Double,
        left: Double,
        right: Double,
        tabBar: TabBar[Widget],
        top: Double,
        width: Double,
        x: Double,
        y: Double
      ): ITabAreaGeometry = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], tabBar = tabBar.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[ITabAreaGeometry]
      }
      
      @scala.inline
      implicit class ITabAreaGeometryMutableBuilder[Self <: ITabAreaGeometry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTabBar(value: TabBar[Widget]): Self = StObject.set(x, "tabBar", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for the supported insertion modes.
      *
      * An insert mode is used to specify how a widget should be added
      * to the dock layout relative to a reference widget.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-top`
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-left`
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-right`
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-bottom`
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.`tab-before`
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.`tab-after`
    */
    trait InsertMode extends StObject
    object InsertMode {
      
      @scala.inline
      def `split-bottom`: typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-bottom` = "split-bottom".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-bottom`]
      
      @scala.inline
      def `split-left`: typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-left` = "split-left".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-left`]
      
      @scala.inline
      def `split-right`: typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-right` = "split-right".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-right`]
      
      @scala.inline
      def `split-top`: typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-top` = "split-top".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.`split-top`]
      
      @scala.inline
      def `tab-after`: typingsSlinky.luminoWidgets.luminoWidgetsStrings.`tab-after` = "tab-after".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.`tab-after`]
      
      @scala.inline
      def `tab-before`: typingsSlinky.luminoWidgets.luminoWidgetsStrings.`tab-before` = "tab-before".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.`tab-before`]
    }
  }
}
