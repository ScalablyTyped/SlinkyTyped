package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportingWidgetDefaultsFeatureTemplates extends Object {
  /**
    * Indicates whether the [templates filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterEnabled) displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var filterEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Aids in managing various template items and how they display within the widget. Please refer to [groupBy API reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#groupBy) for additional information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var groupBy: js.UndefOr[String | GroupByFunction] = js.native
}

object SupportingWidgetDefaultsFeatureTemplates {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SupportingWidgetDefaultsFeatureTemplates = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SupportingWidgetDefaultsFeatureTemplates]
  }
  @scala.inline
  implicit class SupportingWidgetDefaultsFeatureTemplatesOps[Self <: SupportingWidgetDefaultsFeatureTemplates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByFunction1(value: /* grouping */ js.Any => String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupBy(value: String | GroupByFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.undefined)
        ret
    }
  }
  
}

