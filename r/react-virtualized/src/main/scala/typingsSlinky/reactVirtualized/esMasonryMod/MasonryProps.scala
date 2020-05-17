package typingsSlinky.reactVirtualized.esMasonryMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.anon.ClientHeight
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheInterface
import typingsSlinky.reactVirtualized.esCellMeasurerMod.KeyMapper
import typingsSlinky.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasonryProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  var autoHeight: Boolean = js.native
  var cellCount: Double = js.native
  var cellMeasurerCache: CellMeasurerCacheInterface = js.native
  var cellPositioner: Positioner = js.native
  var cellRenderer: CellRenderer = js.native
  var className: js.UndefOr[String] = js.native
  var height: Double = js.native
  var id: js.UndefOr[String] = js.native
  var keyMapper: js.UndefOr[KeyMapper] = js.native
  var onCellsRendered: js.UndefOr[OnCellsRenderedCallback] = js.native
  var onScroll: js.UndefOr[OnScrollCallback] = js.native
  var overscanByPixels: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tabIndex: js.UndefOr[Double | Null] = js.native
  var width: Double = js.native
}

object MasonryProps {
  @scala.inline
  def apply(
    autoHeight: Boolean,
    cellCount: Double,
    cellMeasurerCache: CellMeasurerCacheInterface,
    cellPositioner: Positioner,
    cellRenderer: /* props */ MasonryCellProps => TagMod[Any],
    height: Double,
    width: Double
  ): MasonryProps = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], cellCount = cellCount.asInstanceOf[js.Any], cellMeasurerCache = cellMeasurerCache.asInstanceOf[js.Any], cellPositioner = cellPositioner.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryProps]
  }
  @scala.inline
  implicit class MasonryPropsOps[Self <: MasonryProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellMeasurerCache(value: CellMeasurerCacheInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMeasurerCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellPositioner(value: Positioner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPositioner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellRenderer(value: /* props */ MasonryCellProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(js.Any.fromFunction1(value))
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
    def withKeyMapper(value: (/* rowIndex */ Double, /* columnIndex */ Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMapper")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeyMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMapper")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellsRendered(value: /* params */ IndexRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellsRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellsRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellsRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* params */ ClientHeight => Unit): Self = {
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
    def withOverscanByPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanByPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanByPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanByPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollingResetTimeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingResetTimeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollingResetTimeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingResetTimeInterval")(js.undefined)
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
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(null)
        ret
    }
  }
  
}

