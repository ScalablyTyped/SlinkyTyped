package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for generating category statistics for a [predominance](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html) renderer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-predominantCategories.html)
  */
@js.native
trait predominantCategories extends StObject {
  
  /**
    * Determines predominant categories for a layer based on a given set of competing numeric fields and returns the number of features belonging to each category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-predominantCategories.html#predominantCategories)
    */
  def predominantCategories(params: predominantCategoriesPredominantCategoriesParams): js.Promise[PredominantCategoriesResult] = js.native
}
object predominantCategories {
  
  @scala.inline
  def apply(
    predominantCategories: predominantCategoriesPredominantCategoriesParams => js.Promise[PredominantCategoriesResult]
  ): predominantCategories = {
    val __obj = js.Dynamic.literal(predominantCategories = js.Any.fromFunction1(predominantCategories))
    __obj.asInstanceOf[predominantCategories]
  }
  
  @scala.inline
  implicit class predominantCategoriesMutableBuilder[Self <: predominantCategories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredominantCategories(value: predominantCategoriesPredominantCategoriesParams => js.Promise[PredominantCategoriesResult]): Self = StObject.set(x, "predominantCategories", js.Any.fromFunction1(value))
  }
}
