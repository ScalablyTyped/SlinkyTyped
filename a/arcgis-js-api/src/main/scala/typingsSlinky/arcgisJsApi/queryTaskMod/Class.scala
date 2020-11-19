package typingsSlinky.arcgisJsApi.queryTaskMod

import typingsSlinky.arcgisJsApi.esri.QueryTask
import typingsSlinky.arcgisJsApi.esri.QueryTaskProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/tasks/QueryTask", JSImport.Namespace)
@js.native
/**
  * Executes different types of query operations on a layer. The most common method used in this class is [execute()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#execute), which executes the query as defined in the [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) object that is passed as a parameter to the function. `QueryTask.execute()` returns a Promise that resolves to a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html), which contains the features in the layer that satisfy the [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html)
  */
class Class () extends QueryTask {
  def this(properties: QueryTaskProperties) = this()
}
