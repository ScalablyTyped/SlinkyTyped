package typingsSlinky.arcgisJsApi.serviceAreaTaskMod

import typingsSlinky.arcgisJsApi.esri.ServiceAreaTask
import typingsSlinky.arcgisJsApi.esri.ServiceAreaTaskProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/tasks/ServiceAreaTask", JSImport.Namespace)
@js.native
/**
  * ServiceAreaTask helps you find service areas around any location on a network. A network service area is a region that encompasses all accessible streets (streets that are within a specified impedance). For instance, the 5-minute service area for a point includes all the streets that can be reached within five minutes from that point.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html)
  */
class Class () extends ServiceAreaTask {
  def this(properties: ServiceAreaTaskProperties) = this()
}
