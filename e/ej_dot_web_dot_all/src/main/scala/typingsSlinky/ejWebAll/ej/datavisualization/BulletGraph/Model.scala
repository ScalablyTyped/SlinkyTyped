package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires, on clicking the bullet graph.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Toggles the visibility of the range stroke color of the labels.
    * @Default {false}
    */
  var applyRangeStrokeToLabels: js.UndefOr[Boolean] = js.native
  /** Toggles the visibility of the range stroke color of the ticks.
    * @Default {false}
    */
  var applyRangeStrokeToTicks: js.UndefOr[Boolean] = js.native
  /** Contains property to customize the caption in bullet graph.
    */
  var captionSettings: js.UndefOr[CaptionSettings] = js.native
  /** Comparative measure bar in bullet graph render till the specified value.
    * @Default {0}
    */
  var comparativeMeasureValue: js.UndefOr[Double] = js.native
  /** Fires, on double clicking the bullet graph.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  /** Fires on rendering the caption of bullet graph.
    */
  var drawCaption: js.UndefOr[js.Function1[/* e */ DrawCaptionEventArgs, Unit]] = js.native
  /** Fires on rendering the category.
    */
  var drawCategory: js.UndefOr[js.Function1[/* e */ DrawCategoryEventArgs, Unit]] = js.native
  /** Fires on rendering the comparative measure symbol.
    */
  var drawComparativeMeasureSymbol: js.UndefOr[js.Function1[/* e */ DrawComparativeMeasureSymbolEventArgs, Unit]] = js.native
  /** Fires on rendering the feature measure bar.
    */
  var drawFeatureMeasureBar: js.UndefOr[js.Function1[/* e */ DrawFeatureMeasureBarEventArgs, Unit]] = js.native
  /** Fires on rendering the indicator of bullet graph.
    */
  var drawIndicator: js.UndefOr[js.Function1[/* e */ DrawIndicatorEventArgs, Unit]] = js.native
  /** Fires on rendering the labels.
    */
  var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.native
  /** Fires on rendering the qualitative ranges.
    */
  var drawQualitativeRanges: js.UndefOr[js.Function1[/* e */ DrawQualitativeRangesEventArgs, Unit]] = js.native
  /** Fires on rendering the ticks.
    */
  var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.native
  /** Toggles the animation of bullet graph.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Specifies to convert the date object to string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.native
  /** Controls whether bullet graph has to be responsive while resizing.
    * @Default {true}
    */
  var enableResizing: js.UndefOr[Boolean] = js.native
  /** Specifies the direction of flow in bullet graph. Neither it may be backward nor forward.
    * @Default {forward}
    */
  var flowDirection: js.UndefOr[FlowDirection | String] = js.native
  /** Specifies the height of the bullet graph.
    * @Default {90}
    */
  var height: js.UndefOr[Double] = js.native
  /** Sets a value whether to make the bullet graph responsive on resize.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Fires on loading bullet graph.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Name of the culture based on which bulletgraph should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Bullet graph will render in the specified orientation.
    * @Default {horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.native
  /** Size of the qualitative range depends up on the specified value.
    * @Default {32}
    */
  var qualitativeRangeSize: js.UndefOr[Double] = js.native
  /** Contains property to customize the qualitative ranges.
    */
  var qualitativeRanges: js.UndefOr[js.Array[QualitativeRange]] = js.native
  /** Length of the quantitative range depends up on the specified value.
    * @Default {475}
    */
  var quantitativeScaleLength: js.UndefOr[Double] = js.native
  /** Contains all the properties to customize quantitative scale.
    */
  var quantitativeScaleSettings: js.UndefOr[QuantitativeScaleSettings] = js.native
  /** Fires, on right clicking the bullet graph.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  /** By specifying this property the user can change the theme of the bullet graph.
    * @Default {flatlight}
    */
  var theme: js.UndefOr[String] = js.native
  /** Contains all the properties to customize tooltip.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
  /** Feature measure bar in bullet graph render till the specified value.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.native
  /** Specifies the width of the bullet graph.
    * @Default {595}
    */
  var width: js.UndefOr[Double] = js.native
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
    def withClick(value: /* e */ ClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Click")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyRangeStrokeToLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyRangeStrokeToLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyRangeStrokeToLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyRangeStrokeToLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyRangeStrokeToTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyRangeStrokeToTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyRangeStrokeToTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyRangeStrokeToTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionSettings(value: CaptionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withComparativeMeasureValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparativeMeasureValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparativeMeasureValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparativeMeasureValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawCaption(value: /* e */ DrawCaptionEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCaption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCaption")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawCategory(value: /* e */ DrawCategoryEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCategory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawComparativeMeasureSymbol(value: /* e */ DrawComparativeMeasureSymbolEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawComparativeMeasureSymbol")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawComparativeMeasureSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawComparativeMeasureSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawFeatureMeasureBar(value: /* e */ DrawFeatureMeasureBarEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawFeatureMeasureBar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawFeatureMeasureBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawFeatureMeasureBar")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawIndicator(value: /* e */ DrawIndicatorEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawIndicator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawLabels(value: /* e */ DrawLabelsEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLabels")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawQualitativeRanges(value: /* e */ DrawQualitativeRangesEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawQualitativeRanges")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawQualitativeRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawQualitativeRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawTicks(value: /* e */ DrawTicksEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTicks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTicks")(js.undefined)
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
    def withEnableGroupSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroupSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowDirection(value: FlowDirection | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* e */ LoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
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
    def withQualitativeRangeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualitativeRangeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualitativeRangeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualitativeRangeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withQualitativeRanges(value: js.Array[QualitativeRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualitativeRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualitativeRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualitativeRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantitativeScaleLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantitativeScaleLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantitativeScaleLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantitativeScaleLength")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantitativeScaleSettings(value: QuantitativeScaleSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantitativeScaleSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantitativeScaleSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantitativeScaleSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRightClick(value: /* e */ RightClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRightClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
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
    def withTooltipSettings(value: TooltipSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipSettings")(js.undefined)
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

