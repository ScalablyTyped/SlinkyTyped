package typingsSlinky.blueprintjsTable.anon

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.blueprintjsTable.gridMod.Grid
import typingsSlinky.blueprintjsTable.tableQuadrantMod.QuadrantType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/quadrants/tableQuadrant.ITableQuadrantProps> */
@js.native
trait PartialITableQuadrantProp extends js.Object {
  var bodyRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  var bodyRenderer: js.UndefOr[
    js.Function3[
      /* quadrantType */ js.UndefOr[QuadrantType], 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      ReactElement
    ]
  ] = js.native
  var className: js.UndefOr[String] = js.native
  var columnHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenColumnsOnly */ js.UndefOr[Boolean], ReactElement]] = js.native
  var enableRowHeader: js.UndefOr[Boolean] = js.native
  var grid: js.UndefOr[Grid] = js.native
  var menuRenderer: js.UndefOr[js.Function0[ReactElement]] = js.native
  var onScroll: js.UndefOr[EventHandler[SyntheticUIEvent[HTMLDivElement]]] = js.native
  var onWheel: js.UndefOr[EventHandler[SyntheticWheelEvent[HTMLDivElement]]] = js.native
  var quadrantRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  var quadrantType: js.UndefOr[QuadrantType] = js.native
  var rowHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenRowsOnly */ js.UndefOr[Boolean], ReactElement]] = js.native
  var scrollContainerRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object PartialITableQuadrantProp {
  @scala.inline
  def apply(): PartialITableQuadrantProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITableQuadrantProp]
  }
  @scala.inline
  implicit class PartialITableQuadrantPropOps[Self <: PartialITableQuadrantProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyRef(value: /* ref */ HTMLElement | Null => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBodyRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRef")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyRenderer(
      value: (/* quadrantType */ js.UndefOr[QuadrantType], /* showFrozenRowsOnly */ js.UndefOr[Boolean], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRenderer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBodyRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRenderer")(js.undefined)
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
    def withColumnHeaderCellRenderer(value: /* showFrozenColumnsOnly */ js.UndefOr[Boolean] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnHeaderCellRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderCellRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Grid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuRenderer(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuRenderer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMenuRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): Self = {
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
    def withOnWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withQuadrantRef(value: /* ref */ HTMLElement | Null => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadrantRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQuadrantRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadrantRef")(js.undefined)
        ret
    }
    @scala.inline
    def withQuadrantType(value: QuadrantType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadrantType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuadrantType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadrantType")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeaderCellRenderer(value: /* showFrozenRowsOnly */ js.UndefOr[Boolean] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowHeaderCellRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderCellRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollContainerRef(value: /* ref */ HTMLElement | Null => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollContainerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollContainerRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollContainerRef")(js.undefined)
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
  }
  
}

