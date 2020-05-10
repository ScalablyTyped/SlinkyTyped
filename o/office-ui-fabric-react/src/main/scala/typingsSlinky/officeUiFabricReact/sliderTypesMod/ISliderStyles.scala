package typingsSlinky.officeUiFabricReact.sliderTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISliderStyles extends js.Object {
  /**
    * Style set for active portion of the line.
    */
  var activeSection: IStyle = js.native
  /**
    * Style set for the container of the slider.
    */
  var container: IStyle = js.native
  /**
    * Style set for inactive portion of the line.
    */
  var inactiveSection: IStyle = js.native
  /**
    * Style set for element that contains all the lines.
    */
  var line: IStyle = js.native
  /**
    * Style set for both active and inactive sections of the line.
    */
  var lineContainer: IStyle = js.native
  /**
    * Style set for the root element.
    */
  var root: IStyle = js.native
  /**
    * Style set for the actual box containting interactive elements of the slider.
    */
  var slideBox: IStyle = js.native
  /**
    * Style set for thumb of the slider.
    */
  var thumb: IStyle = js.native
  /**
    * Style set for the title label above the slider.
    */
  var titleLabel: IStyle = js.native
  /**
    * Style set for value label on right/below of the slider.
    */
  var valueLabel: IStyle = js.native
  /**
    * Style set for tick on 0 on number line. This element only shows up when originFromZero prop is true.
    */
  var zeroTick: IStyle = js.native
}

object ISliderStyles {
  @scala.inline
  def apply(): ISliderStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISliderStyles]
  }
  @scala.inline
  implicit class ISliderStylesOps[Self <: ISliderStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveSection(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSection")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveSectionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSection")(null)
        ret
    }
    @scala.inline
    def withContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
        ret
    }
    @scala.inline
    def withInactiveSection(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveSection")(js.undefined)
        ret
    }
    @scala.inline
    def withInactiveSectionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveSection")(null)
        ret
    }
    @scala.inline
    def withLine(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withLineNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(null)
        ret
    }
    @scala.inline
    def withLineContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withLineContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineContainer")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withSlideBox(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideBox")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideBoxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideBox")(null)
        ret
    }
    @scala.inline
    def withThumb(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(null)
        ret
    }
    @scala.inline
    def withTitleLabel(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLabelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLabel")(null)
        ret
    }
    @scala.inline
    def withValueLabel(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withValueLabelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLabel")(null)
        ret
    }
    @scala.inline
    def withZeroTick(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroTick")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroTickNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroTick")(null)
        ret
    }
  }
  
}

