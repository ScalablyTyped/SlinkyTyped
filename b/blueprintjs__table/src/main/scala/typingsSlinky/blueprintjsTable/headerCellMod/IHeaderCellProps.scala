package typingsSlinky.blueprintjsTable.headerCellMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsTable.resizeHandleMod.ResizeHandle
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeaderCellProps extends IProps {
  /**
    * The index of the cell in the header. If provided, this will be passed as an argument to any
    * callbacks when they are invoked.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * If `true`, will apply the active class to the header to indicate it is
    * part of an external operation.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the row/column `name` will be replaced with a fixed-height skeleton, and the
    * `resizeHandle` will not be rendered. If passing in additional children to this component, you
    * will also want to conditionally apply `Classes.SKELETON` where appropriate.
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.native
  /**
    * A callback that returns an element, like a `<Menu>`, which is displayed by right-clicking
    * anywhere in the header. The callback will receive the cell index if it was provided via
    * props.
    */
  var menuRenderer: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], ReactElement]] = js.native
  /**
    * The name displayed in the header of the row/column.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A `ReorderHandle` React component that allows users to drag-reorder the column header.
    */
  var reorderHandle: js.UndefOr[ReactElement] = js.native
  /**
    * A `ResizeHandle` React component that allows users to drag-resize the header.
    */
  var resizeHandle: js.UndefOr[ResizeHandle] = js.native
  /**
    * CSS styles for the top level element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
}

object IHeaderCellProps {
  @scala.inline
  def apply(): IHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeaderCellProps]
  }
  @scala.inline
  implicit class IHeaderCellPropsOps[Self <: IHeaderCellProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
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
    def withMenuRenderer(value: /* index */ js.UndefOr[Double] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMenuRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withReorderHandle(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReorderHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHandle(value: ResizeHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandle")(js.undefined)
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

