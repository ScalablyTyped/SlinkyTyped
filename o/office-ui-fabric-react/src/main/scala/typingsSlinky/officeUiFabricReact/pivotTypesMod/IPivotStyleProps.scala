package typingsSlinky.officeUiFabricReact.pivotTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Pivot/Pivot.types.IPivotProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Pivot/Pivot.types.IPivotProps, 'className'> & {  rootIsLarge ? :boolean,   rootIsTabs ? :boolean,   linkIsSelected ? :boolean} */
@js.native
trait IPivotStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  /**
    * Indicates whether Pivot link is selected.
    * @deprecated Is not populated with valid value. Specify `linkIsSelected` styling instead.
    */
  var linkIsSelected: js.UndefOr[Boolean] = js.native
  /** Indicates whether Pivot has large format. */
  var rootIsLarge: js.UndefOr[Boolean] = js.native
  /** Indicates whether Pivot has tabbed format. */
  var rootIsTabs: js.UndefOr[Boolean] = js.native
  var theme: ITheme = js.native
}

object IPivotStyleProps {
  @scala.inline
  def apply(theme: ITheme): IPivotStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPivotStyleProps]
  }
  @scala.inline
  implicit class IPivotStylePropsOps[Self <: IPivotStyleProps] (val x: Self) extends AnyVal {
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
    def withLinkIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkIsSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkIsSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withRootIsLarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIsLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootIsLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIsLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withRootIsTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIsTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootIsTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIsTabs")(js.undefined)
        ret
    }
  }
  
}

