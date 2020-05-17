package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ComponentElementModelTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseGaugeOptions[T] extends BaseWidgetOptions[T] {
  /** Specifies animation options. */
  var animation: js.UndefOr[BaseGaugeAnimation] = js.native
  /** Specifies the color of the parent page element. */
  var containerBackgroundColor: js.UndefOr[String] = js.native
  /** Configures the loading indicator. */
  @JSName("loadingIndicator")
  var loadingIndicator_BaseGaugeOptions: js.UndefOr[BaseGaugeLoadingIndicator] = js.native
  /** A function that is executed when a tooltip becomes hidden. */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ ComponentElementModelTarget[T], _]] = js.native
  /** A function that is executed when a tooltip appears. */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ ComponentElementModelTarget[T], _]] = js.native
  /** Specifies options of the gauge's range container. */
  var rangeContainer: js.UndefOr[BaseGaugeRangeContainer] = js.native
  /** Specifies options of the gauge's scale. */
  var scale: js.UndefOr[BaseGaugeScale] = js.native
  /** Specifies a set of subvalues to be designated by the subvalue indicators. */
  var subvalues: js.UndefOr[js.Array[Double]] = js.native
  /** Configures tooltips. */
  @JSName("tooltip")
  var tooltip_BaseGaugeOptions: js.UndefOr[BaseGaugeTooltip] = js.native
  /** Specifies the main value on a gauge. */
  var value: js.UndefOr[Double] = js.native
}

object BaseGaugeOptions {
  @scala.inline
  def apply[T](): BaseGaugeOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeOptions[T]]
  }
  @scala.inline
  implicit class BaseGaugeOptionsOps[Self[t] <: BaseGaugeOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAnimation(value: BaseGaugeAnimation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerBackgroundColor(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerBackgroundColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIndicator(value: BaseGaugeLoadingIndicator): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIndicator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipHidden(value: /* e */ ComponentElementModelTarget[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipHidden: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipShown(value: /* e */ ComponentElementModelTarget[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipShown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipShown")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeContainer(value: BaseGaugeRangeContainer): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeContainer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: BaseGaugeScale): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withSubvalues(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subvalues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubvalues: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subvalues")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: BaseGaugeTooltip): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

