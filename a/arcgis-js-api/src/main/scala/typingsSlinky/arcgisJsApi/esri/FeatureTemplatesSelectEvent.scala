package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTemplatesSelectEvent extends StObject {
  
  var item: TemplateItem = js.native
  
  var template: FeatureTemplate = js.native
}
object FeatureTemplatesSelectEvent {
  
  @scala.inline
  def apply(item: TemplateItem, template: FeatureTemplate): FeatureTemplatesSelectEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTemplatesSelectEvent]
  }
  
  @scala.inline
  implicit class FeatureTemplatesSelectEventMutableBuilder[Self <: FeatureTemplatesSelectEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: TemplateItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: FeatureTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
