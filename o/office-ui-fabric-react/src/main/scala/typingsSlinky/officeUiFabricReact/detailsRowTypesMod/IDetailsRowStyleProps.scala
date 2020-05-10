package typingsSlinky.officeUiFabricReact.detailsRowTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRowProps, 'theme'>> & {  isSelected ? :boolean,   anySelected ? :boolean,   canSelect ? :boolean,   droppingClassName ? :string,   isCheckVisible ? :boolean,   isRowHeader ? :boolean,   checkboxCellClassName ? :string,   className ? :string,   compact ? :boolean,   cellStyleProps ? :office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.ICellStyleProps,   enableUpdateAnimations ? :boolean} */
@js.native
trait IDetailsRowStyleProps extends js.Object {
  /** Whether there are any rows in the list selected */
  var anySelected: js.UndefOr[Boolean] = js.native
  /** Whether this row can be selected */
  var canSelect: js.UndefOr[Boolean] = js.native
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  /** A class name from the checkbox cell, so proper styling can be targeted */
  var checkboxCellClassName: js.UndefOr[String] = js.native
  /** CSS class name for the component */
  var className: js.UndefOr[String] = js.native
  /** Is list in compact mode */
  var compact: js.UndefOr[Boolean] = js.native
  /** Class name of when this becomes a drop target. */
  var droppingClassName: js.UndefOr[String] = js.native
  /** Whether to animate updates */
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.native
  /** Is the checkbox visible */
  var isCheckVisible: js.UndefOr[Boolean] = js.native
  /** Is this a row header */
  var isRowHeader: js.UndefOr[Boolean] = js.native
  /** Whether the row is selected  */
  var isSelected: js.UndefOr[Boolean] = js.native
  var theme: ITheme = js.native
}

object IDetailsRowStyleProps {
  @scala.inline
  def apply(theme: ITheme): IDetailsRowStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowStyleProps]
  }
  @scala.inline
  implicit class IDetailsRowStylePropsOps[Self <: IDetailsRowStyleProps] (val x: Self) extends AnyVal {
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
    def withAnySelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anySelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnySelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anySelected")(js.undefined)
        ret
    }
    @scala.inline
    def withCanSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelect")(js.undefined)
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
    def withCheckboxCellClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxCellClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxCellClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxCellClassName")(js.undefined)
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
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withDroppingClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppingClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDroppingClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppingClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableUpdateAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUpdateAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableUpdateAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUpdateAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCheckVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCheckVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCheckVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCheckVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
  }
  
}

