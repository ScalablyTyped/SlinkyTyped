package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.IdentifyTaskProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.IdentifyTask")
@js.native
/**
  * Performs an identify operation on the layers of a map service exposed by the ArcGIS Server REST API. Use [IdentifyParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html) to set the parameters for the identify operation and [IdentifyResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html) to work with the results.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-IdentifyTask.html)
  */
class IdentifyTaskCls ()
  extends typingsSlinky.arcgisJsApi.esri.IdentifyTask {
  def this(properties: IdentifyTaskProperties) = this()
}
