package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.FeatureTemplatesProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FeatureTemplates")
@js.native
/**
  * The FeatureTemplates widget is part of the overall editing workflow. Its main purpose is to display [templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#templates) from one or more [feature layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). In addition to displaying feature layer templates, it is also possible to [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterFunction) and [group](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#groupBy) templates for an easier editing experience. The widget listens for an end user to select a specific template in the widget. Its [select](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#event-select) event is fired and the resulting template information is returned. This widget can be used in conjunction with [FeatureLayer.applyEdits](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits) to enable an end user to update one of its feature layers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html)
  */
class FeatureTemplatesCls ()
  extends typingsSlinky.arcgisJsApi.esri.FeatureTemplates {
  def this(properties: FeatureTemplatesProperties) = this()
}
