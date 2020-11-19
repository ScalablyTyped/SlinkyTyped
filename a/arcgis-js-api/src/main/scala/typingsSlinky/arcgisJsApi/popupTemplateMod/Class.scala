package typingsSlinky.arcgisJsApi.popupTemplateMod

import typingsSlinky.arcgisJsApi.esri.PopupTemplate
import typingsSlinky.arcgisJsApi.esri.PopupTemplateProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/PopupTemplate", JSImport.Namespace)
@js.native
/**
  * A PopupTemplate formats and defines the content of a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) for a specific [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). A PopupTemplate allows the user to access values from feature attributes and values returned from [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions when a feature in the view is selected.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html)
  */
class Class () extends PopupTemplate {
  def this(properties: PopupTemplateProperties) = this()
}
