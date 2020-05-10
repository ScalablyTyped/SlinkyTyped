package typingsSlinky.officeUiFabricReact.calloutTypesMod

import typingsSlinky.officeUiFabricReact.positioningTypesMod.ICalloutPositionedInfo
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalloutContentStyleProps extends js.Object {
  /**
    * Background color for the beak and callout.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Width of Callout beak
    */
  var beakWidth: js.UndefOr[Double] = js.native
  /**
    * Max width for callout including borders.
    */
  var calloutMaxWidth: js.UndefOr[Double] = js.native
  /**
    * Width for callout including borders.
    */
  var calloutWidth: js.UndefOr[Double] = js.native
  /**
    * CSS class to apply to the callout.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Whether or not to clip content of the callout,
    * if it overflows vertically.
    */
  var overflowYHidden: js.UndefOr[Boolean] = js.native
  /**
    * Callout positioning data
    */
  var positions: js.UndefOr[ICalloutPositionedInfo] = js.native
  /**
    * Theme to apply to the calloutContent.
    */
  var theme: ITheme = js.native
}

object ICalloutContentStyleProps {
  @scala.inline
  def apply(theme: ITheme): ICalloutContentStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutContentStyleProps]
  }
  @scala.inline
  implicit class ICalloutContentStylePropsOps[Self <: ICalloutContentStyleProps] (val x: Self) extends AnyVal {
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
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBeakWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutWidth")(js.undefined)
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
    def withOverflowYHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowYHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowYHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowYHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withPositions(value: ICalloutPositionedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(js.undefined)
        ret
    }
  }
  
}

