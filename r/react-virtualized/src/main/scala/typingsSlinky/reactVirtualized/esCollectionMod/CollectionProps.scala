package typingsSlinky.reactVirtualized.esCollectionMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.esGridMod.ScrollParams
import typingsSlinky.reactVirtualized.esGridMod.SectionRenderedParams
import typingsSlinky.reactVirtualized.mod.Alignment
import typingsSlinky.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  var `aria-label`: js.UndefOr[String] = js.native
  /**
    * Outer height of Collection is set to "auto". This property should only be
    * used in conjunction with the WindowScroller HOC.
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  /**
    * Number of cells in Collection.
    */
  var cellCount: Double = js.native
  /**
    * Responsible for rendering a group of cells given their indices.
    * Should implement the following interface: ({
    *   cellSizeAndPositionGetter:Function,
    *   indices: Array<number>,
    *   cellRenderer: Function
    * }): Array<PropTypes.node>
    */
  var cellGroupRenderer: js.UndefOr[CollectionCellGroupRenderer] = js.native
  /**
    * Responsible for rendering a cell given an row and column index.
    * Should implement the following interface: ({ index: number, key: string, style: object }): PropTypes.element
    */
  var cellRenderer: CollectionCellRenderer = js.native
  /**
    * Callback responsible for returning size and offset/position information for a given cell (index).
    * ({ index: number }): { height: number, width: number, x: number, y: number }
    */
  var cellSizeAndPositionGetter: CollectionCellSizeAndPositionGetter = js.native
  /**
    * Optional custom CSS class name to attach to root Collection element.
    */
  var className: js.UndefOr[String] = js.native
  var height: Double = js.native
  var horizontalOverscanSize: js.UndefOr[Double] = js.native
  /**
    * Optional custom id to attach to root Collection element.
    */
  var id: js.UndefOr[String] = js.native
  var noContentRenderer: js.UndefOr[js.Function0[ReactElement]] = js.native
  /**
    * Callback invoked whenever the scroll offset changes within the inner
    * scrollable region: ({ clientHeight, clientWidth, scrollHeight, scrollLeft, scrollTop, scrollWidth }): void
    */
  var onScroll: js.UndefOr[js.Function1[/* params */ ScrollParams, _]] = js.native
  /**
    * Callback invoked with information about the section of the Collection
    * that was just rendered: ({ indices: Array<number> }): void
    */
  var onSectionRendered: js.UndefOr[js.Function1[/* params */ SectionRenderedParams, _]] = js.native
  /**
    * Horizontal offset
    */
  var scrollLeft: js.UndefOr[Double] = js.native
  /**
    * Controls the alignment of scrolled-to-cells. The default ("auto") scrolls
    * the least amount possible to ensure that the specified cell is fully
    * visible. Use "start" to always align cells to the top/left of the
    * Collection and "end" to align them bottom/right. Use "center" to align
    * specified cell in the middle of container.
    */
  var scrollToAlignment: js.UndefOr[Alignment] = js.native
  var scrollToCell: js.UndefOr[Double] = js.native
  /**
    * Vertical Offset
    */
  var scrollTop: js.UndefOr[Double] = js.native
  /**
    * Optionally override the size of the sections a Collection's cells are split into.
    */
  var sectionSize: js.UndefOr[Double] = js.native
  /**
    * Optional custom inline style to attach to root Collection element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  var verticalOverscanSize: js.UndefOr[Double] = js.native
  /**
    * Width of Collection; this property determines the number of visible
    * (vs virtualized) columns.
    */
  var width: Double = js.native
}

object CollectionProps {
  @scala.inline
  def apply(
    cellCount: Double,
    cellRenderer: /* params */ CollectionCellRendererParams => TagMod[Any],
    cellSizeAndPositionGetter: /* params */ Index => CollectionCellSizeAndPosition,
    height: Double,
    width: Double
  ): CollectionProps = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), cellSizeAndPositionGetter = js.Any.fromFunction1(cellSizeAndPositionGetter), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionProps]
  }
  @scala.inline
  implicit class CollectionPropsOps[Self <: CollectionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellRenderer(value: /* params */ CollectionCellRendererParams => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellSizeAndPositionGetter(value: /* params */ Index => CollectionCellSizeAndPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSizeAndPositionGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAria-label`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCellGroupRenderer(value: /* params */ CollectionCellGroupRendererParams => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellGroupRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellGroupRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellGroupRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalOverscanSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOverscanSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalOverscanSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOverscanSize")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withNoContentRenderer(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noContentRenderer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNoContentRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noContentRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* params */ ScrollParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSectionRendered(value: /* params */ SectionRenderedParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSectionRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSectionRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSectionRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToAlignment(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToCell(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToCell")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalOverscanSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOverscanSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalOverscanSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOverscanSize")(js.undefined)
        ret
    }
  }
  
}

