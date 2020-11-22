package typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  var exclusions: ExclusionsResource = js.native
  
  var locations: LocationsResource = js.native
  
  var logs: LogsResource = js.native
  
  var metrics: MetricsResource = js.native
  
  var sinks: SinksResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(
    exclusions: ExclusionsResource,
    locations: LocationsResource,
    logs: LogsResource,
    metrics: MetricsResource,
    sinks: SinksResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], sinks = sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExclusions(value: ExclusionsResource): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogs(value: LogsResource): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: MetricsResource): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinks(value: SinksResource): Self = this.set("sinks", value.asInstanceOf[js.Any])
  }
}
