package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps because var conflicts: indentWidth, selectionMode, viewport. Inlined columns, groupNestingDepth, selection, checkboxVisibility, cellStyleProps, rowWidth */ @js.native
trait IDetailsGroupDividerProps extends IGroupDividerProps {
  /**
    * Rules for rendering column cells.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  /**
    * Checkbox visibility
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.native
  /**
    * Column metadata
    */
  var columns: js.UndefOr[js.Array[IColumn]] = js.native
  /**
    * Nesting depth of a grouping
    */
  var groupNestingDepth: js.UndefOr[Double] = js.native
  /**
    * Minimum width of the row.
    *
    * @defaultvalue 0
    */
  var rowWidth: js.UndefOr[Double] = js.native
  /**
    * Selection from utilities
    */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
}

object IDetailsGroupDividerProps {
  @scala.inline
  def apply(): IDetailsGroupDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsGroupDividerProps]
  }
  @scala.inline
  implicit class IDetailsGroupDividerPropsOps[Self <: IDetailsGroupDividerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellStyleProps(value: ICellStyleProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellStyleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxVisibility(value: CheckboxVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[IColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupNestingDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupNestingDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupNestingDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupNestingDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withRowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: ISelection[IObjectWithKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
  }
  
}

