package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesErrorBar extends js.Object {
  /** Options for customizing the error bar cap.
    */
  var cap: js.UndefOr[SeriesErrorBarCap] = js.native
  /** Specifies the direction of error bar.
    * @Default {both}
    */
  var direction: js.UndefOr[ErrorBarDirection | String] = js.native
  /** Fill color of the error bar.
    * @Default {#000000}
    */
  var fill: js.UndefOr[String] = js.native
  /** Value of horizontal  error bar.
    * @Default {1}
    */
  var horizontalErrorValue: js.UndefOr[Double] = js.native
  /** Value of negative horizontal error bar.
    * @Default {1}
    */
  var horizontalNegativeErrorValue: js.UndefOr[Double] = js.native
  /** Value of positive horizontal error bar.
    * @Default {1}
    */
  var horizontalPositiveErrorValue: js.UndefOr[Double] = js.native
  /** Specifies the mode of error bar.
    * @Default {vertical}
    */
  var mode: js.UndefOr[ErrorBarMode | String] = js.native
  /** Specifies the type of error bar.
    * @Default {FixedValue}
    */
  var `type`: js.UndefOr[ErrorBarType | String] = js.native
  /** Value of vertical error bar.
    * @Default {3}
    */
  var verticalErrorValue: js.UndefOr[Double] = js.native
  /** Value of negative vertical error bar.
    * @Default {5}
    */
  var verticalNegativeErrorValue: js.UndefOr[Double] = js.native
  /** Value of positive vertical error bar.
    * @Default {5}
    */
  var verticalPositiveErrorValue: js.UndefOr[Double] = js.native
  /** Show/hides the error bar
    * @Default {visible}
    */
  var visibility: js.UndefOr[Boolean] = js.native
  /** Width of the error bar.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}

object SeriesErrorBar {
  @scala.inline
  def apply(): SeriesErrorBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesErrorBar]
  }
  @scala.inline
  implicit class SeriesErrorBarOps[Self <: SeriesErrorBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCap(value: SeriesErrorBarCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cap")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: ErrorBarDirection | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalErrorValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalErrorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalErrorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalErrorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalNegativeErrorValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalNegativeErrorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalNegativeErrorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalNegativeErrorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalPositiveErrorValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalPositiveErrorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalPositiveErrorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalPositiveErrorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: ErrorBarMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ErrorBarType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalErrorValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalErrorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalErrorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalErrorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalNegativeErrorValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalNegativeErrorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalNegativeErrorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalNegativeErrorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalPositiveErrorValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalPositiveErrorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalPositiveErrorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalPositiveErrorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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

