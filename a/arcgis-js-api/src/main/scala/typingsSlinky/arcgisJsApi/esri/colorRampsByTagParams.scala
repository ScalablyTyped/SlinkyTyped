package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait colorRampsByTagParams extends Object {
  
  /**
    * When provided, only ramps missing all the provided tags will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#byTag)
    */
  var excludedTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * When provided, only ramps containing all the matching tags will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#byTag)
    */
  var includedTags: js.UndefOr[js.Array[String]] = js.native
}
object colorRampsByTagParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): colorRampsByTagParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[colorRampsByTagParams]
  }
  
  @scala.inline
  implicit class colorRampsByTagParamsMutableBuilder[Self <: colorRampsByTagParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedTags(value: js.Array[String]): Self = StObject.set(x, "excludedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedTagsUndefined: Self = StObject.set(x, "excludedTags", js.undefined)
    
    @scala.inline
    def setExcludedTagsVarargs(value: String*): Self = StObject.set(x, "excludedTags", js.Array(value :_*))
    
    @scala.inline
    def setIncludedTags(value: js.Array[String]): Self = StObject.set(x, "includedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedTagsUndefined: Self = StObject.set(x, "includedTags", js.undefined)
    
    @scala.inline
    def setIncludedTagsVarargs(value: String*): Self = StObject.set(x, "includedTags", js.Array(value :_*))
  }
}
