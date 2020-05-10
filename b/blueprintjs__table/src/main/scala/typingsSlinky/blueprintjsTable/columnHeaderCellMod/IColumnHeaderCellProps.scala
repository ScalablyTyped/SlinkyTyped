package typingsSlinky.blueprintjsTable.columnHeaderCellMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.blueprintjsTable.headerCellMod.IHeaderCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.blueprintjsTable.columnHeaderCellMod.IColumnNameProps because var conflicts: name. Inlined nameRenderer */ @js.native
trait IColumnHeaderCellProps extends IHeaderCellProps {
  /**
    * Specifies if the column is reorderable.
    */
  var enableColumnReordering: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the full column is part of a selection.
    */
  var isColumnSelected: js.UndefOr[Boolean] = js.native
  /**
    * The icon name or element for the header's menu button.
    * @default "chevron-down"
    */
  var menuIcon: js.UndefOr[IconName | ReactElement] = js.native
  /**
    * A callback to override the default name rendering behavior. The default
    * behavior is to simply use the `ColumnHeaderCell`s name prop.
    *
    * This render callback can be used, for example, to provide a
    * `EditableName` component for editing column names.
    *
    * If you define this callback, we recommend you also set
    * `<Table enableColumnInteractionBar={true}>` to avoid issues with menus or selection.
    *
    * The callback will also receive the column index if an `index` was originally
    * provided via props.
    */
  var nameRenderer: js.UndefOr[js.Function2[/* name */ String, /* index */ js.UndefOr[Double], ReactElement]] = js.native
}

object IColumnHeaderCellProps {
  @scala.inline
  def apply(): IColumnHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnHeaderCellProps]
  }
  @scala.inline
  implicit class IColumnHeaderCellPropsOps[Self <: IColumnHeaderCellProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableColumnReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withIsColumnSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColumnSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsColumnSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColumnSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuIcon(value: IconName | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuIcon")(js.undefined)
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

