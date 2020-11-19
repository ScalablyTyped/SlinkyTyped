package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.AttributionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Attribution")
@js.native
/**
  * The Attribution displays attribution text for the layers in a map. The text displayed for the layers is either a list of data providers or sources as defined in the layer's custom attribution data, or the copyright text. This widget automatically updates based on layer visibility and map extent and displays a single line of attribution that can be expanded with a single click to view all data sources.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html)
  */
class AttributionCls ()
  extends typingsSlinky.arcgisJsApi.esri.Attribution {
  def this(properties: AttributionProperties) = this()
}
