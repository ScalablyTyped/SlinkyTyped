package typingsSlinky.blueprintjsCore.multiSliderMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISliderBaseProps
  extends IProps
     with IIntentProps {
  /**
    * Whether the slider is non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Number of decimal places to use when rendering label value. Default value is the number of
    * decimals used in the `stepSize` prop. This prop has _no effect_ if you supply a custom
    * `labelRenderer` callback.
    * @default inferred from stepSize
    */
  var labelPrecision: js.UndefOr[Double] = js.native
  /**
    * Callback to render a single label. Useful for formatting numbers as currency or percentages.
    * If `true`, labels will use number value formatted to `labelPrecision` decimal places.
    * If `false`, labels will not be shown.
    * @default true
    */
  var labelRenderer: js.UndefOr[Boolean | (js.Function1[/* value */ Double, String | ReactElement])] = js.native
  /**
    * Increment between successive labels. Must be greater than zero.
    * @default 1
    */
  var labelStepSize: js.UndefOr[Double] = js.native
  /**
    * Maximum value of the slider.
    * @default 10
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Minimum value of the slider.
    * @default 0
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Whether a solid bar should be rendered on the track between current and initial values,
    * or between handles for `RangeSlider`.
    * @default true
    */
  var showTrackFill: js.UndefOr[Boolean] = js.native
  /**
    * Increment between successive values; amount by which the handle moves. Must be greater than zero.
    * @default 1
    */
  var stepSize: js.UndefOr[Double] = js.native
  /**
    * Whether to show the slider in a vertical orientation.
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object ISliderBaseProps {
  @scala.inline
  def apply(): ISliderBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISliderBaseProps]
  }
  @scala.inline
  implicit class ISliderBasePropsOps[Self <: ISliderBaseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelRendererFunction1(value: /* value */ Double => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabelRenderer(value: Boolean | (js.Function1[/* value */ Double, String | ReactElement])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStepSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStepSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStepSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStepSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTrackFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTrackFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTrackFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTrackFill")(js.undefined)
        ret
    }
    @scala.inline
    def withStepSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

