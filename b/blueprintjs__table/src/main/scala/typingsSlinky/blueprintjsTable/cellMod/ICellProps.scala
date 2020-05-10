package typingsSlinky.blueprintjsTable.cellMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellProps
  extends IIntentProps
     with IProps {
  /**
    * A ref handle to capture the outer div of this cell. Used internally.
    */
  var cellRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
  /**
    * The column index of the cell. If provided, this will be passed as an argument to any callbacks
    * when they are invoked.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * If `true`, the cell will be rendered above overlay layers to enable mouse
    * interactions within the cell.
    * @default false
    */
  var interactive: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  /**
    * An optional native tooltip that is displayed on hover.
    * If `true`, content will be replaced with a fixed-height skeleton.
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.native
  /**
    * Callback invoked when the cell is focused and a key is pressed down.
    */
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  /**
    * Callback invoked when a character-key is pressed.
    */
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  /**
    * Callback invoked when the cell is focused and a key is released.
    */
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  /**
    * The row index of the cell. If provided, this will be passed as an argument to any callbacks
    * when they are invoked.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Allows for setting a tab index on the cell, so the cell can be browser-focusable.
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * An optional native tooltip that is displayed on hover.
    */
  var tooltip: js.UndefOr[String] = js.native
  /**
    * If `true`, the cell contents will be wrapped in a `div` with
    * styling that will prevent the content from overflowing the cell.
    * @default true
    */
  var truncated: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the cell contents will be wrapped in a `div` with
    * styling that will cause text to wrap, rather than displaying it on a single line.
    * @default false
    */
  var wrapText: js.UndefOr[Boolean] = js.native
}

object ICellProps {
  @scala.inline
  def apply(): ICellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICellProps]
  }
  @scala.inline
  implicit class ICellPropsOps[Self <: ICellProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellRef(value: /* ref */ HTMLElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRef")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUp(value: SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(js.undefined)
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
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapText")(js.undefined)
        ret
    }
  }
  
}

