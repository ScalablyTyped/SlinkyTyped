package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.list
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.preview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsProperties extends WidgetProperties {
  
  /**
    * A string value indicating how to display the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#displayType)
    */
  var displayType: js.UndefOr[preview | list] = js.native
  
  /**
    * The graphic for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#viewModel)
    */
  var viewModel: js.UndefOr[AttachmentsViewModelProperties] = js.native
}
object AttachmentsProperties {
  
  @scala.inline
  def apply(): AttachmentsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsProperties]
  }
  
  @scala.inline
  implicit class AttachmentsPropertiesMutableBuilder[Self <: AttachmentsProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayType(value: preview | list): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    
    @scala.inline
    def setGraphic(value: GraphicProperties): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicUndefined: Self = StObject.set(x, "graphic", js.undefined)
    
    @scala.inline
    def setViewModel(value: AttachmentsViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
