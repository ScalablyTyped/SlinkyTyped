package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires, on clicking the range of range navigator.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** It allows to show the value between the particular periods (i.e) from 1st January to 31st February and so on. The default value is true. If we set the property as false, it allows
    * to show the value between the particular periods.(i.e) from 1st January to 31st January and so on.
    * @Default {true}
    */
  var allowNextValue: js.UndefOr[Boolean] = js.native
  /** Toggles the placement of slider exactly on the place it left or on the nearest interval.
    * @Default {false}
    */
  var allowSnapping: js.UndefOr[Boolean] = js.native
  /** Options for customizing the color, opacity and width of the chart border.
    */
  var border: js.UndefOr[Border] = js.native
  /** Specifies the data source for range navigator.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Fires, on double clicking the range of range navigator.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  /** Enable the resize option in the rangenavigator.
    * @Default {false}
    */
  var enableAutoResizing: js.UndefOr[Boolean] = js.native
  /** Toggles the redrawing of chart on moving the sliders.
    * @Default {true}
    */
  var enableDeferredUpdate: js.UndefOr[Boolean] = js.native
  /** Toggles the direction of rendering the range navigator control.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Enable the scrollbar option in the rangenavigator.
    * @Default {false}
    */
  var enableScrollbar: js.UndefOr[Boolean] = js.native
  /** Sets a value whether to make the range navigator responsive on resize.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Options for customizing the labels colors, font, style, size, horizontalAlignment and opacity.
    */
  var labelSettings: js.UndefOr[LabelSettings] = js.native
  /** Fires on load of range navigator.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Fires after range navigator is loaded.
    */
  var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.native
  /** This property is to specify the localization of range navigator.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Options for customizing the range navigator.
    */
  var navigatorStyleSettings: js.UndefOr[NavigatorStyleSettings] = js.native
  /** Padding specifies the gap between the container and the range navigator.
    * @Default {0}
    */
  var padding: js.UndefOr[String] = js.native
  /** Fires on changing the range of range navigator.
    */
  var rangeChanged: js.UndefOr[js.Function1[/* e */ RangeChangedEventArgs, Unit]] = js.native
  /** If the range is not given explicitly, range will be calculated automatically.
    * @Default {none}
    */
  var rangePadding: js.UndefOr[RangePadding | String] = js.native
  /** Options for customizing the starting and ending ranges.
    */
  var rangeSettings: js.UndefOr[RangeSettings] = js.native
  /** Fires, on right clicking the range of range navigator.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  /** Fires on changing the scrollbar position of range navigator.
    */
  var scrollChanged: js.UndefOr[js.Function1[/* e */ ScrollChangedEventArgs, Unit]] = js.native
  /** Fires on changes ending the scrollbar position of range navigator.
    */
  var scrollEnd: js.UndefOr[js.Function1[/* e */ ScrollEndEventArgs, Unit]] = js.native
  /** Options for rendering scrollbar based on the start and end range values.
    */
  var scrollRangeSettings: js.UndefOr[ScrollRangeSettings] = js.native
  /** Fires on when starting to change the scrollbar position of range navigator.
    */
  var scrollStart: js.UndefOr[js.Function1[/* e */ ScrollStartEventArgs, Unit]] = js.native
  /** selectedData is for getting the data when the &quot;rangeChanged&quot; event trigger from client side.
    */
  var selectedData: js.UndefOr[js.Any] = js.native
  /** Fires when the selection  ends in the range navigator
    */
  var selectedRangeEnd: js.UndefOr[js.Function1[/* e */ SelectedRangeEndEventArgs, Unit]] = js.native
  /** Options for customizing the start and end range values.
    */
  var selectedRangeSettings: js.UndefOr[SelectedRangeSettings] = js.native
  /** Fires on when starting to change the slider position of range navigator.
    */
  var selectedRangeStart: js.UndefOr[js.Function1[/* e */ SelectedRangeStartEventArgs, Unit]] = js.native
  /** Specifies the properties used for customizing the range series.
    */
  var series: js.UndefOr[js.Array[Series]] = js.native
  /** Specifies the  properties used for customizing all the range series.
    */
  var seriesSettings: js.UndefOr[js.Array[SeriesSetting]] = js.native
  /** Contains property to customize the hight and width of range navigator.
    */
  var sizeSettings: js.UndefOr[SizeSettings] = js.native
  /** By specifying this property the user can change the theme of the range navigator.
    * @Default {null}
    */
  var theme: js.UndefOr[String] = js.native
  /** Options for customizing the tooltip in range navigator.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
  /** Options for configuring minor grid lines, major grid lines, axis line of axis.
    */
  var valueAxisSettings: js.UndefOr[ValueAxisSettings] = js.native
  /** You can plot data of type date time or numeric. This property determines the type of data that this axis will handle.
    * @Default {datetime}
    */
  var valueType: js.UndefOr[ValueType | String] = js.native
  /** Specifies the xName for dataSource. This is used to take the x values from dataSource
    */
  var xName: js.UndefOr[js.Any] = js.native
  /** Specifies the yName for dataSource. This is used to take the y values from dataSource
    */
  var yName: js.UndefOr[js.Any] = js.native
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
    def withAllowNextValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNextValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNextValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNextValue")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSnapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSnapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSnapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSnapping")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
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
    def withEnableAutoResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDeferredUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeferredUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDeferredUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeferredUpdate")(js.undefined)
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
    def withEnableScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScrollbar")(js.undefined)
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
    def withLabelSettings(value: LabelSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSettings")(js.undefined)
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
    def withLoaded(value: /* e */ LoadedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.undefined)
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
    def withNavigatorStyleSettings(value: NavigatorStyleSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorStyleSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatorStyleSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatorStyleSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeChanged(value: /* e */ RangeChangedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRangeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withRangePadding(value: RangePadding | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSettings(value: RangeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSettings")(js.undefined)
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
    def withScrollChanged(value: /* e */ ScrollChangedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEnd(value: /* e */ ScrollEndEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollRangeSettings(value: ScrollRangeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollRangeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollRangeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollRangeSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollStart(value: /* e */ ScrollStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedData")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRangeEnd(value: /* e */ SelectedRangeEndEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectedRangeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRangeSettings(value: SelectedRangeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRangeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRangeStart(value: /* e */ SelectedRangeStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectedRangeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[Series]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesSettings(value: js.Array[SeriesSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeSettings(value: SizeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSettings")(js.undefined)
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
    def withValueAxisSettings(value: ValueAxisSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAxisSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAxisSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAxisSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withValueType(value: ValueType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(js.undefined)
        ret
    }
    @scala.inline
    def withXName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xName")(js.undefined)
        ret
    }
    @scala.inline
    def withYName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yName")(js.undefined)
        ret
    }
  }
  
}

