package typingsSlinky.blueprintjsTable.rowHeaderCellMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsTable.headerCellMod.IHeaderCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowHeaderCellProps extends IHeaderCellProps {
  /**
    * Specifies if the row is reorderable.
    */
  var enableRowReordering: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the full row is part of a selection.
    */
  var isRowSelected: js.UndefOr[Boolean] = js.native
  /**
    * A callback to override the default name rendering behavior. The default
    * behavior is to simply use the `RowHeaderCell`s name prop.
    *
    * This render callback can be used, for example, to provide a
    * `EditableName` component for editing row names.
    *
    * The callback will also receive the row index if an `index` was originally
    * provided via props.
    */
  var nameRenderer: js.UndefOr[js.Function2[/* name */ String, /* index */ js.UndefOr[Double], ReactElement]] = js.native
}

object IRowHeaderCellProps {
  @scala.inline
  def apply(): IRowHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowHeaderCellProps]
  }
  @scala.inline
  implicit class IRowHeaderCellPropsOps[Self <: IRowHeaderCellProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableRowReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRowSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRowSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withNameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameRenderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNameRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameRenderer")(js.undefined)
        ret
    }
  }
  
}

