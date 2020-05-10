package typingsSlinky.officeUiFabricReact.detailsColumnTypesMod

import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsColumn.types.IDetailsColumnProps, 'theme' | 'cellStyleProps'>> & {  headerClassName ? :string,   isActionable ? :boolean,   isEmpty ? :boolean,   isIconVisible ? :boolean,   isPadded ? :boolean,   isIconOnly ? :boolean,   iconClassName ? :string,   transitionDurationDrag ? :number,   transitionDurationDrop ? :number} */
@js.native
trait IDetailsColumnStyleProps extends js.Object {
  var cellStyleProps: ICellStyleProps = js.native
  /**
    * Classname to provide for header region.
    */
  var headerClassName: js.UndefOr[String] = js.native
  /**
    * Classname to provide for the header's icon region.
    */
  var iconClassName: js.UndefOr[String] = js.native
  /**
    * Whether or not the column is actionable.
    */
  var isActionable: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the column contains contents.
    */
  var isEmpty: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the column has icon only content/
    */
  var isIconOnly: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the column has a visible icon.
    */
  var isIconVisible: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the column is padded.
    */
  var isPadded: js.UndefOr[Boolean] = js.native
  var theme: ITheme = js.native
  /**
    * CSS transition duration on drag event.
    */
  var transitionDurationDrag: js.UndefOr[Double] = js.native
  /**
    * CSS transition duration on drop event.
    */
  var transitionDurationDrop: js.UndefOr[Double] = js.native
}

object IDetailsColumnStyleProps {
  @scala.inline
  def apply(cellStyleProps: ICellStyleProps, theme: ITheme): IDetailsColumnStyleProps = {
    val __obj = js.Dynamic.literal(cellStyleProps = cellStyleProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsColumnStyleProps]
  }
  @scala.inline
  implicit class IDetailsColumnStylePropsOps[Self <: IDetailsColumnStyleProps] (val x: Self) extends AnyVal {
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
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsActionable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActionable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsActionable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActionable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIconOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIconOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIconOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIconOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIconVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIconVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIconVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIconVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPadded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPadded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPadded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPadded")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDurationDrag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDurationDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDurationDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDurationDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDurationDrop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDurationDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDurationDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDurationDrop")(js.undefined)
        ret
    }
  }
  
}

