package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.anon.PartialITabsProps
import typingsSlinky.blueprintjsCore.anon.SelectedTabId
import typingsSlinky.blueprintjsCore.anon.TypeofTab
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.tabMod.TabId
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Expander")
  @js.native
  val Expander: ReactComponentClass[js.Object] = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs")
  @js.native
  class Tabs protected ()
    extends AbstractPureComponent2[ITabsProps, ITabsState, js.Object] {
    def this(props: ITabsProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MTabs(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTabs(prevProps: ITabsProps, prevState: ITabsState): Unit = js.native
    
    var getInitialSelectedTabId: js.Any = js.native
    
    var getKeyCodeDirection: js.Any = js.native
    
    /** Filters children to only `<Tab>`s */
    var getTabChildren: js.Any = js.native
    
    var getTabChildrenProps: js.Any = js.native
    
    /** Queries root HTML element for all tabs with optional filter selector */
    var getTabElements: js.Any = js.native
    
    var handleKeyDown: js.Any = js.native
    
    var handleKeyPress: js.Any = js.native
    
    var handleTabClick: js.Any = js.native
    
    /**
      * Calculate the new height, width, and position of the tab indicator.
      * Store the CSS values so the transition animation can start.
      */
    var moveSelectionIndicator: js.Any = js.native
    
    var refHandlers: js.Any = js.native
    
    var renderTabPanel: js.Any = js.native
    
    var renderTabTitle: js.Any = js.native
    
    var tablistElement: js.Any = js.native
  }
  /* static members */
  object Tabs {
    
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs.Expander")
    @js.native
    def Expander: ReactComponentClass[js.Object] = js.native
    @scala.inline
    def Expander_=(x: ReactComponentClass[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expander")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs.Tab")
    @js.native
    def Tab: TypeofTab = js.native
    @scala.inline
    def Tab_=(x: TypeofTab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs.defaultProps")
    @js.native
    def defaultProps: PartialITabsProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialITabsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(hasSelectedTabId: ITabsProps): SelectedTabId | Null = js.native
  }
  
  @js.native
  trait ITabsProps extends IProps {
    
    /**
      * Whether the selected tab indicator should animate its movement.
      * @default true
      */
    var animate: js.UndefOr[Boolean] = js.native
    
    /**
      * Initial selected tab `id`, for uncontrolled usage.
      * Note that this prop refers only to `<Tab>` children; other types of elements are ignored.
      * @default first tab
      */
    var defaultSelectedTabId: js.UndefOr[TabId] = js.native
    
    /**
      * Unique identifier for this `Tabs` container. This will be combined with the `id` of each
      * `Tab` child to generate ARIA accessibility attributes. IDs are required and should be
      * unique on the page to support server-side rendering.
      */
    var id: TabId = js.native
    
    /**
      * If set to `true`, the tab titles will display with larger styling.
      * This will apply large styles only to the tabs at this level, not to nested tabs.
      * @default false
      */
    var large: js.UndefOr[Boolean] = js.native
    
    /**
      * A callback function that is invoked when a tab in the tab list is clicked.
      */
    var onChange: js.UndefOr[
        js.Function3[
          /* newTabId */ TabId, 
          /* prevTabId */ js.UndefOr[TabId], 
          /* event */ SyntheticMouseEvent[HTMLElement], 
          Unit
        ]
      ] = js.native
    
    /**
      * Whether inactive tab panels should be removed from the DOM and unmounted in React.
      * This can be a performance enhancement when rendering many complex panels, but requires
      * careful support for unmounting and remounting.
      * @default false
      */
    var renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Selected tab `id`, for controlled usage.
      * Providing this prop will put the component in controlled mode.
      * Unknown ids will result in empty selection (no errors).
      */
    var selectedTabId: js.UndefOr[TabId] = js.native
    
    /**
      * Whether to show tabs stacked vertically on the left side.
      * @default false
      */
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object ITabsProps {
    
    @scala.inline
    def apply(id: TabId): ITabsProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITabsProps]
    }
    
    @scala.inline
    implicit class ITabsPropsMutableBuilder[Self <: ITabsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setDefaultSelectedTabId(value: TabId): Self = StObject.set(x, "defaultSelectedTabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedTabIdUndefined: Self = StObject.set(x, "defaultSelectedTabId", js.undefined)
      
      @scala.inline
      def setId(value: TabId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* newTabId */ TabId, /* prevTabId */ js.UndefOr[TabId], /* event */ SyntheticMouseEvent[HTMLElement]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRenderActiveTabPanelOnly(value: Boolean): Self = StObject.set(x, "renderActiveTabPanelOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderActiveTabPanelOnlyUndefined: Self = StObject.set(x, "renderActiveTabPanelOnly", js.undefined)
      
      @scala.inline
      def setSelectedTabId(value: TabId): Self = StObject.set(x, "selectedTabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedTabIdUndefined: Self = StObject.set(x, "selectedTabId", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait ITabsState extends StObject {
    
    var indicatorWrapperStyle: js.UndefOr[CSSProperties] = js.native
    
    var selectedTabId: js.UndefOr[TabId] = js.native
  }
  object ITabsState {
    
    @scala.inline
    def apply(): ITabsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITabsState]
    }
    
    @scala.inline
    implicit class ITabsStateMutableBuilder[Self <: ITabsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndicatorWrapperStyle(value: CSSProperties): Self = StObject.set(x, "indicatorWrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorWrapperStyleUndefined: Self = StObject.set(x, "indicatorWrapperStyle", js.undefined)
      
      @scala.inline
      def setSelectedTabId(value: TabId): Self = StObject.set(x, "selectedTabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedTabIdUndefined: Self = StObject.set(x, "selectedTabId", js.undefined)
    }
  }
}
