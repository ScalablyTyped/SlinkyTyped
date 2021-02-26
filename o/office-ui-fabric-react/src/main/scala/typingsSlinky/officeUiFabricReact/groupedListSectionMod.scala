package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.anon.Callback
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typingsSlinky.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typingsSlinky.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedListStyles
import typingsSlinky.officeUiFabricReact.listTypesMod.IListProps
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.Component
import typingsSlinky.uifabricMergeStyles.istylesetMod.IProcessedStyleSet
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupedListSectionMod {
  
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedListSection", "GroupedListSection")
  @js.native
  class GroupedListSection protected ()
    extends Component[IGroupedListSectionProps, IGroupedListSectionState, js.Any] {
    def this(props: IGroupedListSectionProps) = this()
    
    var _dragDropSubscription: js.Any = js.native
    
    var _droppingClassName: js.Any = js.native
    
    var _events: js.Any = js.native
    
    /**
      * get the correct css class to reflect the dropping state for a given group
      *
      * If the group is the current drop target, return the default dropping class name
      * Otherwise, return '';
      *
      */
    var _getDroppingClassName: js.Any = js.native
    
    /**
      * collect all the data we need to enable drag/drop for a group
      */
    var _getGroupDragDropOptions: js.Any = js.native
    
    var _getGroupKey: js.Any = js.native
    
    var _id: js.Any = js.native
    
    var _list: js.Any = js.native
    
    var _onRenderGroup: js.Any = js.native
    
    var _onRenderGroupCell: js.Any = js.native
    
    var _onRenderGroupFooter: js.Any = js.native
    
    var _onRenderGroupHeader: js.Any = js.native
    
    var _onRenderGroupShowAll: js.Any = js.native
    
    var _onSelectionChange: js.Any = js.native
    
    var _renderSubGroup: js.Any = js.native
    
    var _returnOne: js.Any = js.native
    
    var _root: js.Any = js.native
    
    var _subGroupRefs: js.Any = js.native
    
    /**
      * update groupIsDropping state based on the input value, which is used to change style during drag and drop
      *
      * @param newValue - new isDropping state value
      * @param event - the event trigger dropping state change which can be dragenter, dragleave etc
      */
    var _updateDroppingState: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MGroupedListSection(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MGroupedListSection(previousProps: IGroupedListSectionProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MGroupedListSection(): Unit = js.native
    
    def forceListUpdate(): Unit = js.native
  }
  
  @js.native
  trait IGroupedListSectionProps extends ClassAttributes[GroupedListSection] {
    
    /** Whether to render in compact mode */
    var compact: js.UndefOr[Boolean] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Map of callback functions related to drag and drop functionality. */
    var dragDropEvents: js.UndefOr[IDragDropEvents] = js.native
    
    /** helper to manage drag/drop across item rows and groups */
    var dragDropHelper: js.UndefOr[IDragDropHelper] = js.native
    
    /** Event names and corresponding callbacks that will be registered to the group and the rendered elements */
    var eventsToRegister: js.UndefOr[js.Array[Callback]] = js.native
    
    /** Information to pass in to the group footer. */
    var footerProps: js.UndefOr[IGroupFooterProps] = js.native
    
    /** Grouping item limit. */
    var getGroupItemLimit: js.UndefOr[js.Function1[/* group */ IGroup, Double]] = js.native
    
    /** Optional grouping instructions. */
    var group: js.UndefOr[IGroup] = js.native
    
    /** Optional grouping instructions. */
    var groupIndex: js.UndefOr[Double] = js.native
    
    /** Optional group nesting level. */
    var groupNestingDepth: js.UndefOr[Double] = js.native
    
    /** Optional override properties to render groups. */
    var groupProps: js.UndefOr[IGroupRenderProps] = js.native
    
    /** GroupedList resolved class names */
    var groupedListClassNames: js.UndefOr[IProcessedStyleSet[IGroupedListStyles]] = js.native
    
    /** Stores parent group's children. */
    var groups: js.UndefOr[js.Array[IGroup]] = js.native
    
    /** Information to pass in to the group header. */
    var headerProps: js.UndefOr[IGroupHeaderProps] = js.native
    
    /** List of items to render. */
    var items: js.Array[_] = js.native
    
    /** Optional list props to pass to list renderer.  */
    var listProps: js.UndefOr[IListProps[_]] = js.native
    
    /** Rendering callback to render the group items. */
    def onRenderCell(): ReactElement = js.native
    def onRenderCell(nestingDepth: js.UndefOr[scala.Nothing], item: js.UndefOr[scala.Nothing], index: Double): ReactElement = js.native
    def onRenderCell(nestingDepth: js.UndefOr[scala.Nothing], item: js.Any): ReactElement = js.native
    def onRenderCell(nestingDepth: js.UndefOr[scala.Nothing], item: js.Any, index: Double): ReactElement = js.native
    def onRenderCell(nestingDepth: Double): ReactElement = js.native
    def onRenderCell(nestingDepth: Double, item: js.UndefOr[scala.Nothing], index: Double): ReactElement = js.native
    def onRenderCell(nestingDepth: Double, item: js.Any): ReactElement = js.native
    def onRenderCell(nestingDepth: Double, item: js.Any, index: Double): ReactElement = js.native
    
    /** Override for rendering the group footer. */
    var onRenderGroupFooter: js.UndefOr[IRenderFunction[IGroupFooterProps]] = js.native
    
    /** Override for rendering the group header. */
    var onRenderGroupHeader: js.UndefOr[IRenderFunction[IGroupHeaderProps]] = js.native
    
    /** Override for rendering the group Show All link. */
    var onRenderGroupShowAll: js.UndefOr[IRenderFunction[IGroupShowAllProps]] = js.native
    
    /**
      * Optional callback to determine whether the list should be rendered in full, or virtualized.
      * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
      * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for
      * smaller lists.
      * The default implementation will virtualize when this callback is not provided.
      */
    var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[_], Boolean]] = js.native
    
    /** Optional selection model to track selection state.  */
    var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
    
    /** Controls how/if the details list manages selection. */
    var selectionMode: js.UndefOr[SelectionMode] = js.native
    
    /** Information to pass in to the group Show All footer. */
    var showAllProps: js.UndefOr[IGroupShowAllProps] = js.native
    
    /** Optional Viewport, provided by the parent component. */
    var viewport: js.UndefOr[IViewport] = js.native
  }
  
  @js.native
  trait IGroupedListSectionState extends StObject {
    
    var isDropping: js.UndefOr[Boolean] = js.native
    
    var isSelected: js.UndefOr[Boolean] = js.native
  }
  object IGroupedListSectionState {
    
    @scala.inline
    def apply(): IGroupedListSectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupedListSectionState]
    }
    
    @scala.inline
    implicit class IGroupedListSectionStateMutableBuilder[Self <: IGroupedListSectionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDropping(value: Boolean): Self = StObject.set(x, "isDropping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDroppingUndefined: Self = StObject.set(x, "isDropping", js.undefined)
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    }
  }
}
