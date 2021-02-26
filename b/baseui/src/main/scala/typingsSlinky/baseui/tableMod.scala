package typingsSlinky.baseui

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.baseuiStrings.ASC
import typingsSlinky.baseui.baseuiStrings.DESC
import typingsSlinky.react.mod.Component
import typingsSlinky.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("baseui/table", "Filter")
  @js.native
  val Filter: ReactComponentClass[FilterProps] = js.native
  
  @js.native
  sealed trait SORT_DIRECTION extends StObject
  @JSImport("baseui/table", "SORT_DIRECTION")
  @js.native
  object SORT_DIRECTION extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SORT_DIRECTION with String] = js.native
    
    @js.native
    sealed trait ASC extends SORT_DIRECTION
    /* "ASC" */ val ASC: typingsSlinky.baseui.tableMod.SORT_DIRECTION.ASC with String = js.native
    
    @js.native
    sealed trait DESC extends SORT_DIRECTION
    /* "DESC" */ val DESC: typingsSlinky.baseui.tableMod.SORT_DIRECTION.DESC with String = js.native
  }
  
  @JSImport("baseui/table", "SortableHeadCell")
  @js.native
  val SortableHeadCell: ReactComponentClass[SortableHeadCellProps] = js.native
  
  @JSImport("baseui/table", "StyledAction")
  @js.native
  val StyledAction: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledCell")
  @js.native
  val StyledCell: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledFilterButton")
  @js.native
  val StyledFilterButton: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledFilterContent")
  @js.native
  val StyledFilterContent: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledFilterFooter")
  @js.native
  val StyledFilterFooter: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledFilterHeading")
  @js.native
  val StyledFilterHeading: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledHead")
  @js.native
  val StyledHead: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledHeadCell")
  @js.native
  val StyledHeadCell: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledRow")
  @js.native
  val StyledRow: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledSortableLabel")
  @js.native
  val StyledSortableLabel: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledTable")
  @js.native
  val StyledTable: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "Table")
  @js.native
  class Table protected ()
    extends Component[TableProps, js.Object, js.Any] {
    def this(props: TableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableProps, context: js.Any) = this()
  }
  
  @js.native
  trait FilterOverrides extends StObject {
    
    var Content: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Footer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Heading: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var MenuButton: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object FilterOverrides {
    
    @scala.inline
    def apply(): FilterOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterOverrides]
    }
    
    @scala.inline
    implicit class FilterOverridesMutableBuilder[Self <: FilterOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      @scala.inline
      def setFooter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "Footer", js.undefined)
      
      @scala.inline
      def setHeading(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingUndefined: Self = StObject.set(x, "Heading", js.undefined)
      
      @scala.inline
      def setMenuButton(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "MenuButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuButtonUndefined: Self = StObject.set(x, "MenuButton", js.undefined)
    }
  }
  
  @js.native
  trait FilterProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var children: ReactElement = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onReset: js.UndefOr[js.Function0[_]] = js.native
    
    var onSelectAll: js.UndefOr[js.Function0[_]] = js.native
    
    var overrides: js.UndefOr[FilterOverrides] = js.native
  }
  object FilterProps {
    
    @scala.inline
    def apply(): FilterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterProps]
    }
    
    @scala.inline
    implicit class FilterPropsMutableBuilder[Self <: FilterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnReset(value: () => _): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnSelectAll(value: () => _): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
      
      @scala.inline
      def setOverrides(value: FilterOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  @js.native
  trait SortableHeadCellOverrides extends StObject {
    
    var HeadCell: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var SortableLabel: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object SortableHeadCellOverrides {
    
    @scala.inline
    def apply(): SortableHeadCellOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortableHeadCellOverrides]
    }
    
    @scala.inline
    implicit class SortableHeadCellOverridesMutableBuilder[Self <: SortableHeadCellOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeadCell(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "HeadCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadCellUndefined: Self = StObject.set(x, "HeadCell", js.undefined)
      
      @scala.inline
      def setSortableLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "SortableLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableLabelUndefined: Self = StObject.set(x, "SortableLabel", js.undefined)
    }
  }
  
  @js.native
  trait SortableHeadCellProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var direction: ASC | DESC | Null = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var fillClickTarget: js.UndefOr[Boolean] = js.native
    
    var onSort: js.UndefOr[js.Function0[_]] = js.native
    
    var overrides: js.UndefOr[SortableHeadCellOverrides] = js.native
    
    var title: String = js.native
  }
  object SortableHeadCellProps {
    
    @scala.inline
    def apply(title: String): SortableHeadCellProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortableHeadCellProps]
    }
    
    @scala.inline
    implicit class SortableHeadCellPropsMutableBuilder[Self <: SortableHeadCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDirection(value: ASC | DESC): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionNull: Self = StObject.set(x, "direction", null)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFillClickTarget(value: Boolean): Self = StObject.set(x, "fillClickTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillClickTargetUndefined: Self = StObject.set(x, "fillClickTarget", js.undefined)
      
      @scala.inline
      def setOnSort(value: () => _): Self = StObject.set(x, "onSort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      @scala.inline
      def setOverrides(value: SortableHeadCellOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableProps extends StObject {
    
    var columns: js.Array[String | ReactElement] = js.native
    
    var data: js.Array[js.Array[ReactElement]] = js.native
    
    var horizontalScrollWidth: js.UndefOr[String] = js.native
    
    var isLoading: js.UndefOr[Boolean] = js.native
  }
  object TableProps {
    
    @scala.inline
    def apply(columns: js.Array[String | ReactElement], data: js.Array[js.Array[ReactElement]]): TableProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit class TablePropsMutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[String | ReactElement]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: (String | ReactElement)*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[js.Array[ReactElement]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Array[ReactElement]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHorizontalScrollWidth(value: String): Self = StObject.set(x, "horizontalScrollWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalScrollWidthUndefined: Self = StObject.set(x, "horizontalScrollWidth", js.undefined)
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    }
  }
}
