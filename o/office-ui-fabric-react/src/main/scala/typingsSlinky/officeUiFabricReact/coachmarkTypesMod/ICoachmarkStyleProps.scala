package typingsSlinky.officeUiFabricReact.coachmarkTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoachmarkStyleProps extends js.Object {
  /**
    * Beacon color one
    */
  var beaconColorOne: js.UndefOr[String] = js.native
  /**
    * Beacon color two
    */
  var beaconColorTwo: js.UndefOr[String] = js.native
  /**
    * ClassName to provide on the root style area.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Is the Coachmark collapsed.
    * Deprecated, use `isCollapsed` instead.
    * @deprecated Use `isCollapsed` instead.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * Color
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Delay time for the animation to start
    */
  var delayBeforeCoachmarkAnimation: js.UndefOr[String] = js.native
  /**
    * The height measured before the component has been mounted
    * in pixels
    */
  var entityHostHeight: js.UndefOr[String] = js.native
  /**
    * The width measured in pixels
    */
  var entityHostWidth: js.UndefOr[String] = js.native
  /**
    * Height of the coachmark
    */
  var height: js.UndefOr[String] = js.native
  /**
    * Is the beacon currently animating.
    */
  var isBeaconAnimating: Boolean = js.native
  /**
    * Is the Coachmark collapsed
    */
  var isCollapsed: Boolean = js.native
  /**
    * Is the Coachmark finished measuring the dimensions of innerHostElement
    */
  var isMeasured: Boolean = js.native
  /**
    * Is the component taking measurements
    */
  var isMeasuring: Boolean = js.native
  /**
    * Current theme.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Transform origin for teaching bubble content
    */
  var transformOrigin: js.UndefOr[String] = js.native
  /**
    * Width of the coachmark
    */
  var width: js.UndefOr[String] = js.native
}

object ICoachmarkStyleProps {
  @scala.inline
  def apply(isBeaconAnimating: Boolean, isCollapsed: Boolean, isMeasured: Boolean, isMeasuring: Boolean): ICoachmarkStyleProps = {
    val __obj = js.Dynamic.literal(isBeaconAnimating = isBeaconAnimating.asInstanceOf[js.Any], isCollapsed = isCollapsed.asInstanceOf[js.Any], isMeasured = isMeasured.asInstanceOf[js.Any], isMeasuring = isMeasuring.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkStyleProps]
  }
  @scala.inline
  implicit class ICoachmarkStylePropsOps[Self <: ICoachmarkStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsBeaconAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeaconAnimating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMeasured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMeasured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMeasuring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMeasuring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeaconColorOne(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconColorOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconColorOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconColorOne")(js.undefined)
        ret
    }
    @scala.inline
    def withBeaconColorTwo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconColorTwo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconColorTwo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconColorTwo")(js.undefined)
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
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayBeforeCoachmarkAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayBeforeCoachmarkAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayBeforeCoachmarkAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayBeforeCoachmarkAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityHostHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityHostHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityHostHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityHostHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityHostWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityHostWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityHostWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityHostWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

