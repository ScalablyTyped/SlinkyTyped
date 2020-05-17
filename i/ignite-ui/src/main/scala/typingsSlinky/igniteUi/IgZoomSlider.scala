package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgZoomSlider
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  var actualPixelScalingRatio: js.UndefOr[Double] = js.native
  var areThumbCalloutsEnabled: js.UndefOr[Boolean] = js.native
  var barBrush: js.UndefOr[js.Any] = js.native
  var barExtent: js.UndefOr[Double] = js.native
  var barOutline: js.UndefOr[js.Any] = js.native
  var barStrokeThickness: js.UndefOr[Double] = js.native
  var endInset: js.UndefOr[Double] = js.native
  /**
  	 * The height of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[String | Double] = js.native
  var higherCalloutBrush: js.UndefOr[js.Any] = js.native
  var higherCalloutOutline: js.UndefOr[js.Any] = js.native
  var higherCalloutStrokeThickness: js.UndefOr[Double] = js.native
  var higherCalloutTextColor: js.UndefOr[js.Any] = js.native
  var higherShadeBrush: js.UndefOr[js.Any] = js.native
  var higherShadeOutline: js.UndefOr[js.Any] = js.native
  var higherShadeStrokeThickness: js.UndefOr[Double] = js.native
  var higherThumbBrush: js.UndefOr[js.Any] = js.native
  var higherThumbHeight: js.UndefOr[Double] = js.native
  var higherThumbOutline: js.UndefOr[js.Any] = js.native
  var higherThumbRidgesBrush: js.UndefOr[js.Any] = js.native
  var higherThumbStrokeThickness: js.UndefOr[Double] = js.native
  var higherThumbWidth: js.UndefOr[Double] = js.native
  var lowerCalloutBrush: js.UndefOr[js.Any] = js.native
  var lowerCalloutOutline: js.UndefOr[js.Any] = js.native
  var lowerCalloutStrokeThickness: js.UndefOr[Double] = js.native
  var lowerCalloutTextColor: js.UndefOr[js.Any] = js.native
  var lowerShadeBrush: js.UndefOr[js.Any] = js.native
  var lowerShadeOutline: js.UndefOr[js.Any] = js.native
  var lowerShadeStrokeThickness: js.UndefOr[Double] = js.native
  var lowerThumbBrush: js.UndefOr[js.Any] = js.native
  var lowerThumbHeight: js.UndefOr[Double] = js.native
  var lowerThumbOutline: js.UndefOr[js.Any] = js.native
  var lowerThumbRidgesBrush: js.UndefOr[js.Any] = js.native
  var lowerThumbStrokeThickness: js.UndefOr[Double] = js.native
  var lowerThumbWidth: js.UndefOr[Double] = js.native
  var maxZoomWidth: js.UndefOr[Double] = js.native
  var minZoomWidth: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[String] = js.native
  var panTransitionDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  var propertyChanged: js.UndefOr[PropertyChangedEvent] = js.native
  var rangeThumbBrush: js.UndefOr[js.Any] = js.native
  var rangeThumbOutline: js.UndefOr[js.Any] = js.native
  var rangeThumbRidgesBrush: js.UndefOr[js.Any] = js.native
  var rangeThumbStrokeThickness: js.UndefOr[Double] = js.native
  var resolvingAxisValue: js.UndefOr[ResolvingAxisValueEvent] = js.native
  var startInset: js.UndefOr[Double] = js.native
  var thumbCalloutTextStyle: js.UndefOr[js.Any] = js.native
  var trackEndInset: js.UndefOr[Double] = js.native
  var trackStartInset: js.UndefOr[Double] = js.native
  /**
  	 * The width of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[String | Double] = js.native
  var windowRect: js.UndefOr[js.Any] = js.native
  /**
  	 * Occurs just after the current ZoomSlider's window rectangle is changed.
  	 */
  var windowRectChanged: js.UndefOr[WindowRectChangedEvent] = js.native
}

object IgZoomSlider {
  @scala.inline
  def apply(): IgZoomSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgZoomSlider]
  }
  @scala.inline
  implicit class IgZoomSliderOps[Self <: IgZoomSlider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualPixelScalingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualPixelScalingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualPixelScalingRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualPixelScalingRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withAreThumbCalloutsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areThumbCalloutsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreThumbCalloutsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areThumbCalloutsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBarBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withBarExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withBarOutline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withBarStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withEndInset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endInset")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
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
    def withHigherCalloutBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherCalloutBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherCalloutBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherCalloutBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withHigherCalloutOutline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherCalloutOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherCalloutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherCalloutOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withHigherCalloutStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherCalloutStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherCalloutStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherCalloutStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withHigherCalloutTextColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherCalloutTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherCalloutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherCalloutTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHigherShadeBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherShadeBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherShadeBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherShadeBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withHigherShadeOutline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherShadeOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherShadeOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherShadeOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withHigherShadeStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherShadeStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherShadeStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherShadeStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withHigherThumbBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherThumbBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherThumbBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherThumbBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withHigherThumbHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherThumbHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherThumbHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherThumbHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHigherThumbOutline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherThumbOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherThumbOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherThumbOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withHigherThumbRidgesBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherThumbRidgesBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherThumbRidgesBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherThumbRidgesBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withHigherThumbStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherThumbStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherThumbStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherThumbStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withHigherThumbWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherThumbWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherThumbWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherThumbWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerCalloutBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCalloutBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerCalloutBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCalloutBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerCalloutOutline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCalloutOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerCalloutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCalloutOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerCalloutStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCalloutStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerCalloutStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCalloutStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerCalloutTextColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCalloutTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerCalloutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCalloutTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerShadeBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerShadeBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerShadeBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerShadeBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerShadeOutline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerShadeOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerShadeOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerShadeOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerShadeStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerShadeStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerShadeStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerShadeStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerThumbBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerThumbBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerThumbBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerThumbBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerThumbHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerThumbHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerThumbHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerThumbHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerThumbOutline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerThumbOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerThumbOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerThumbOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerThumbRidgesBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerThumbRidgesBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerThumbRidgesBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerThumbRidgesBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerThumbStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerThumbStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerThumbStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerThumbStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerThumbWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerThumbWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerThumbWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerThumbWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoomWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoomWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoomWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
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
    def withPanTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panTransitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panTransitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelScalingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelScalingRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyChanged(value: (/* event */ Event, /* ui */ PropertyChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPropertyChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeThumbBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeThumbBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeThumbBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeThumbBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeThumbOutline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeThumbOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeThumbOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeThumbOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeThumbRidgesBrush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeThumbRidgesBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeThumbRidgesBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeThumbRidgesBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeThumbStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeThumbStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeThumbStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeThumbStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvingAxisValue(value: (/* event */ Event, /* ui */ ResolvingAxisValueEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvingAxisValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResolvingAxisValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvingAxisValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStartInset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startInset")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbCalloutTextStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbCalloutTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbCalloutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbCalloutTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackEndInset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackEndInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackEndInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackEndInset")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackStartInset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStartInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackStartInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStartInset")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
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
    @scala.inline
    def withWindowRect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowRect")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowRectChanged(value: (/* event */ Event, /* ui */ WindowRectChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowRectChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWindowRectChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowRectChanged")(js.undefined)
        ret
    }
  }
  
}

