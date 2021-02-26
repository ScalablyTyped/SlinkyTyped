package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`auto-complete-polygon`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`down-arrow`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`left-arrow`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`right-arrow`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`up-arrow`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.arrow
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.circle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ellipse
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.freehand
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.line
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.point
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rectangle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTemplateProperties extends StObject {
  
  /**
    * Description of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#description)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Name of the default drawing tool defined for the template to create a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#drawingTool)
    */
  var drawingTool: js.UndefOr[
    `auto-complete-polygon` | circle | ellipse | freehand | line | none | point | polygon | rectangle | arrow | triangle | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow`
  ] = js.native
  
  /**
    * Name of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * An object used to create a thumbnail image that represents a feature type in the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var thumbnail: js.UndefOr[FeatureTemplateThumbnail] = js.native
}
object FeatureTemplateProperties {
  
  @scala.inline
  def apply(): FeatureTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTemplateProperties]
  }
  
  @scala.inline
  implicit class FeatureTemplatePropertiesMutableBuilder[Self <: FeatureTemplateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDrawingTool(
      value: `auto-complete-polygon` | circle | ellipse | freehand | line | none | point | polygon | rectangle | arrow | triangle | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow`
    ): Self = StObject.set(x, "drawingTool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawingToolUndefined: Self = StObject.set(x, "drawingTool", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setThumbnail(value: FeatureTemplateThumbnail): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
