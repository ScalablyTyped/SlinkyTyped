package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartMediaInfoValueProperties extends js.Object {
  /**
    * An array of strings, with each string containing the name of a field to display in the chart.
    * > In order to work with related fields within a chart, the fields must either be set as a [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) element in the [PopupTemplate's content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content) or as [popupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property outside of the PopupTemplate's content.
    * > Set the [popupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property for any fields that need to have number formatting for chart/text elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#fields)
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  /**
    * A string containing the name of a field. The values of all fields in the chart will be normalized (divided) by the value of this field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#normalizeField)
    */
  var normalizeField: js.UndefOr[String] = js.native
  /**
    * An array of [ChartMediaInfoValueSeries](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html) objects which provide information of x/y data data that is plotted in a chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#series)
    */
  var series: js.UndefOr[js.Array[ChartMediaInfoValueSeriesProperties]] = js.native
  /**
    * String value indicating the tooltip for a chart specified from another field. It is used for showing tooltips from another field in the same layer or related layer/table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#tooltipField)
    */
  var tooltipField: js.UndefOr[String] = js.native
}

object ChartMediaInfoValueProperties {
  @scala.inline
  def apply(): ChartMediaInfoValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMediaInfoValueProperties]
  }
  @scala.inline
  implicit class ChartMediaInfoValuePropertiesOps[Self <: ChartMediaInfoValueProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeField")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[ChartMediaInfoValueSeriesProperties]): Self = {
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
    def withTooltipField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipField")(js.undefined)
        ret
    }
  }
  
}

