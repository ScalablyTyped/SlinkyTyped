package typingsSlinky.baseui

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutGridMod {
  
  @js.native
  sealed trait ALIGNMENT extends StObject
  @JSImport("baseui/layout-grid", "ALIGNMENT")
  @js.native
  object ALIGNMENT extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ALIGNMENT with String] = js.native
    
    @js.native
    sealed trait center extends ALIGNMENT
    /* "center" */ val center: typingsSlinky.baseui.layoutGridMod.ALIGNMENT.center with String = js.native
    
    @js.native
    sealed trait end extends ALIGNMENT
    /* "flex-end" */ val end: typingsSlinky.baseui.layoutGridMod.ALIGNMENT.end with String = js.native
    
    @js.native
    sealed trait start extends ALIGNMENT
    /* "flex-start" */ val start: typingsSlinky.baseui.layoutGridMod.ALIGNMENT.start with String = js.native
  }
  
  @js.native
  sealed trait BEHAVIOR extends StObject
  @JSImport("baseui/layout-grid", "BEHAVIOR")
  @js.native
  object BEHAVIOR extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BEHAVIOR with String] = js.native
    
    @js.native
    sealed trait fixed extends BEHAVIOR
    /* "fixed" */ val fixed: typingsSlinky.baseui.layoutGridMod.BEHAVIOR.fixed with String = js.native
    
    @js.native
    sealed trait fluid extends BEHAVIOR
    /* "fluid" */ val fluid: typingsSlinky.baseui.layoutGridMod.BEHAVIOR.fluid with String = js.native
  }
  
  @JSImport("baseui/layout-grid", "Cell")
  @js.native
  val Cell: ReactComponentClass[CellProps] = js.native
  
  @JSImport("baseui/layout-grid", "Grid")
  @js.native
  val Grid: ReactComponentClass[GridProps] = js.native
  
  @JSImport("baseui/layout-grid", "StyledCell")
  @js.native
  val StyledCell: StyletronComponent[StyledCellProps] = js.native
  
  @JSImport("baseui/layout-grid", "StyledGrid")
  @js.native
  val StyledGrid: StyletronComponent[StyledGridProps] = js.native
  
  @js.native
  trait CellOverrides extends StObject {
    
    var Cell: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object CellOverrides {
    
    @scala.inline
    def apply(): CellOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellOverrides]
    }
    
    @scala.inline
    implicit class CellOverridesMutableBuilder[Self <: CellOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "Cell", js.undefined)
    }
  }
  
  @js.native
  trait CellProps extends StObject {
    
    var align: js.UndefOr[Responsive[ALIGNMENT]] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var order: js.UndefOr[Responsive[Double]] = js.native
    
    var overrides: js.UndefOr[CellOverrides] = js.native
    
    var skip: js.UndefOr[Responsive[Double]] = js.native
    
    var span: js.UndefOr[Responsive[Double]] = js.native
  }
  object CellProps {
    
    @scala.inline
    def apply(): CellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps]
    }
    
    @scala.inline
    implicit class CellPropsMutableBuilder[Self <: CellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Responsive[ALIGNMENT]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAlignVarargs(value: ALIGNMENT*): Self = StObject.set(x, "align", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOrder(value: Responsive[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: Double*): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setOverrides(value: CellOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSkip(value: Responsive[Double]): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSkipVarargs(value: Double*): Self = StObject.set(x, "skip", js.Array(value :_*))
      
      @scala.inline
      def setSpan(value: Responsive[Double]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setSpanVarargs(value: Double*): Self = StObject.set(x, "span", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GridOverrides extends StObject {
    
    var Grid: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object GridOverrides {
    
    @scala.inline
    def apply(): GridOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridOverrides]
    }
    
    @scala.inline
    implicit class GridOverridesMutableBuilder[Self <: GridOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrid(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "Grid", js.undefined)
    }
  }
  
  @js.native
  trait GridProps extends StObject {
    
    var align: js.UndefOr[Responsive[ALIGNMENT]] = js.native
    
    var behavior: js.UndefOr[BEHAVIOR] = js.native
    
    var children: ReactElement = js.native
    
    var gridColumns: js.UndefOr[Responsive[Double]] = js.native
    
    var gridGaps: js.UndefOr[Responsive[Double]] = js.native
    
    var gridGutters: js.UndefOr[Responsive[Double]] = js.native
    
    var gridMargins: js.UndefOr[Responsive[Double]] = js.native
    
    var gridMaxWidth: js.UndefOr[Double] = js.native
    
    var gridUnit: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
      ] = js.native
    
    var overrides: js.UndefOr[GridOverrides] = js.native
  }
  object GridProps {
    
    @scala.inline
    def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    @scala.inline
    implicit class GridPropsMutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Responsive[ALIGNMENT]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAlignVarargs(value: ALIGNMENT*): Self = StObject.set(x, "align", js.Array(value :_*))
      
      @scala.inline
      def setBehavior(value: BEHAVIOR): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setGridColumns(value: Responsive[Double]): Self = StObject.set(x, "gridColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnsUndefined: Self = StObject.set(x, "gridColumns", js.undefined)
      
      @scala.inline
      def setGridColumnsVarargs(value: Double*): Self = StObject.set(x, "gridColumns", js.Array(value :_*))
      
      @scala.inline
      def setGridGaps(value: Responsive[Double]): Self = StObject.set(x, "gridGaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridGapsUndefined: Self = StObject.set(x, "gridGaps", js.undefined)
      
      @scala.inline
      def setGridGapsVarargs(value: Double*): Self = StObject.set(x, "gridGaps", js.Array(value :_*))
      
      @scala.inline
      def setGridGutters(value: Responsive[Double]): Self = StObject.set(x, "gridGutters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridGuttersUndefined: Self = StObject.set(x, "gridGutters", js.undefined)
      
      @scala.inline
      def setGridGuttersVarargs(value: Double*): Self = StObject.set(x, "gridGutters", js.Array(value :_*))
      
      @scala.inline
      def setGridMargins(value: Responsive[Double]): Self = StObject.set(x, "gridMargins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridMarginsUndefined: Self = StObject.set(x, "gridMargins", js.undefined)
      
      @scala.inline
      def setGridMarginsVarargs(value: Double*): Self = StObject.set(x, "gridMargins", js.Array(value :_*))
      
      @scala.inline
      def setGridMaxWidth(value: Double): Self = StObject.set(x, "gridMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridMaxWidthUndefined: Self = StObject.set(x, "gridMaxWidth", js.undefined)
      
      @scala.inline
      def setGridUnit(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
      ): Self = StObject.set(x, "gridUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUnitUndefined: Self = StObject.set(x, "gridUnit", js.undefined)
      
      @scala.inline
      def setOverrides(value: GridOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  type Responsive[T] = T | js.Array[T]
  
  @js.native
  trait StyledCellProps extends StObject {
    
    @JSName("$align")
    var $align: js.UndefOr[Responsive[ALIGNMENT]] = js.native
    
    @JSName("$gridColumns")
    var $gridColumns: js.UndefOr[Responsive[Double]] = js.native
    
    @JSName("$gridGaps")
    var $gridGaps: js.UndefOr[Responsive[Double]] = js.native
    
    @JSName("$gridGutters")
    var $gridGutters: js.UndefOr[Responsive[Double]] = js.native
    
    @JSName("$gridUnit")
    var $gridUnit: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
      ] = js.native
    
    @JSName("$order")
    var $order: js.UndefOr[Responsive[Double]] = js.native
    
    @JSName("$skip")
    var $skip: js.UndefOr[Responsive[Double]] = js.native
    
    @JSName("$span")
    var $span: js.UndefOr[Responsive[Double]] = js.native
  }
  object StyledCellProps {
    
    @scala.inline
    def apply(): StyledCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledCellProps]
    }
    
    @scala.inline
    implicit class StyledCellPropsMutableBuilder[Self <: StyledCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$align(value: Responsive[ALIGNMENT]): Self = StObject.set(x, "$align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$alignUndefined: Self = StObject.set(x, "$align", js.undefined)
      
      @scala.inline
      def set$alignVarargs(value: ALIGNMENT*): Self = StObject.set(x, "$align", js.Array(value :_*))
      
      @scala.inline
      def set$gridColumns(value: Responsive[Double]): Self = StObject.set(x, "$gridColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$gridColumnsUndefined: Self = StObject.set(x, "$gridColumns", js.undefined)
      
      @scala.inline
      def set$gridColumnsVarargs(value: Double*): Self = StObject.set(x, "$gridColumns", js.Array(value :_*))
      
      @scala.inline
      def set$gridGaps(value: Responsive[Double]): Self = StObject.set(x, "$gridGaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$gridGapsUndefined: Self = StObject.set(x, "$gridGaps", js.undefined)
      
      @scala.inline
      def set$gridGapsVarargs(value: Double*): Self = StObject.set(x, "$gridGaps", js.Array(value :_*))
      
      @scala.inline
      def set$gridGutters(value: Responsive[Double]): Self = StObject.set(x, "$gridGutters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$gridGuttersUndefined: Self = StObject.set(x, "$gridGutters", js.undefined)
      
      @scala.inline
      def set$gridGuttersVarargs(value: Double*): Self = StObject.set(x, "$gridGutters", js.Array(value :_*))
      
      @scala.inline
      def set$gridUnit(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
      ): Self = StObject.set(x, "$gridUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$gridUnitUndefined: Self = StObject.set(x, "$gridUnit", js.undefined)
      
      @scala.inline
      def set$order(value: Responsive[Double]): Self = StObject.set(x, "$order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$orderUndefined: Self = StObject.set(x, "$order", js.undefined)
      
      @scala.inline
      def set$orderVarargs(value: Double*): Self = StObject.set(x, "$order", js.Array(value :_*))
      
      @scala.inline
      def set$skip(value: Responsive[Double]): Self = StObject.set(x, "$skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$skipUndefined: Self = StObject.set(x, "$skip", js.undefined)
      
      @scala.inline
      def set$skipVarargs(value: Double*): Self = StObject.set(x, "$skip", js.Array(value :_*))
      
      @scala.inline
      def set$span(value: Responsive[Double]): Self = StObject.set(x, "$span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$spanUndefined: Self = StObject.set(x, "$span", js.undefined)
      
      @scala.inline
      def set$spanVarargs(value: Double*): Self = StObject.set(x, "$span", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StyledGridProps extends StObject {
    
    @JSName("$align")
    var $align: js.UndefOr[Responsive[ALIGNMENT]] = js.native
    
    @JSName("$behavior")
    var $behavior: js.UndefOr[BEHAVIOR] = js.native
    
    @JSName("$gridGutters")
    var $gridGutters: js.UndefOr[Responsive[Double]] = js.native
    
    @JSName("$gridMargins")
    var $gridMargins: js.UndefOr[Responsive[Double]] = js.native
    
    @JSName("$gridMaxWidth")
    var $gridMaxWidth: js.UndefOr[Double] = js.native
    
    @JSName("$gridUnit")
    var $gridUnit: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
      ] = js.native
  }
  object StyledGridProps {
    
    @scala.inline
    def apply(): StyledGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledGridProps]
    }
    
    @scala.inline
    implicit class StyledGridPropsMutableBuilder[Self <: StyledGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$align(value: Responsive[ALIGNMENT]): Self = StObject.set(x, "$align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$alignUndefined: Self = StObject.set(x, "$align", js.undefined)
      
      @scala.inline
      def set$alignVarargs(value: ALIGNMENT*): Self = StObject.set(x, "$align", js.Array(value :_*))
      
      @scala.inline
      def set$behavior(value: BEHAVIOR): Self = StObject.set(x, "$behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$behaviorUndefined: Self = StObject.set(x, "$behavior", js.undefined)
      
      @scala.inline
      def set$gridGutters(value: Responsive[Double]): Self = StObject.set(x, "$gridGutters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$gridGuttersUndefined: Self = StObject.set(x, "$gridGutters", js.undefined)
      
      @scala.inline
      def set$gridGuttersVarargs(value: Double*): Self = StObject.set(x, "$gridGutters", js.Array(value :_*))
      
      @scala.inline
      def set$gridMargins(value: Responsive[Double]): Self = StObject.set(x, "$gridMargins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$gridMarginsUndefined: Self = StObject.set(x, "$gridMargins", js.undefined)
      
      @scala.inline
      def set$gridMarginsVarargs(value: Double*): Self = StObject.set(x, "$gridMargins", js.Array(value :_*))
      
      @scala.inline
      def set$gridMaxWidth(value: Double): Self = StObject.set(x, "$gridMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$gridMaxWidthUndefined: Self = StObject.set(x, "$gridMaxWidth", js.undefined)
      
      @scala.inline
      def set$gridUnit(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
      ): Self = StObject.set(x, "$gridUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$gridUnitUndefined: Self = StObject.set(x, "$gridUnit", js.undefined)
    }
  }
}
