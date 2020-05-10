package typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod

import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.types.IDetailsHeaderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.types.IDetailsHeaderProps, 'className'> & {  isSelectAllHidden ? :boolean,   isAllSelected ? :boolean,   isResizingColumn ? :boolean,   isAllCollapsed ? :boolean,   isSizing ? :boolean,   isCheckboxHidden ? :boolean,   cellStyleProps ? :office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.ICellStyleProps} */
@js.native
trait IDetailsHeaderStyleProps extends js.Object {
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  var className: js.UndefOr[String] = js.native
  /** Are all columns collapsed */
  var isAllCollapsed: js.UndefOr[Boolean] = js.native
  /** Whether the "select all" checkbox is checked */
  var isAllSelected: js.UndefOr[Boolean] = js.native
  /** Whether checkbox is hidden  */
  var isCheckboxHidden: js.UndefOr[Boolean] = js.native
  /** Is column being resized */
  var isResizingColumn: js.UndefOr[Boolean] = js.native
  /** Whether to hide select all checkbox */
  var isSelectAllHidden: js.UndefOr[Boolean] = js.native
  /** Whether the header is sizing */
  var isSizing: js.UndefOr[Boolean] = js.native
  var theme: ITheme = js.native
}

object IDetailsHeaderStyleProps {
  @scala.inline
  def apply(theme: ITheme): IDetailsHeaderStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsHeaderStyleProps]
  }
  @scala.inline
  implicit class IDetailsHeaderStylePropsOps[Self <: IDetailsHeaderStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withIsAllCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAllCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAllSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAllSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCheckboxHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCheckboxHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCheckboxHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCheckboxHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResizingColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizingColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResizingColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizingColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelectAllHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectAllHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelectAllHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectAllHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSizing")(js.undefined)
        ret
    }
  }
  
}

