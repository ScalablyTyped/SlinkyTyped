package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'className'> & {  isHorizontalConstrained ? :boolean,   compact ? :boolean,   isFixed ? :boolean} */
@js.native
trait IDetailsListStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  /** Whether the list is in compact mode */
  var compact: js.UndefOr[Boolean] = js.native
  /** Whether the list is fixed in size */
  var isFixed: js.UndefOr[Boolean] = js.native
  /** Whether the list is horizontally constrained */
  var isHorizontalConstrained: js.UndefOr[Boolean] = js.native
  var theme: ITheme = js.native
}

object IDetailsListStyleProps {
  @scala.inline
  def apply(theme: ITheme): IDetailsListStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListStyleProps]
  }
  @scala.inline
  implicit class IDetailsListStylePropsOps[Self <: IDetailsListStyleProps] (val x: Self) extends AnyVal {
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
    def withIsFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHorizontalConstrained(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontalConstrained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHorizontalConstrained: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontalConstrained")(js.undefined)
        ret
    }
  }
  
}

