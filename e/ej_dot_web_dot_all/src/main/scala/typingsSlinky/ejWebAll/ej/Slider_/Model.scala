package typingsSlinky.ejWebAll.ej.Slider_

import typingsSlinky.ejWebAll.ej.Orientation
import typingsSlinky.ejWebAll.ej.slider.sliderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Specifies the allowMouseWheel of the slider.
    * @Default {false}
    */
  var allowMouseWheel: js.UndefOr[Boolean] = js.native
  /** Specifies the animationSpeed of the slider.
    * @Default {500}
    */
  var animationSpeed: js.UndefOr[Double] = js.native
  /** Fires once Slider control value is changed successfully.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Fires once Slider control has been created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Specify the CSS class to slider to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Fires when Slider control has been destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Specifies the animation behavior of the slider.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Specify the enablePersistence to slider to save current model value to browser cookies for state maintains
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Specifies the Right to Left Direction of the slider.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Specifies the state of the slider.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies the height of the slider.
    * @Default {14}
    */
  var height: js.UndefOr[String] = js.native
  /** Specifies the HTML Attributes of the ejSlider.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Specifies the incremental step value of the slider.
    * @Default {1}
    */
  var incrementStep: js.UndefOr[Double] = js.native
  /** Specifies the distance between two major (large) ticks from the scale of the slider.
    * @Default {10}
    */
  var largeStep: js.UndefOr[Double] = js.native
  /** Specifies the ending value of the slider.
    * @Default {100}
    */
  var maxValue: js.UndefOr[Double] = js.native
  /** Specifies the starting value of the slider.
    * @Default {0}
    */
  var minValue: js.UndefOr[Double] = js.native
  /** Specifies the orientation of the slider.
    * @Default {ej.orientation.Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.native
  /** Specifies the readOnly of the slider.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Fires before creating each slider scale tick. You can use this event to add custom text in tick values.
    */
  var renderingTicks: js.UndefOr[js.Function1[/* e */ RenderingTicksEventArgs, Unit]] = js.native
  /** Shows/Hides the increment and decrement buttons of the slider.
    * @Default {false}
    */
  var showButtons: js.UndefOr[Boolean] = js.native
  /** Specifies the rounded corner behavior for slider.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Shows/Hide the major (large) and minor (small) ticks in the scale of the slider.
    * @Default {false}
    */
  var showScale: js.UndefOr[Boolean] = js.native
  /** Specifies the small ticks from the scale of the slider.
    * @Default {true}
    */
  var showSmallTicks: js.UndefOr[Boolean] = js.native
  /** Specifies the showTooltip to shows the current Slider value, while moving the Slider handle or clicking on the slider handle of the slider.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Fires once Slider control is sliding successfully.
    */
  var slide: js.UndefOr[js.Function1[/* e */ SlideEventArgs, Unit]] = js.native
  /** Specifies the sliderType of the slider.
    * @Default {ej.SliderType.Default}
    */
  var sliderType: js.UndefOr[typingsSlinky.ejWebAll.ej.slider.sliderType | String] = js.native
  /** Specifies the distance between two minor (small) ticks from the scale of the slider.
    * @Default {1}
    */
  var smallStep: js.UndefOr[Double] = js.native
  /** Fires once Slider control is started successfully.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.native
  /** Fires when Slider control is stopped successfully.
    */
  var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, Unit]] = js.native
  /** Fires when display the custom tooltip.
    */
  var tooltipChange: js.UndefOr[js.Function1[/* e */ TooltipChangeEventArgs, Unit]] = js.native
  /** Specifies the value of the slider. But it's not applicable for range slider. To range slider we can use values property.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.native
  /** Specifies the values of the range slider. But it's not applicable for default and minRange sliders. we can use value property for default and minRange sliders.
    * @Default {[minValue,maxValue]}
    */
  var values: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the width of the slider.
    * @Default {100%}
    */
  var width: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMouseWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMouseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMouseWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
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
    def withHtmlAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementStep")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeStep")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Orientation | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderingTicks(value: /* e */ RenderingTicksEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingTicks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderingTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withShowButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoundedCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoundedCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withShowScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScale")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSmallTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSmallTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSmallTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSmallTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide(value: /* e */ SlideEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderType(value: sliderType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderType")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallStep")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* e */ StartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: /* e */ StopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipChange(value: /* e */ TooltipChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTooltipChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipChange")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
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

