package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredominantCategoriesResult extends Object {
  /**
    * An array of objects describing the count of each predominant category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
    */
  var predominantCategoryInfos: js.Array[PredominantCategoriesResultPredominantCategoryInfos] = js.native
}

object PredominantCategoriesResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    predominantCategoryInfos: js.Array[PredominantCategoriesResultPredominantCategoryInfos],
    propertyIsEnumerable: PropertyKey => Boolean
  ): PredominantCategoriesResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), predominantCategoryInfos = predominantCategoryInfos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PredominantCategoriesResult]
  }
  @scala.inline
  implicit class PredominantCategoriesResultOps[Self <: PredominantCategoriesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPredominantCategoryInfos(value: js.Array[PredominantCategoriesResultPredominantCategoryInfos]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predominantCategoryInfos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

