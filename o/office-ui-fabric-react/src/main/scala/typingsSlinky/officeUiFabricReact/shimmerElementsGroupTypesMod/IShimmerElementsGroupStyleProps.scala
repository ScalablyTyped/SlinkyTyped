package typingsSlinky.officeUiFabricReact.shimmerElementsGroupTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerElementsGroupStyleProps extends js.Object {
  /**
    * Boolean flag to notify whether the root element needs to flex wrap.
    */
  var flexWrap: js.UndefOr[Boolean] = js.native
  /** Theme provided by High-Order Component. */
  var theme: ITheme = js.native
}

object IShimmerElementsGroupStyleProps {
  @scala.inline
  def apply(theme: ITheme): IShimmerElementsGroupStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerElementsGroupStyleProps]
  }
  @scala.inline
  implicit class IShimmerElementsGroupStylePropsOps[Self <: IShimmerElementsGroupStyleProps] (val x: Self) extends AnyVal {
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
    def withFlexWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(js.undefined)
        ret
    }
  }
  
}

