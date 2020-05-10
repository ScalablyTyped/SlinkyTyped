package typingsSlinky.reactSortablePane.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactMotion.mod.SpringHelperConfig
import typingsSlinky.reactSortablePane.reactSortablePaneStrings.horizontal
import typingsSlinky.reactSortablePane.reactSortablePaneStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortablePaneProps extends js.Object {
  var children: js.Array[ReactElement] = js.native
  var className: js.UndefOr[String] = js.native
  var defaultOrder: js.UndefOr[js.Array[String]] = js.native
  var direction: js.UndefOr[horizontal | vertical] = js.native
  var disableEffect: js.UndefOr[Boolean] = js.native
  var dragHandleClassName: js.UndefOr[String] = js.native
  var isSortable: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[Double] = js.native
  var onDragStart: js.UndefOr[
    js.Function3[
      /* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], 
      /* key */ PaneKey, 
      /* elementRef */ HTMLElement, 
      Unit
    ]
  ] = js.native
  var onDragStop: js.UndefOr[
    js.Function4[
      /* e */ MouseEvent | TouchEvent, 
      /* key */ PaneKey, 
      /* elementRef */ HTMLElement, 
      /* order */ js.Array[String], 
      Unit
    ]
  ] = js.native
  var onOrderChange: js.UndefOr[js.Function1[/* order */ js.Array[String], Unit]] = js.native
  var onResize: js.UndefOr[
    js.Function5[
      /* e */ MouseEvent | TouchEvent, 
      /* key */ PaneKey, 
      /* dir */ PaneResizeDirection, 
      /* elementRef */ HTMLElement, 
      /* delta */ PaneSize, 
      Unit
    ]
  ] = js.native
  var onResizeStart: js.UndefOr[
    js.Function3[
      /* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], 
      /* key */ PaneKey, 
      /* dir */ PaneResizeDirection, 
      Unit
    ]
  ] = js.native
  var onResizeStop: js.UndefOr[
    js.Function5[
      /* e */ MouseEvent | TouchEvent, 
      /* key */ PaneKey, 
      /* dir */ PaneResizeDirection, 
      /* elementRef */ HTMLElement, 
      /* delta */ PaneSize, 
      Unit
    ]
  ] = js.native
  var order: js.UndefOr[js.Array[String]] = js.native
  var springConfig: js.UndefOr[SpringHelperConfig] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object SortablePaneProps {
  @scala.inline
  def apply(children: js.Array[ReactElement]): SortablePaneProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortablePaneProps]
  }
  @scala.inline
  implicit class SortablePanePropsOps[Self <: SortablePaneProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
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
    def withDefaultOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableEffect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withDragHandleClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandleClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragHandleClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandleClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(
      value: (/* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], /* key */ PaneKey, /* elementRef */ HTMLElement) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStop(
      value: (/* e */ MouseEvent | TouchEvent, /* key */ PaneKey, /* elementRef */ HTMLElement, /* order */ js.Array[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStop")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOrderChange(value: /* order */ js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrderChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOrderChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrderChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(
      value: (/* e */ MouseEvent | TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeStart(
      value: (/* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], /* key */ PaneKey, /* dir */ PaneResizeDirection) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnResizeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeStop(
      value: (/* e */ MouseEvent | TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStop")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnResizeStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStop")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withSpringConfig(value: SpringHelperConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(js.undefined)
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

