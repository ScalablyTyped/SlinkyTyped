package typingsSlinky.officeUiFabricReact.shimmerTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerStyleProps extends js.Object {
  /** Optional CSS class name for the component attached to the root stylable area. */
  var className: js.UndefOr[String] = js.native
  /** Boolean flag to trigger fadeIn/fadeOut transition animation when content is loaded. */
  var isDataLoaded: js.UndefOr[Boolean] = js.native
  /** Color to be used as the main background color of Shimmer when not animating. */
  var shimmerColor: js.UndefOr[String] = js.native
  /** Tip color of the shimmer wave which gradually gets from and to `shimmerColor`. */
  var shimmerWaveColor: js.UndefOr[String] = js.native
  /** Theme provided by High-Order Component. */
  var theme: ITheme = js.native
  /** Interval in milliseconds for the adeIn/fadeOut transition animation. */
  var transitionAnimationInterval: js.UndefOr[Double] = js.native
}

object IShimmerStyleProps {
  @scala.inline
  def apply(theme: ITheme): IShimmerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerStyleProps]
  }
  @scala.inline
  implicit class IShimmerStylePropsOps[Self <: IShimmerStyleProps] (val x: Self) extends AnyVal {
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
    def withIsDataLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDataLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withShimmerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShimmerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShimmerWaveColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerWaveColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShimmerWaveColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerWaveColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionAnimationInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAnimationInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionAnimationInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAnimationInterval")(js.undefined)
        ret
    }
  }
  
}

