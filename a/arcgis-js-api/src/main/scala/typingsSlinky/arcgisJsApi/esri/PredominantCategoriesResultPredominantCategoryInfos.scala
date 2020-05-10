package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredominantCategoriesResultPredominantCategoryInfos extends Object {
  /**
    * The number of features belonging to the predominant category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
    */
  var count: Double = js.native
  /**
    * The label describing the predominant category, or field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The value or category referenced in a predominance visualization. This is typically a field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
    */
  var value: String | Double = js.native
}

object PredominantCategoriesResultPredominantCategoryInfos {
  @scala.inline
  def apply(
    constructor: js.Function,
    count: Double,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: String | Double
  ): PredominantCategoriesResultPredominantCategoryInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredominantCategoriesResultPredominantCategoryInfos]
  }
  @scala.inline
  implicit class PredominantCategoriesResultPredominantCategoryInfosOps[Self <: PredominantCategoriesResultPredominantCategoryInfos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

