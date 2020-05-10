package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sizeVisualVariableResult extends Object {
  /**
    * Authoring information related to the creation of the visual variable. This includes information related to UI inputs from sliders and selected themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var authoringInfo: AuthoringInfo = js.native
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var basemapId: String = js.native
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var basemapTheme: String = js.native
  /**
    * Indicates whether default values were used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var defaultValuesUsed: Boolean = js.native
  /**
    * The size scheme used by the main visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var sizeScheme: SizeScheme = js.native
  /**
    * Basic statistics returned from a query to the service for the given field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var statistics: SummaryStatisticsResult = js.native
  /**
    * An array of size visual variables configured based on the statistics of the data and the view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var visualVariables: js.Array[SizeVariable] = js.native
}

object sizeVisualVariableResult {
  @scala.inline
  def apply(
    authoringInfo: AuthoringInfo,
    basemapId: String,
    basemapTheme: String,
    constructor: js.Function,
    defaultValuesUsed: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    sizeScheme: SizeScheme,
    statistics: SummaryStatisticsResult,
    visualVariables: js.Array[SizeVariable]
  ): sizeVisualVariableResult = {
    val __obj = js.Dynamic.literal(authoringInfo = authoringInfo.asInstanceOf[js.Any], basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sizeScheme = sizeScheme.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], visualVariables = visualVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizeVisualVariableResult]
  }
  @scala.inline
  implicit class sizeVisualVariableResultOps[Self <: sizeVisualVariableResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthoringInfo(value: AuthoringInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoringInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasemapId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasemapTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValuesUsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValuesUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeScheme(value: SizeScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistics(value: SummaryStatisticsResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualVariables(value: js.Array[SizeVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualVariables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

