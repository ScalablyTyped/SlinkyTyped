package typingsSlinky.arcgisJsApi.identifyTaskMod

import typingsSlinky.arcgisJsApi.esri.IdentifyTask
import typingsSlinky.arcgisJsApi.esri.IdentifyTaskProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/tasks/IdentifyTask", JSImport.Namespace)
@js.native
/**
  * Performs an identify operation on the layers of a map service exposed by the ArcGIS Server REST API. Use [IdentifyParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html) to set the parameters for the identify operation and [IdentifyResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html) to work with the results.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-IdentifyTask.html)
  */
class Class () extends IdentifyTask {
  def this(properties: IdentifyTaskProperties) = this()
}
