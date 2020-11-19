package typingsSlinky.blueprintjsTable

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.blueprintjsCore.mod.AbstractComponent2
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsTable.anon.PartialITableQuadrantProp
import typingsSlinky.blueprintjsTable.gridMod.Grid
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", JSImport.Namespace)
@js.native
object tableQuadrantMod extends js.Object {
  
  @js.native
  trait ITableQuadrantProps extends IProps {
    
    /**
      * A callback that receives a `ref` to the quadrant's body-wrapping element. Will need to be
      * provided only for the MAIN quadrant, because that quadrant contains the main table body.
      */
    var bodyRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
    
    /**
      * A callback that renders either all of or just frozen sections of the table body.
      */
    def bodyRenderer(): ReactElement = js.native
    def bodyRenderer(
      quadrantType: js.UndefOr[scala.Nothing],
      showFrozenRowsOnly: js.UndefOr[scala.Nothing],
      showFrozenColumnsOnly: Boolean
    ): ReactElement = js.native
    def bodyRenderer(quadrantType: js.UndefOr[scala.Nothing], showFrozenRowsOnly: Boolean): ReactElement = js.native
    def bodyRenderer(
      quadrantType: js.UndefOr[scala.Nothing],
      showFrozenRowsOnly: Boolean,
      showFrozenColumnsOnly: Boolean
    ): ReactElement = js.native
    def bodyRenderer(quadrantType: QuadrantType): ReactElement = js.native
    def bodyRenderer(
      quadrantType: QuadrantType,
      showFrozenRowsOnly: js.UndefOr[scala.Nothing],
      showFrozenColumnsOnly: Boolean
    ): ReactElement = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Boolean): ReactElement = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Boolean, showFrozenColumnsOnly: Boolean): ReactElement = js.native
    
    /**
      * A callback that renders either all of or just the frozen section of the column header.
      */
    var columnHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenColumnsOnly */ js.UndefOr[Boolean], ReactElement]] = js.native
    
    /**
      * If `false`, hides the row headers and settings menu.
      * @default true
      */
    var enableRowHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * The grid computes sizes of cells, rows, or columns from the
      * configurable `columnWidths` and `rowHeights`.
      */
    var grid: Grid = js.native
    
    /**
      * A callback that renders the table menu (the rectangle in the top-left corner).
      */
    var menuRenderer: js.UndefOr[js.Function0[ReactElement]] = js.native
    
    /**
      * An optional callback invoked when the quadrant is scrolled via the scrollbar OR the trackpad/mouse wheel.
      * This callback really only makes sense for the MAIN quadrant, because that's the only quadrant whose
      * scrollbar is visible. Other quadrants should simply provide an `onWheel` callback.
      */
    var onScroll: js.UndefOr[EventHandler[SyntheticUIEvent[HTMLDivElement]]] = js.native
    
    /**
      * An optional callback invoked when the quadrant is scrolled via the trackpad/mouse wheel. This
      * callback should be provided for all quadrant types except MAIN, which should provide the more
      * generic `onScroll` callback.
      */
    var onWheel: js.UndefOr[EventHandler[SyntheticWheelEvent[HTMLDivElement]]] = js.native
    
    /**
      * A callback that receives a `ref` to the quadrant's outermost element.
      */
    var quadrantRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
    
    /**
      * The quadrant type. Informs the values of the parameters that will be passed to the
      * `render...` callbacks, assuming an expected stacking order of the four quadrants.
      */
    var quadrantType: js.UndefOr[QuadrantType] = js.native
    
    /**
      * A callback that renders either all of or just the frozen section of the row header.
      */
    var rowHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenRowsOnly */ js.UndefOr[Boolean], ReactElement]] = js.native
    
    /**
      * A callback that receives a `ref` to the quadrant's scroll-container element.
      */
    var scrollContainerRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
    
    /**
      * CSS styles to apply to the quadrant's outermost element.
      */
    var style: js.UndefOr[CSSProperties] = js.native
  }
  
  @js.native
  sealed trait QuadrantType extends js.Object
  @js.native
  object QuadrantType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[QuadrantType with String] = js.native
    
    /**
      * The left quadrant, containing row headers and frozen columns.
      */
    @js.native
    sealed trait LEFT extends QuadrantType
    /* "left" */ @js.native
    object LEFT extends TopLevel[LEFT with String]
    
    /**
      * The main quadrant beneath any frozen rows or columns.
      */
    @js.native
    sealed trait MAIN extends QuadrantType
    /* "main" */ @js.native
    object MAIN extends TopLevel[MAIN with String]
    
    /**
      * The top quadrant, containing column headers and frozen rows.
      */
    @js.native
    sealed trait TOP extends QuadrantType
    /* "top" */ @js.native
    object TOP extends TopLevel[TOP with String]
    
    /**
      * The top-left quadrant, containing the headers and cells common to both
      * the frozen columns and frozen rows.
      */
    @js.native
    sealed trait TOP_LEFT extends QuadrantType
    /* "top-left" */ @js.native
    object TOP_LEFT extends TopLevel[TOP_LEFT with String]
  }
  
  @js.native
  class TableQuadrant ()
    extends AbstractComponent2[ITableQuadrantProps, js.Object, js.Object] {
    
    var getQuadrantCssClass: js.Any = js.native
  }
  /* static members */
  @js.native
  object TableQuadrant extends js.Object {
    
    var defaultProps: PartialITableQuadrantProp = js.native
  }
}
