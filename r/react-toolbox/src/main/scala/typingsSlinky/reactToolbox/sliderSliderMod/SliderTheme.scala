package typingsSlinky.reactToolbox.sliderSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderTheme extends js.Object {
  /**
    * Used as an inner container of the root component.
    */
  var container: js.UndefOr[String] = js.native
  /**
    * Added to the root of in case the Slider is editable.
    */
  var editable: js.UndefOr[String] = js.native
  /**
    * Used to style the inner element of the knob.
    */
  var innerknob: js.UndefOr[String] = js.native
  /**
    * Provided to the ProgressBar component.
    */
  var innerprogress: js.UndefOr[String] = js.native
  /**
    * Provided to the Input element in case it's editable.
    */
  var input: js.UndefOr[String] = js.native
  /**
    * Used to style the outer layer of the knob.
    */
  var knob: js.UndefOr[String] = js.native
  /**
    * Added to the root in case the Slider is pinned.
    */
  var pinned: js.UndefOr[String] = js.native
  /**
    * Added to the root in case the state is pressed.
    */
  var pressed: js.UndefOr[String] = js.native
  /**
    * Used as an outer wrapper for the ProgressBar.
    */
  var progress: js.UndefOr[String] = js.native
  /**
    * Used in the root when the knob should be a ring.
    */
  var ring: js.UndefOr[String] = js.native
  /**
    * Class used for the root element.
    */
  var slider: js.UndefOr[String] = js.native
  /**
    * Used for every individual snap element.
    */
  var snap: js.UndefOr[String] = js.native
  /**
    * Used as a wrapper for the group of snaps when it's snapped.
    */
  var snaps: js.UndefOr[String] = js.native
}

object SliderTheme {
  @scala.inline
  def apply(): SliderTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderTheme]
  }
  @scala.inline
  implicit class SliderThemeOps[Self <: SliderTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: String): Self = {
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
    def withEditable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerknob(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerknob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerknob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerknob")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerprogress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerprogress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerprogress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerprogress")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withKnob(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withPressed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withRing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ring")(js.undefined)
        ret
    }
    @scala.inline
    def withSlider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(js.undefined)
        ret
    }
    @scala.inline
    def withSnap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.undefined)
        ret
    }
    @scala.inline
    def withSnaps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snaps")(js.undefined)
        ret
    }
  }
  
}

