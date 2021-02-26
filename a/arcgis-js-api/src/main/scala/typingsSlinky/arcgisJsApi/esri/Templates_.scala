package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Templates_ extends Object {
  
  /**
    * Includes the primary PopupTemplate suggested for the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#Templates)
    */
  var primaryTemplate: Template = js.native
  
  /**
    * Includes secondary PopupTemplates that may be applied to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#Templates)
    */
  var secondaryTemplates: js.Array[Template] = js.native
}
object Templates_ {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primaryTemplate: Template,
    propertyIsEnumerable: PropertyKey => Boolean,
    secondaryTemplates: js.Array[Template]
  ): Templates_ = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryTemplate = primaryTemplate.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondaryTemplates = secondaryTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Templates_]
  }
  
  @scala.inline
  implicit class Templates_MutableBuilder[Self <: Templates_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimaryTemplate(value: Template): Self = StObject.set(x, "primaryTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryTemplates(value: js.Array[Template]): Self = StObject.set(x, "secondaryTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryTemplatesVarargs(value: Template*): Self = StObject.set(x, "secondaryTemplates", js.Array(value :_*))
  }
}
