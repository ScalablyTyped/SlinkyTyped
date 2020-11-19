package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.FeatureFormProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FeatureForm")
@js.native
/**
  * The FeatureForm widget displays attributes of a feature. This widget renders input fields based on the feature's attributes and whether the field allows editing. You can configure field groupings to aid in display and organization of form data. Use this widget, in combination with [FeatureLayer.applyEdits](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits), to enable an end user to update a feature's attribute on a specified editable feature layer(s).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html)
  */
class FeatureFormCls ()
  extends typingsSlinky.arcgisJsApi.esri.FeatureForm {
  def this(properties: FeatureFormProperties) = this()
}
