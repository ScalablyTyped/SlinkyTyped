package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.anon.ItemIndex
import typingsSlinky.officeUiFabricReact.detailsColumnBaseMod.DetailsColumnBase
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsColumnTypesMod {
  
  @js.native
  trait IDetailsColumnProps extends ClassAttributes[DetailsColumnBase] {
    
    /**
      * Custom styles for cell rendering.
      */
    var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
    
    /**
      * The column definition for the component instance.
      */
    var column: IColumn = js.native
    
    /**
      * The column index for the component instance.
      */
    var columnIndex: Double = js.native
    
    /**
      * A reference to the component instance.
      */
    var componentRef: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * The drag and drop helper for the component instance.
      */
    var dragDropHelper: js.UndefOr[IDragDropHelper | Null] = js.native
    
    /**
      * Whether or not the column can be re-ordered via drag and drop.
      */
    var isDraggable: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not the column has been dropped via drag and drop.
      */
    var isDropped: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback fired when click event occurs.
      */
    var onColumnClick: js.UndefOr[
        js.Function2[/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn, Unit]
      ] = js.native
    
    /**
      * Callback fired on contextual menu event to provide contextual menu UI.
      */
    var onColumnContextMenu: js.UndefOr[
        js.Function2[/* column */ IColumn, /* ev */ SyntheticMouseEvent[HTMLElement], Unit]
      ] = js.native
    
    /**
      * Render function for providing a column header tooltip.
      */
    var onRenderColumnHeaderTooltip: js.UndefOr[IRenderFunction[IDetailsColumnRenderTooltipProps]] = js.native
    
    /**
      * Parent ID used for accessibility label(s).
      */
    var parentId: js.UndefOr[String] = js.native
    
    /**
      * @deprecated use `updateDragInfo`
      */
    var setDraggedItemIndex: js.UndefOr[js.Function1[/* itemIndex */ Double, Unit]] = js.native
    
    /**
      * The component styles to respect during render.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]] = js.native
    
    /**
      * The theme object to respect during render.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * Callback on drag and drop event.
      */
    var updateDragInfo: js.UndefOr[js.Function2[/* props */ ItemIndex, /* event */ js.UndefOr[MouseEvent], Unit]] = js.native
    
    /**
      * Whether to use fast icon and check components. The icons can't be targeted by customization
      * but are still customizable via class names.
      * @defaultvalue true
      */
    var useFastIcons: js.UndefOr[Boolean] = js.native
  }
  object IDetailsColumnProps {
    
    @scala.inline
    def apply(column: IColumn, columnIndex: Double): IDetailsColumnProps = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsColumnProps]
    }
    
    @scala.inline
    implicit class IDetailsColumnPropsMutableBuilder[Self <: IDetailsColumnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
      
      @scala.inline
      def setColumn(value: IColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRef(value: () => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction0(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDragDropHelper(value: IDragDropHelper): Self = StObject.set(x, "dragDropHelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragDropHelperNull: Self = StObject.set(x, "dragDropHelper", null)
      
      @scala.inline
      def setDragDropHelperUndefined: Self = StObject.set(x, "dragDropHelper", js.undefined)
      
      @scala.inline
      def setIsDraggable(value: Boolean): Self = StObject.set(x, "isDraggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDraggableUndefined: Self = StObject.set(x, "isDraggable", js.undefined)
      
      @scala.inline
      def setIsDropped(value: Boolean): Self = StObject.set(x, "isDropped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDroppedUndefined: Self = StObject.set(x, "isDropped", js.undefined)
      
      @scala.inline
      def setOnColumnClick(value: (/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn) => Unit): Self = StObject.set(x, "onColumnClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnColumnClickUndefined: Self = StObject.set(x, "onColumnClick", js.undefined)
      
      @scala.inline
      def setOnColumnContextMenu(value: (/* column */ IColumn, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onColumnContextMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnColumnContextMenuUndefined: Self = StObject.set(x, "onColumnContextMenu", js.undefined)
      
      @scala.inline
      def setOnRenderColumnHeaderTooltip(
        value: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
              js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], ReactElement | Null]
            ]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderColumnHeaderTooltip", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderColumnHeaderTooltipUndefined: Self = StObject.set(x, "onRenderColumnHeaderTooltip", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setSetDraggedItemIndex(value: /* itemIndex */ Double => Unit): Self = StObject.set(x, "setDraggedItemIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDraggedItemIndexUndefined: Self = StObject.set(x, "setDraggedItemIndex", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDetailsColumnStyleProps => DeepPartial[IDetailsColumnStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUpdateDragInfo(value: (/* props */ ItemIndex, /* event */ js.UndefOr[MouseEvent]) => Unit): Self = StObject.set(x, "updateDragInfo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateDragInfoUndefined: Self = StObject.set(x, "updateDragInfo", js.undefined)
      
      @scala.inline
      def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFastIconsUndefined: Self = StObject.set(x, "useFastIcons", js.undefined)
    }
  }
  
  @js.native
  trait IDetailsColumnRenderTooltipProps extends ITooltipHostProps {
    
    /**
      * Information about the column for which the tooltip is being rendered.
      * Use this to format status information about the column, such as its filter or sort state.
      */
    var column: js.UndefOr[IColumn] = js.native
  }
  object IDetailsColumnRenderTooltipProps {
    
    @scala.inline
    def apply(): IDetailsColumnRenderTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsColumnRenderTooltipProps]
    }
    
    @scala.inline
    implicit class IDetailsColumnRenderTooltipPropsMutableBuilder[Self <: IDetailsColumnRenderTooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: IColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsColumn.types.IDetailsColumnProps, 'theme' | 'cellStyleProps'>> & {  headerClassName :string | undefined,   isActionable :boolean | undefined,   isEmpty :boolean | undefined,   isIconVisible :boolean | undefined,   isPadded :boolean | undefined,   isIconOnly :boolean | undefined,   iconClassName :string | undefined,   transitionDurationDrag :number | undefined,   transitionDurationDrop :number | undefined} */
  @js.native
  trait IDetailsColumnStyleProps extends StObject {
    
    var cellStyleProps: ICellStyleProps = js.native
    
    /**
      * Classname to provide for header region.
      */
    var headerClassName: js.UndefOr[String] = js.native
    
    /**
      * Classname to provide for the header's icon region.
      */
    var iconClassName: js.UndefOr[String] = js.native
    
    /**
      * Whether or not the column is actionable.
      */
    var isActionable: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not the column contains contents.
      */
    var isEmpty: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not the column has icon only content/
      */
    var isIconOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not the column has a visible icon.
      */
    var isIconVisible: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not the column is padded.
      */
    var isPadded: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
    
    /**
      * CSS transition duration on drag event.
      */
    var transitionDurationDrag: js.UndefOr[Double] = js.native
    
    /**
      * CSS transition duration on drop event.
      */
    var transitionDurationDrop: js.UndefOr[Double] = js.native
  }
  object IDetailsColumnStyleProps {
    
    @scala.inline
    def apply(cellStyleProps: ICellStyleProps, theme: ITheme): IDetailsColumnStyleProps = {
      val __obj = js.Dynamic.literal(cellStyleProps = cellStyleProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsColumnStyleProps]
    }
    
    @scala.inline
    implicit class IDetailsColumnStylePropsMutableBuilder[Self <: IDetailsColumnStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      @scala.inline
      def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
      
      @scala.inline
      def setIsActionable(value: Boolean): Self = StObject.set(x, "isActionable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActionableUndefined: Self = StObject.set(x, "isActionable", js.undefined)
      
      @scala.inline
      def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      @scala.inline
      def setIsIconOnly(value: Boolean): Self = StObject.set(x, "isIconOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIconOnlyUndefined: Self = StObject.set(x, "isIconOnly", js.undefined)
      
      @scala.inline
      def setIsIconVisible(value: Boolean): Self = StObject.set(x, "isIconVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIconVisibleUndefined: Self = StObject.set(x, "isIconVisible", js.undefined)
      
      @scala.inline
      def setIsPadded(value: Boolean): Self = StObject.set(x, "isPadded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPaddedUndefined: Self = StObject.set(x, "isPadded", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationDrag(value: Double): Self = StObject.set(x, "transitionDurationDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationDragUndefined: Self = StObject.set(x, "transitionDurationDrag", js.undefined)
      
      @scala.inline
      def setTransitionDurationDrop(value: Double): Self = StObject.set(x, "transitionDurationDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationDropUndefined: Self = StObject.set(x, "transitionDurationDrop", js.undefined)
    }
  }
  
  @js.native
  trait IDetailsColumnStyles extends StObject {
    
    /**
      * Styleable label region.
      */
    var accessibleLabel: IStyle = js.native
    
    /**
      * Styleable border region after drag & drop.
      */
    var borderAfterDropping: IStyle = js.native
    
    /**
      * Styleable border while drag & drop occurs.
      */
    var borderWhileDragging: IStyle = js.native
    
    /**
      * Styleable cell name region.
      */
    var cellName: IStyle = js.native
    
    /**
      * Styleable cell title region.
      */
    var cellTitle: IStyle = js.native
    
    /**
      * Styleable cell tooltip region.
      */
    var cellTooltip: IStyle = js.native
    
    /**
      * Styleable filter glyph.
      */
    var filterChevron: IStyle = js.native
    
    /**
      * Styleable resize glyph region.
      */
    var gripperBarVerticalStyle: IStyle = js.native
    
    /**
      * Styleable icon region.
      */
    var iconClassName: IStyle = js.native
    
    /**
      * Styleable margin by icon region.
      */
    var nearIcon: IStyle = js.native
    
    /**
      * Transparent no border region after drag & drop to avoid content shift.
      */
    var noBorderAfterDropping: IStyle = js.native
    
    /**
      * Transparent no border region while drag & drop occurs to avoid content shift.
      */
    var noBorderWhileDragging: IStyle = js.native
    
    /**
      * Styleable root region.
      */
    var root: IStyle = js.native
    
    /**
      * Styleable column sort icon region.
      */
    var sortIcon: IStyle = js.native
  }
  object IDetailsColumnStyles {
    
    @scala.inline
    def apply(): IDetailsColumnStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsColumnStyles]
    }
    
    @scala.inline
    implicit class IDetailsColumnStylesMutableBuilder[Self <: IDetailsColumnStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibleLabel(value: IStyle): Self = StObject.set(x, "accessibleLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleLabelNull: Self = StObject.set(x, "accessibleLabel", null)
      
      @scala.inline
      def setAccessibleLabelUndefined: Self = StObject.set(x, "accessibleLabel", js.undefined)
      
      @scala.inline
      def setBorderAfterDropping(value: IStyle): Self = StObject.set(x, "borderAfterDropping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderAfterDroppingNull: Self = StObject.set(x, "borderAfterDropping", null)
      
      @scala.inline
      def setBorderAfterDroppingUndefined: Self = StObject.set(x, "borderAfterDropping", js.undefined)
      
      @scala.inline
      def setBorderWhileDragging(value: IStyle): Self = StObject.set(x, "borderWhileDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWhileDraggingNull: Self = StObject.set(x, "borderWhileDragging", null)
      
      @scala.inline
      def setBorderWhileDraggingUndefined: Self = StObject.set(x, "borderWhileDragging", js.undefined)
      
      @scala.inline
      def setCellName(value: IStyle): Self = StObject.set(x, "cellName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellNameNull: Self = StObject.set(x, "cellName", null)
      
      @scala.inline
      def setCellNameUndefined: Self = StObject.set(x, "cellName", js.undefined)
      
      @scala.inline
      def setCellTitle(value: IStyle): Self = StObject.set(x, "cellTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellTitleNull: Self = StObject.set(x, "cellTitle", null)
      
      @scala.inline
      def setCellTitleUndefined: Self = StObject.set(x, "cellTitle", js.undefined)
      
      @scala.inline
      def setCellTooltip(value: IStyle): Self = StObject.set(x, "cellTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellTooltipNull: Self = StObject.set(x, "cellTooltip", null)
      
      @scala.inline
      def setCellTooltipUndefined: Self = StObject.set(x, "cellTooltip", js.undefined)
      
      @scala.inline
      def setFilterChevron(value: IStyle): Self = StObject.set(x, "filterChevron", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterChevronNull: Self = StObject.set(x, "filterChevron", null)
      
      @scala.inline
      def setFilterChevronUndefined: Self = StObject.set(x, "filterChevron", js.undefined)
      
      @scala.inline
      def setGripperBarVerticalStyle(value: IStyle): Self = StObject.set(x, "gripperBarVerticalStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGripperBarVerticalStyleNull: Self = StObject.set(x, "gripperBarVerticalStyle", null)
      
      @scala.inline
      def setGripperBarVerticalStyleUndefined: Self = StObject.set(x, "gripperBarVerticalStyle", js.undefined)
      
      @scala.inline
      def setIconClassName(value: IStyle): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassNameNull: Self = StObject.set(x, "iconClassName", null)
      
      @scala.inline
      def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
      
      @scala.inline
      def setNearIcon(value: IStyle): Self = StObject.set(x, "nearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearIconNull: Self = StObject.set(x, "nearIcon", null)
      
      @scala.inline
      def setNearIconUndefined: Self = StObject.set(x, "nearIcon", js.undefined)
      
      @scala.inline
      def setNoBorderAfterDropping(value: IStyle): Self = StObject.set(x, "noBorderAfterDropping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoBorderAfterDroppingNull: Self = StObject.set(x, "noBorderAfterDropping", null)
      
      @scala.inline
      def setNoBorderAfterDroppingUndefined: Self = StObject.set(x, "noBorderAfterDropping", js.undefined)
      
      @scala.inline
      def setNoBorderWhileDragging(value: IStyle): Self = StObject.set(x, "noBorderWhileDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoBorderWhileDraggingNull: Self = StObject.set(x, "noBorderWhileDragging", null)
      
      @scala.inline
      def setNoBorderWhileDraggingUndefined: Self = StObject.set(x, "noBorderWhileDragging", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSortIcon(value: IStyle): Self = StObject.set(x, "sortIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortIconNull: Self = StObject.set(x, "sortIcon", null)
      
      @scala.inline
      def setSortIconUndefined: Self = StObject.set(x, "sortIcon", js.undefined)
    }
  }
}
